package com.codelearning.rabbitmqconsumerfeignclient.service.impl;

import com.codelearning.rabbitmqconsumerfeignclient.client.NotificationServiceClient;
import com.codelearning.rabbitmqconsumerfeignclient.model.Message;
import com.codelearning.rabbitmqconsumerfeignclient.model.NotificationDto;
import com.codelearning.rabbitmqconsumerfeignclient.service.QueueReceiver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiverImpl implements QueueReceiver {
    private static final Logger logger = LogManager.getLogger(QueueReceiverImpl.class);
    private final NotificationServiceClient notificationServiceClient;

    public QueueReceiverImpl(NotificationServiceClient notificationServiceClient) {
        this.notificationServiceClient = notificationServiceClient;
    }

    @RabbitListener(queues = "${user.queue.name}")
    @Override
    public ResponseEntity<String> messageGetFromQueue(String message) {
        logger.info("Message Recived {}", message);
        Integer mobilePushId= 0,notificationId = 0;

        NotificationDto notificationDto = new NotificationDto(
                "cWCKjUF_SxK4cOVKCJA69i:APA91bHyipHpwUkRoeuYCZdFLwBCmvsc1vxZO_Wla1H1LVXNKdih3nSGxS06mT1QxgeCbXKHid8mu9O3c2ciZpyjtDI9svQdma9amLbYHuLo_IKSJ0wxGAdMsksL00MGR6LeW82M9SkT",
                "",
                "hello",
                "",
                "hi",
                "",
                "",
                "",
                mobilePushId,
                notificationId
        );
        try {

            notificationServiceClient.sendNotification(notificationDto);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
