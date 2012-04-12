import java.io.DataInputStream;

object Main extends App {
  override def main(args: Array[String]) {
    while (true) {
      val s = readLine()
      if (s == null) {
        return;
      }
      val a: Array[String] = s.split(" ");
      val x: Double = a.apply(1).toDouble;
      a.apply(0) match {
        case "erf" =>  println(Erf.erf(x));
        case "expm1" => println(Expm1.expm1(x));
        case _ => { println("Unknown function: " + a.apply(0)); return;}
      }
    }
  }
}