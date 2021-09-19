package com.company.models;
import java.util.Arrays;

/**
 * @author ilau020203
 * @version 0.0.1
 */

public class Model {
    String[] strings;

    /**
     * create Model
     * @param n count stings
     */
    public Model(int n){
        this.strings = new String[n];
    }

    /**
     * get array stings
     * @return array stings
     */
    public String[] getStrings() {
        return strings;
    }

    /**
     * set array of strings
     * @param strings array of strings
     */
    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    /**
     * sorting arrays of stings
     */
    public  void  sort(){
         Arrays.sort(strings);
    }
}
