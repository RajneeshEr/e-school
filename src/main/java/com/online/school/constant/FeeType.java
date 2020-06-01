package com.online.school.constant;

public enum FeeType {
    COURSE("course"),
    BUS("bus"),
    BOOK("book");

    private String type;

    FeeType(String course) {
        this.type=course;
    }

    public String getType() {
        return type;
    }
}
