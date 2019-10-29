import scala.io.Source
val lines = Source.fromFile("D:\\TIMO\\Desktop\\UTPL\\Tercer Ciclo\\Programacion funcional y reactiva\\taller-nro-3-JoanMBQ\\data\\GLigaPro_2019.csv").getLines.drop(1).toList
val data = lines.map(
        line => line.split(";") match {
        case Array(a, b, c, d, e) => (a.trim, b.trim, c.trim, d.trim.toInt, e.trim)
    })
val prom = data.map(_._4).sum / data.length
val pregunta1 = data.filter(_._4 > 10).map(_._1)
val pregunta2 = data.filter(_._4 > 10).sortBy(_._4).map(_._1)
val pregunta3 = data.maxBy(_._4)._2
val pregunta4 = data.maxBy(_._4)._3
val pregunta5 = data.filter(_._5 != "No").map(_._1)
