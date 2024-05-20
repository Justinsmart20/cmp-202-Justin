public class User {
    String username = "Justin" ;
    String password = "Pass" ;
    String login() {
        if (username.equals("Justin") && password.equals("Pass")) {
            return "Logged in" ;
        } else {
            return "Failed" ;
        }
    }
    public static void main(String[]args) {
        User John = new User() ;
        System.out.println(John.login()) ;
    }
}
