package annalynsInfiltration;

public class main {
    public static void main(String [] args){
        AnnalynsInfiltration annalynsInfiltration = new AnnalynsInfiltration();

        System.out.println(annalynsInfiltration.canFastAttack(true));
        System.out.println(annalynsInfiltration.canSpy(false, true, false));
        System.out.println(annalynsInfiltration.canSignalPrisoner(false, true));
        System.out.println(annalynsInfiltration.canFreePrisoner(false, true, false, false));
    }
}

class AnnalynsInfiltration{
    public static boolean canFastAttack(boolean knightIsAwake){
        boolean canFastAttack = false;

        if(knightIsAwake){

        }else{
            canFastAttack = true;
        }

        return canFastAttack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        boolean canSpy = false;

        if(knightIsAwake && archerIsAwake){
            
        }else{
            canSpy = true;
        }

        return canSpy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
        boolean canSignalPrisoner = false;

        if(archerIsAwake || !prisonerIsAwake){

        }else{
            canSignalPrisoner = true;
        }

        return canSignalPrisoner;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent){
        boolean canFreePrisoner = false;

        if(petDogIsPresent && !archerIsAwake){
            canFreePrisoner = true;
        }else if(!petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake){
            canFreePrisoner = true;
        }else{
            canFreePrisoner = false;
        }

        return canFreePrisoner;
    }
}