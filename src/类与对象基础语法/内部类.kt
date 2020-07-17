package 类与对象基础语法
class Bank{
    //var money: Money ?= null
    //lateinit var money: Money
    var money: Money = Money(0)
    // 钱
    // 嵌套类 Nested
    // 独立 不能访问宿主类的属性和方法
    class Money(var num: Int){}

    // 银行卡
    // 内部类 inner
    inner class Card(var ID: Int){
        fun save(count: Int){
            money.num += count
            println("存款成功 余额${money.num}")
        }

        fun withdraw(count: Int){
            if (money.num >= count){
                money.num -= count
                println("取款成功 余额为${money.num}")
            }else{
                println("余额不足")
            }
        }
    }
}

fun main() {
    val card = Bank().Card(6217)
    card.save(1000)
    card.withdraw(300)
}