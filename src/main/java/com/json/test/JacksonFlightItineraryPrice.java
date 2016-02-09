/**
 * @(#)JacksonFlightItineraryPrice.java
 *
 *
 * @author 
 * @version 1.00 2015/10/13
 */
package com.json.test;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JacksonFlightItineraryPrice {

    private String                                                tripType;

    @JsonProperty("tripInfos")
    private List<JacksonFlightItineraryPrice.FlightInfoParameter> tripInfos;

    private JacksonFlightItineraryPrice.PaxFare                   adultFare;
    private JacksonFlightItineraryPrice.PaxFare                   childFare;
    private JacksonFlightItineraryPrice.PaxFare                   infantFare;

    private short                                                 adultCount;
    private short                                                 childCount;
    private short                                                 infantCount;

    public String getTripType() {
        return (this.tripType);
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public List<JacksonFlightItineraryPrice.FlightInfoParameter> getTripInfos() {
        return (this.tripInfos);
    }

    public void setTripInfos(List<JacksonFlightItineraryPrice.FlightInfoParameter> tripInfos) {
        this.tripInfos = tripInfos;
    }

    public JacksonFlightItineraryPrice.PaxFare getAdultFare() {
        return (this.adultFare);
    }

    public void setAdultFare(JacksonFlightItineraryPrice.PaxFare adultFare) {
        this.adultFare = adultFare;
    }

    public JacksonFlightItineraryPrice.PaxFare getChildFare() {
        return (this.childFare);
    }

    public void setChildFare(JacksonFlightItineraryPrice.PaxFare childFare) {
        this.childFare = childFare;
    }

    public JacksonFlightItineraryPrice.PaxFare getInfantFare() {
        return (this.infantFare);
    }

    public void setInfantFare(JacksonFlightItineraryPrice.PaxFare infantFare) {
        this.infantFare = infantFare;
    }

    public short getAdultCount() {
        return (this.adultCount);
    }

    public void setAdultCount(short adultCount) {
        this.adultCount = adultCount;
    }

    public short getChildCount() {
        return (this.childCount);
    }

    public void setChildCount(short childCount) {
        this.childCount = childCount;
    }

    public short getInfantCount() {
        return (this.infantCount);
    }

    public void setInfantCount(short infantCount) {
        this.infantCount = infantCount;
    }

    public static class FlightInfoParameter {

        private String from;
        private String to;
        private String fromSchedule;
        private String toSchedule;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getFromSchedule() {
            return fromSchedule;
        }

        public void setFromSchedule(String fromSchedule) {
            this.fromSchedule = fromSchedule;
        }

        public String getToSchedule() {
            return toSchedule;
        }

        public void setToSchedule(String toSchedule) {
            this.toSchedule = toSchedule;
        }

        @Override
        public String toString() {
            return "{ " + from + "(" + fromSchedule + ") -> " + to + "(" + toSchedule + ") }";
        }
    }

    public static class PaxFare {

        private String paxType;
        private Double baseFare;
        private Double totalFeesAndTaxes;
        private Double totalAmount;

        public String getPaxType() {
            return paxType;
        }

        public void setPaxType(String paxType) {
            this.paxType = paxType;
        }

        public Double getBaseFare() {
            return baseFare;
        }

        public void setBaseFare(Double baseFare) {
            this.baseFare = baseFare;
        }

        public Double getTotalFeesAndTaxes() {
            return totalFeesAndTaxes;
        }

        public void setTotalFeesAndTaxes(Double totalFeesAndTaxes) {
            this.totalFeesAndTaxes = totalFeesAndTaxes;
        }

        public Double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
        }

        @Override
        public String toString() {
            return "(paxType=" + paxType + ", baseFare=" + baseFare + ", totalFeesAndTaxes" + totalFeesAndTaxes + ", totalAmount=" + totalAmount + ")";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(\n");
        sb.append("  tripType=" + tripType + ",\n");

        if (null != tripInfos) {
            sb.append("  tripInfos:\n  [\n");
            boolean isFirst = true;
            for (FlightInfoParameter f : tripInfos) {
                if (!isFirst) {
                    sb.append(",\n");
                }
                sb.append("\t" + f);
                isFirst = false;
            }
            sb.append("\n  ],\n");
        } else {
            sb.append("  tripInfos=null,\n");
        }

        sb.append("  adultFare=" + adultFare + ",\n");
        sb.append("  childFare=" + childFare + ",\n");
        sb.append("  infantFare=" + infantFare + ",\n");
        sb.append("  adultCount=" + adultCount + ",\n");
        sb.append("  childCount=" + childCount + ",\n");
        sb.append("  infantCount=" + infantCount + "\n)");
        return sb.toString();
    }
}
