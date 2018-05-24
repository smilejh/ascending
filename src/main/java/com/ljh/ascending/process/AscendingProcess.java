package com.ljh.ascending.process;

import java.util.List;
import java.util.stream.Collectors;

public class AscendingProcess {

    public static String getAscendingResult(List<Character> alphabetList, List<Character> numberList) {
        List<Character> sortedAlphabetList = alphabetList.stream().sorted().collect(Collectors.toList());
        List<Character> sortedNumberList = numberList.stream().sorted().collect(Collectors.toList());

        StringBuilder ascendingResult = new StringBuilder();

        for( int i=0; i<sortedAlphabetList.size(); i++ ) {
            ascendingResult.append(sortedAlphabetList.get(i));
            if( i<sortedNumberList.size() ) {
                ascendingResult.append(sortedNumberList.get(i));
            }
        }

        for( int i=sortedAlphabetList.size(); i<sortedNumberList.size(); i++ ) {
            ascendingResult.append(sortedNumberList.get(i));
        }

        return ascendingResult.toString();
    }
}
