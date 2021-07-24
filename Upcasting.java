
class A
 {
   public void run ()
   { 
    System.out.println("Hello Shruthi");
   }
 }
class B extends A
{
  public void fly()
  {
    System.out.println("Hello karthik");
  }
}
 public class Upcasting
{
  public static void main(String args[])
  {
  A a1 =new B();
  a1.run();
  }
}
