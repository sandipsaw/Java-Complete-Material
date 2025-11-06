//4. Default + Parameterized
// Create a class Book having both default and parameterized constructors.
// Create one object using each and display their details.

import java.util.*;
class Book{
    String name;
    String author;
    int price;

    Book(){
        name = "java";
        author = "James Gosling";
        price = 2000;
        System.out.println("this is the detail of book");
    }
    Book(String name,String author,int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("name : "+name+" author : "+author+" price : "+price);
    }
}
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book("java script","branden ech",1500);
        b1.display();
        Book b2 = new Book();
        b2.display();
        sc.close();
    }
}