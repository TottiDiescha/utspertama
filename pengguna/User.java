package pengguna;
public class User {
    private String username;
    private String password;

    public User (String username, String password){
        this.username = username;
        this.password = password;  
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getusername(){
        return this.username;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getpassword(){
        return this.password;
    } 

}
