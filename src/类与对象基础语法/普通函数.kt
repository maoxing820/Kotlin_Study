package 类与对象基础语法

fun show(){

}

// Unit == void 空函数 返回值为空
fun buy(money: Int){

}

fun study(money: Int): Int{
    return 8000
}

/*
fun 类与对象基础语法.add(a: Int, b: Int): Int{
    return a + b
}*/

fun add(a: Int, b: Int) = a + b

fun work(money: Int = 6000, name: String, type: String = "android开发工程师"){

}

fun add(vararg names: Int){
    var result = 0;
    for (value in names){
        result += value
    }
    println(result)
}

fun showView(){
    fun loadData() = 1000

    fun showList(){
        // 下载数据
        loadData().also {
            println("显示下载内容：$it")
        }
    }

    showList()
}

// local function
/*fun 类与对象基础语法.showView(){
    fun loadData(): String = "图片"

    fun showList(){
        // 下载数据
        var img = loadData()
        // 展示
        println("显示下载内容： $img")

    }

    showList()
}*/

class TP(){
    fun goBack(): String = "泉水"
}
fun main() {
    work(name = "pxd")
    println(work(name = "pxd"))
    add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    showView()
    println(TP().goBack())
}