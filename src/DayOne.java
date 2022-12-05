import java.io.File;
import java.io.IOException;
import java.util.*;

public class DayOne {

    /*public static int maxElf(File readFile) throws IOException {
        File obj = new File(readfile.toURI());
        Scanner file = new Scanner(obj);

        int elfNumber=1;
        int caloriesNb=0;
        int maxElf=0;
        int maxCalories=0;
        while (file.hasNextLine()) {
            String line=file.nextLine();
            if (line.isEmpty()) {
                if (caloriesNb > maxCalories) {
                    maxCalories = caloriesNb;
                    maxElf = elfNumber;
                }
                elfNumber += 1;
                caloriesNb=0;
            } else {
                caloriesNb += Integer.parseInt(line);
            }
    }*/
    public static void main(String[] args) throws IOException {
        File obj = new File("input_day_one.txt");
        Scanner file = new Scanner(obj);

        int caloriesNb = 0;

        ArrayList<Integer> listCal=new ArrayList<>();

        while (file.hasNextLine()) {
            String line = file.nextLine();
            if (line.isEmpty()) {
                listCal.add(caloriesNb);
                caloriesNb = 0;
            } else {
                caloriesNb += Integer.parseInt(line);
            }
        }
       Collections.sort(listCal);
        System.out.println(listCal.get(listCal.size() - 1) +
                listCal.get(listCal.size() - 2) +
                listCal.get(listCal.size() - 3));
    }
}
