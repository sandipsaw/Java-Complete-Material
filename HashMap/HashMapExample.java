import java.util.*;
import java.util.Map;
public class HashMapExample  {
    public static void main(String[] args) {
        // creation search iteration remove
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> map = new HashMap<>();

        map.put("India", 150);
        map.put("us", 30);
        map.put("china", 180);

        map.put("china", 120);
        System.out.println(map);

        // Search
        if(map.containsKey("china")){
            System.out.println("china is present in the map");
        }else{
            System.out.println("china is not present in the map");
        }

        if(map.containsKey("Australia")){
            System.out.println("Australia is present in the map");
        }else{
            System.out.println("Australia is not present in the map");
        }

        System.out.println(map.get("India")); // key exists
        System.out.println(map.get("InAustraliadia")); //key does not exists

        // int arr[] = {4,8,13,17,20};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i] +" ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val +" ");
        // }

        // for(int val : arr)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }
        map.remove("us");
        System.out.println(map);
        sc.close();
    }
}