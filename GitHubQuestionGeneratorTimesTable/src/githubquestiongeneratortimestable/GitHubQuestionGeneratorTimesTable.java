/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubquestiongeneratortimestable;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ben-g
 */
public class GitHubQuestionGeneratorTimesTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random NumGen = new Random();
        Scanner Input = new Scanner(System.in);

        int Num1, Num2, Answer, CorrectAns;

        Num1 = NumGen.nextInt(20) + 1;
        Num2 = NumGen.nextInt(20) + 1;

        System.out.println(Num1 + "x" + Num2);

        CorrectAns = Num1 * Num2;

        System.out.println("please answer the question");
        Answer = Input.nextInt();

        if (Answer == CorrectAns) {
            System.out.println("Well Done");
        } else {
            System.out.println("Not quite");
        }
    }

}
