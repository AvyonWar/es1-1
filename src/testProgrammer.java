public class testProgrammer {
    public  static  void main(String[]arg){
        programmer test1 = new programmer();
        test1.name = "Dany";
        test1.age = 33;
        test1.wearsGlasses = true;

        programmer test2 = new programmer();
        test2.name = "Francesco";
        test2.age = 23;
        test2.wearsGlasses = false;

        System.out.println("test1 - " + test1.drinkCoffee() + " - " + test1.printDetails());
        System.out.println("test2 - " + test2.printDetails() + " - " + test2.hasGlasses());
    }
}
