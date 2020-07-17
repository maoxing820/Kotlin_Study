package 类与对象基础语法

fun main() {
    // 实例化对象 直接调用构造函数
    val xw = Person()
    val xs = Person2()
    val xl = Person3("string", 3)
}
/**
 * Kotlin里面构造函数分成两种
 * 1.祝构造函数 类的头部
 * 2.次构造函数 类的内部
 */
// 默认提供一个没有参数的构造函数
class Person{

}

class Person1(){

}

// 通过constructor关键字显示指定 这是构造函数
// 当有修饰（public，private）的时候 constructor不能省略
class Person2 constructor(){
    init {
        println("init方法")
    }
}

// 提供一个次构造函数
// 注意：次构造函数必须显示调用主构造函数
class Person3(){
    constructor(name: String): this(){

    }

    constructor(name: String, age: Int): this(){
        println("my age is $age")
    }
}