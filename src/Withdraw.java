public class Withdraw {
   int continueState =0;
    public void withdrawProcess(){
        Banking bankingOop = new Banking();
        System.out.println("Enter Withdraw Amount");
        int withdrawAmount = bankingOop.getScanner().nextInt();
        bankingOop.accountBalance -= withdrawAmount;
        System.out.println("Thanks For Withdraw Your Balance is " + bankingOop.getAccountBalance());
        System.out.println("Press 3 For Continue Press 4 for Leave");
        continueState = bankingOop.getScanner().nextInt();
        if (continueState == 4) {
            bankingOop.whileRunningState = false;
        }
     }
}
