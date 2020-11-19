package com.Lessons6HomeWork.Students;

import com.Lessons4.Students;

public class Start {
    public static void main(String[] args) {
        Students students1 = new Students(1, "Ivan", "Ivanov", 33, 3,4, 5);
        Students students2 = new Students(0, "Ovan", "Ivanov", 33);
        Students students3 = new Students();
        float st1 = (students1.getMafh1() + students1.getEconomy() + students1.getEnglish())/3;
        float st2 = (students2.getMafh1() + students2.getEconomy() + students2.getEnglish())/3;
        float st3 = (students3.getMafh1() + students3.getEconomy() + students3.getEnglish())/3;
        System.out.println( "Среднее арифметическое " + st1 + " " + st2 + " " + st3);

        students1.sred(students1.getMafh1(), students1.getEnglish(), students1.getEconomy());

    }
}
