package InnerClass;

//外部类不能是静态的static
class Outclass{
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    /**
     *Innerclass:
     * 1. how to get a object of static Innerclass?
     * Outclass.Innerclass innerclass = new Outclass.Innerclass();
     *
     * 2. 不能在静态内部类中，直接访问外部类非静态的数据成员（static 静态）
     * 有两种方法可以帮助访问外部类非静态数据成员
     *  outclass = new Outclass();
     *  System.out.println(outclass.data1);
     *  System.out.println(outclass.data2);
     */
    //Method 1
    static class Innerclass{
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;
        public Outclass outclass;

        public Innerclass(Outclass outclass){
            System.out.println("Method of static Innerclass");
            this.outclass = outclass;
        }
        public void test(){
            System.out.println("Test method is running");
//            Outclass outclass = new Outclass();
//            System.out.println(outclass.data1);
//            System.out.println(outclass.data2);
            System.out.println(outclass.data1);
            System.out.println(outclass.data2);
            System.out.println(data3);
            System.out.println();
        }
    }
}



public class test {
    public static void main(String[] args) {
        Outclass.Innerclass innerclass = new Outclass.Innerclass(new Outclass());
        innerclass.test();
    }
}

//class Outclass{
//    public int data1 = 1;
//    private int data2 = 2;
//    public static int data3 = 3;
//
//    /**
//     *Innerclass:
//     * 1. how to get a object of static Innerclass?
//     * Outclass.Innerclass innerclass = new Outclass.Innerclass();
//     *
//     * 2. 不能在静态内部类中，直接访问外部类非静态的数据成员（static 静态）
//     * 有两种方法可以帮助访问外部类非静态数据成员
//     *  outclass = new Outclass();
//     *  System.out.println(outclass.data1);
//     *  System.out.println(outclass.data2);
//     */
////  Method 2
//    static class Innerclass{
//        public int data4 = 4;
//        private int data5 =