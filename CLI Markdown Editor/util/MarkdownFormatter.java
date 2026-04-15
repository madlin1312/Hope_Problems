package com.sessionmanager.util;

public class MarkdownFormatter {

    public static String formatBold(String text) {
        return "**" + text + "**";
    }

    public static String formatItalic(String text) {
        return "*" + text + "*";
    }
}