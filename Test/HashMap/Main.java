package Test.HashMap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        //Data structure that stores key-value pairs


        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 250.00);
        map.put("Banana", 175.00);
        map.put("Grape", 150.00);

        System.out.println(map);

        System.out.println(map.containsKey("Grape"));

        for(String key : map.keySet()){

            System.out.println(key + " : " + map.get(key));

        }

    }
}
