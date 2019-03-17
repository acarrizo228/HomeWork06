package com.epam.homework06;

public class Books {
    private Book[] book;
    int index = -1;

    public Books() {
    }

    public Books(int size) {
        book = new Book[size];
    }

    public void addBook(Book book) {
        if (index == this.book.length) {
            System.out.println("Sorry, but library is full.");
        } else {
            this.book[++index] = book;
        }
    }

    public void showLibrary() {
        if (index < 0) {
            System.out.println("Sorry, but library is empty");
        } else {
            for (int i = 0; i <= index; i++) {
                book[i].view();
                System.out.println();
            }
        }
    }

    public void getNewPrice(int percent) {
        for (int i = 0; i <= index; i++) {
            int cost = book[i].getCost();
            cost = cost + (cost / 100 * percent);
            book[i].setCost(cost);
        }
    }

    public int count(int year) {
        int size = 0;
        for (int i = 0; i <= index; i++) {
            if (book[i].getYear() > year) {
                size++;
            }
        }
        System.out.println(size);
        return size;
    }

    public Books findSinceYear(int year) {
        int size = count(year);
        if (size > 0) {
            Books list = new Books(size);
            for (int i = 0; i <= index; i++) {
                if (book[i].getYear() >= year) {
                    list.addBook(book[i]);
                }
            }
            return list;
        } else {
            System.out.println("Не найдено книг старше этого года");
            return new Books(0);
        }
    }

    public int count(String author) {
        int size = 0;
        for (int i = 0; i <= index; i++) {
            if (book[i].getAuthor().equals(author)) {
                size++;
            }
        }
        return size;
    }


    public Books findByAuthor(String author) {
        int size = count(author);
        if (size > 0) {
            Books list = new Books(size);
            for (int i = 0; i <= index; i++) {
                if (book[i].getAuthor().equals(author)) {
                    list.addBook(book[i]);
                }
            }
            return list;
        } else {
            System.out.println("Не найдено книг с таким автором");
            return new Books(0);
        }
    }
}

