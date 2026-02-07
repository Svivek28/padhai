package out.vivek;

class A
{
    static void show()
    {
        System.out.println("Amit");
    }

}
class B extends A
{
    static void show()
    {
        System.out.println("sumit");
    }
}
class example
{
    public static void main(String[] args) {
        A ob=new B();
        ob.show();
    }
}