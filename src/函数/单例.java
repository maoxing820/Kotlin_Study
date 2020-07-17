package 函数;

public class 单例 {
    public static void main(String[] args) {
        HttpOperation httpOperation1 = HttpOperation.getInstance();
        HttpOperation httpOperation2 = HttpOperation.getInstance();
        HttpOperation httpOperation3 = HttpOperation.getInstance();
        httpOperation1.show();

        System.out.println(httpOperation1);
        System.out.println(httpOperation2);
        System.out.println(httpOperation3);
    }
}

class Work{
    private static Work instance;
    private Work(){

    }

    public void show(){
        System.out.println("单例测试");
    }
    public static Work getInstance() {
        if (instance == null){
            synchronized (Work.class){
                if (instance == null){
                    instance = new Work();
                }
            }
        }
        return instance;
    }
}

class HttpOperation {
    //静态方法先访问静态属性 静态对象
    private static HttpOperation instance; //懒汉式 先不创建 等需要的时候再创建

    public void show(){
        System.out.println("单例测试");
    }

    private HttpOperation(){
    }

    // static 静态方法优先加载 用类本身来调用 不需要创建对象；
    public static HttpOperation getInstance(){
        //判断对象是否有值
        if(instance == null){
            // 加锁
            synchronized (HttpOperation.class) {
                if(instance == null){
                    // 创建一个对象
                    instance = new HttpOperation();
                }
            }
        }
        return instance; // private的instance 不能在类外被访问 所以把instance变为静态属性
    }
}

class Util1{
    public static Util1 instance = new Util1();

    private Util1(){
    }
}

class Util2{
    private static Util2 instance;
    private Util2(){}

    public static Util2 getInstance() {
        if (instance == null){
            synchronized (Util2.class){
                if (instance == null){
                    instance = new Util2();
                }
            }
        }
        return instance;
    }
}