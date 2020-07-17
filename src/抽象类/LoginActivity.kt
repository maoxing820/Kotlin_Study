package 抽象类

class LoginActivity(override var title: String) : BaseActivity() {

    override fun onCreate() {
        println("界面被创建了")
    }

    override fun onPause() {
        super.onPause()
        println("该方法使用 open修饰 重写了")
    }
}

fun main(){
    LoginActivity("11")
}


