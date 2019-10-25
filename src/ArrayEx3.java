
/*
enter ten words from user adn print them in one line
 */

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[]args){
        Scanner keybd= new Scanner(System.in);
        String words[] = new String[10];

        String store;



        for (int i=0; i<10; i++) {

            System.out.println("Enter word: ");
            store = keybd.nextLine();
            words[i] = store;

            System.out.println(words);
            System.out.println(store);
        }

    }

}
