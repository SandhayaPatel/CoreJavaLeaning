package src.oops_07_30Dec;

public class Lab112 {
    public static void main(String[] args) {
        int c=sum(3);
        int c1 = sum(3,5);
        int c2=sum();
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        sayHello();
    }
 static int sum(int a, int b){
        return  a+b;
}
static int sum(int a){
        return a;
}
static  int sum(){
        return 99;
}
 static void sayHello(){
    System.out.println("Hellos");
}
}
