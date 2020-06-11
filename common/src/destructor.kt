data class Video(val name: String, val year: Int)

fun main(arguments: Array<String>){
    val movie1 = Video("Postman", 1997)
    println(movie1)
    val (movieName, _) = movie1
    println(movieName)
}