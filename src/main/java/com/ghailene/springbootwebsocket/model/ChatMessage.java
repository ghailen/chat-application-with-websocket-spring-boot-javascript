package com.ghailene.springbootwebsocket.model;

public class ChatMessage {
    private String content;
    private String sender;
    private MessageType messageType;

    public enum MessageType {
        CHAT, LEAVE, JOIN
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }


}
