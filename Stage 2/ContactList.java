package code;
import java.io.BufferedReader;
/**BufferReader */
import java.io.IOException;
/** IO exception*/
import java.io.InputStreamReader;
/** InputStreamReader*/
import java.util.ArrayList;
/** ArrayList*/
import java.util.List;
/**List*/
import java.util.Scanner;
/**Scanner*/

/** this is the contacl list class*/
public class ContactList {

/**ArrayList<List.Contact> contactlist;*/
/**this is the array for storing data*/
List<Contact> contactlist = new ArrayList<Contact>();


/**top is the attribute storing values*/
/** Contact contact; */
private int top = 5;

public static void main(String[] args) throws IOException {
    /** Contact contact;
    contact = new Contact();
    List.Contact c;
    c = contact; */
    ContactList list = new ContactList();
/**this is setting up the menus and use the options*/
    BufferedReader keyIn;
    keyIn = new BufferedReader(new InputStreamReader(System.in));
    /**new buffer reader*/
    String choose = "";
    while (true) {

        System.out.println("\n[1] Add contact");
        /** printing the add contact*/
        System.out.println("[2] View all contacts");
        /**view all contacts*/
        System.out.println("[3] Quit");
        /** quit*/
        System.out.print("Choose : ");
        /**choose*/

        try {
            choose = keyIn.readLine();
        } catch (IOException e) {

            System.out.println("Error");
        }
        int chooseInt = Integer.parseInt(choose);
        switch (chooseInt)
        /**this is a switch statement*/
        {
            case 1:
                list.addContact();
                break;
            case 2:
                list.viewContacts();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Error");
                break;
         }

       }
    }

public ContactList()
/** contactList*/
{
    this.contactlist = new ArrayList<Contact>();
    /**this is pre-set data(test data)*/
    contactlist.add(new Contact("john","smith","23 melby avenue","john.smith@gmail.com","04202010384","engineer","apple","30.04.1996"));
    contactlist.add(new Contact("saly","jones","13 melby avenue","Saly.jones@gmail.com","04202010384","opeerator","apple","23.04.1996"));
    contactlist.add(new Contact("mike","tsman","33 melby avenue","mike.tsman@gmail.com","04202010384","database admin","apple","31.04.1996"));
    contactlist.add(new Contact("adi","deswal","43 melby avenue","adi.deswal@gmail.com","04202010384","engineer","apple","13.04.1996"));
    contactlist.add(new Contact("chandra","saini","43 melby avenue","chandra.saini@gmail.com","042020345384","engineer","apple","13.04.1996"));
    contactlist.add(new Contact("chelton","evan","43 melby avenue","chelton.evan@gmail.com","0434534584","engineer","apple","13.04.1996"));
    contactlist.add(new Contact("yong","king","43 melby avenue","yong.king@gmail.com","04223453454","engineer","apple","13.04.1996"));
    contactlist.add(new Contact("eric","su","43 melby avenue","eirc.su123@gmail.com","0434523453","engineer","apple","13.04.1996"));
    contactlist.add(new Contact("luke","butler","43 melby avenue","luke.butler@gmail.com","052342543245","engineer","apple","13.04.1996"));
    contactlist.add(new Contact("kevin","butler","53 melby avenue","kevin.butler@gmail.com","04324523454","engineer","apple","22.04.1996"));
}
//its gonna store the details of contacts with the scanner input allow user to enter details
public void addContact() throws IOException {
    BufferedReader keyIn;
    keyIn = new BufferedReader(new InputStreamReader(System.in));
    String firstName;
    /**firstname*/
    String lastName;
    /** last name*/
    String address;
    /**address*/
    String email;
    /**email*/
    String phone;
    /**phone*/
    String jobTitle;
    /**job title*/
    String organization;
    /**organisation*/
    String dateOfBirth;
    /**dateofBirth*/

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter Specify the contact type (1) Personal (2) Business: ");
    int contactType;
    try  /** this code checks the value if its an integer or not and if not then exits out the function */
    {
      contactType = input.nextInt();
    }catch(Exception e)
    {
      input.close();
      return;
    }
    /** it stores the values for personal contact*/
    if (contactType == 1) {
        System.out.print("First Name: ");
        /**first name*/
        firstName = keyIn.readLine();
        System.out.print("Last Name: ");
        lastName = keyIn.readLine();
        /**last name*/
        System.out.print("Address: ");
        address = keyIn.readLine();
        /**address*/
        System.out.print("E-mail address: ");
        email = keyIn.readLine();
        /**email*/
        System.out.print("Phone number: ");
        phone = keyIn.readLine();
        /**phone number*/
        System.out.print("Date of Birth (MM/DD/YYYY): ");
        dateOfBirth = keyIn.readLine();
        /**dateOfBirth*/
        System.out.print("Job Title: ");
        jobTitle = keyIn.readLine();
        /**Job Title*/
        System.out.print("organization: ");
        organization = keyIn.readLine();
        /**Organisation*/

        PersonalContact entry;
        /**personalContact entry*/
        entry = new PersonalContact(firstName, lastName, address, email, 
        phone, dateOfBirth,jobTitle,organization);
        contactlist.add(entry);
        top++;
       
        try {
            /**entry.write();*/
        } catch (Exception e) {
        }

    }
    /**this is for business contact details */
    else if (contactType == 2) {
        System.out.print("First Name: ");
        firstName = keyIn.readLine();
        /**First name*/
        System.out.print("Last Name: ");
        lastName = keyIn.readLine();
        /**last name*/
        System.out.print("Address: ");
        address = keyIn.readLine();
        /**adress*/
        System.out.print("E-mail address: ");
        email = keyIn.readLine();
        /**email*/
        System.out.print("Phone number: ");
        phone = keyIn.readLine();
        /**phone number*/
        System.out.print("Job Title: ");
        jobTitle = keyIn.readLine();
        /**job title*/
        System.out.print("Organization: ");
        organization = keyIn.readLine();
        /**organisation*/
        System.out.print("Date Of Birth: ");
        dateOfBirth = keyIn.readLine();
        /**dateOfBirth*/
        

        input.close();
        /**input close*/
        
        BusinessContact entry;
        /**BusinessContact entry*/
        entry = new BusinessContact(firstName, lastName, address, email, 
        phone, jobTitle, organization,dateOfBirth);
        contactlist.add(entry);
        top++;
        try {
            /**entry.write();*/
        } catch (Exception e) {
        }

    }
    /**this is the statement if we press anything but 1&2 it will take us to the back stage or showing you all the options again*/
    else{
     input.close();
     return; 
    }

}
/**we can have a look on the contacts which we saved through this code*/
public void viewContacts() {
for (int index = 0; index < top; index++) {
    /**System.out.println((index + 1) + " First Name " +
    contactlist.get(index).getFirstName());
    System.out.println("Last Name " + contactlist.get(index).getLastName());
    System.out.println("Address: " + contactlist.get(index).getAddress());
    System.out.println("E-mail: " + contactlist.get(index).getEmail());
    System.out.println("Phone: " + contactlist.get(index).getPhone());
    System.out.println("Job Title " + contactlist.get(index).getJobTitle());
    System.out.println("Organization " +  contactlist.get(index).
    getOrganization());
    System.out.println("Date of Birth " + contactlist.get(index).
    getDateOfBirth());*/
  System.out.printf("%-30s"+"%-30s"+"%-30s"+"%-30s"+"%-30s"+"\n","First Name","Last Name","Address","E-Mail", "Phone" ); 

  System.out.printf("%-30s"+"%-30s"+"%-30s"+"%-30s"+"%-30s"+"\n",contactlist.get(index).getFirstName(),contactlist.get(index).getLastName(),contactlist.get(index).getAddress(),contactlist.get(index).getEmail(),contactlist.get(index).getPhone()); 
    System.out.println("=================================================================================================================================================" ); 
   }
    }
}