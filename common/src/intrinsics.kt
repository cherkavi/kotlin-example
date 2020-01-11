import kotlin.jvm.internal.Intrinsics

data class Human(val name: String, var age: Int)

fun main(arguments: Array<String>){
    val john = Human("John", 30)
    println(john)

    println("check object for null field")
    Intrinsics.checkFieldIsNotNull(john,"Human", "name")

    Intrinsics.throwIllegalState("message for Illegal state exception")
}