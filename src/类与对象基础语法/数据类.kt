package 类与对象基础语法

// 数据模型
// MVP MVC MVVM model
// 数据类 Data Class
// 1.数据类的主构造函数必须有至少一次参数
// 2.参数必须使用var或者val修饰
// 3.不能使用 open inner abstract
data class User(
        var name: String,
        var password: String,
        var id: Int) {
}

fun main() {
    val u = User("jack", "123", 1)
    println(u)

    User("jack", "123", 1).also {
        print(it)
    }
}