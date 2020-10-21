public class Raflebaeger {

    Terning terning1 = new Terning(6);
    Terning terning2 = new Terning(6);

    public int sum(){
        return terning1.getVaerdi() + terning2.getVaerdi();
    }
    public Raflebaeger roll(){
        terning1.roll();
        terning2.roll();
        return this;
    }

    @Override
    public String toString() {
        return
                 terning1.getVaerdi() +
                ", " + terning2.getVaerdi();
    }
}
