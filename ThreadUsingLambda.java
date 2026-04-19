class ThreadUsingLambda
{
   public static void main(String[] args)
  {
      new Thread(()->
    {
    System.out.println("Thread is running.........");
   }).start();

System.out.println("Hello World");

  }
}