package InnerClass2;

/*
1. Inner Classes
* Cannot define static properties or methods
* 实例内部类当中，包含了外部类的this
*
 */
class Outclass{
    public int data1 = 1;
    private int data2 = 2;
    public static int data3 = 3;

    class Innerclass{
        public int data1 = 2222;
        public int data4 = 4;
        private int data5 = 5;
        public int data6 = 6;

        public Innerclass(){
            System.out.println("Innerclass::int()");
        }

        public void test(){
            System.out.println(data1);
            System.out.println(this.data1);
            System.out.println(Outclass.this.data1);
        }
    }

    public void func(){
        System.out.println("Outclass::func()");
    }
}

public class test {
    public static void main(String[] args) {
        Outclass outclass = new Outclass();
        Outclass.Innerclass innerclass = outclass.new Innerclass();
        innerclass.test();
    }
}
