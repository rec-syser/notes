package base;

import java.util.Scanner;

@SuppressWarnings("all")
public class BaseMain {
    public static void main(String[] args) {
//        int a = 0;
//        String b = "b";
//        String[] c = new String[5];
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c[0]);
//        Colors color = Colors.RED;
//        Colors.RED.ordinal(); //  返回枚举常量的位置
//        System.out.println(  );

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SAMLL, MEDIUM)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println( "size: " + size );
        System.out.println("abbrevation: "+size.getAbbrevation());
    }
}
