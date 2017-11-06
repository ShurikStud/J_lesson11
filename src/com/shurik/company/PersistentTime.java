package com.shurik.company;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class PersistentTime implements Serializable{

    private static final long serialVersionUID = 1L;

    private Date datetime;

    public PersistentTime() {
        datetime    = Calendar.getInstance().getTime();
    }

    public Date getDatetime() {
        return datetime;
    }
}
