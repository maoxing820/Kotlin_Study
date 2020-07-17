package 函数

/**
 * 启动app -> 登陆 -> 加载主页数据
 *                -> 保存用户信息
 */

fun login(name: String, funParam: (Int) -> String){
    //...登陆
    val id = 1

    // 进一步操作
    //val result = loadMainData(id)
    //val request = saveUserInfo(id)
    funParam(1).also { println(it) }
}

fun loadMainData(id: Int): String{
    println("加载主页数据")
    return "加载成功...数据"
}

fun saveUserInfo(id: Int): String{
    println("保存信息")
    return "保存信息成功 ..."
}

/**
 * 如何定义一个函数变量
 */

fun main() {
    // 函数名仅仅是这个函数的名称
    // 函数名前面 + :: 表示这个函数的对象 即临时函数对象

    // 通过变量调用函数
    // 函数已经定义好了 只需要赋值给某个变量
    // 函数作为对象赋值给其他变量 不要函数名
    var funA = ::loadMainData
    funA(10).also { println(it) }

    (::loadMainData)(10).also { println(it) }
    (::loadMainData).invoke(20).also { println(it) }


    // 匿名函数
    var fun0 = fun(id: Int): String{
        println("加载主页数据")
        return "加载成功...数据"
    }

    /**
     * Lambda表达式 == 匿名函数
     * 注意：如果函数有返回值 不能使用return 默认返回最后一行内容
     * 函数使用大括号括起来{
     *    函数的参数 -> 返回值类型
     *    函数体body
     * }
     */

    // () -> Unit
    var fun1 = {

    }

    // (Int,Int) -> Int
    var fun3 = { a: Int, b: Int -> Int
        a + b
    }

    // (Int) -> String
    var funLoad = { id: Int -> String
        println("加载主页数据")
        "$id 加载成功 。。。 数据"
    }

    var funSave = { id: Int -> String
        println("保存数据")
        "$id 保存信息成功 ..."
    }

    println("*************************")
    login("jack", funLoad)
    login("mary", funSave)


    // 函数直接作为参数传递过去
    login("jack", { id: Int -> String
        println("测试成功 得到id为$id")
        "yes"
    })

    // 函数哦作为最后一个参数 则
    login("jack") { id: Int -> String
        println("测试成功 得到id为$id")
        "yes"
    }

    // 如果表达式中参数只有一个 这个参数可以省略
    // 默认提供名字为it
    login("jack") {
        "测试成功 得到id为$it"
    }
}