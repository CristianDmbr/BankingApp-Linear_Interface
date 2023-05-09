
import java.util.Scanner;

public class main {
    public static void main (String[] args) throws InterruptedException {

        //Default account balance value
        double balance = 100;

        //Default savings balance value
        double savings = 1000;

        System.out.print("Enter the four digit pin code : ");

        while ( true ) {

            Scanner pinPad = new Scanner(System.in);
            int pin = pinPad.nextInt();

            if (pin == 1234) {
                System.out.println("Processing...");
                Thread.sleep(3000);
                System.out.println(" ");
                System.out.println("Access gained");
                break;
            } else {
                System.out.println(" ");
                System.out.println("Processing...");
                Thread.sleep(500);
                System.out.println("Pin incorrect ");
                System.out.println("Try again :");
            }
        }

        System.out.println(" ");
        System.out.println("Welcome to MacroBank");
        System.out.println(" ");
        Thread.sleep(1000);
        System.out.println("Please select an option from the options below :");
        System.out.println(" ");
        Thread.sleep(1000);
        System.out.println("Balance");
        System.out.println(" ---------------");
        Thread.sleep(1000);
        System.out.println("Withdraw");
        System.out.println(" ---------------");
        Thread.sleep(1000);
        System.out.println("Deposit");
        System.out.println(" ---------------");
        Thread.sleep(1000);
        System.out.println("Savings");
        System.out.println(" ---------------");
        Thread.sleep(1000);
        System.out.println("Exit");
        System.out.println(" ---------------");

        Thread.sleep(1000);
        System.out.println("Type the function you want to use :");

        while (true) {

            Scanner option = new Scanner(System.in);
            String optionChosen = option.next();

            if ( optionChosen.equals("Balance") || optionChosen.equals("balance")) {
                System.out.println(" ");

                System.out.println("Your balance is : £" + balance);
                System.out.println(" ");
                System.out.println("MAIN MENU");
                System.out.println(" ---------------");
                System.out.println("Type the function you want to use :");

            } else if ( optionChosen.equals("Withdraw") || optionChosen.equals("withdraw")) {
                System.out.println(" ");
                System.out.println("Please enter the amount you want to withdraw : ");

                Scanner withdraw = new Scanner(System.in);
                double withdrawAmount = withdraw.nextInt();

                if ( withdrawAmount > balance ) {
                    System.out.println("Processing...");
                    Thread.sleep(500);
                    System.out.println(" ");
                    System.out.println("You don't have enough fund to withdraw £" + withdrawAmount);
                    System.out.println(" ");
                    System.out.println("MAIN MENU");
                    System.out.println(" ---------------");
                    System.out.println("Please enter the function you would like to do :");
                } else {
                    System.out.println(" ");
                    System.out.println("Processing withdrawing ...");
                    Thread.sleep(2000);
                    System.out.println("£" + withdrawAmount + " have been successfully withdrawn.");
                    System.out.println(" ");
                    balance -= withdrawAmount;
                    Thread.sleep(1000);
                    System.out.println("MAIN MENU");
                    System.out.println(" ---------------");
                    System.out.println("Please enter the function you would like to do :");
                }

            } else if ( optionChosen.equals("Deposit") || optionChosen.equals("deposit")) {
                System.out.println(" ");
                System.out.println("Please enter the amount you would like to deposit :");

                Scanner deposit = new Scanner(System.in);
                double depositAmount = deposit.nextInt();

                System.out.println(" ");
                System.out.println("Processing deposit ...");
                Thread.sleep(1000);
                System.out.println("£" + depositAmount + " have been successfully deposited.");
                balance += depositAmount;
                System.out.println(" ");
                Thread.sleep(1000);
                System.out.println("MAIN MENU");
                System.out.println(" ---------------");
                System.out.println("Please enter the function you would like to do :");


            } else if (optionChosen.equals("Savings") || optionChosen.equals("savings")) {
                System.out.println(" ");
                Thread.sleep(1000);
                System.out.println("< Savings account menu >");
                System.out.println("Please select from the following options : ");
                System.out.println(" ");
                Thread.sleep(1000);
                System.out.println("Savings Balance");
                System.out.println(" ---------------");
                Thread.sleep(1000);
                System.out.println("Withdraw Savings ");
                System.out.println(" ---------------");
                Thread.sleep(1000);
                System.out.println("Deposit to Savings");
                System.out.println(" ---------------");
                Thread.sleep(1000);
                System.out.println("Exit to main menu");
                System.out.println(" ---------------");


                while (true) {

                    Scanner savingsOptions = new Scanner(System.in);
                    String savingsFunctionSelected = savingsOptions.next();

                    if ( savingsFunctionSelected.equals("Savings Balance") || savingsFunctionSelected.equals("savings balance") || savingsFunctionSelected.equals("balance") || savingsFunctionSelected.equals("Balance")) {
                        System.out.println("Your savings balance is : £" + savings);
                        System.out.println(" ");
                        Thread.sleep(1000);
                        System.out.println("< Savings account menu >");
                        System.out.println("Please enter the function you would like to do :");

                    } else if ( savingsFunctionSelected.equals("Withdraw") || savingsFunctionSelected.equals("withdraw savings")|| savingsFunctionSelected.equals("withdraw") ) {
                        System.out.println("Please enter the amount you would like to withdraw from your savings account :");

                        Scanner withdrawInput = new Scanner(System.in);
                        double withdrawAmount = withdrawInput.nextInt();

                        if ( withdrawAmount > savings) {
                            System.out.println("You don't have enough funds to withdraw : £" + withdrawAmount + " from your savings account!");
                            System.out.println(" ");
                            Thread.sleep(1000);
                            System.out.println("< Savings account menu >");
                            System.out.println("Please enter the function you would like to do :");
                        } else {
                            savings -= withdrawAmount;
                            balance += withdrawAmount;
                            System.out.println("Processing withdrawing ...");
                            Thread.sleep(2000);
                            System.out.println("£" + withdrawAmount + " have been successfully withdrawn and out in your main balance.");
                            System.out.println(" ");
                            Thread.sleep(1000);
                            System.out.println("< Savings account menu >");
                            System.out.println("Please enter the function you would like to do :");


                        }
                    } else if (savingsFunctionSelected.equals("Exit") || savingsFunctionSelected.equals("exit")) {
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("Welcome to MacroBank");
                        System.out.println(" ");
                        Thread.sleep(1000);
                        System.out.println("Please select an option from the options below :");
                        System.out.println(" ");
                        Thread.sleep(1000);
                        System.out.println("Balance");
                        System.out.println(" ---------------");
                        Thread.sleep(1000);
                        System.out.println("Withdraw");
                        System.out.println(" ---------------");
                        Thread.sleep(1000);
                        System.out.println("Deposit");
                        System.out.println(" ---------------");
                        Thread.sleep(1000);
                        System.out.println("Savings");
                        System.out.println(" ---------------");
                        Thread.sleep(1000);
                        System.out.println("Exit");
                        System.out.println(" ---------------");
                        break;
                    } else if ( savingsFunctionSelected.equals("Deposit to savings")|| savingsFunctionSelected.equals("deposit to savings")|| savingsFunctionSelected.equals("Deposit") || savingsFunctionSelected.equals("deposit")) {
                        System.out.println("Please enter the amount you would like to deposit to your savings account :");

                        Scanner depositInput = new Scanner(System.in);
                        double depositAmount = depositInput.nextInt();

                        if (balance <= depositAmount) {
                            System.out.println("Processing your £" + depositAmount + " deposit to your savings..." );
                            Thread.sleep(2000);
                            System.out.println("Deposit fail as there isn't enough fund on the main balance. ");
                            Thread.sleep(1000);
                            System.out.println(" ");
                            System.out.println("< Savings account menu >");
                            System.out.println("Please enter the function you would like to do :");
                        } else {
                            balance -= depositAmount;
                            savings += depositAmount;

                            System.out.println("Processing your £" + depositAmount + " deposit to your savings..." );
                            Thread.sleep(1000);
                            savings += depositAmount;
                            System.out.println("£" + depositAmount + " has been successfully deposited on your savings account.");
                            System.out.println(" ");
                            System.out.println("< Savings account menu >");
                            System.out.println("Please enter the function you would like to do :");
                        }

                    } else {
                        System.out.println(" ");
                        System.out.println("Try again");
                        System.out.println("Enter only the functions available : ");
                        System.out.println("Balance, Withdraw, Exit, Deposit or Exit" );
                    }
                }

            } else if (optionChosen.equals("Exit") || optionChosen.equals("exit") || optionChosen.equals("no") || optionChosen.equals("No")) {
                System.out.println(" ");
                System.out.println("Please wait as we log you out ...");
                Thread.sleep(3000);
                System.out.println("You have exited the program!");
                break;
                
            } else {
                System.out.println(" ");
                System.out.println("Try again");
                System.out.println("Enter only the functions available : ");
                System.out.println("Balance, Withdraw, Exit, Deposit or Exit" );
            }
        }
    }
}
