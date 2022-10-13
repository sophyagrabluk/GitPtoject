public class Therapist extends Doctor {

    @Override
    void cure() {
        System.out.println("Я лечу как терапевт");
    }

    public Therapist() {
    }

    // Так же у терапевта создать метод, который будет назначать врача пациенту согласно плану лечения
    // Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
    // Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
    // Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();

    public void whichDoctor(Patient patient) {
        if (patient.plan == 1) {
            patient.doctor = "Хирург";
            surgeon.cure();
        } else if (patient.plan == 2) {
            patient.doctor = "Дантист";
            dentist.cure();
        } else
            patient.doctor = "Терапевт";
        cure();

    }
}