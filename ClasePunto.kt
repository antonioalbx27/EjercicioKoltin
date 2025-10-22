import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    val punto1 = Punto()
    val punto2 = Punto(7.0, 5.0)
    val punto11 = punto1.mover(5.0, 7.0)
    println("Punto1 se ha movido a: $punto11")
    println("La distancia entre punto1 y punto2: ${punto1.distanciaPunto(punto2)}")
    val sumaSobre = punto1.sobreCargaMas(punto2)
    val restaSobre = punto1.sobreCargaMenos(punto2)
    println("Esta es la sobrecarga de la suma: $sumaSobre")
    println("Esta es la sobrecarga de la resta: $restaSobre")
    val punto3 = Punto(7.0, 7.0)
    val punto4 = Punto(7.0, 5.0)
    println("Son lo mismo punto2 que punto3? ${punto2.equals(punto3)}" )
	println("Son lo mismo punto2 que punto4? ${punto2.equals(punto4)}" )
}
class Punto (val x: Double = 0.0, val y: Double = 0.0){
    fun mover(posicionX: Double, posisionY: Double): Punto{
        
         val x1 = this.x + posicionX
         val y2 = this.y + posisionY
        return Punto(x1, y2) 
    }
    fun distanciaPunto (punto : Punto): Double{
        val distanciax = punto.x - this.x
        val distanciay = punto.y - this.y
        return sqrt(distanciax.pow(2) + distanciay.pow(2))
    }
    fun sobreCargaMas(punto : Punto): Punto{
        val sobreMasX = this.x + punto.x
        val sobreMasY = this.y + punto.y
        return Punto(sobreMasX, sobreMasY)
    }
    fun sobreCargaMenos(punto : Punto): Punto{
        val sobreMenosX = this.x - punto.x
        val sobreMenosY = this.y - punto.y
        return Punto(sobreMenosX, sobreMenosY)
    }
    override fun equals(other: Any?): Boolean{
        if (this === other)return true
        if (other !is Punto)return false
        return this.x == other.x && this.y == other.y
    }
	override fun toString(): String {
        return "Punto(x = $x, y = $y)"
    }
    
}