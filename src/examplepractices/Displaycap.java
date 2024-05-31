package examplepractices;

public class Displaycap {
    public static void main(String[] args)
    {
        StringBuffer a = new StringBuffer();
        System.out.println(a.capacity());
        a.append("Hello");
        System.out.println(a.capacity());
        a.append("Welcome to Shree Gajanan");
        System.out.println(a.capacity());
    }
}