package com.sessionmanager.model;

public class TextElement extends Element {

    public TextElement(String content) {
        super(content);
    }

    @Override
    public String render() {
        return content;
    }
}