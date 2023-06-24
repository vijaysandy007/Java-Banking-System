import java.util.Scanner;

public class Banking {
    public int accountNumber;
    public int accountBalance =0;
    public boolean whileRunningState = true;

    public void setAccountNumber(int accountNumber){
        System.out.println("Account Number setted "+accountNumber);
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getAccountBalance(){
        return this.accountBalance;
    }
    public boolean getRunningStatus(){
        return this.whileRunningState;
    }
    public Scanner getScanner(){
        Scanner src = new Scanner(System.in);
        return src;
    }
}
