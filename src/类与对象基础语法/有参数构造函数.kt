package 类与对象基础语法

fun main() {
    val bz = Car("奔驰")
    val xw = Student("xw")
    xw.name = "zs"
    println(xw.name)

    val lxj = Student("李进")

    val zs = Student(wife = "rose")
    println(zs.wife)
}
// 类与对象基础语法.Student = 类与对象基础语法.Student1
class Student(var name: String = "李四", var wife: String ?= null){

}
class Student1(aname: String){
    val name = aname
}
// 主构造函数带有参数
// 参数是局部变量
// 外部无法访问
// 当对象初始化的方法里面可以访问
class Car(brand: String){
    var myBrand = brand

    init {
        println(brand)
    }

    constructor(brand: String, color: String):this(brand){

    }
}