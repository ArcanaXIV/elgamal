/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgamal;

/**
 *
 * @author ltder
 */
import java.io.*;
import java.nio.file.Paths;
import java.util.*;
public class NewMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //PrimitiveRoots test = new PrimitiveRoots();
        //int a = test.primRoot(31847);
        //ExtendedEuclid junk = new ExtendedEuclid();
        //int b[] = junk.gcd(3781, 14409);
        //for(int i = 0; i < b.length; i++){
        //  System.out.println(b[i]);   
                Decrypt decrypt = new Decrypt();
                System.out.println(decrypt.Decrypt(31847, 5, 18074));
        //Scanner scanner = new Scanner(Paths.get("pairs.txt"));
        //while(scanner.hasNextInt()){
        //    System.out.println(scanner.next());
        //}
        //ExtendedEuclid test = new ExtendedEuclid();
        //System.out.println(test.modinv(15,26));
        //}
    
        // TODO code application logic here
    }
}
