import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

      BankAccountInterface account = new BankAccountImplementation();

        BankAccount account1 = new BankAccount( "Bikram Tamang", 50.0,
                "51098379895", "bikram9295@gmail.com");
        //account1.showInfo();

        Scanner input = new Scanner(System.in);

        int option = -1;

        while(option < 1 || option > 11){

            System.out.println(" ============================= ");
            System.out.println(" 1. Show Account Balance ");
            System.out.println(" 2. Deposit ");
            System.out.println(" 3. withdraw ");
            System.out.println(" 4. Create an Account  ");
            System.out.println(" 5. Update name  ");
            System.out.println(" 6. Update Email  ");
            System.out.println(" 7. Update phone Number  ");
            System.out.println(" 8. Delete an Account  ");
            System.out.println(" 9. Display all User ");
            System.out.println(" 10. Search User by name ");
            System.out.println(" 11. Exit ");

            System.out.println( " Please Enter a Number to select from the menu: ");


            if(input.hasNextInt())
                option = input.nextInt();

        }
        Scanner in = new Scanner(System.in);

        switch(option){
            case 1:
                //do logic
                account.showBalance();
                break;
            case 2:
                //do logic
                account.deposit();
                break;
            case 3:
                //do logic
                account.withdraw();
                break;
            case 4:
                System.out.println("Creating a New account");
                System.out.println("Please enter your first and last name");
                String name = in.nextLine();
                System.out.println("Please deposit your initial balance (must be more than $ 5)");
                //int balance = in.nextInt();
                double balance = in.nextDouble();
                Scanner number = new Scanner(System.in);
                System.out.println("Please enter your phone Number");
                String phNumber = number.nextLine();

                Scanner email = new Scanner(System.in);
                System.out.println("Please enter your email");
                String mail = email.nextLine();



                BankAccount newAccount = new BankAccount(name, balance, phNumber, mail);
                account.addAccount(newAccount);
                System.out.println("Thank you for creating an account with us \n" +
                        "please confirm you Account information below \n" +
                        "Account number:" + newAccount.getAccountNumber() + "\n" + "Name: " +newAccount.getName()
                        + "\n" + "Balance: " +newAccount.getBalance()+ "\n" + "Phone Number:"+ newAccount.getPhoneNumber()
                        + "\n" + "E-mail address: "+ newAccount.getEmail());

                break;

            case 5:
                Scanner acc = new Scanner(System.in);
                System.out.println("Please enter you account number to change the name");
                int accNum = acc.nextInt();

                Scanner newName = new Scanner(System.in);
                System.out.println("Please enter your new name");
                String s1 = newName.nextLine();
                account.updateAccountName(accNum, s1);
                break;
            case 6:
                account.updateAccountEmail();
                break;
            case 7:
                account.updateAccountPhoneNumber();
                break;
            case 8:
                account.deleteAccount();
                break;
            case 9:
                account.getAllAccount();
                break;
            case 10:
                account.searchUser();
                break;






        }

        // Test for the new added account.
       account.getAllAccount();

    }

}
