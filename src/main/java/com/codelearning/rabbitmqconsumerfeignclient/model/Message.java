package com.codelearning.rabbitmqconsumerfeignclient.model;

import java.io.Serializable;

public class Message implements Serializable {

    private String messageId;
    private String by;
    private String messageBody;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", by='" + by + '\'' +
                ", messageBody='" + messageBody + '\'' +
                '}';
    }
}