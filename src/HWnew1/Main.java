package HWnew1;

public class Main {
    public static void main (String[] args){
        Author tolstoi = new Author("Лев" , "Толстой");
        Author pushkin = new Author("Александр","Пушкин");

        Book warAndPis = new Book("Война и мир",tolstoi,1967);
        Book evgenOneg = new Book("Евге́ний Оне́гин", pushkin,1833);

        System.out.println("Автор - " + tolstoi.getFirstName() + " "+ tolstoi.getLasName());
        System.out.println("произведение: " + warAndPis.getbookname());
        System.out.println("Год публикации - " + warAndPis.getPublishingYear());
        System.out.println();

        System.out.println("Автор - " + pushkin.getFirstName() + " "+ pushkin.getLasName());
        System.out.println("произведение: " + evgenOneg.getbookname());
        System.out.println("Год публикации - " + evgenOneg.getPublishingYear());
        System.out.println();

        evgenOneg.setPublishingYear(2005);
        System.out.println("Автор - " + pushkin.getFirstName() + " "+ pushkin.getLasName());
        System.out.println("произведение: " + evgenOneg.getbookname());
        System.out.println("Год публикации - " + evgenOneg.getPublishingYear());



    }

}
