public class Pacient {
     private int HealType;

    public int getHealType() {
        return HealType;
    }

    public void setHealType(int healType) {
        HealType = healType;
    }

    public Pacient(int healType) {
        HealType = healType;
    }
    public void pohilitsya(){
        HeallPlan.findDoctor(this.HealType);
    }
}
