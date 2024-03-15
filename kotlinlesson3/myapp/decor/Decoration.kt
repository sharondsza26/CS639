package kotlinlesson3.myapp.decor

class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

data class Decoration(val rocks: String) {
}

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations3() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)
}

fun makeDecorations2() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
}


fun main(){
//    makeDecorations()
//    makeDecorations2()
//    makeDecorations3()
//    println(Direction.EAST.name)
//    println(Direction.EAST.ordinal)
//    println(Direction.EAST.degrees)
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}