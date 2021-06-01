package code;
/**this is to create a contacts for personal information
 * users inherits feature from contact class  
 */
public class PersonalContact extends Contact {

    private String dateOfBirth;
/**this is a constructor for personal contact class */
    public PersonalContact(String firstName, String lastName, String address, 
        String email, String phone, String dateOfBirth,String jobTitle,String organization) {
        super(firstName, lastName, address, email, phone,jobTitle,organization, dateOfBirth);
        this.dateOfBirth = dateOfBirth;
    }
/**this is returning the DOB*/
    public String getDateOfBirth() {
        return dateOfBirth;
    }
/**this is for setting up the DOB*/
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

   
}