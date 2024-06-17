public class Customer {

    private String lastName;
    private String firstName;
    private String sex;
    private String birthDate;
    private String birthPlace;
    private String address;
    private Float height;

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

    public String getBirthPlace() {
        return this.birthPlace;
    }

    public String getAddress() {
        return this.address;
    }

    public Float getHeight() {
        return this.height;
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

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.setLastName("Escobar");
        c.setFirstName("Pablo");
        c.setSex("Male");
        c.setBirthDate("1/12/1949");
        c.setBirthPlace("Colombia");
        c.setAddress("Medellin, Colombia");
        c.setHeight(1.75f); 

        System.out.println(c.getLastName());
        System.out.println(c.getFirstName());
        System.out.println(c.getSex());
        System.out.println(c.getBirthDate());
        System.out.println(c.getBirthPlace());
        System.out.println(c.getHeight());
        
    }
}
