package com.json.test;


import java.util.List;

public class PassengerInfoParameter {

    private String                                        mainPassenger;
    private String                                        emailAddress;
    private String                                        contactNo;
    private List<PassengerInfoParameter.PassengerDetails> passengers;

    public String getMainPassenger() {
        return mainPassenger;
    }

    public void setMainPassenger(String mainPassenger) {
        this.mainPassenger = mainPassenger;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public List<PassengerInfoParameter.PassengerDetails> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerInfoParameter.PassengerDetails> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("{\n");
        sb.append("\tmainPassenger=" + mainPassenger + ",\n");
        sb.append("\temailAddress=" + emailAddress + ",\n");
        sb.append("\tcontactNo=" + contactNo + ",\n");
        sb.append("\tpassengers=[\n");

        boolean isFirst = true;
        for (PassengerInfoParameter.PassengerDetails pd : passengers) {
            if (!isFirst) sb.append(",\n");
            sb.append("\t\t" + pd);
            isFirst = false;
        }

        sb.append("\n\t]\n");
        sb.append("}");

        return sb.toString();
    }

    public static class PassengerDetails {

        private String  type;
        private String  gender;
        private String  firstName;
        private String  lastName;
        private String  dateOfBirth;
        private String  nationality;
        private boolean is_senior;
        private String  parentPax;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public boolean isIs_senior() {
            return is_senior;
        }

        public void setIs_senior(boolean is_senior) {
            this.is_senior = is_senior;
        }

        public String getParentPax() {
            return parentPax;
        }

        public void setParentPax(String parentPax) {
            this.parentPax = parentPax;
        }

        @Override
        public String toString() {
            return "{type: " + type + ", gender: " + gender + ", firstName: " + firstName + ", lastName: " + lastName + ", dateOfBirth: " + dateOfBirth + ", nationality: " + nationality + ", is_senior: " + is_senior + ", parentPax: " + parentPax
                    + "}";
        }
    }
}
