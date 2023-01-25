import java.util.Scanner;
public class MainClass 
{
    public static void main(String[] args) 
    {
        AtmOperationInterf op = new AtmOperationImpl();

        int atmnumber=12345;
        int atmpin=1234;

        System.out.println("Welcome to ATM Machine");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter ATM Number : ");
        int atmNumber = in.nextInt();

        System.out.print("Enter Pin : ");
        int pin = in.nextInt();

        if(atmnumber==atmNumber && atmpin==pin)
        {
            while (true) 
            {
                System.out.println("1. View Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. Mini Statement\n5. Exit");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                
                if(ch==1)
                {
                    op.viewBalance();
                }

                else if(ch==2)
                {
                    System.out.println("Enter Amount to Withdraw : ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }

                else if(ch==3)
                {
                    System.out.println("Enter Amount to Deposit : ");
                    Double depositAmount=in.nextDouble();
                    op.depositAmount(depositAmount);
                }

                else if(ch==4)
                {
                    op.viewMiniStatement();
                }

                else if(ch==5)
                {
                    System.out.println("Collect your Atm card.\nThank you for using Atm Machine..!");
                    System.exit(0);
                }

                else
                {
                    System.out.println("Please Enter Correct Choice..!");
                }
            }
        }

        else
        {
            System.out.println("Incorrect atm number or pin..!");
            System.exit(0);
        }
    }
}
