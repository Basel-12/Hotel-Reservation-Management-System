import javax.lang.model.element.Name;

abstract class Person {
    private String name;
    private int SSnn;
    private String email;
    private String phone;
    private String Address;


    Person(){
        this(-1,"","","","");
    }
    Person(int SSnn , String name , String email, String phone, String Address) {
        this.SSnn = SSnn;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.Address = Address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSnn() {
        return SSnn;
    }

    public void setSSnn(int SSnn) {
        this.SSnn = SSnn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString(){
        return "Id: " + SSnn + "\nName: " + name+ "\nEmail: " + email + "\nPhone: " + phone + "\nAddress: "
                + Address;
    }
}
