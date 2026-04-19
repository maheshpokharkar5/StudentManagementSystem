interface Addition
{
   int add(int x,int y);
}


class LambdaExpressionExample4
{
    public static void main(String[] args)
   {
        Addition a1=(a,b)->(a+b);
         
        int res=a1.add(32,68);
        System.out.println("Addition "+res);
   }
}


