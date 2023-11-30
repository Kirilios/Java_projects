package java_seminars;
//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class task5 {
    public static void main(String[] args) {
        String s ="Добро пожаловать на курс по Java";
        String[] array = m.split(" ");
        System.out.println(Arrays.toString(array));
        for(int i = array.length-1; i >= 0; --i){
            System.out.print(array[i] + " ");
        }
    }
}
