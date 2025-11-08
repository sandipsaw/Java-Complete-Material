# What is a HashMap in Java?

HashMap is a part of Java’s Collection Framework (in the package java.util).
It is used to store data in key–value pairs, just like a dictionary.

👉 Each key in a HashMap is unique,
but values can be duplicated.

syntax : 
```
import java.util.HashMap;

HashMap<KeyType, ValueType> map = new HashMap<>();
```
Example
```
HashMap<Integer, String> map = new HashMap<>();
```
Key → Integer  |   Value → String

Characteristics of HashMap
Property     	         Description
Order	           Not ordered (uses hashing internally)
Duplicates   	   Keys must be unique, but values can repeat
Null	           Allows one null key and multiple null values
Performance  	   Very fast (O(1) average for put/get)
Thread Safety	   Not synchronized (use ConcurrentHashMap if needed in multithreading)

```
import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements (key-value pairs)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Print the map
        System.out.println(map);

        // Access a value using key
        System.out.println("Value for key 2: " + map.get(2));

        // Remove an element
        map.remove(3);

        // Check if a key exists
        System.out.println("Contains key 1? " + map.containsKey(1));

        // Check if a value exists
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // Iterate through all keys and values
        for (Integer key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}
```
output :
```
{1=Apple, 2=Banana, 3=Cherry}
Value for key 2: Banana
Contains key 1? true
Contains value 'Banana'? true
1 → Apple
2 → Banana
```

there are two cases made in map.put();
if key is Already exists then value will be update
if key does not exists then new pair as (key & value) is inserted

```
HashMap<String , Integer> map = new HashMap<>();
    map.put("India", 150);
    map.put("us", 30);
    map.put("china", 180);

    map.put("china", 120);
    System.out.println(map);
```

there are two cases made in map.get("india");
if key is Already exists then we get the value of key
if key does not exists then we get null as a value

Example — Using entrySet()
```
for (var entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```
