package com.codegym;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The VietNam");

        BookReader namReader = new BookReader(book);
        BookReader nuReader = new BookReader(book);

        Thread namThread = new Thread(namReader, "Nguyệt Công Tử");
        Thread nuThread = new Thread(nuReader, "Tinh Nhi");

        nuThread.start();
        namThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BookWriter bookWriter = new BookWriter(book);
        Thread bookWriterThread = new Thread(bookWriter);
        bookWriterThread.start();

    }
}
