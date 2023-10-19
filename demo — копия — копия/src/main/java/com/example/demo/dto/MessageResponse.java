package com.example.demo.dto;

public class MessageResponse {
    private String msg_id;
    private String timestamp;

    public MessageResponse(String msg_id, long timestamp) {
        this.msg_id = msg_id;
        this.timestamp = String.valueOf(timestamp);
    }

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
