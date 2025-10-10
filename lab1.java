//with constructor
public class lab1 {
    public String title;
    public String author;
    public int price;

    public lab1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        lab1 book = new lab1("Rich Dad Poor Dad", "Robert Kiyosaki", 499);
        book.display();
    }
    
}


/*Without constructor
public class lab1 {
    public String title;
    public String author;
    public int price;

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        lab1 book = new lab1();
        book.title = "Rich Dad Poor Dad";
        book.author = "Robert Kiyosaki";
        book.price = 499;
        book.display();
    }
 */
