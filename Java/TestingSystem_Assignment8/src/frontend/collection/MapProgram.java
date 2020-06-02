//
package frontend.collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Van");
		students.put(2, "Quı");
		students.put(3, "Trang");
		students.put(4, "Duy");
		students.put(5, "Loan");

		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println("ID: " + entry.getKey() + " / " + "Name: " + entry.getValue());
		}
	}

}
