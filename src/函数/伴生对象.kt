package 函数

/**
 * Companion Object 伴生对象  == JAVA里的静态 static
 * HttpRequest -> 加载到内存类对象 Class（静态属性 静态方法）-> 对象（成员方法 实例方法）
 */
fun main() {
    println(HttpRequest.URL)
    HttpRequest.loadData()
    ImageUtil.saveBitmapToFile()
}

// 静态类object
// 都是静态属性 静态方法
// 替换java里面的工具类
object ImageUtil{
    var URL: String = "www.baidu.com"

    fun scale(){

    }

    fun saveBitmapToFile(){

    }

    fun mohu(){

    }
}

// 普通类里面有静态方法 在里面用 companion object
class HttpRequest{
    companion object {
        val URL: String = "http://www.baidu.com"
        fun loadData(){
            println("下载数据")
        }
    }
}