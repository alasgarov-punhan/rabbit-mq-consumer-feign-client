package com.codelearning.rabbitmqconsumerfeignclient.client;

import com.codelearning.rabbitmqconsumerfeignclient.model.NotificationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "NotificationServiceClient", url = "${client.notification}")
public interface NotificationServiceClient {

    @PostMapping("/internal/notify")
    String sendNotification(NotificationDto pushNotificationDto);

}
