public class Main {
    public static void main(String[] args) {
        System.out.println("----------[ My Home Work - 2. Variables. Lesson 2. ]----------");
//Объявите переменные типа int, byte, short, long, float, double.
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
    }
}