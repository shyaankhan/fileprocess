package org.apache.commons.csv;

import java.io.IOException;
import java.io.File;
import java.io.Serializable;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;


public class FileProcessingAPI implements Serializable{

    public static void main(String[] args)  throws IOException {
      File csvData = new File("https://monkknows.herokuapp.com/02_medium.csv");
      CSVParser parser = new CSVParser(csvData, CSVFormat.Default);
      for (CSVRecord csvRecord : parser) {
          System.out.println(csvRecord);
      }
    }


  /*      URL url = new URL("https://monkknows.herokuapp.com/02_medium.csv");
        URLConnection urlConn = url.openConnection();



        String output  = getUrlContents("https://monkknows.herokuapp.com/02_medium.csv");
   	 	System.out.println(output);

    //    String inputLine;
     //   while ((inputLine = in.readLine()) != null)
      //      System.out.println(inputLine);
       // in.close();

    }
  private static String getUrlContents(String theUrl)
  {
    StringBuilder content = new StringBuilder();

    // many of these calls can throw exceptions, so i've just
    // wrapped them all in one try/catch statement.
    try
    {
      // create a url object
      URL url = new URL(theUrl);

      // create a urlconnection object
      URLConnection urlConnection = url.openConnection();

      // wrap the urlconnection in a bufferedreader
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

      String line;

      // read from the urlconnection via the bufferedreader
      while ((line = bufferedReader.readLine()) != null)
      {
        content.append(line + "\n");
      }
      bufferedReader.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return content.toString();
  }*/
}
