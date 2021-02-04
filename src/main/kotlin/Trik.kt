fun main(args: Array<String>) {
    var index: Int = 0
    var line: String? = readLine()
    for (i in 0..line!!.length-1){
       if(line.get(i) == 'A'){
           if (index == 0)
               index = 1
           else if (index == 1)
               index = 0
       } else if (line.get(i) == 'B') {
           if (index == 1)
               index = 2
           else if (index == 2)
               index = 1
       } else {
           if (index == 0)
               index = 2
           else if (index == 2)
               index = 0
       }
    }
    println(index+1)
}