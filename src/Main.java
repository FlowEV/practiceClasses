public class Main {
    public static void main(String[] args) {
        class User{
            int userAge;
            String userName;

            public void hasAccsess(){
                if(userAge>=18){
                    System.out.println("Hello, " + userName + ", accsess permited!");
                }   else {
                    System.out.println("Sorry, "+ userName + "you are under 18, accsess denied.");
                }
            }

        }

        User penelopa = new User();
        penelopa.userAge = 18;
        penelopa.userName = "Penelopa";

        User jorgia = new User();
        jorgia.userAge = 16;
        jorgia.userName = "Jorgia";

        User daniel = new User();
        daniel.userAge = 14;
        daniel.userName = "Daniel";

        penelopa.hasAccsess();
        jorgia.hasAccsess();
        daniel.hasAccsess();
    }
}