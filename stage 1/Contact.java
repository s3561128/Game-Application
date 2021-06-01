package code;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;

   public Contact(String firstName, String lastName, String address, String email, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
   
    public String getfirstName() {
        return this.firstName;
    }

    public String setfirstName(){
        //return (this.firstName = firstName);
        return firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    public String setlastName(){
       // return (this.lastName = lastName);
         return lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String setAddress(){
        //return (this.address = address);
        return address;
    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail(){
        //return (this.email = email);
         return email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String setPhone(){
        //return (this.phone = phone);
        return phone;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    //String getJobTitle() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    //}

   /* String getOrganization() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    String getDateOfBirth() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }*/
}


