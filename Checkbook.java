import java.util.*;
/**
 * Homework3 
 * Create class checkbook  
 * @author (Katherine)
 */
public class Checkbook
{
    //Money to spend
    private double checkbookBalance;
    //ArrayList from class Check
    private ArrayList<Check> checks;
    //the amount spent on a check
    private double amountfromCheck;
    //total amount of money spent on all checks written
    private double totalSpent;
    
    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook (double balance)
    {
        checkbookBalance = balance;
        checks = new ArrayList<Check>();
       
    }
    /**
     * Add a check to checkbook
     */
    public void addCheck(Check newCheck)
    {
        amountfromCheck = newCheck.amount;
        checks.add(newCheck);
        checkbookBalance = checkbookBalance - amountfromCheck; 
        totalSpent = totalSpent + amountfromCheck;
    }
    
    public double returncheckbookBalance()
    {
        return checkbookBalance;
    
  }
  public double returnTotalSpent()
  {
      return totalSpent;
    }
  public void addBalance(double balance)
  {
      checkbookBalance = checkbookBalance + balance;
    }
  
  public void printCheck()
  {
      System.out.println("Amount left:" + returncheckbookBalance());
      System.out.println("Total Spent:" + returnTotalSpent());
}
}