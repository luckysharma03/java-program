package skl_oop_java_B3;

/*
 *  Aim :Write a program to print alphabets and numbers using two threads.
* Name : Sharma lucky
* UIN : 231P061
* Div : A.
*/

class PrintAlphabets extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

class PrintNumbers extends Thread {
    @Override
    public void run() {
        for (int num = 1; num <= 26; num++) {
            System.out.print(num + " ");
        }
    }
}

public class AlphabetNumberPrinter {
    public static void main(String[] args) {
        // Create instances of both threads
        Thread alphabetThread = new PrintAlphabets();
        Thread numberThread = new PrintNumbers();

        // Start both threads
        alphabetThread.start();
        numberThread.start();

        // Wait for both threads to finish
        try {
            alphabetThread.join();
            numberThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nBoth threads finished execution.");
    }
System.out.print("lucky sharma / 42 / 231P061 ");
}
