package exercise;

class Book{
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;

    }
    public void displayDetail(){
        System.out.println("Title of book: "+title);
        System.out.println("Book author: "+author);
        System.out.println("Price: "+price);
    }

}


public class exercise3 {
    public static void main (String[] args){

Book obj = new Book("A way to heaven with Java ", "Rayuth",  30.55);
        obj.displayDetail();


    }
}
