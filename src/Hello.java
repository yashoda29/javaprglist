public class Hello {
    int a;
    static int b;
    Hello(){
        System.out.println("Constructor");
    }
    Hello(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("CP");
    }
    public void hello(){
        System.out.println("Method");
    }
    {
        System.out.println("Initializing Block");
    }

    static
    {
        System.out.println("Static Initializing Block");
    }
    public static void main (String[] args)
    {
        Hello h1 = new Hello();
        //System.out.println("h1.a=" + h1.a);
        //System.out.println("h1.b=" + h1.b);
        //System.out.println("b=" +b);
        //System.out.println("Hello.b=" + Hello.b);

        Hello h2 = new Hello(1,2);
        {
            int a = 5;
        }
            //int a = 5;
            //System.out.println(a);
    }
}
