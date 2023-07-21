package InnerClass2;

//how to get static innerclass object?
//实例内部类
//不能在静态内部类中，直接access外部类非static的数据
class Outclass1{//外部类
    public int data1 = 1;//非静态的数据
    private int data2 = 2;//非静态的数据
    public static int data3 = 3;

    static class Innerclass{//静态内部类
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;

        public Innerclass(){
            System.out.println("静态内部类的构造方法");
        }
        public void test(){
            System.out.println("test function run");
            System.out.println(data3);
            Outclass1 outclass1 = new Outclass1();//提供外部类对象的引用
            System.out.println(outclass1.data1);
            System.out.println(outclass1.data2);
        }
    }
}

public class test2 {
    public static void main(String[] args) {
        Outclass1.Innerclass innerclass = new Outclass1.Innerclass();
        innerclass.test();
    }

}
