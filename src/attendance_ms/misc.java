package attendance_ms;

/**
 *
 * @author hp
 */
public class misc {
    private int Id;
    private int password;
    private String name;
    private byte [] image;
    private String dept;
    private String status;
    private String email;
    private String gender;
    private String address;
    private int age; //should be auto generated, the user input date of birth and program picks the users year of birth and subtracts it from the curent year

   //misc constructor 
    public misc(int Id,int password,String name,byte [] image,String dept,String status,String email,String gender,String address,int age){
        this.Id = Id;
        this.password =  password;
        this.name = name;
        this.image = image;
        this.dept = dept;
        this.status = status;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    misc() {
        
    }
    //end constructor
    
}
