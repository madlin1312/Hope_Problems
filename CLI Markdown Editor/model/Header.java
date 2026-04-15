package com.sessionmanager.model;

public class Header extends Element {

    private int level;

    public Header(String content, int level) {
        super(content);
        this.level = level;
    }

    @Override
    public String render() {
        return "#".repeat(level) + " " + content;
    }
}