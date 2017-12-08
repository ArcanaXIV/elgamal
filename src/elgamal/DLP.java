package elgamal;
import java.util.*;
/*
 * Goal: Find k such that a^k = y(mod p). (In other words, find the position of y
 * in the huge list {a, a^2, a^3, ... ,a^(q-1)}.
<<<<<<< HEAD
 * In short, DLP is: given a^x (mod p), find x.
=======
 * In short, DLP is: given a^x (mod q), find x.
 * 
 * Project goal: solve DLP using brute force
>>>>>>> cd5c3171827af37f471e979f83bd373d69584ba3
 */
public class DLP extends PrimitiveRoots {
	
	static PrimitiveRoots root = new PrimitiveRoots();
        static RepeatedSquaring square = new RepeatedSquaring();
        
	static int dlp(int alpha, int beta,int p)  {
        //Input: p = large prime number; a = primitive root of q;
//        y = a residue mod q
        boolean logFound = false;
        int b=0, x=0;
        double[] a;

        while(!logFound)
        {
            //Used primeRoot() from PrimitiveRoots class.
            a = root.primRoot(p);
            for(int i = 0; i < a.length; i++){
                b = (int) (Math.pow((int)alpha,a[i]) %p); //Finds the remainder for b.
                if(b != square.modexp((int)a[i],x, p)) {
                    x++;
                    if(b == square.modexp((int)a[i],x, p)) {
                        logFound = true;
                    }
                }
            }
            break;
        }
        return x;
        }
}