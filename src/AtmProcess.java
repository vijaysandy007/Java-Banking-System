public class AtmProcess {

    public void atmProcess(){
        Banking bankingOop = new Banking();
        int continueState =0;
        while (bankingOop.whileRunningState){
            System.out.println("Welcome to Vijay Bank");
            if (bankingOop.accountNumber == 0) {
                System.out.println("Enter Your Bank Account Number");
                bankingOop.accountNumber =bankingOop.getScanner().nextInt();
                System.out.println("Your Account is "+ bankingOop.getAccountNumber());
            }

            System.out.println("Press 1 for deposit Press 2 for Withdraw");
            int  userInput = bankingOop.getScanner().nextInt();

            switch (userInput){
                case 1:
                    System.out.println("Enter Deposit Amount");
                    int depositAmount = bankingOop.getScanner().nextInt();
                    bankingOop.accountBalance += depositAmount;
                    System.out.println("Thanks For Deposit Your Balance is "+ bankingOop.getAccountBalance());
                    System.out.println("Press 3 For Continue Press 4 for Leave");
                    continueState = bankingOop.getScanner().nextInt();
                    if(continueState ==4){
                        bankingOop.whileRunningState = false;
                    }
                    break;

                case 2:
                    System.out.println("Enter Withdraw Amount");
                    int withdrawAmount = bankingOop.getScanner().nextInt();
                    bankingOop.accountBalance-=withdrawAmount;
                    System.out.println("Thanks For Withdraw Your Balance is "+ bankingOop.getAccountBalance());
                    System.out.println("Press 3 For Continue Press 4 for Leave");
                    continueState = bankingOop.getScanner().nextInt();
                    if(continueState ==4){
                        bankingOop.whileRunningState = false;
                    }
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
            }
    }

}
