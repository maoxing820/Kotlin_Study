package 类与对象基础语法// 在已有类的基础上添加新的方法和属性
// 1.继承
// 2.函数扩展

// kotlin里面类默认不能被继承 必须有关键字open
// 而且和Java一样只能单继承 一个类只能继承一个open
// 但可以间接继承

open class Father(var name: String, var age: Int = 30){
    // 默认情况下 方法不能被重写 必须使用open修饰 才能被子类重写
    open fun work(){
        println("干农活")
    }
}

class Child(var myName: String, var fatherName: String): Father(fatherName,40){
    fun show(){
        println("类与对象基础语法.Father's name and my name are $fatherName $myName, His gae is $age")
    }

    // 子类重写父类的方法 必须使用override修饰
    override fun work(){
        // 如果子类需要调用父类的方法 使用supper
        super.work()
        println("写代码")
    }
}

fun main() {
    val xw = Child("小王", "老王")
    xw.show()
    xw.work()
}
