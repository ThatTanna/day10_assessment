
public class User {
    
    private String firstName;
    private String lastName;
    private String address;
    private Integer years;

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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getYears() {
        return years;
    }
    public void setYears(Integer years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "user [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", years=" + years
                + "]";
    }

}
