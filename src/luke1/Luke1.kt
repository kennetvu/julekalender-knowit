package luke1

import java.io.File
import kotlin.text.Regex

/**
 * Created by Kennet on 01.12.2015.
 */

fun main(args: Array<String>) {
    println(File("files/F8z0JWqa.txt").readLines().filter({ it -> it.matches(Regex("""^([a-z]{0,3}\d{2,8}[A-Z]{3,})$""")) }).size)
}