import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf
{
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();

    public void viewBalance()
    {
        System.out.println("Available Balance is : "+ atm.getBalance());
    }

    public void withdrawAmount(double withdrawAmount)
    {
        if(withdrawAmount%100==0 || withdrawAmount%200==0 || withdrawAmount%500==0)
        {
            if(withdrawAmount<atm.getBalance())
            {
                ministmt.put(withdrawAmount, " Amount withdrawn");
                System.out.println("Collect the Cash "+withdrawAmount);
                
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            }

            else
            {
                System.out.println("Insufficient balance...!");
            }
        }

        else
        {
            System.out.println("Please enter the amount in multiple of 100, 200, 500");
        } 
    }

    public void depositAmount(double depositAmount)
    {
        ministmt.put(depositAmount," Amount deposited");
        System.out.println(depositAmount+" Deposited Successfully..!");

        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    public void viewMiniStatement()
    {
        for(Map.Entry<Double,String>m:ministmt.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
