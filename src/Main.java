import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("changes made to the main file");
        System.out.println("welcome to git hub");
        Wall wall1 = new Wall("east");
        Wall wall2 = new Wall("west");
        Wall wall3 = new Wall("north");
        Wall wall4 = new Wall("south");
        Bed bed = new Bed("king",3,1,2,2);
        Lamp lamp = new Lamp("kings",true,9);

        Bedroom bedroom =  new Bedroom("sallu",wall1,wall2,wall3,wall4,new Ceiling(20,"white"),bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        addNum(10,20);
        }
        public static void addNum(int a,int b){
            int c = a+b;
            System.out.println("sum of "+a+ " and "+b+ " = "+c);
        }
    }

