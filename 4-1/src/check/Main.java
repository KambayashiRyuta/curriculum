package check;

public class Main{
    private String firstName = "上林";
    private String lastName = "龍太";
    private String printName = firstName + lastName;
   
    public static void main(String[] args) { 
        Main printt = new Main();
        printt.report();
        
        Pet Pet = new Pet("Java吉", "hoge");
        Pet.introduce();
        RobotPet RPet = new RobotPet("R2D2", "ルーク");
        RPet.introduce();
    }
    void report(){
        System.out.println("printNameメソッド→"+ this.printName);
    }
}