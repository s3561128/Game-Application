package code;
/** this is for inheriting from the contact class and will create 
 * business contact details for a customer
 */
public class BusinessContact extends Contact {

    private String jobTitle;
    /**job title*/
    private String organization;
    /**organisation*/

    public BusinessContact(String firstName, String lastName, String address, 
    String email, String phone, String jobTitle, String organization,String dateOfBirth) {
        super(firstName, lastName, address, email, phone,jobTitle,organization, dateOfBirth);
        this.jobTitle = jobTitle;
        this.organization = organization;
    }
   /**get method is for returning the job title*/
    public String getJobTitle() {
        return jobTitle;
    }
/**allowing us to set the job title*/
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
   /**get method is for returning the orgainsation */
    public String getOrganization() {
        return organization;
    }
/**allowing us to set the organisation*/
    public void setOrganization(String organization) {
        this.organization = organization;
    }

  

}