public class HW8_Main {
    public static void main(String[] args) {
        Patient patient = new Patient(5);
        Therapist therapist = new Therapist();
        therapist.whichDoctor(patient);
    }
}
