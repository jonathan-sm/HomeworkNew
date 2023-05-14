package HWnew1;

public class Author {
    private String firstName;
    private String lasName;

    public Author(String firstName, String lasName) {
        this.firstName = firstName;
        this.lasName = lasName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLasName(){
        return this.lasName;
    }

}
