package 类与对象基础语法

// 接口 -> 统一接口
// 接口不能被实例化 只能实例化接口的实现类
// 接口的方法默认是 open
interface OnTouchListener{
    fun onTouchEvent(type: String)
}

fun didTouch(listener: OnTouchListener){
    listener.onTouchEvent("手指按下")
}

// 方法1: 定义类实现接口 -> 实例化这个实现类
class ButtonListener: OnTouchListener {
    override fun onTouchEvent(type: String) {
        println("接收到事件为: $type")
    }

}

// 匿名类的方式实现
fun main() {
//    var btn = 类与对象基础语法.ButtonListener()
//    类与对象基础语法.didTouch(btn)
    didTouch(ButtonListener())
    // apply -> this
    // also -> it
    ButtonListener().apply { didTouch(this) }
    ButtonListener().also { didTouch(it) }

    // 匿名内部类
    didTouch(object : OnTouchListener {
        override fun onTouchEvent(type: String) {
            println("匿名内部类接收到: $type")
        }
    })
}

class QQ{
    fun show(){
        dispatchTouch(object: OnTouchListener {
            override fun onTouchEvent(type: String) {
                println("实现了！")
            }

        })
    }
    fun dispatchTouch(listener: OnTouchListener){
        listener.onTouchEvent("手指在滑动")
    }

    interface OnTouchListener{
        fun onTouchEvent(type: String)
    }
}