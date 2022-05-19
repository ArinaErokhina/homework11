public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Стивен", "Кинг");

        Book theBookOfHorrors = new Book(stephenKing, "Книга ужасов", 2015);

        Author ransomRiggs = new Author("Ренсом", "Риггз");

        Book libraryOfSouls = new Book(ransomRiggs, "Библиотека душ", 2016);

        System.out.println(theBookOfHorrors);
        System.out.println(libraryOfSouls);

        System.out.println(theBookOfHorrors.equals(theBookOfHorrors));
        System.out.println(stephenKing.equals(stephenKing));
    }
}