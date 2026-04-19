interface Addition
{
   int add(int x,int y);
}


class LambdaExpressionExample3
{
    public static void main(String[] args)
   {
        Addition a1=
           (a,b)->
          {
              return a+b;
           } ;

        int res=a1.add(32,68);
        System.out.println("Addition "+res);
   }
}


