public class ReduceNumToZero1342 {
    public static void main(String[] args) {
        reduceNumToZero1342 Reduce = new reduceNumToZero1342();
        System.out.println(Reduce.reduceNum(14));;
    }

    public static class reduceNumToZero1342 {
        public int reduceNum(int num) {
            int output = 0;

            while (num != 0) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = num - 1;
                }
                output++;
            }

            return output;
        }
    }

}
