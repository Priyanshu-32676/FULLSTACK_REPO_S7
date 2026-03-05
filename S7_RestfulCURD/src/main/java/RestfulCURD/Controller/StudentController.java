package RestfulCURD.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulCURD.Model.Student;

@RestController
@RequestMapping("/students")  // It will use for  to provide base URl for StudentController class
public class StudentController {
	
	//This method is used for to read the details(Read operation)
	@GetMapping("/{id}")
	public Student getData(@PathVariable int id) { // Id value is pass the the function by using @PathVariable
		
		
//		 if(id != 32676){
//		        throw new RuntimeException("Student not found");
//		 }
		
		Student s = new Student();
		s.setId(id);
		s.setName("Kumar Priyanshu");
		s.setCgpa(9.7);
		s.setDropout(false);
		return s;
	}
	
	//Insert the data from the browser(Create Operation)
	@PostMapping("/insert")
	public String insertStudent(@RequestBody Student s) {//Student data need to be insert from browser(web) so, we need to take the annontation @RequestBody
		return " Student data added \n"+
			 "Student id = " + s.getId() +"\n"+
		     "Student name = " + s.getName()+"\n"+
		      "Student cgpa = "  + s.getCgpa()+"\n"+
		      "Student Dropout = "+s.isDropout();
	}
	
	//Update operation
	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable int id , @RequestBody Student s) {     //i want to update only student id so i took only id 
		return " Student data Id updated \n"+
				 "Student updated id = " + id +"\n"+
			     "Student name = " + s.getName()+"\n"+
			      "Student cgpa = "  + s.getCgpa()+"\n"+
			      "Student Dropout = "+s.isDropout();
	}
	
	//Delete operation
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id) {
		return ResponseEntity.ok("Student Data deleted" +id);
	}
	

}
