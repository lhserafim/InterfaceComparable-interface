package application;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String args[]) {
        String path ="/Users/lhserafim/Desktop/teste.txt";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
