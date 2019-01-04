/**
 * Groovy可变参数
 */
def task2(name, String[] details) {
    println "$name - $details"
}

task2('Call', '123-456-789')
task2('sunyf','111','222')
task2('sunyf1')