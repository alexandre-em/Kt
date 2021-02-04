fun main(args: Array<String>) {
    var line = readLine()
    var list = line!!.split('-');
    list.forEach { print(it.get(0)) }
}
