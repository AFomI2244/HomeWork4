public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1.");
        int a = 1000;
        System.out.println("1. Значение переменной A с типом int равно " + a);
        byte b = 5;
        System.out.println("2. Значение переменной B с типом byte равно " + b);
        short c = 22;
        System.out.println("3. Значение переменной C с типом short равно " + c);
        long d = 75649;
        System.out.println("4. Значение переменной D с типом long равно " + d);
        float e = 0.253f;
        System.out.println("5. Значение переменной E с типом float равно " + e);
        double f = 1.5135695;
        System.out.println("6. Значение переменной F с типом double равно " + f);

        //Задача 2
        System.out.println("Задача 2.");
        byte g = 67;
        System.out.println(g);
        short h = -159;
        System.out.println(h);
        int i = 27897;
        System.out.println(i);
        long j = 987678965549L;
        System.out.println(j);
        float k = 2.786f;
        System.out.println(k);
        double l = 27.12;
        System.out.println(l);
        char m = 569;
        System.out.println(m);
        boolean n = false;
        System.out.println(n);

        //Задача 3
        System.out.println("Задача 3.");
        byte lyudmilaPavlovna = 23;
        short annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        long totalPupils = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        long totalPapers = 480;
        long onePupilPapers = totalPapers / totalPupils;
        System.out.println("На каждого ученика рассчитано " + onePupilPapers + " листов бумаги.");

        //Задача 4
        System.out.println("Задача 4.");
        int twoMins = 16;
        int twentyMins = twoMins * 10;
        System.out.println("1. За 20 минут машина произвела бутылок " + twentyMins + " штук.");
        int aDay = twentyMins * 72;
        System.out.println("2. За сутки машина произвела бутылок " + aDay + " штук.");
        int threeDays = aDay * 3;
        System.out.println("3. За 3 дня машина произвела бутылок " + threeDays + " штук.");
        int aMonth = threeDays * 10;
        System.out.println("4. За 1 месяц машина произвела бутылок " + aMonth + " штук.");

        //Задача 5
        System.out.println("Задача 5.");
        int totalPaintCans = 120;
        byte oneClassroomWhiteCans = 2;
        byte oneClassroomBrownCans = 4;
        int oneClassroomCans = oneClassroomBrownCans + oneClassroomWhiteCans;
        int classrooms = totalPaintCans / oneClassroomCans;
        int totalClassroomsWhiteCans = oneClassroomWhiteCans * classrooms;
        int totalClassroomsBrownCans = oneClassroomBrownCans * classrooms;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + totalClassroomsWhiteCans + " банок белой краски и " + totalClassroomsBrownCans + " банок коричневой краски.");

        //Задача 6
        System.out.println("Задача 6.");
        byte oneBanana = 80;
        byte oneMilk = 105;
        byte oneIceCream = 100;
        byte oneEgg = 70;
        int bananas = oneBanana * 5;
        int milk = oneMilk * 2;
        int iceCream = oneIceCream * 2;
        int eggs = oneEgg * 4;
        int totalWeight = bananas + milk + iceCream + eggs;
        System.out.println("Вес спорт-завтрака: " + totalWeight + " г.");
        float kiloWeight = totalWeight / 1000f;
        System.out.println("Вес спорт-завтрака: " + kiloWeight + " кг.");

        //Задача 7
        System.out.println("Задача 7.");
        short totalWeightLoss = 7000;
        int minWeightLoss = totalWeightLoss / 250;
        System.out.println("1. Если спортсмен будет терять каждый день по 250 грамм, то " + minWeightLoss + " дней уйдёт на похудение.");
        int maxWeightLoss = totalWeightLoss / 500;
        System.out.println("2. Если спортсмен будет терять каждый день по 500 грамм, то " + maxWeightLoss + " дней уйдёт на похудение.");
        int averageValue = (minWeightLoss + maxWeightLoss) / 2;
        System.out.println("3. В среднем потребуется " + averageValue + " день, чтобы добиться результата похудения.");

        //Задача 8
        System.out.println("Задача 8.");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaMonthlyRaise = masha * 1.1f;
        float denisMonthlyRaise = denis * 1.1f;
        float kristinaMonthlyRaise = kristina * 1.1f;
        double mashaYear = masha * 12;
        double denisYear = denis * 12;
        double kristinaYear = kristina * 12;
        double mashaNewYear = (mashaMonthlyRaise * 12) - mashaYear;
        System.out.println("1. Маша теперь получает " + mashaMonthlyRaise + " рублей в месяц. Годовой доход вырос на " + mashaNewYear + " рублей.");
        double denisNewYear = (denisMonthlyRaise * 12) - denisYear;
        System.out.println("2. Денис теперь получает " + denisMonthlyRaise + " рублей в месяц. Годовой доход вырос на " + denisNewYear + " рублей.");
        double kristinaNewYear = (kristinaMonthlyRaise * 12) - kristinaYear;
        System.out.println("3. Кристина теперь получает " + kristinaMonthlyRaise + " рублей в месяц. Годовой доход вырос на " + kristinaNewYear + " рублей.");
    }
}