package oop.collec.col;

public class ExamList {
	
	private int index;
	private int capacity;
	private Exam[] exams;
	
	public ExamList() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;
	}

	public void add(Exam exam) {
		if(index>=capacity) {
			Exam[] temp = new Exam[capacity+2];
			for(int i=0; i<exams.length; i++) {
				temp[i] = exams[i];
			}
			exams = temp;
			
			capacity+=2;
		}
		exams[index++] = exam;
	}

	public Exam get(int i) {
		return exams[i];
	}

	public int size() {
		return index;
	}

}
