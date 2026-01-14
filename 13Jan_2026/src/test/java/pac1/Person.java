package pac1;

public class Person {
    String FirstName;
    String LastName;
    Gender Gender;        
    String PhoneNumber;

    
    public Person(String fn, String ln, Gender g) {
        this.FirstName = fn;
        this.LastName = ln;
        this.Gender = g;
    }

    public Person(String fn, String ln, char g) {
        this.FirstName = fn;
        this.LastName = ln;
        Gender parsed = Gender.fromInput(String.valueOf(g));
        if (parsed == null) {
            throw new IllegalArgumentException("Gender must be 'M' or 'F'");
        }
        this.Gender = parsed;
    }

    public String getFirstName() { return FirstName; }
    public void setFirstName(String firstName) { FirstName = firstName; }

    public String getLastName() { return LastName; }
    public void setLastName(String lastName) { LastName = lastName; }

    
    public Gender getGender() { return Gender; }
    public void setGender(Gender gender) { Gender = gender; }

    public String getPhoneNumber() { return PhoneNumber; }
    public void setPhoneNumber(String phoneNumber) { PhoneNumber = phoneNumber; }

    
    
}

