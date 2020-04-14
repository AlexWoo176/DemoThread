package demo.thread;

public class Table {
      synchronized void printTable(int n) {
         System.out.println("Chay Tung Luong: ");
             for (int i = 1; i <= 5; i++) {
                 System.out.println(n * i);
                 try {
                     Thread.sleep(400);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
    }
}
