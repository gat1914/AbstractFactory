public class FrenchAddressPhoneFactory implements AddressPhoneFactory {
    PhoneNumber frenchPhoneNumber = new FrenchPhoneNumber();
    @Override
    public FrenchAddress createAddress() {
        return null;
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return null;
    }
}
