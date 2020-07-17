package 函数

/**
 * 饿汉式
 */
class Person private constructor(){
    companion object{
        val instance = Person()
    }
}
object Person2

/**
 * 懒汉式
 */
class Sqlite private constructor(){
    companion object {
        var default: Sqlite ?= null

        fun getInstance(): Sqlite {
            if (default == null) {
                synchronized(this) {
                    default = Sqlite()
                }
            }
            return default!!
        }
    }
    fun show(){
        println("hello")
    }
}

class Sqlite2 private constructor(){
    companion object {
        val default: Sqlite2 by lazy(LazyThreadSafetyMode.SYNCHRONIZED){
            Sqlite2()
        }
    }
fun show(){
        println("hello11")
    }
}

fun main() {
    var q = Person.instance
    println(q)

    var person1 = Person2
    var person2 = Person2
    println(person1)
    println(person2)

    Sqlite.getInstance().show()
    Sqlite2.default.show()
}