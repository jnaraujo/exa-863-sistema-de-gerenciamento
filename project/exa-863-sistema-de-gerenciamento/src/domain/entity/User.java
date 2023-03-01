package domain.entity;

import domain.value_objects.PhoneNumber;

public class User {
    private String name;
    private String address;
    private PhoneNumber phone;

    public User(String name, String address, PhoneNumber phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone.getPhone();
    }

    public void setPhone(String phone) throws Exception {
        this.phone.setPhone(phone);
    }
}
