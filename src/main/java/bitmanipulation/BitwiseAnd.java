package bitmanipulation;

public class BitwiseAnd {
    public static void main(String[] args) {
        System.out.println("& "+ (5 & 3));
        System.out.println("| "+ (3 | 6));
        System.out.println("XOR "+ (3 ^ 6));
        System.out.println("bitwise not(~) "+ (~3));
        System.out.println(1<<3);
        System.out.println(4>>1);
        System.out.println(4>>>1);
        System.out.println(-3<<1);
        System.out.println(-3>>>1);


    }
}
