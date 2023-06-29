package address.book;

public class contact {
    private String firstName;
    private String lastName;
    private String address;
    private String cityName;
    private String stateName;
    private int zipCode;
    private long phoneNumber;
    private String email;
    public contact(String fn,String ln, String adr, String cty,
                       String state, int zp, long pn, String em ) {
        firstName = fn;
        lastName = ln;
        address = adr;
        cityName = cty;
        stateName = state;
        zipCode = zp;
        phoneNumber = pn;
        email = em;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
