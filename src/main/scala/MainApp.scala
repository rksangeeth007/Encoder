//how to run : spark-submit --class MainApp  --master 'local[4]' encoder_2.11-1.0.jar encoder thrift://localhost:9083 /user/hive/warehouse encoder
//how to run : spark-submit --class MainApp  --master 'local[4]' encoder_2.11-1.0.jar <app_name> <thrift_uri> <ware_house> <input_db_name>


import org.apache.spark.sql.SparkSession


object MainApp {

  def main(args: Array[String]) {

    val appName = args(0)
    val inputFile = args(1)
    val outputFolder = args(2)


    val spark = SparkSession.builder().master("local[2]").appName(appName).getOrCreate();
    import spark.implicits._

    print(appName)
    println()
    print(inputFile)
    println()
    print(outputFolder)

     // Read the text file


    // Iterate through the each of the line and encode the line. Put this encoding logic into EncoderAlgoImplementation file

    // check for the diff in sizes of original data and latest encoded data


    // If both are same discard it, else write the encoded data to to output folder
    spark.stop()



  }

}
