package com.ljh.ascending;

import com.ljh.ascending.process.AscendingProcess;
import com.ljh.ascending.process.SplitProcess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INPUT ('a'~'z', '0'~'9')");
        String inputLine = scan.nextLine();

        SplitProcess splitProcess = new SplitProcess();
        if( splitProcess.stringSplit(inputLine) ) {
            String result = AscendingProcess.getAscendingResult(splitProcess.getAlphabetList(), splitProcess.getNumberList());
            System.out.println(result);
        } else {
            System.out.println("WRONG INPUT.");
        }
    }
}
