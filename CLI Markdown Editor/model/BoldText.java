package com.sessionmanager.model;

public class BoldText extends Element {

    public BoldText(String content) {
        super(content);
    }

    @Override
    public String render() {
        return "**" + content + "**";
    }
}