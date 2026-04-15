package com.sessionmanager.model;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private List<Element> elements;

    public Document() {
        elements = new ArrayList<>();
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public String renderDocument() {
        StringBuilder sb = new StringBuilder();
        for (Element e : elements) {
            sb.append(e.render()).append("\n");
        }
        return sb.toString();
    }
}