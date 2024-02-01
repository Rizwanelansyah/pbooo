import java.util.Scanner
fun main(args:Array<String>) {
    val Input = Scanner(System.`in`)
    print ("Masukan nama anda:Rafli Akmal ")
    val nama = Input.nextLine()
    print ("Masukkan umur anda:18 ")
    val umur = Input.nextInt()
    println("Halo,$nama anda berusia $umur tahun.")
}