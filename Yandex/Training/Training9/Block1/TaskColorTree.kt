package Block1

import kotlin.math.max
import kotlin.math.min

fun main() {
    val vasya = readln().split(" ").map { it.toInt() }
    val masha = readln().split(" ").map { it.toInt() }

    val vasyaCanColor = (vasya[0] - vasya[1]) .. (vasya[0] + vasya[1])
    val mashaCanColor = (masha[0] - masha[1]) .. (masha[0] + masha[1])
    val interval = min(vasyaCanColor.first, mashaCanColor.first)..max(vasyaCanColor.last, mashaCanColor.last)
    var result = 0
    interval.forEach {
        if (vasyaCanColor.contains(it) || mashaCanColor.contains(it)) {
            result++
        }
    }
    println(result)
}