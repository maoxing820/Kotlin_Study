package 抽象类// 抽象类
// 一个界面Activity -> 加载 - 显示 -> 结束
// 一个app有多个界面
// 抽象成一个模板
// 抽取基类 base类 -> 供相关类使用
// 抽象类.BaseActivity -> LoginActivity: 抽象类.BaseActivity

/**
 * 抽象类里面可以定义
 * 抽象属性
 * 抽象方法
 * 普通方法 -> 有实现
 *
 * 抽象方法不能实现 抽象属性不能初始化
 * 如果是子类必须实现的 那么就定义为抽象方法
 * 否则就定义为 普通方法
 *
 * 抽象类默认情况下是 open 的
 */
abstract class BaseActivity{
    abstract var title: String
    init {
        //创建界面
        onCreate()
        //暂停界面
        onPause()
        //销毁界面
        onDestory()
    }

    abstract fun onCreate()

    open fun onPause(){
        println("界面暂停了")
    }

    fun onDestory(){
        println("界面销毁了")
    }
}

