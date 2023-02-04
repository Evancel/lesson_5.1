

public class Main {
    public static void main(String[] args) {
        Author joanneRowling = new Author ("Rowling", "Joanne");
        Book harryPotter = new Book ("Harry Potter", joanneRowling, 1995);
        //распечатка с Автор = ссылка на объект
        System.out.println("Harry Potter: " + harryPotter.getName() + " " +
                harryPotter.getAuthor() + " " + harryPotter.getYear());
        //распечатка в привычном виде
        System.out.println("Harry Potter: " + harryPotter.getName() + " " + harryPotter.getAuthor().getFirstName() + " " +
                harryPotter.getAuthor().getLastName() + " " + harryPotter.getYear());
        //распечатка через метод ОК / не ОК ?
        System.out.println("Harry Potter: " + harryPotter.getName() + " " +
                harryPotter.authorToString() + " " + harryPotter.getYear());

        //изменяем год публикации
        harryPotter.setYear(1997);
        System.out.println("harryPotter.getYear() = " + harryPotter.getYear());

        Author johnTolkien = new Author("Tolkien","John");
        Book hobbit = new Book ("The Hobbit",johnTolkien, 1937);
        System.out.println("The Hobbit: " + hobbit.getName() + " " +
                hobbit.authorToString() + " " + hobbit.getYear());
    }
}