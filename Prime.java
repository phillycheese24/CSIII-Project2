import java.lang.Math;

public class Prime
{
    private int number;

    public Prime()
    {
        number=0;
    }

    public Prime(int num)
    {
        number=num;
    }

    public void setPrime(int num)
    {
        number=num;
    }

    public boolean isPrime()
    {
        for(int i= 2;i<number;i++){
            if(number%i==0 && number!=2){
                return false;
            }
        }

        //If you loop through all the numbers from 2 to the number 
        //and the modulus isn’t zero, then you found a non-prime number!

        return true;
    }

    public String toString()
    {
        // update this method

        String output="";
        // if the method isPrime() is true
        // concatenate output with the number and " IS PRIME"
        // otherwise concatenate output with the number and " IS NOT PRIME"
        if(isPrime()){
            return number + " IS PRIME";
            
        }
        else{
            return number + " IS NOT PRIME";
        }
        
    }
}