class mynewthr1 extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("thnx");
            i++;
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
             class mynewthr2 extends Thread {
                public void run() {
                    while (true) {


                        System.out.println("My thnx");

                    }
                }
           }




    public class threadss {
        public static void main(String[] args) {
            mynewthr1 t1 = new mynewthr1();
            mynewthr2 t2 = new mynewthr2();
            t1.start();
            t2.start();
        }

    }

