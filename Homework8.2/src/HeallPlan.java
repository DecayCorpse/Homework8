public class HeallPlan {
public static void findDoctor(int HealType){
    if (HealType == 0){
        Dantist dantist = new Dantist();
        dantist.heal();
    }
    if (HealType == 1){
        heryrg heryrg = new heryrg();
        heryrg.heal();
    }
    if (HealType == 2){
        terapevt terapevt = new terapevt();
        terapevt.heal();
    }
    }
}
