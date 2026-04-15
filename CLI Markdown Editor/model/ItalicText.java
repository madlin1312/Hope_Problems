package com.sessionmanager.model;

public class ItalicText extends Element {

    public ItalicText(String content) {
        super(content);
    }

    @Override
    public String render() {
        return "*" + content + "*";
    }
}