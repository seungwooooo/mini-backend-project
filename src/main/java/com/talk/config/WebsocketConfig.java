package com.talk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
    // sockJS Fallback�� �̿��� ������ endpoint ����
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // �������� handshake�� �ϱ� ���� �����ϴ� endpoint
        registry.addEndpoint("/ws")
                .setAllowedOriginPatterns("*")
                .withSockJS();

    }

    //�޼��� ���Ŀ�� ���� ����
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // ���� -> Ŭ���̾�Ʈ�� �����ϴ� �޼����� ���� endpoint ���� : ����
        registry.enableSimpleBroker("/sub");

        // Ŭ���̾�Ʈ->������ �����ϴ� �޼����� ���� endpoint ���� : ������ ���� �޼���
        registry.setApplicationDestinationPrefixes("/pub");
    }
}
