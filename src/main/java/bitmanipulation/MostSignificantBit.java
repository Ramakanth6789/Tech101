package bitmanipulation;

public class MostSignificantBit {

    public static void main(String[] args) {
        System.out.println(Integer.highestOneBit(33));
        System.out.println(getMostSignificantBit(33));

    }

    private static int getMostSignificantBit(int num) {
        int msb = 0;
        while(num>0){
            num = num>>1;
            msb++;
        }
        return 1 << (msb - 1);
    }
}
