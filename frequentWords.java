import java.io.*;
import java.util.*;
import java.net.*;
import java.util.stream.Collectors;



public class frequentWords {
  public List<String> countWords() throws Exception{
      String s = "https://s3-us-west-2.amazonaws.com/periscope-public/alice-in-wonderland.txt";

      Map<String, Integer> map = new HashMap<>();
      URL url = new URL(s);
      Scanner scanner = new Scanner(url.openStream());

      while(scanner.hasNext()){
        String line = scanner.nextLine();
        String [] words = line.split("\\s+");

        for (String w : words){
          map.put(w, map.getOrDefault(w, 0) + 1);
        }


      }

      List<String> list = map.entrySet().stream()
          .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
          .map(e -> e.getKey())
          .collect(Collectors.toList());


      return list.subList(0, 10);
  }

  public static void main (String[] args) throws Exception{
    frequentWords f = new frequentWords();
    System.out.print(f.countWords());
  }
}
