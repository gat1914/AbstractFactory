/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dfellig
 */
public abstract class PhoneNumber {

    private String phoneNumber;

    public abstract String getCountryCode();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String newNumber) {
        try {
            Long.parseLong(newNumber);
            phoneNumber = newNumber;
        } catch (NumberFormatException exc) {
        }
    }
}
