/**
 * Groovy能进行多重赋值
 */
/*def (id,name) = [18,"黄蓉"]
println "${name}今年${id}岁"*/


//左边变量数目多于右边列表元素
/*def (id,name,address) = [18,"黄蓉"]
println "${name}今年${id}岁,${address}是她的家吗？"*/

//左边变量数目少于右边列表元素
/*
def (id,name) = [18,"黄蓉","桃花岛"]
println "${name}今年${id}岁"*/

def getUserInfo() { [18, '黄蓉'] }
def (id,name) = getUserInfo()
println "${name}今年${id}岁"
