fun main(args: Array<String>) {
    var line = readLine()
    var (r1, s) = line!!.split(" ")
    var r2 = (2*s.toLong()-r1.toLong())
    println(r2)
}