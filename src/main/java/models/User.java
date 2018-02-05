package models;

public class User {
    private String username;
    private String password;
    private String gender;
    private String fname;
    private String sufix;
    private String lname;
    private String birthday;
    private String phone;
    private String email;
    private String digitalcardnumber;

    public User(String username, String password, String gender, String fname, String sufix, String lname,
                String birthday, String phone, String email, String digitalcardnumber){
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.fname = fname;
        this.sufix = sufix;
        this.lname = lname;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.digitalcardnumber = digitalcardnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSufix() {
        return sufix;
    }

    public void setSufix(String sufix) {
        this.password = sufix;
    }

}
