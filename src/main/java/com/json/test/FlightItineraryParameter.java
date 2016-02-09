package com.json.test;


import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class FlightItineraryParameter {

    private String                                           flightType;
    private List<FlightItineraryParameter.FlightInformation> flightInfos;
    private FlightItineraryParameter.PaxTypeFares            adultFares;
    private FlightItineraryParameter.PaxTypeFares            childFares;
    private FlightItineraryParameter.PaxTypeFares            infantFares;
    private FlightItineraryParameter.PaxTypeFares            seniorFares;
    private short                                            adultCount;
    private short                                            childCount;
    private short                                            infantCount;
    private short                                            seniorCount;

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public List<FlightItineraryParameter.FlightInformation> getFlightInfos() {
        return flightInfos;
    }

    public void setFlightInfos(List<FlightItineraryParameter.FlightInformation> flightInfos) {
        this.flightInfos = flightInfos;
    }

    public FlightItineraryParameter.PaxTypeFares getAdultFares() {
        return adultFares;
    }

    public void setAdultFares(FlightItineraryParameter.PaxTypeFares adultFares) {
        this.adultFares = adultFares;
    }

    public FlightItineraryParameter.PaxTypeFares getChildFares() {
        return childFares;
    }

    public void setChildFares(FlightItineraryParameter.PaxTypeFares childFares) {
        this.childFares = childFares;
    }

    public FlightItineraryParameter.PaxTypeFares getInfantFares() {
        return infantFares;
    }

    public void setInfantFares(FlightItineraryParameter.PaxTypeFares infantFares) {
        this.infantFares = infantFares;
    }

    public FlightItineraryParameter.PaxTypeFares getSeniorFares() {
        return seniorFares;
    }

    public void setSeniorFares(FlightItineraryParameter.PaxTypeFares seniorFares) {
        this.seniorFares = seniorFares;
    }

    public short getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(short adultCount) {
        this.adultCount = adultCount;
    }

    public short getChildCount() {
        return childCount;
    }

    public void setChildCount(short childCount) {
        this.childCount = childCount;
    }

    public short getInfantCount() {
        return infantCount;
    }

    public void setInfantCount(short infantCount) {
        this.infantCount = infantCount;
    }

    public short getSeniorCount() {
        return seniorCount;
    }

    public void setSeniorCount(short seniorCount) {
        this.seniorCount = seniorCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("{\n");
        sb.append("   flightType=" + flightType + ",\n");

        if (null == flightInfos) {
            sb.append("   flightInfos=null,\n");
        } else {
            boolean isFirst = true;
            sb.append("    [\n      flightInfos(" + flightInfos.size() + "):\n");
            for (FlightItineraryParameter.FlightInformation f : flightInfos) {
                if (!isFirst) {
                    sb.append(",\n");
                }
                sb.append("        " + f);
                isFirst = false;
            }
            sb.append("\n    ],\n");
        }

        sb.append("   adultFares=" + adultFares + ",\n");
        sb.append("   childFares=" + childFares + ",\n");
        sb.append("   infantFares=" + infantFares + ",\n");
        sb.append("   adultCount=" + adultCount + ",\n");
        sb.append("   childCount=" + childCount + ",\n");
        sb.append("   infantCount=" + infantCount + "\n");
        sb.append("}");

        return sb.toString();
    }

    /* START: Flight Information */
    public static class FlightInformation {

        private String carrierCode;
        private String flightNumber;
        private String arrivalStation;
        private String departureStation;
        private String arrivalSchedule;
        private String departureSchedule;
        private String aircraftType;
        private String resBookDesigCode;
        private String marriageGroupCode;
        private String rph;

        public String getCarrierCode() {
            return carrierCode;
        }

        public void setCarrierCode(String carrierCode) {
            this.carrierCode = carrierCode;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getArrivalStation() {
            return arrivalStation;
        }

        public void setArrivalStation(String arrivalStation) {
            this.arrivalStation = arrivalStation;
        }

        public String getDepartureStation() {
            return departureStation;
        }

        public void setDepartureStation(String departureStation) {
            this.departureStation = departureStation;
        }

        public String getArrivalSchedule() {
            return arrivalSchedule;
        }

        public void setArrivalSchedule(String arrivalSchedule) {
            this.arrivalSchedule = arrivalSchedule;
        }

        public String getDepartureSchedule() {
            return departureSchedule;
        }

        public void setDepartureSchedule(String departureSchedule) {
            this.departureSchedule = departureSchedule;
        }

        public String getAircraftType() {
            return aircraftType;
        }

        public void setAircraftType(String aircraftType) {
            this.aircraftType = aircraftType;
        }

        public String getResBookDesigCode() {
            return resBookDesigCode;
        }

        public void setResBookDesigCode(String resBookDesigCode) {
            this.resBookDesigCode = resBookDesigCode;
        }

        public String getMarriageGroupCode() {
            return marriageGroupCode;
        }

        public void setMarriageGroupCode(String marriageGroupCode) {
            this.marriageGroupCode = marriageGroupCode;
        }

        public String getRph() {
            return rph;
        }

        public void setRph(String rph) {
            this.rph = rph;
        }

        public Date getArrivalDate() {
            /*
             * try { return BiyaheDateUtility.convertToDate(arrivalSchedule); } catch (ParseException e) { e.printStackTrace(); }
             */
            return new Date();
        }

        public Date getDepartureDate() {
            /*
             * try { return BiyaheDateUtility.convertToDate(departureSchedule); } catch (ParseException e) { e.printStackTrace(); }
             */
            return new Date();
        }

        @Override
        public String toString() {
            return "(carrierCode=" + carrierCode + ", flightNumber=" + flightNumber + ", arrivalStation=" + arrivalStation + ", departureStation=" + departureStation + ", arrivalSchedule=" + arrivalSchedule + ", departureSchedule="
                    + departureSchedule + ")";
        }
    }

    /* START: Pax Type Fares */
    public static class PaxTypeFares {

        private String paxType;
        private double baseFare;
        private double connectionAdjustment;
        private double webAdminFee;
        private double apt;
        private double aptf;
        private double asc;
        private double asf;
        private double avl;
        private double dpsc;
        private double fuex;
        private double psf;
        private double psc;
        private double scf;
        private double vat;
        private double inft;
        private double totalFeesAndTaxes;
        private double totalAmount;
        private double grandTotalPrice;

        public String getPaxType() {
            return paxType;
        }

        public void setPaxType(String paxType) {
            this.paxType = paxType;
        }

        public double getBaseFare() {
            return baseFare;
        }

        public void setBaseFare(double baseFare) {
            this.baseFare = baseFare;
        }

        public double getConnectionAdjustment() {
            return connectionAdjustment;
        }

        public void setConnectionAdjustment(double connectionAdjustment) {
            this.connectionAdjustment = connectionAdjustment;
        }

        public double getWebAdminFee() {
            return webAdminFee;
        }

        public void setWebAdminFee(double webAdminFee) {
            this.webAdminFee = webAdminFee;
        }

        public double getApt() {
            return apt;
        }

        public void setApt(double apt) {
            this.apt = apt;
        }

        public double getAptf() {
            return aptf;
        }

        public void setAptf(double aptf) {
            this.aptf = aptf;
        }

        public double getAsc() {
            return asc;
        }

        public void setAsc(double asc) {
            this.asc = asc;
        }

        public double getAsf() {
            return asf;
        }

        public void setAsf(double asf) {
            this.asf = asf;
        }

        public double getAvl() {
            return avl;
        }

        public void setAvl(double avl) {
            this.avl = avl;
        }

        public double getDpsc() {
            return dpsc;
        }

        public void setDpsc(double dpsc) {
            this.dpsc = dpsc;
        }

        public double getFuex() {
            return fuex;
        }

        public void setFuex(double fuex) {
            this.fuex = fuex;
        }

        public double getPsf() {
            return psf;
        }

        public void setPsf(double psf) {
            this.psf = psf;
        }

        public double getPsc() {
            return psc;
        }

        public void setPsc(double psc) {
            this.psc = psc;
        }

        public double getScf() {
            return scf;
        }

        public void setScf(double scf) {
            this.scf = scf;
        }

        public double getVat() {
            return vat;
        }

        public void setVat(double vat) {
            this.vat = vat;
        }

        public double getInft() {
            return inft;
        }

        public void setInft(double inft) {
            this.inft = inft;
        }

        public double getTotalFeesAndTaxes() {
            return totalFeesAndTaxes;
        }

        public void setTotalFeesAndTaxes(double totalFeesAndTaxes) {
            this.totalFeesAndTaxes = totalFeesAndTaxes;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

        public double getGrandTotalPrice() {
            return grandTotalPrice;
        }

        public void setGrandTotalPrice(double grandTotalPrice) {
            this.grandTotalPrice = grandTotalPrice;
        }

        @Override
        public String toString() {
            return "(paxType=" + paxType + ", baseFare=" + baseFare + ", connectionAdjustment=" + connectionAdjustment + ", webAdminFee=" + webAdminFee + ", apt=" + apt + ", aptf=" + aptf + ", asc=" + asc + ", asf=" + asf + ", avl=" + avl + ", dpsc="
                    + dpsc + ", fuex=" + fuex + ", psf=" + psf + ", psc=" + psc + ", scf=" + scf + ", vat=" + vat + ", totalFeesAndTaxes=" + totalFeesAndTaxes + ", totalAmount=" + totalAmount + ", grandTotalPrice=" + grandTotalPrice + ")";
        }
    }
}
