public abstract class User {
    protected String id;
    protected String name;
    protected String email;
    protected String password;
    protected String userType; // Student, lecturer, staff

    public User(String Id, String name, String email, String password,
     String userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
     }
     public String getid() {
        return id;
     }
     public String getEmail() {
        return email;
     }
     public String getName() {
        return name;
     }
     public String getUserType() {
        return userType;
     }
     // password doesn't get a getter because of security and encapsulation
     public boolean idLogin(String identered, String passwordEntered) {
        return this.id.equals(identered) && password.equals(passwordEntered); //Checks if inputted password matches user password;
     }

     

     



}
