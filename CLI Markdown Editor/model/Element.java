package com.sessionmanager.model;

public abstract class Element {
    protected String content;

    public Element(String content) {
        this.content = content;
    }

    public abstract String render(); // polymorphism
}