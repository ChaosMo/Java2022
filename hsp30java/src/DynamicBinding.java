
public class DynamicBinding {
    public static void main(String[] args) {
        //a 的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        System.out.println(a.sum());//?40 -> 30
        System.out.println(a.sum1());//?30-> 20

        System.out.println(a.i);
    }
}

class A {//父类
    public int i = 111;
    //动态绑定机制:

    public int sum() {//父类sum()
        return getI() + 11;//20 + 10
    }

    public int sum1() {//父类sum1()
        return i + 11;//10 + 10
    }

    public int getI() {//父类getI
        return i;
    }
}

class B extends A {//子类
    public int i = 222;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {//子类getI()
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
    public void foo() {}
}
