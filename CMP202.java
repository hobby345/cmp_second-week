// OBJECT ORIENTED PROGRAMMING JAVA [INHERITANCE AND ENCAPSULATION]

//DATA TYPE IN JAVA 
// 1 PRIMITIVE TYPE (predefined type it get store as a byte-value)
// 2 OBJECT/REFRENCE TYPE(user defined type and when called it is being refrenced)

// LIST OF PRIMITIVE DATATYPE
public class CMP202{
    // ATRRIBUTES
    int age;
    float height;
    String name;
    String password;

// METHOD OR FUNCTION
    void printuserDetails(){
        age = 23;
        height =170;
        name= "james";
        password ="123456";
        if (password.contains("123456")||password.contains("abcdf")){
             System.out.println("password to easy ");
        }

    }
}


