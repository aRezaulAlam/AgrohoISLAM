package com.agroho.domain.enums;

/**
 * Created by AKM Rezaul Alam on 6/30/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
public enum QuestionStatus {

    NEWQUESTION("NEW_QUESTION"),
    PENDING("PENDING"),
    ANSWERING("ANSWERING"),
    ANSWERED("ANSWERED"),
    UNKNOWN("UNKNOWN");

    private String statusLabel;

    QuestionStatus(String statusLabel) {
        this.statusLabel = statusLabel;
    }

    public String getStatusLabel() {
        return statusLabel;
    }

}
