package classwork20.library.controller;

import classwork20.library.model.Book;

public class Library {

    // fields
    // ARRAY FOR BOOKS
    private Book[] books;

    // number of books in library

    private int size;

    public Library(int capacity) {
    this. books = new Book[capacity];
    this.size = 0;
    }

    // methods
    // addBook
    public boolean addBook(Book book){
        // необходимо в массив добавить элемент
        // предупредить, что не добавляется null, не добавляется дубликат, нельзя вместить библеотеки

        if (book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
        books[size] = book; // size - это индекс книжки, которой еще нет в массиве, size - 1 - это последняя, которая есть

        size++;
        return true;
    }

    private Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn()==isbn){
                return books[i];
            }
        }
        return null;
    }

    // print books
    public void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
        System.out.println("===========================================");
    }

    // получение кол-ва книг в библиотеке;

    public int getSize(){
        return size;
    }

    public Book removeBook(long isbn){
        // найдем жертву, удаляем книгу
        Book victim = null;
        // ищем книгу по isbn
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                victim = books[i];
                books[i] = books[size - 1]; // на места i-й книги поставили последнюю
                books[size - 1] = null;
                size --;
                break;
            }
        } return victim;
        // на ее место поставим последнюю книгу из имеющихся в массиве

        // return удаляем книгу
    }
}
