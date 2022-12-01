package hw11Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity colUni = new ColumbiaUniversity();
		// University university = new University (); university is an interface and an
		// interface can't be instantiated
		// MedicalSchool medicalSchool = new MedicalSchool (); Abstract class can not be
		// instantiated

		colUni.biology();
		colUni.commonRoom();
		colUni.laboratory();
		colUni.languageClub();
		colUni.emergencyRoom();
		colUni.surgeryRoom();
		colUni.cafeteria();
		colUni.lawInfo();
		colUni.vocationalInfo();
		colUni.classSize();
		colUni.playGround();
		colUni.teacher();
		colUni.anatomyLab();
		colUni.hygiene();
		colUni.biochemistryLab();
		colUni.caring();
		colUni.maths();
		colUni.mechanicalLab();
		colUni.computerLab();
		colUni.anthropology();
		colUni.aeronauticalInfo();
		University.black();
		ColumbiaUniversity.yellow();
		MedicalSchool.white();
		colUni.red();

	}

}
