package annalynsInfiltration;

public class AnnalynsInfiltration {
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
