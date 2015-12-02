package luke2

import java.io.File

/**
 * Created by kennetvuong on 02/12/15.
 */

fun main(args: Array<String>) {
    var max = 0.0;
    val l: List<Double> = File("files/sJVZp7BH.txt").readLines().map { it.toDouble() }
    l.forEachIndexed { i, d -> l.subList(i, l.size).filter { it > d }.forEach {max = if (it - d > max) it - d else max}}
    println(max);
}
