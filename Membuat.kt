package latihan_oasa

import java.io.File
import java.io.IOException

fun membuat(){
    val file = File("latihan.txt")
    try{
        //membuat file
        if(file.createNewFile()){
            println("File sukses dibuat: ${file.absolutePath}")
        }else{
            println("File gagal dibuat")
        }
    }catch(e: IOException){
e.printStackTrace()
}
}