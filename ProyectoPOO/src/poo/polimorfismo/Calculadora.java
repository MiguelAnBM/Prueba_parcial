package poo.polimorfismo;

/**
 * TEMA: Polimorfismo — SOBRECARGA de métodos (Overloading)
 *
 * La sobrecarga consiste en definir varios métodos con el MISMO nombre
 * pero diferente lista de parámetros (cantidad, tipo u orden).
 * Se resuelve en TIEMPO DE COMPILACIÓN (polimorfismo estático).
 *
 * Diferencia clave:
 *   Sobrecarga     → mismo nombre, diferente firma, dentro de la MISMA clase.
 *   Sobreescritura → mismo nombre e igual firma, en clases distintas (herencia).
 *
 * INSTRUCCIONES:
 *
 * Crea los siguientes métodos sobrecargados dentro de esta clase:
 *
 * 1. sumar(int a, int b)
 *       Imprime "  sumar(int, int)" y retorna la suma.
 *
 * 2. sumar(int a, int b, int c)
 *       Imprime "  sumar(int, int, int)" y retorna la suma de los tres.
 *
 * 3. sumar(double a, double b)
 *       Imprime "  sumar(double, double)" y retorna la suma.
 *
 * 4. sumar(String a, String b)
 *       Imprime "  sumar(String, String)" y retorna la concatenación.
 *
 * 5. calcularArea(double lado)
 *       Imprime "  calcularArea(lado) → cuadrado" y retorna lado * lado.
 *
 * 6. calcularArea(double base, double altura)
 *       Imprime "  calcularArea(base, altura) → rectángulo" y retorna base * altura.
 *
 * 7. calcularArea(double radio, boolean esCirculo)
 *       Imprime "  calcularArea(radio, bool) → círculo" y retorna Math.PI * radio * radio.
 */
public class Calculadora {

}
