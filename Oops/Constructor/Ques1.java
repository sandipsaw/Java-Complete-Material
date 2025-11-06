//1. Default Constructor
// Create a class Car with data members brand and price.
// Use a default constructor to initialize them and print their values.

import java.util.*;
class Car{
    String brand;
    int price;

    Car(){
        brand = "Discover";
        price = 115000;
    }
    void display(){
        System.out.println("brand : "+brand+" price : "+price);
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        c1.display();

        sc.close();
    }
}