package Challenges.hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grades according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
*/

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> results = new ArrayList<>();
        for (Integer grade: grades){
            if (grade < 38){
                results.add(grade);
            }
            else if (grade % 5 == 3){
                results.add(grade + 2);
            }else if(grade % 5 == 4){
                results.add(grade + 1);
            }else{
                results.add(grade);
            }
        }

        return results;

    }

    public static void main(String[] args) {
//        int x = 78 % 5;
//        System.out.println(x);

        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        System.out.println(gradingStudents(grades));
    }
}
