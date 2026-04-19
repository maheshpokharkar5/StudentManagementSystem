interface ABC
{
   void say(String name);
}


class LambdaExpressionExample2
{
    public static void main(String[] args)
   {
        ABC a1=
           (x)->
          {
            System.out.println("Hello "+x);
           } ;

        a1.say("Nitin");
   }
}


