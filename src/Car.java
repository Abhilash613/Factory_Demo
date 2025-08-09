public class Car {

    public static Engine getVeichle(String type){
        Start();
        if (type.equalsIgnoreCase("petrol"))
        {
           return new Petrol();
        }else if(type.equalsIgnoreCase("disel")){
            return new Disel();
        }else{
            return null;

        }

    }
    public static void Start(){
        System.out.println("Car is starting");
    }

}
