package code;
/** this is a contact class*/
public class Contact {
    private String firstName;
    /**FirstName */
    private String lastName;
   /**lastName*/
    private String address;
    /**  address */
    private String email;
    /**Email*/
    private String phone;
    /**Phone*/
    private String jobTitle;
    /**jpb title*/
    private String organization; 
    /**orgainzation*/
    private String dateOfBirth;
    /** date of birth*/
    
//this is a constructor for creating a object 
   public Contact(String firstName, String lastName, String address, String email, String phone, String jobTitle, String organization, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.jobTitle = jobTitle;
        this.organization = organization;
        this.dateOfBirth = dateOfBirth;
    }
   /**get method is for returning the firstname */
    public String getfirstName() {
        return this.firstName;
    }
/**allowing us to set the first name */
    public String setfirstName(){
        //return (this.firstName = firstName);
        return firstName;
    }
   /**get method is for returning the lastname*/
    public String getlastName() {
        return this.lastName;
    }
/**allowing us to set the last name*/
    public String setlastName(){
       // return (this.lastName = lastName);
         return lastName;
    }
   /**get method is for returning the address*/
    public String getAddress() {
        return this.address;
    }
/**allowing us to set the address*/
    public String setAddress(){
        //return (this.address = address);
        return address;
    }
   /**get method is for returning the email*/
    public String getEmail() {
        return this.email;
    }
    /** allowing us to set the email */
    public String setEmail(){
        //return (this.email = email);
         return email;
    }
   /**get method is for returning the phone*/
    public String getPhone() {
        return this.phone;
    }
/**allowing us to set the phone*/
    public String setPhone(){
        //return (this.phone = phone);
        return phone;
    }
   /**get method is for returning the firstname*/
    String getFirstName() {
        return firstName;
    }
   /**get method is for returning the last name*/ 
    String getLastName() {
        return lastName;
    }
   /**get method is for returning the job title*/
    String getJobTitle() {
        return this.jobTitle;
    }
   /**get method is for returning the orgainzation*/
   String getOrganization() {
       return this.organization;
       }
   /**get method is for returning theDOB*/
    String getDateOfBirth() {
    return this.dateOfBirth;
    }
}


