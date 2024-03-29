package Util; /**
 * Created by shambala on 25/09/16.
 */
import java.io.*;
import java.util.ArrayList;

/**
 * Created by shambala on 17/09/16.
 */

public class Reader {
    public ArrayList<Flat> read(String file) {
        ArrayList<Flat> dots = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] spl = line.split(",");
                if (Character.isDigit(spl[0].charAt(0))) {
                    dots.add(new Flat(Integer.parseInt(spl[0]), Integer.parseInt(spl[1]), Integer.parseInt(spl[2])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Reading finished!");
        return dots;
    }

    public static void main(String[] args) {
        ArrayList<Flat> dots = new Reader().read("prices.txt");
    }
}
