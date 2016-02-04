package com.onneby.coffee.model;

/**
 * Created by ponneby on 04/02/16.
 */
public class Message implements Command {
    private String content;

    public Command withContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return content;
    }
}
