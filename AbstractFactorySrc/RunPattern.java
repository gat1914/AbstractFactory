/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dfellig
 */
public class RunPattern {

    public static void main(String[] arguments) {
        System.out.println("Example for the AbstractFactory pattern");
        System.out.println();
      
        System.out.println();

        System.out.println("Creating U.S. Address and Phone Number:");
        AddressPhoneFactory usAddressFactory = new USAddressPhoneFactory();
        Address usAddress = usAddressFactory.createAddress();
        PhoneNumber usPhone = usAddressFactory.createPhoneNumber();

        usAddress.setStreet("142 Lois Lane");
        usAddress.setCity("Metropolis");
        usAddress.setRegion("WY");
        usAddress.setPostalCode("54321");
        usPhone.setPhoneNumber("7039214722");

        System.out.println("U.S. address:");
        System.out.println(usAddress.getFullAddress());
        System.out.println("U.S. phone number:");
        System.out.println(usPhone.getPhoneNumber());
        System.out.println();
        System.out.println();

        System.out.println("Creating French Address and Phone Number:");
        AddressPhoneFactory frenchAddressFactory = new FrenchAddressPhoneFactory();
        Address frenchAddress = frenchAddressFactory.createAddress();
        PhoneNumber frenchPhone = frenchAddressFactory.createPhoneNumber();

        frenchAddress.setStreet("21 Rue Victor Hugo");
        frenchAddress.setCity("Courbevoie");
        frenchAddress.setPostalCode("40792");
        frenchPhone.setPhoneNumber("011324290");

        System.out.println("French address:");
        System.out.println(frenchAddress.getFullAddress());
        System.out.println("French phone number:");
        System.out.println(frenchPhone.getPhoneNumber());
    }
}
