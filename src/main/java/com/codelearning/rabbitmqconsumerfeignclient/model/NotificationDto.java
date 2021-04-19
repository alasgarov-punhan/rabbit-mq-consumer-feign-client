package com.codelearning.rabbitmqconsumerfeignclient.model;

public class NotificationDto {
    private String deviceToken;
    private String pushTitle;
    private String pushValue;
    private String notificationType;
    private String title;
    private String priority;
    private String sound;
    private String clickAction;
    private Integer mobilePushId;
    private Integer notificationId;


    public NotificationDto(String deviceToken, String pushTitle, String pushValue, String notificationType, String title, String priority, String sound, String clickAction, Integer mobilePushId, Integer notificationId) {
        this.deviceToken = deviceToken;
        this.pushTitle = pushTitle;
        this.pushValue = pushValue;
        this.notificationType = notificationType;
        this.title = title;
        this.priority = priority;
        this.sound = sound;
        this.clickAction = clickAction;
        this.mobilePushId = mobilePushId;
        this.notificationId = notificationId;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getPushTitle() {
        return pushTitle;
    }

    public void setPushTitle(String pushTitle) {
        this.pushTitle = pushTitle;
    }

    public String getPushValue() {
        return pushValue;
    }

    public void setPushValue(String pushValue) {
        this.pushValue = pushValue;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getClickAction() {
        return clickAction;
    }

    public void setClickAction(String clickAction) {
        this.clickAction = clickAction;
    }

    public Integer getMobilePushId() {
        return mobilePushId;
    }

    public void setMobilePushId(Integer mobilePushId) {
        this.mobilePushId = mobilePushId;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    @Override
    public String toString() {
        return "{" +
                "deviceToken='" + deviceToken + '\'' +
                ", pushTitle='" + pushTitle + '\'' +
                ", pushValue='" + pushValue + '\'' +
                ", notificationType=" + notificationType +
                ", title='" + title + '\'' +
                ", priority='" + priority + '\'' +
                ", sound='" + sound + '\'' +
                ", clickAction='" + clickAction + '\'' +
                ", mobilePushId=" + mobilePushId +
                '}';
    }
}
