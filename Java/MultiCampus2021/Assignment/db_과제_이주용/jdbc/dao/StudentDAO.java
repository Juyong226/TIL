package jdbc.dao;

import java.sql.*;
import java.util.ArrayList;

import jdbc.dto.StudentDTO;
import jdbc.util.MyException;

public class StudentDAO {
	
	public StudentDAO() throws MyException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new MyException("오라클 드라이버 등록 실패");			
		}		
	}
	
	public String insertStudent(StudentDTO s) throws MyException {
		Connection con = null;
		PreparedStatement stmt = null;
		String msg;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "School", "1234");
			stmt = con.prepareStatement("insert into student values(?, ?, ?, ?, ?)");
			stmt.setInt(1, s.getNo());
			stmt.setString(2, s.getName());
			stmt.setString(3, s.getDet());
			stmt.setString(4, s.getAddr());
			stmt.setString(5, s.getTel());
			
			int i = stmt.executeUpdate();
			System.out.println(i + "행이 추가되었습니다.");
			msg = "학생을 등록하였습니다.";
			return msg;
			
		} catch (SQLException e) {		
			e.printStackTrace();
			throw new MyException("학생 등록 실패");
		} finally {			
				try {
					if(stmt != null) stmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public ArrayList<StudentDTO> printStudents() throws MyException {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "School", "1234");
			stmt = con.prepareStatement("select * from student");
			ResultSet rs = stmt.executeQuery();
			ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				String det = rs.getString(3);
				String addr = rs.getString(4);
				String tel = rs.getString(5);
				StudentDTO s = new StudentDTO(no, name, det, addr, tel);
				list.add(s);
			}
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new MyException("학생 조회 실패");
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
