fun main() {
    fun part1(input: List<String>): Int {
        var i = 0
        var highest = 0

        input.forEach {
            if (it != "") {
                // Count = Count + value from that line converted into an Integer
                i += it.toInt()
            }
            else {
                if (i > highest) {
                    highest = i
                }
                // Reset i after summing section
                i = 0
            }
        }

        return highest
    }

    fun part2(input: List<String>): Int {
        var i = 0
        var highest = 0
        var highest2 = 0
        var highest3 = 0

        input.forEach {
            if (it != "") {
                // Count = Count + value from that line converted into an Integer
                i += it.toInt()
            }
            else {
                if (i > highest) {
                    highest3 = highest2
                    highest2 = highest
                    highest = i
                }
                else if (i > highest2) {
                    highest3 = highest2
                    highest2 = i
                }
                else if (i > highest3) {
                    highest3 = i
                }

                // Reset i after summing section
                i = 0
            }
        }

        return highest + highest2 + highest3
    }

    val inputSam = readInput("sam/Day01")
    val inputAgaton = readInput("agaton/Day01")

    println("Part 1")
    println("Sam: " + part1(inputSam))
    println("Agaton: " + part1(inputAgaton))

    println("\nPart 2")
    println("Sam: " + part2(inputSam))
    println("Agaton: " +part2(inputAgaton))
}
