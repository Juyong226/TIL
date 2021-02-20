package jdbc.test;

import java.util.ArrayList;

import jdbc.dao.StudentDAO;
import jdbc.dto.StudentDTO;
import jdbc.util.MyException;

public class StudentTest {
	StudentDAO studentDAO;
	
	public static void main(String[] args) {
		StudentTest studentTest = new StudentTest();
		StudentDTO s = new StudentDTO(3, "나길동", "영문학과", "제주", "010-3333-3333");
		
		studentTest.operateInsert(s);
		studentTest.operatePrint();

	}
	
	public StudentTest() {
		try {
			studentDAO = new StudentDAO();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void operateInsert(StudentDTO s) {
		try {
			String msg = insertStudent(s);
			System.out.println(msg);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void operatePrint() {
		try {
			ArrayList<StudentDTO> list = printStudents();
			for(StudentDTO s : list) {
				System.out.println(s.getNo() + "\t| " + s.getName() + "\t| " + s.getDet() + "\t| " + s.getAddr() + "\t| " + s.getTel());
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String insertStudent(StudentDTO s) throws MyException {
		return studentDAO.insertStudent(s);
	}
	
	public ArrayList<StudentDTO> printStudents() throws MyException {
		return studentDAO.printStudents();
	}
}
