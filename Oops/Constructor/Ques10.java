//10. Real-Life Example
// Create a class Movie with attributes title, genre, and rating.
// Use a parameterized constructor to initialize data and display movie info.
import java.util.*;

class Movie{
    String title;
    String genre;
    double rating;

    Movie(String title,String genre,double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
    void display(){
        System.out.println("Movie name : "+title+" | genre : "+genre+" | rating : "+rating);
    }
}
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie mv1 = new Movie("pardesh", "Romantic", 4.6);
        mv1.display();
        sc.close();
    }
}