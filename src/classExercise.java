import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class classExercise {

public static void main(String[] args) throws FileNotFoundException, IOException {
  
  BufferedReader br = new BufferedReader(new FileReader("googleplaystore.csv"));
  br.lines()
  //skip the header
      .skip(1)
      //String -> String[]
        .map(lines -> lines.split (","))
        //keep below row 13
        .map(cols -> { 
          if (cols.length <= 14)
          return cols;
          return cols;})
        //remove nan
         .filter(cols -> !cols[2].trim().toLowerCase().equals("nan"))
         ;
}  
} 











// var filePath = "googleplaystore.csv";
// Files.lines(Paths.get(filePath))
// .skip(1) 
// .forEach(System.out::println);



//   List<List<String>> records = new ArrayList<>();
// try (BufferedReader br = new BufferedReader(new FileReader("googleplaystore.csv"))) {
//     String line;
//     while ((line = br.readLine()) != null) {
//         String[] values = line.split(",");
//         records.add(Arrays.asList(values));
// }

// String line ="";
// String splitBy = ",";

// try
// {
// BufferedReader br = new BufferedReader(new FileReader("googleplaystore.csv"));
// while ((line = br.readLine()) != null) {
//   String[] apps = line.split(splitBy);
//   System.out.println(apps[0] + "-> " + apps[2] + "-> " + apps[11]);
// }}
// catch (IOException e)   
// {  
// e.printStackTrace();  
// }  
