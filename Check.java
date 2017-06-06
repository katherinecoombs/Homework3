
/**
 * Homework 3
 * Class Check
 * @author (Katherine)
 * 
 */
public class Check
{
    //checkNumber
    private int number;
    //what is the check for
    private String For;
    // Who you are paying
    private String payee;
    // amount you are paying
    public double amount;
    private String name = "Katherine";
  
    /**
     * Create a new check with a given check number
     */
    public Check(int checkNumber, String payingTo, String reason)
    {
        number = checkNumber;
        payee = payingTo;
        amount = 0;
        For = reason; 
    }
    
    /**
     * return the check number for a check
     */
    public int getNumber()
    {
        return number;
    }
    
    /**
     * return the payee information
     */
    
    public String getpayingTo()
    {
        return payee;
    }
    
    /**
     * insert an amount of money into a check
     * the amount must be positive otherwise system will print
     * that you need to enter a positive amount
     */
    public void insetMoney(double price)
   {
       if(price > 0){
           amount = price;
        } 
        else{
            System.out.println("Please enter a positive amount rather than:" + price);
            
        }
    }
   /**
    * 
    */
    public void printCheck()
    {
        System.out.println(name + "       " + number);
        System.out.println("Pay to the order of: " + payee + "      " + "$" + amount);
        System.out.println("For:   " + For);
    }
}
