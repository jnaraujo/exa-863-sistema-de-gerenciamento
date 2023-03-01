package domain.value_objects;

public class PhoneNumber {
    private String phone;

    public PhoneNumber(String phone) throws Exception {
        this.setPhone(phone);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception{
        if(phone.length() < 10){
            throw new Exception("Invalid phone number");
        }

        this.phone = phone;
    }
}
