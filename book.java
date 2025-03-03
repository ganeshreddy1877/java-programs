public class book{
    String  title_of_the_book,author;
    int year_of_publication;
book(String title_of_the_book, String author, int year_of_publication){
  this.title_of_the_book=title_of_the_book;
  this.author=author;
  this.year_of_publication=year_of_publication;
  System.out.println("the title of the of the is :" +title_of_the_book+","+author+","+year_of_publication);}
  public void display(){
    System.out.println(title_of_the_book+","+author+","+year_of_publication);
  }
    public static void main(String[] args) {
        book b1 =new book("my die i die","priyadarshi",2018);
        b1.display();
        System.out.println(b1.title_of_the_book+","+b1.author+","+b1.year_of_publication);
        book b2=new book("avengers","stanlee",1990);
        b2.display();
            System.out.println(b2.title_of_the_book+","+b2.author+","+b2.year_of_publication);
        
    }
}
