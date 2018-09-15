import org.apache.log4j.{Level,Logger}
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.sql.types.StrcutType

object gittest {

def main(args:String):Unit = {

  Logger.getLogger("org").setLevel(Level.WARN)
  Logger.getLogger("org").setLevel(Level.WARN)

  val conf = new SparkConf().setAppName("SparkML").setMaster("local[*]")
  val sc = new SparkContext(conf)
 
  val sqlContext = new SQLContext(sc)

  val hiveContext = new HiveContext(sc)

  println("Hi kali")
  
  sc.stop()
 

}
}
