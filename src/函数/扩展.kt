package 函数

import 函数.*

/**
 * Extension 扩展
 * 在已有类上添加属性和方法
 *
 * 1.继承
 * 2.装饰模式 组合模式
 * 3.扩展
 */

open class Car{

}

class Audi: Car(){

}

class Dazhong{
    val car = Car()
    val color: String = "white"

}

/**
 * 扩展
 *      fun 添加方法
 *      var 添加属性
 *      val
 * 实际上并没有添加到当前这个类
 * 当扩展方法或扩展属性和原有相同 那么原有的优先级高
 * 由于扩展属性没有backing filed 所以扩展属性不能存值也不能初始化
 * 相当于只是在类里面添加了对应的set或get方法
 * 必须为扩展属性显示声明 get或set
 *      val get
 *      var set get
 */

class Student(var name: String){
    fun work(){
        println("学习是我的工作")
    }
    companion object{

    }
}

fun Student.Companion.show(){
    println("测试静态方法")
}

val Student.Companion.url: String
    get() = "www.baidu.com"

// 方法扩展
fun Student.eat(){
    println("吃饭")
}
fun Student.work(){
    println("enjoy working")
}

// 属性扩展
val Student.grade: Int
    get() {
        println("grade的get方法")
        return 1
    }
var Student.score: Float
    get() = 86.4f
    set(value) {
        name = "${name}_${value}"
    }
fun main() {
    val s = Student("小王")
    s.work()
    s.work()
    s.eat()    
    s.score = 100f
    println(s.name)
    print(s.score)

    Student.show()
    val url = Student.url
    println(url)
}