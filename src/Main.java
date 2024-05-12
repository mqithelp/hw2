
public class Main {
    public static void main(String[] args) {
        System.out.println("=====[ Welcome to Task 1 ]=====");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Varable dog: " + dog);
        System.out.println("Varable cat: " + cat);
        System.out.println("Varable paper: " + paper);
        System.out.println("=====[ Welcome to Task 2 ]=====");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Varable dog: " + dog);
        System.out.println("Varable cat: " + cat);
        System.out.println("Varable paper: " + paper);
        System.out.println("=====[ Welcome to Task 3 ]=====");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Varable dog: " + dog);
        System.out.println("Varable cat: " + cat);
        System.out.println("Varable paper: " + paper);

        System.out.println("=====[ Welcome to Task 4 ]=====");
        var friend = 19;
        System.out.println("Initial variable Friend: " + friend);
        friend = friend + 2;
        System.out.println("Friend increase by 2: " + friend);
        friend = friend / 7;
        System.out.println("Friend divide by 7: " + friend);

        System.out.println("=====[ Welcome to Task 5 ]=====");
        var frog = 3.5;
        System.out.println("Initial variable Frog: " + frog);
        frog = frog * 10;
        System.out.println("Frog increase in 10: " + frog);
        frog = frog / 3.5;
        System.out.println("Frog divide by 3.5: " + frog);
        frog = frog + 4;
        System.out.println("Frog inc by 4: " + frog);

        System.out.println("=====[ Welcome to Task 6 ]=====");
        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var totalWeight = oneBoxerWeight + twoBoxerWeight;
        var defferenceWeight = twoBoxerWeight - oneBoxerWeight;
        System.out.println("Общая масса двух бойцов: " + totalWeight);
        System.out.println("Разница в весе двух бойцов : " + defferenceWeight);

        System.out.println("=====[ Welcome to Task 7 ]=====");
        var remDiv = twoBoxerWeight % oneBoxerWeight;
        System.out.println("Остаток от деления: " + remDiv);

        System.out.println("=====[ Welcome to Task 8 ]=====");
        var totalWorkTime = 640;
        var employeeWorkTime = 8;
        var totalEmployee = totalWorkTime / employeeWorkTime;
        System.out.println("Всего работников в компании -- " + totalEmployee + " человек");
        totalEmployee = totalEmployee + 94;
        employeeWorkTime = totalWorkTime / totalEmployee;
        System.out.println("Если в компании работает " + totalEmployee +
                " человек, то всего " + employeeWorkTime + " часов работы может быть" +
                " поделено между сотрудниками");
    }
}