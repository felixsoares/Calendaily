package com.felix.materialcalendar.Interface;

import com.felix.materialcalendar.Util.CalendarDay;

import java.util.ArrayList;
import java.util.Date;

public interface CalendarCallback {
    Date getDateSelected();

    ArrayList<CalendarDay> getEvents();

    boolean getIndicatorsVisible();
}
