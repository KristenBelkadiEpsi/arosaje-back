package com.epsi.arosaje.config;

import com.corundumstudio.socketio.BroadcastOperations;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.Configuration;
import com.epsi.arosaje.entities.Message;
import com.epsi.arosaje.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
@org.springframework.context.annotation.Configuration
public class SocketIOConfig {
    @Autowired
    private MessageRepository messageRepository;
    @Value("${socketio.server.host}")
    private String host;
    @Value("${socketio.server.port}")
    private int port;
    @Bean
    public SocketIOServer socketIOServer() {
        Configuration config = new Configuration();
        config.setHostname(host);
        config.setPort(port);

        SocketIOServer server = new SocketIOServer(config);
        BroadcastOperations broadcaster = server.getBroadcastOperations();
        server.addEventListener("message", Message.class, (client, data, ackSender) -> {
            // gérer l'enregistrement du message dans la bdd
            messageRepository.save(data);
            broadcaster.sendEvent("message", data);
        });

        server.start();
        return server;
    }
}
