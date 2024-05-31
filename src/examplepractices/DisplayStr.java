package examplepractices;

public class DisplayStr {
    public static void main(String[] args) throws Exception
    {
        StringBuilder str = new StringBuilder();
        str.append("Shree");
        System.out.println("String = " + str.toString());
        StringBuilder str1 = new StringBuilder("Gajanan Technologies");
        System.out.println("String1 = " + str1.toString());
        StringBuilder str2 = new StringBuilder(10);
        System.out.println("String2 capacity = " + str2.capacity());
        StringBuilder str3 = new StringBuilder(str1.toString());
        System.out.println("String3 = " + str3.toString());
    }
} 