//: io/FileOutputShortcut.java
// �2015 MindView LLC: see Copyright.txt
import java.io.*;

public class FileOutputShortcut {
  static String file = "FileOutputShortcut.out";
  public static void main(String[] args)
  throws IOException {
    BufferedReader in = new BufferedReader(
      new StringReader(
       BufferedInputFile.read("FileOutputShortcut.java")));
    try ( // Here's the shortcut:
            PrintWriter out = new PrintWriter(file)) {
      int lineCount = 1;
      String s;
      while((s = in.readLine()) != null )
        out.println(lineCount++ + ": " + s);
    }
    // Show the stored file:
    System.out.println(BufferedInputFile.read(file));
  }
} /* (Execute to see output) *///:~
