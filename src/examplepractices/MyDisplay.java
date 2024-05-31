package examplepractices;

public class MyDisplay {
 
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("Shree Gajanan");
        s.insert(5, "for");
        System.out.println(s);
        s.insert(3, 3);
        System.out.println(s);
        s.insert(3, true);
        System.out.println(s);
        s.insert(1, 1);
        System.out.println(s);
        s.insert(2, 2);
        System.out.println(s);
        char abc_arr[] = { 't', 'e', 'c', 'h', 'o' };
        s.insert(2, abc_arr);
        System.out.println(s);
    }
}