/**
 * 展开(spread)操作符
 */
//有一些情况一个集合正好跟方法调用的参数匹配，在这个情况下，我们就可以使用展开操作符进行调用方法，例如，你想象一下你以下的方法签名：
int function(int x, int y, int z) {
    x*y+z
}
//然后你有如下的集合：
def args = [4,5,6]
def result = function(*args)
println(result)

//而且将展开的方法参数和普通的参数混合使用也是可以的：
args = [4]
result = function(*args,5,6)
println(result)

//展开的集合元素
//当被用在一个集合常量中，展开操作符就可以将集合元素内容内联到集合中：
//items集合直接插入list中而无需调用addAll()方法
def items = [4,5]
def list = [1,2,3,*items,6]
println list