package com.myspace.pollution.pollution_rules;

public class PollutionAnalytic implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "type")
    private java.lang.String type;

    @org.kie.api.definition.type.Label(value = "locationId")
    private java.lang.String locationId;

    @org.kie.api.definition.type.Label(value = "pollutant")
    private java.lang.String pollutant;

    @org.kie.api.definition.type.Label(value = "periodType")
    private java.lang.String periodType;

    @org.kie.api.definition.type.Label(value = "value")
    private java.lang.Double value;

    @org.kie.api.definition.type.Label(value = "threshold")
    private java.lang.Double threshold;

    @org.kie.api.definition.type.Label(value = "countUsed")
    private java.lang.Integer countUsed;

    @org.kie.api.definition.type.Label(value = "hourOfDay")
    private java.lang.Integer hourOfDay;

    @org.kie.api.definition.type.Label(value = "dayOfWeek")
    private java.lang.Integer dayOfWeek;

    @org.kie.api.definition.type.Label(value = "dayOfMonth")
    private java.lang.Integer dayOfMonth;

    @org.kie.api.definition.type.Label(value = "monthOfYear")
    private java.lang.Integer monthOfYear;

    @org.kie.api.definition.type.Label(value = "shift")
    private java.lang.String shift;

    @org.kie.api.definition.type.Label(value = "message")
    private java.lang.String message;

    @org.kie.api.definition.type.Label(value = "ts")
    private java.util.Date ts;

    public PollutionAnalytic() {
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public java.lang.String getLocationId() {
        return this.locationId;
    }

    public void setLocationId(java.lang.String locationId) {
        this.locationId = locationId;
    }

    public java.lang.String getPollutant() {
        return this.pollutant;
    }

    public void setPollutant(java.lang.String pollutant) {
        this.pollutant = pollutant;
    }

    public java.lang.String getPeriodType() {
        return this.periodType;
    }

    public void setPeriodType(java.lang.String periodType) {
        this.periodType = periodType;
    }

    public java.lang.Double getValue() {
        return this.value;
    }

    public void setValue(java.lang.Double value) {
        this.value = value;
    }

    public java.lang.Double getThreshold() {
        return this.threshold;
    }

    public void setThreshold(java.lang.Double threshold) {
        this.threshold = threshold;
    }

    public java.lang.Integer getCountUsed() {
        return this.countUsed;
    }

    public void setCountUsed(java.lang.Integer countUsed) {
        this.countUsed = countUsed;
    }

    public java.lang.Integer getHourOfDay() {
        return this.hourOfDay;
    }

    public void setHourOfDay(java.lang.Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public java.lang.Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    public void setDayOfWeek(java.lang.Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public java.lang.Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    public void setDayOfMonth(java.lang.Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public java.lang.Integer getMonthOfYear() {
        return this.monthOfYear;
    }

    public void setMonthOfYear(java.lang.Integer monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public java.lang.String getShift() {
        return this.shift;
    }

    public void setShift(java.lang.String shift) {
        this.shift = shift;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    public java.util.Date getTs() {
        return this.ts;
    }

    public void setTs(java.util.Date ts) {
        this.ts = ts;
    }
}