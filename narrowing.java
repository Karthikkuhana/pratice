class narrowing
 {
   public static void main(String args[])
   { 
    double d=32829.237;
    float f=(float)d;
    long l=(long)f;
    int i=(int)l;
    System.out.println(f);
    System.out.println(l);
    System.out.println(i);

   }
 }
