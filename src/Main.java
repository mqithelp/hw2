public class Main {
    public static void main(String[] args) {
        System.out.println("----------[ My Home Work - 2. Variables. Lesson 2. ]----------");
        System.out.println("==[ Task 1 ]==");
        {
            int myInt = 0;
            byte myByte = 0;
            short myShort = 0;
            long myLong = 0;
            float myFloat = 0;
            double myDouble = 0;
            System.out.println("Значение переменной myInt с типом int равно " + myInt);
            System.out.println("Значение переменной myByte с типом int равно " + myByte);
            System.out.println("Значение переменной myShort с типом int равно " + myShort);
            System.out.println("Значение переменной myLong с типом int равно " + myLong);
            System.out.println("Значение переменной myFloat с типом int равно " + myFloat);
            System.out.println("Значение переменной myDouble с типом int равно " + myDouble);
        }
        System.out.println("==[ Task 2 ]==");
        {
            float myFloat = 27.12f;
            long myLong = 987_678_965_549L;
            double myDouble = 2.786;
            short myShort = 569;
            short myShort2 = -159;
            short myShort3 = 27897;
            byte myByte = 67;
        }
        System.out.println("==[ Task 3 ]==");
        {
            byte studentLP = 23;
            byte studentAS = 27;
            byte studentEA = 30;
            short paperCount = 480;
            float perStudentPaper = (float) paperCount / (studentLP + studentAS + studentEA);
            System.out.println("На каждого ученика рассчитано " + perStudentPaper + " листов бумаги");
        }
        System.out.println("==[ Task 4 ]==");
        {
            byte performanceBottleMachine = 16;
            byte timePerformance = 2;
            float perfByMinutes = (float) performanceBottleMachine / timePerformance;
            short minutes20 = 20;
            short dayMinutes = 24 * 60;
            int threeDayMinutes = dayMinutes * 3;
            int MouthMay = dayMinutes * 31;
            System.out.println("За 1 минуту машина производит " + perfByMinutes + " штук бутылок");
            System.out.println("За " + minutes20 + " минут машина произвела " + minutes20 * perfByMinutes + " штук бутылок");
            System.out.println("За сутки (" + dayMinutes + " минут) машина произвела " + dayMinutes * perfByMinutes + " штук бутылок");
            System.out.println("За 3 дня (" + threeDayMinutes + " минут) машина произвела " + threeDayMinutes * perfByMinutes + " штук бутылок");
            System.out.println("За один месяц (" + MouthMay + " минут) машина произвела " + MouthMay * perfByMinutes + " штук бутылок");
        }
        System.out.println("==[ Task 5 ]==");
        {
            byte paintSum = 120;
            byte classWhitePaint = 2;
            byte classBrownPaint = 4;
            int totalClass = paintSum / (classWhitePaint + classBrownPaint);
            int totalWhitePaint = totalClass * classWhitePaint;
            int totalBrownPaint = totalClass * classBrownPaint;
            System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        }
        System.out.println("==[ Task 6 ]==");
        {
            short bananasWeight = 5 * 80;
            short milkWeight = 2 * 105;
            short icecreamWeight = 2 * 100;
            short eggWeight = 4 * 70;
            int totalWeightGR = bananasWeight + milkWeight + icecreamWeight + eggWeight;
            float totalWeightKG = totalWeightGR / 1000f;
            System.out.println("Готовый Спортзавтрак получился " + totalWeightGR + " грамм или " + totalWeightKG + " кг.");
        }
        System.out.println("==[ Task 7 ]==");
        {
            short totalWeight = 7 * 1000;
            float lostWeight250 = 250f;
            float lostWeight500 = 500f;
            float avgLostWeight = (lostWeight250 + lostWeight500) / 2;
            float dayNormal = totalWeight / lostWeight250;
            float dayExtremal = totalWeight / lostWeight500;
            float avgDay = totalWeight / avgLostWeight;
            System.out.println("При потере веса в день 250 гр. Понадобится " + dayNormal + " дней для сброса 7 кг. веса.");
            System.out.println("При потере веса в день 500 гр. Понадобится " + dayExtremal + " дней для сброса 7 кг. веса.");
            System.out.println("При средней потере веса в день " + avgLostWeight + " гр. Понадобится " + avgDay + " дней для сброса 7 кг. веса.");
        }
        System.out.println("==[ Task 8 ]==");
        {
            float salaryMasha = 67_760f;
            float salaryDenis = 83_690f;
            float salaryKristina = 76_230f;
            float salaryIndex = 0.1f;
            float incomeMasha = salaryMasha * 12;
            float incomeDenis = salaryDenis * 12;
            float incomeKristina = salaryKristina * 12;
            salaryMasha = salaryMasha * (1 + salaryIndex);
            salaryDenis = salaryDenis * (1 + salaryIndex);
            salaryKristina = salaryKristina * (1 + salaryIndex);
            System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на "
                    + (salaryMasha * 12 - incomeMasha) + " рублей");
            System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на "
                    + (salaryDenis * 12 - incomeDenis) + " рублей");
            System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на "
                    + (salaryKristina * 12 - incomeKristina) + " рублей");
        }
    }

}