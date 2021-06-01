package code;

public class PersonalContact extends Contact {

    private String dateOfBirth;

    public PersonalContact(String firstName, String lastName, String address, 
        String email, String phone, String dateOfBirth) {
        super(firstName, lastName, address, email, phone);
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    void write() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}