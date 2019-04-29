
package Ass1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        HashMap<String,Integer> hash= new HashMap();

        File file = new File("src/test.txt");
        Scanner in = new Scanner(file);

        while (in.hasNext()) {
           
            String latter =in.next();
            System.out.println(latter);

            Integer test = hash.get(latter);
            if (test == null) {
                hash.put(latter, 1);
            } else {
                hash.put(latter, test + 1);
            } 
            
            for (int j = 0; j < latter.length(); j++) {

                Character chr = latter.charAt(j);
                System.out.println(chr);

                Integer test1 = hash.get(chr.toString());
                if (test1 == null) {
                    hash.put(chr.toString(), 1);
                } else {
                    hash.put(chr.toString(), test1 + 1);
                }
            }

            System.out.println(hash);
            
        }
    }
}
