public class Customer {

    private String lastName;
    private String firstName;
    private String sex;
    private String birthDate;

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSex() {
        return this.sex;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.setLastName("Escobar");
        c.setFirstName("Pablo");
        c.setSex("Male");
        c.setBirthDate("1/12/1949");

        
    }
}
