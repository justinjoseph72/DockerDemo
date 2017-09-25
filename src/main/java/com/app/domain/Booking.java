package com.app.domain;

import java.io.Serializable;

public class Booking implements Serializable {
    private static final long serialVersionUID =1L;
    private String boolingId;
    private String bookingSatus;

    public String getBoolingId() {
        return boolingId;
    }

    public void setBoolingId(String boolingId) {
        this.boolingId = boolingId;
    }

    public String getBookingSatus() {
        return bookingSatus;
    }

    public void setBookingSatus(String bookingSatus) {
        this.bookingSatus = bookingSatus;
    }
}
