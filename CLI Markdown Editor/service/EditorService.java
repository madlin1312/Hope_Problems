package com.sessionmanager.service;

import com.sessionmanager.model.*;

public class EditorService {

    private Document document;

    public EditorService() {
        document = new Document();
    }

    public void addText(String text) {
        document.addElement(new TextElement(text));
    }

    public void addBold(String text) {
        document.addElement(new BoldText(text));
    }

    public void addItalic(String text) {
        document.addElement(new ItalicText(text));
    }

    public void addHeader(String text, int level) {
        document.addElement(new Header(text, level));
    }

    public String preview() {
        return document.renderDocument();
    }

    public Document getDocument() {
        return document;
    }
}