package me.aikin.refactoring.simplifying.method.calls.encapsulate.downcast;

import java.util.List;

public class Site {
    private List<Reading> readings;

    public Site(List<Reading> readings) {
        this.readings = readings;
    }

    public List<Reading> getReadings() {
        return readings;
    }

    public Object lastReading() {
        return this.readings.get(this.readings.size() - 1);
    }
}
