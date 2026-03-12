package Block1

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)

    val currentApartment = reader.nextInt()
    val totalFloors = reader.nextInt()
    val lastApartment = reader.nextInt()
    val lastEntrance = reader.nextInt()
    val lastFloor = reader.nextInt()
    reader.close()

    val minApartmentsOnEntrance = if (lastApartment % lastEntrance == 0) {
        lastApartment / lastEntrance
    } else {
        lastApartment / lastFloor + 1
    }
    val minApartmentsOnFloor = minApartmentsOnEntrance / totalFloors

}