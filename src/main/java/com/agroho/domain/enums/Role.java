package com.agroho.domain.enums;

/**
 * Created by rezaul on 5/17/17.
 */
public enum Role {

    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_SCHOLAR("ROLE_SCHOLAR"),
    ROLE_USER("ROLE_USER");

    private String label;

    Role(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
