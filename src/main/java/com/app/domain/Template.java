package com.app.domain;

import java.io.Serializable;

public class Template implements Serializable {
    private final static long serialVersionUID = 1L;

    private String title;
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
