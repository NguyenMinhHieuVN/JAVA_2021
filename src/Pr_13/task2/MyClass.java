package Pr_13.task2;

public class MyClass {
    public static <E> void  sid  (String s, E [] arr){

        E [] a = arr;
        AnyTapeArray <E> sid = new AnyTapeArray <E> ();
        sid.setArr(a);

        System.out.print(s + "  ");

        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");

        System.out.println();
    }

    public static void main(String [] args){

        String [] s = {"Hello", "World","!"};
        sid("String" , s);

        Integer [] intr = { 1,2,3,4,5,6,7,8,9};
        sid("Integer" , intr);

        Double [] ad = {1.1,1.3,2.7,3.6};
        sid("Double" , ad);

    }
}
