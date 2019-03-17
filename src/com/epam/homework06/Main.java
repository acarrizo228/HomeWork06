package com.epam.homework06;

import java.util.Scanner;

public class Main {

    public static int intInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String stringInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Books library = new Books(10);
        Book books1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 2004, 180, 85);
        library.addBook(books1);
        Book books2 = new Book(2, "The Grapes of Wrath", "John Steinbeck", "Penguin Classics", 2006, 464, 51);
        library.addBook(books2);
        Book books3 = new Book(3, "Nineteen Eighty-Four", "George Orwell", "Berkley", 1949, 326, 47);
        library.addBook(books3);
        Book books4 = new Book(4,"Ulysses","James Joyce","Simon & Brown",1918,783,24);
        library.addBook(books4);
        Book books5 = new Book(5,"Lolita","Vladimir Nabokov","Vintage",1955,326,15);
        library.addBook(books5);
        library.showLibrary();
        System.out.print("Введите процент для смены цены: ");
        library.getNewPrice(intInput());

        System.out.print("Введите автора: ");
        library.findByAuthor(stringInput()).showLibrary();
        System.out.print("Введите год: ");
        library.findSinceYear(intInput()).showLibrary();
    }
}
