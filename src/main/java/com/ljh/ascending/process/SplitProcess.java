package com.ljh.ascending.process;

import java.util.ArrayList;
import java.util.List;

public class SplitProcess {
    private List<Character> alphabetList;
    private List<Character> numberList;

    public List<Character> getAlphabetList() {
        return alphabetList;
    }

    public void setAlphabetList(List<Character> alphabetList) {
        this.alphabetList = alphabetList;
    }

    public List<Character> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Character> numberList) {
        this.numberList = numberList;
    }

    public boolean stringSplit(String inputStr) {
        alphabetList = new ArrayList<>();
        numberList = new ArrayList<>();

        for( int i=0; i<inputStr.length(); i++ ) {
            char inputCh = inputStr.charAt(i);
            if( inputCh >= 'a' && inputCh <= 'z' ) {
                alphabetList.add(inputCh);
            } else if( inputCh >= '0' && inputCh <= '9') {
                numberList.add(inputCh);
            } else {
                return false;
            }
        }
        return true;
    }

}
