package com.agroho.domain.enums;

/**
 * Created by Rezaul on 5/9/2017.
 */
public enum Gender {

    male("male"),
    female("female"),
    unknown("unknown");

    private String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
