import java.util.TreeMap;
import java.util.Map;

class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 0 || numRows == 1){
            return s;
        }
        System.out.println("num rows: " + numRows);
        TreeMap<Integer, String> myMap = new TreeMap<>();
        int endKey = numRows; //used for concatMap
        String returnS; // Declared returnS

        while (s.length() != 0) {
            for (int i = 1; i <= numRows; i++){
                if (s.length() == 0){
                    returnS = concatMap (myMap,endKey);
                    return  returnS;
                }
                String news = ""+ s.charAt(0);
                s = s.substring(1);
                System.out.println(s);
                if (!myMap.containsKey (i)){
                    myMap.put(i, news);
                }
                else {
                    String olds = myMap.get(i);
                    olds = olds.concat(news);
                    myMap.put(i, olds);
                }

            } //close for loop
            for (int i = numRows-1; i > 1; i --){
                if (s.length() == 0){
                    returnS = concatMap (myMap,endKey);
                    return  returnS;
                }
                String news = ""+ s.charAt(0);
                s = s.substring(1);
                System.out.println(s);
                if (!myMap.containsKey (i)){
                    myMap.put(i, news);
                }
                else {
                    String olds = myMap.get(i);
                    olds = olds.concat(news);
                    myMap.put(i, olds);
                }
                       
            }//close for loop

        } //close while loop
        returnS = concatMap (myMap,endKey);
        return  returnS;
        
    }//close method

    //TreeMap organizes its keys in a sorted order
    public String concatMap (TreeMap<Integer, String> myMap, int endKey){

        String concatenatdString = "";
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            if (entry.getKey() >= 1 && entry.getKey() <= endKey) {
                concatenatdString = concatenatdString.concat(entry.getValue());
            } 
        }//close for loop
        return concatenatdString;
    }//close concatMap method
}


//After reachig the bottom of the first column you should:

// goto the next column, we can do map rowNum, String
// go 1 row up
// we can do string 1 + string 2 ....
//if you are at last row go on row up, if you are at first row go one row down
// two methods one for row 1 and another for last row
// do while string size is no 0
// for int = 1 and <= numrows 
// check if string size is not 0 {if it is return concatenated value of map}
// remove string char from string and add to map
// once loop breal

// for int 1 = numrows -1 til i 1--
// check if string size is not 0 {if it is return concatenated value of map}
// remove string char from string and add to map


