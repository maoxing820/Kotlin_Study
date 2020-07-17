package 类与对象基础语法// 程序加载 -> 加载数据 -> 显示界面
// 程序加载 -> 显示界面
//         -> 加载数据

class Activity{
    // 懒加载
    // 当这个常量被调用的时候才会有值
    val data: String by lazy {
        "图片"
    }
    fun showActivity(){
        imgData = "lagi"
        println("显示下载的数据：$data")
    }

    // 延迟加载
    // 这个变量必须在某个时候初始化
    lateinit var imgData: String

}

fun main() {
    Activity().showActivity()
}