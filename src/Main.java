class MyThread1 extends Thread {
    // Method to be called by multiple threads
    public  void run() {
        // Performing some task
        //sd
      for(int i=0;i<10;i++) {
          try {
              Thread.sleep(1000);
              System.out.println("Welcome Thread" + i);
              if (i == 5) {
                  throw new RuntimeException("Intentional Exception");
              }
          } catch (Exception e) {
              System.out.println("Catch");
              e.printStackTrace();
          }
      }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of class A
       MyThread1 t1=new MyThread1();
       t1.start();
    }
}
