fun main(args: Array<String>){
    var line = readLine()
    var rest = line!!.toInt()
    if (rest > 0 && rest < 10000001) {
        if (rest%2 == 0)
            println("Bob")
        else
            println("Alice")
    }
}