package Java2.game1;

public class Main {
    public static void main(String[] args) {
        Human human=new Human("Геракл", 80,3);
        Robot robot=new Robot("Бронислав",120,1);
        Cat cat=new Cat("Барсик",50,4);

        Road[] roads={new Road(1000), new Road(1400)};
        Wall[]walls={new Wall(2),new Wall(3)};

        double humanTimeRun=0;
        double catTimeRun=0;
        double robotTimeRun=0;


        String luck="успешно";
        String failure="неуспешно";
        String situationName;
        String situationResult;

        for (Road road : roads){
            humanTimeRun=humanTimeRun+ road.getTimeToRoad(human);
            robotTimeRun=robotTimeRun+ road.getTimeToRoad(robot);
            catTimeRun+= road.getTimeToRoad(cat);
        }
        System.out.println( "Человек пробежал за "+humanTimeRun);
        System.out.println( "Робот пробежал за "+robotTimeRun);
        System.out.println( "Кот пробежал за "+catTimeRun);

        CanJump[] arr ={human, robot, cat};
        int jamplenght=2;
        for (int i=0; i<arr.length; i++){
            String nameString= arr[i].getClass().getName()+"может";
            situationName= " прыгнуть на " + arr[i].jamp(jamplenght) + "м.  Пытается прыгнуть на ";
           // situationResult = (arr[i].jamp(jamplenght)) ? luck : failure;
           situationResult = System.out.println ("arr[i].jamp(jamplenght");
            result(nameString,situationName,jamplenght, situationResult);
        }
    }
    private static void result( String nameAnimal, String situation, float situationlenght) {
        System.out.println(nameAnimal + situation + situationlenght + "м.  -  " );
    }
}
