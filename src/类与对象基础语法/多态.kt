package 类与对象基础语法

open class Animal(){
    open fun sleep(){
        println("动物冬眠")
    }
}

class Dog(): Animal(){
    override fun sleep() {
        println("在家里冬眠")
    }
}

fun whereToSleep(animal: Animal){
    animal.sleep()
}

interface OnClickListener{
    fun onClick()
}

class Button: OnClickListener {
    override fun onClick() {
        println("按钮被点击了")
    }
}

class Image1: OnClickListener {
    override fun onClick() {
        println("图片被点击了")
    }
}

fun test(listener: OnClickListener){
    listener.onClick()
}


// 继承与接口 的 多态
// 目的 统一接口子类向父类转 但实现子类的方法
fun main() {
    var an = Animal()
    var dg = Dog()

    whereToSleep(dg)

    test(Image1())
    test(Button())
}