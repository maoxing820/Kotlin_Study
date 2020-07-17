package 集合

/**
 * 集合 Collection
 * Array
 * List
 * Set
 * Map
 */

fun main() {
    /**
     * 第一种创建方式
     */
    // 如何创建Array
    val names = Array<String>(10) {
        "$it-str"
    }

    // 使用iterator来遍历数据
//    val iterator = names.iterator()
//    while (iterator.hasNext()){
//        //println(iterator.next())
//    }

//    names.iterator().also { iterator1 ->
//        while (iterator1.hasNext()) {
//            iterator1.next().also { println(it) }
//        }
//    }

    for (i in names.indices){

    }

    for (str in names){
        // println(str)
    }

    for ((i, str) in names.withIndex()){
        //println(str)
    }

    /**
     * 第二种创建方式
     */
    val names2 = arrayOf("jack", "rose")

    /**
     * 第三种方式
     */
    val names3 = arrayOfNulls<String>(10)

    /**
     * 第四种方式
     */
    val names4 = emptyArray<String>()
}