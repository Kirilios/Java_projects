package java_projects_lection;
public class program {
    public static void main(String[] args) {
        System.out.println("тип - идентификатор - идентификатор = значение");
        int g = 534;
        // string dam = "Hello";
        short age = 10;
        float w = 2.7f; // float needs f at the end
        double pi = 324.55;
        char ch = '1';
        System.out.println(Character.isDigit(ch));
        var i = 123; // неявная типизация
        System.out.println(i);
        System.out.println(getType(i));
        boolean x = true && false;
        System.out.println(true);
    }
    

    static String getType(Object o) {
        return o.getClass().getSimpleName();}
    public static void main1(String[] args){
        // Классы обертки?
        // String s ="qwer";
        // s.charAt(1);
        // System.out.println(Integer.MIN_VALUE);
        // Операции
        int a = 123;
        a++;
        a = --a - a--;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);
        boolean f = 123 > 234;
        System.out.println(f);
        int y = 8;
        // 1000
        // a = a << 1;
        System.out.println(y << 1);
    
}
}
// Память
// float = 32 b, double = 64, int = 32, long = 64, 
// char = 8, byte = 8 , short = 16 boolean = 1
// string
//загуглить строчку - java методы класса String