import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("input_day_two.txt");
        Scanner file = new Scanner(obj);

        String elfChoice="";
        String ourChoice="";

        int score=0;

        while (file.hasNextLine()) {
            String line = file.nextLine();

            // Case part one

//            switch (line.substring(0,1)) {
//                case "A":
//                    elfChoice = "rock";
//                    break;
//                case "B":
//                    elfChoice = "paper";
//                    break;
//                case "C":
//                    elfChoice = "scissors";
//                    break;
//            }
//
//            switch (line.substring(2)) {
//                case "X":
//                    ourChoice = "rock";
//                    score += 1;
//                    break;
//                case "Y":
//                    ourChoice = "paper";
//                    score += 2;
//                    break;
//                case "Z":
//                    ourChoice = "scissors";
//                    score += 3;
//                    break;
//            }

            switch (line.substring(0,1)) {
                case "A":
                    elfChoice = "rock";
                    break;
                case "B":
                    elfChoice = "paper";
                    break;
                case "C":
                    elfChoice = "scissors";
                    break;
            }

            if (line.charAt(2) == 'X') {
                if (line.charAt(0) == 'A') {
                    ourChoice = "scissor";
                } else if (line.charAt(0) == 'B') {
                    ourChoice = "rock";
                } else {
                    ourChoice = "paper";
                }
            } else if (line.charAt(2) == 'Y') {
                ourChoice = elfChoice;
            } else {
                if (line.charAt(0) == 'A') {
                    ourChoice = "paper";
                } else if (line.charAt(0) == 'B') {
                    ourChoice = "scissors";
                } else {
                    ourChoice = "rock";
                }
            }

            if(ourChoice.equals("rock")) {
                score += 1;
                if (elfChoice.equals("paper")) {
                    score += 0;
                } else if (elfChoice.equals("scissors")) {
                    score += 6;
                } else {
                    score += 3;
                }
            } else if (ourChoice.equals("paper")) {
                score += 2;
                if (elfChoice.equals("paper")) {
                    score += 3;
                } else if (elfChoice.equals("scissors")) {
                    score += 0;
                } else {
                    score += 6;
                }
            } else {
                score += 3;
                if (elfChoice.equals("paper")) {
                    score += 6;
                } else if (elfChoice.equals("scissors")) {
                    score += 3;
                } else {
                    score += 0;
                }
            }
            System.out.println(elfChoice + " " + ourChoice + " " + score);
        }
        System.out.println(score);
    }
}
