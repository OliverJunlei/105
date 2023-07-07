package Test;

class person {
    public String name;
    public int age;
    public person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法执行");
    }
    {
        System.out.println("实例代码块执行");
    }
    static {
        System.out.println("静态代码块执行");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person1 = new Person("bit",10);
        System.out.println("============================");
        Person person2 = new Person("gaobo",20);
    }
}
