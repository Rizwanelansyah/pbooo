package latihan_oasa

import java.io.File
import java.io.IOException

fun membaca(){
    val filenama = "latihan.txt"
    try{
        val file = File(filenama)
        val lines: List<String> = file.readLines()
        for (line in lines){
            println(line)
        }
    }catch (e: Exception){
        print("File gagal dibaca: ${e.message}")
    }
}