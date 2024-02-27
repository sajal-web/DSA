public class AccessModifiers{
    public static void main(String args[]){
        BankAccount myACC = new BankAccount();
        myACC.username = "Sajal";
        myACC.setPassword("abcd"); 
    }
}

class BankAccount {
   public String username;
   private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}