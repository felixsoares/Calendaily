package com.felix.materialcalendar.Interface;

import com.felix.materialcalendar.DayView;
import com.felix.materialcalendar.Util.CalendarDay;

public interface DayViewDecorator {
    boolean shouldDecorate(CalendarDay day);
    void decorate(DayView view);
}
