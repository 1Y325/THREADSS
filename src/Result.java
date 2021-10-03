  abstract class First{
 abstract public void method1();

 
// class Second extends First{

  //
  // m1();

 public static void main(String[] args) {
   First obj1 = new First() {
    @Override
    public void method1() {
     System.out.println("welcome");
    }
   };
  }
}
