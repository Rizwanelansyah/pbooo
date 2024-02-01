package latihan_oasa

import java.io.File
import java.io.IOException

fun menulis(){
    try {
       File("latihan.txt").printWriter().use{out->
           out.println("Oasa Mikyalul")
       }
        println("Sukses")
    } catch(e: IOException){
        e.printStackTrace()
    }
}