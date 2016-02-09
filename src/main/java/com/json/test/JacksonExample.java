/**
 * @(#)JacksonExample.java
 *
 *
 * @author 
 * @version 1.00 2015/10/13
 */
package com.json.test;


import java.util.*;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample {

    private static void pojoToJson() {
        JacksonUser userTest = new JacksonUser("Borgy Manotoy", 28);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String file_url = "src/main/json/user_test.json";
            mapper.writeValue(new File(file_url), userTest);
            System.out.println(mapper.writeValueAsString(userTest));
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void jsonToPojo() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String file_url = "src/main/json/user.json";
            JacksonUser user = mapper.readValue(new File(file_url), JacksonUser.class);
            System.out.println(user);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void flightJsonToPojo() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String file_url = "src/main/json/flightItineraryPrice.json";
            File jsonFile = new File(file_url);
            JacksonFlightItineraryPrice flightInfo = mapper.readValue(jsonFile, JacksonFlightItineraryPrice.class);
            System.out.println(flightInfo);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void biyaheJsonToPojo() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String file_url = "src/main/json/biyaheCxFlightItineraryPrice.json";
            File jsonFile = new File(file_url);
            FlightItineraryPrice flightPrice = mapper.readValue(jsonFile, FlightItineraryPrice.class);
            System.out.println(flightPrice);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void passengerDetailsJsonToPojo() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String file_url = "src/main/json/passengerDetails.json";
            File jsonFile = new File(file_url);
            PassengerInfoParameter passengerInfo = mapper.readValue(jsonFile, PassengerInfoParameter.class);
            System.out.println(passengerInfo);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void simpleFlightItineraryJsonToPojo() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String file_url = "src/main/json/simpleFlightItinerary.json";
            File jsonFile = new File(file_url);
            FlightItineraryParameter flightItineraryParameter = mapper.readValue(jsonFile, FlightItineraryParameter.class);
            System.out.println(flightItineraryParameter);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println("TEST-JSON-TO-POJO-APP");

        simpleFlightItineraryJsonToPojo();
        // passengerDetailsJsonToPojo();
        // biyaheJsonToPojo();
        // flightJsonToPojo();

        // pojoToJson();
        // jsonToPojo();

    }

}
