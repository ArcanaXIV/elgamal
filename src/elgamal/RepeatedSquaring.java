package elgamal;
import java.lang.Math;
public class RepeatedSquaring{
    // return a^b mod n
    public int modexp(int base, int exponent, int modulus){
        int Result = 0; 
        if (base < 1 || exponent < 0 || modulus < 1)
        {
            return -1;
        }



        while (exponent > 0) 
        {
           if ((exponent % 2) == 1) 
           {
               Result = (Result * base) % modulus;
           }

        base = (base * base) % modulus;
        exponent = exponent/2;
        }
        return Result;
    } 
}