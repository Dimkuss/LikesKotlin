fun main(){
    val likes: String = "32"
    val likesLast = likes.takeLast(2)
    if (likesLast == "21"||likesLast =="31"||likesLast =="41"||likesLast =="51"||likesLast =="61"
        ||likesLast =="71"||likesLast =="81"||likesLast =="91"||likes == "1"){
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
