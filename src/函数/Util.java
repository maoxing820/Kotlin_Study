package 函数;

/**
 * 当Util 被调用 -> 加载到内存Util -> 类对象Class同时静态内容创建 -> 对象（类与对象基础语法.show()实例方法和属性)
 */
public class Util {
    public static String URL = "www.baidu.com";

    // 静态方法 直接使用Util类调用
    public static void loadData(){
        System.out.println("下载图片");
    }

    // 实例方法 必须实例化这个对象 用这个对象来创建
    public void show(){

    }
}

