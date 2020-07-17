package 类与对象基础语法

import MyClass

// 封装 继承 多态
// 属性 和 方法 -> 整体
// 默认定义属性时 会自动创建对应的get-set方法
// val 常量属性 只有get
// var 变量属性 get&set
// kotlin类的属性声明的同时必须初始化 有初值
// 可以重写默认的set/get方法

// 默认情况下 任何一个属性都有一个内部变量 名字就是field
// 这个变量只能在初始化的时候调用 set/get
class Shape(){
    var name: String = "triangle" //定义的时候给值
        set(value) { field = value.toUpperCase()}
        get() = field.toLowerCase()

    // 设置外部改变 只读
    var password: String = "1234"
        private set // 不允许外部改变

}

class Boy{
    // ? -> 可空类型
    // 1.声明变量时 不确定有没有值
    // 2.接受Java的返回值
    var girlFriend: String ?= null

    fun show(){
        // 对于可空类型的对象 调用时必须使用?
        println(girlFriend?.length)
        // 明确指定这个对象一定不为空
        println(girlFriend!!.length)
    }
}



fun main(){
    Boy().show()

    val tt = MyClass.look()
    // 这个对象可能为空 null  就用 ?
    // 如果不为空，就执行对应的方法 避免报错
    println(tt?.length)

    val shape = Shape()
    shape.name = "Triangle" // 调用set方法
    println(shape.name)  // 调用get方法
}