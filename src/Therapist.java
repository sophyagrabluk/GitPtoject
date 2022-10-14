public class Therapist extends Doctor{
    @Override
    void cure() {
        System.out.println("Я лечу как терапевт");
    }

    public Therapist() {
    }

    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();

    public void whichDoctor (Patient patient) {
        if (patient.plan == 1) {
            System.out.println("Вам назначен хирург");
            this.surgeon.cure();
        } else if (patient.plan == 2) {
            System.out.println("Вам назначен стоматолог");
            this.dentist.cure();
        } else {
            System.out.println("Вам назначен терапевт");
            this.cure();

        }
    }
}
