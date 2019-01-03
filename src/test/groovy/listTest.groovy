/**
 * list
 */
/*List<Integer> list = new ArrayList<>()
list.add(1)
list.add(2)
list.add(3)
println(list)*/

def list2 = [1,2,3]
//println(list2)
//println(list2[0])
//println(list2[0..2])
list2 = list2 + [4,5]
println(list2)
list2 << 6
println(list2)
println(list2.class)
println("-----------------------------------------------")
//遍历
list2.each {print it + " " }
/*def list3 = [1, "a", true]
println(list3)*/

/*
def list4 = new ArrayList()
list4.add(1)
list4.add(2)
list4.add(3)
println(list4)*/

/*//3. 指定集合的类型有两种方式
//方式1 通过 as 操作符来指定
//方式2 通过强类型定义的方式来指定

def list3 = [1, 2, 3] as LinkedList
//println list3.class//class java.util.LinkedList
LinkedList list4 = [4, 5, 6]
println list4.class//class java.util.LinkedList*/
