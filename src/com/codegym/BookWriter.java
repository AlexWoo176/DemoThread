package com.codegym;

public class BookWriter implements Runnable {
    Book book;
    public BookWriter(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        synchronized (book) {
            System.out.println("Author is Starting book: " + book.getTitle());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            book.setCompleted(true);
            System.out.println("Book has been Completed now");
//            book.notify();
//            System.out.println("Notify one reader");
            book.notifyAll();
            System.out.println("Notify reader");
        }

    }
}
