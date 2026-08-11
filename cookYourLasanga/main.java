package cookYourLasanga;

public class main{
    public static void main(String [] args){
        Lasanga lasanga = new Lasanga();

        System.out.println(lasanga.expectedMinutesInOven());
        System.out.println(lasanga.remainingMinutesInOven(30));
        System.out.println(lasanga.preparationTimeInMinutes(2));
        System.out.println(lasanga.totalTimeInMinutes(3, 20));
    }
}

class Lasanga{

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int time){
        return this.expectedMinutesInOven() - time;
    }

    public int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int expectedMinutesInOven){
        return preparationTimeInMinutes(layers) + expectedMinutesInOven;
    }
}