/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgamal;
import java.lang.Math;
import elgamal.ExtendedEuclid;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
/**
 *
 * @author ltder
 */
public class Decrypt {
    public String Decrypt(int p, int alpha, int beta) throws IOException{
        StringBuilder message = new StringBuilder();
        Scanner cipher = new Scanner(Paths.get("pairs.txt"));
        ExtendedEuclid euc = new ExtendedEuclid();
        int a, f, g, h;
        DLP dlp = new DLP();
        a = dlp.dlp(alpha,beta, p);
        while(cipher.hasNextInt()){
             int r = cipher.nextInt();
            int t = cipher.nextInt();
            int s;
            s = euc.modinv(r, p);
            RepeatedSquaring sToTheA = new RepeatedSquaring(); 
            int m = t * sToTheA.modexp(s, a, p); //as long as the .gcd function returns just the modular inverse this will work.
            int[] letters = new int[3];//BRUTE FORCE STARTS HERE
            for(f = 0; f < 26; f++){
                for(g = 0; g < 26; g++){
                    for(h = 0; h < 26; h++){
                        if(m == ((f*Math.pow(26,2))+(g*26)+h)){
                            letters[0] = f;
                            letters[1] = g;
                            letters[2] = h;
                        } else {
                        }
                    }
                }
            }
            switch((int) letters[0]){
                case 0: message.append("a");break;
                case 1: message.append("b");break;
                case 2: message.append("c");break;
                case 3: message.append("d");break;
                case 4: message.append("e");break;
                case 5: message.append("f");break;
                case 6: message.append("g");break;
                case 7: message.append("h");break;
                case 8: message.append("i");break;
                case 9: message.append("j");break;
                case 10: message.append("k");break;
                case 11: message.append("l");break;
                case 12: message.append("m");break;
                case 13: message.append("n");break;
                case 14: message.append("o");break;
                case 15: message.append("p");break;
                case 16: message.append("q");break;
                case 17: message.append("r");break;
                case 18: message.append("s");break;
                case 19: message.append("t");break;
                case 20: message.append("u");break;
                case 21: message.append("v");break;
                case 22: message.append("w");break;
                case 23: message.append("x");break;
                case 24: message.append("y");break;
                case 25: message.append("z");break;
            }
            switch((int) letters[1]){
                case 0: message.append("a");break;
                case 1: message.append("b");break;
                case 2: message.append("c");break;
                case 3: message.append("d");break;
                case 4: message.append("e");break;
                case 5: message.append("f");break;
                case 6: message.append("g");break;
                case 7: message.append("h");break;
                case 8: message.append("i");break;
                case 9: message.append("j");break;
                case 10: message.append("k");break;
                case 11: message.append("l");break;
                case 12: message.append("m");break;
                case 13: message.append("n");break;
                case 14: message.append("o");break;
                case 15: message.append("p");break;
                case 16: message.append("q");break;
                case 17: message.append("r");break;
                case 18: message.append("s");break;
                case 19: message.append("t");break;
                case 20: message.append("u");break;
                case 21: message.append("v");break;
                case 22: message.append("w");break;
                case 23: message.append("x");break;
                case 24: message.append("y");break;
                case 25: message.append("z");break;
            }
            switch((int) letters[2]){
                case 0: message.append("a");break;
                case 1: message.append("b");break;
                case 2: message.append("c");break;
                case 3: message.append("d");break;
                case 4: message.append("e");break;
                case 5: message.append("f");break;
                case 6: message.append("g");break;
                case 7: message.append("h");break;
                case 8: message.append("i");break;
                case 9: message.append("j");break;
                case 10: message.append("k");break;
                case 11: message.append("l");break;
                case 12: message.append("m");break;
                case 13: message.append("n");break;
                case 14: message.append("o");break;
                case 15: message.append("p");break;
                case 16: message.append("q");break;
                case 17: message.append("r");break;
                case 18: message.append("s");break;
                case 19: message.append("t");break;
                case 20: message.append("u");break;
                case 21: message.append("v");break;
                case 22: message.append("w");break;
                case 23: message.append("x");break;
                case 24: message.append("y");break;
                case 25: message.append("z");break;
            }//BRUTE FORCE FINISHED
        }
        return message.toString();
    }
}