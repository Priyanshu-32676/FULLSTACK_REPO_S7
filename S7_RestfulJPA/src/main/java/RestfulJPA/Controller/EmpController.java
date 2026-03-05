package RestfulJPA.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import RestfulJPA.Model.Employee;
import RestfulJPA.Repository.EmpRepository;
@CrossOrigin(origins = "http://localhost:5173")   // @CrossOrigin is used to connect vite+react . 5173 is the react port number
@RestController
@RequestMapping("/Emp")
public class EmpController {
	
	@Autowired  // AutoWired annotation is used to inject EmpRepository interface
	EmpRepository empRepository;
	
	//To save the data in the database use @PostMapping
	@PostMapping("/save")
	public ResponseEntity<String> addEmployee(@RequestBody Employee e) {  //To return string we have to use ResponseEntity
		
		Employee obj = empRepository.save(e); ///To save the data in the database
		return ResponseEntity.ok("Record Inserted Successfully");
	}
	
//==========================================================
    //Get-Get Employee BY ID
//==========================================================
@GetMapping("/{eid}")
public ResponseEntity<Employee> getEmployee(@PathVariable int eid) {
Optional<Employee> e= empRepository.findById(eid);//Optional is like a List
if(e.isPresent()) {
	return ResponseEntity.ok(e.get());
}else {
	return ResponseEntity.notFound().build();
}
}
//=========================================================
//Get - Get All Employees
//=========================================================
@GetMapping("/all")
public List<Employee> getAllStudents(){
return empRepository.findAll(); //Select * FROM Employee e;
}

//=========================================================
//Put-Update Employee
//=========================================================
@PutMapping("/{id}")
public ResponseEntity<String> updateEmployee(@PathVariable int id , @RequestBody Employee e){
	Optional<Employee> existingEmp = empRepository.findById(id);
	 if(existingEmp.isPresent()) {
		 //First get the record
		 //existingEmp object copy to updateEmp object
		 Employee updateEmp = existingEmp.get();
		 updateEmp.setEname(e.getEname());
		 empRepository.save(updateEmp);
		return  ResponseEntity.ok("Record updated successfully");
	 }
	 else {
		return ResponseEntity.ok("Record not available");
	 }
}

//=========================================================
//Delete-Delete Employee
//=========================================================
@DeleteMapping("/{eid}")
public ResponseEntity<String> deleteEmp(@PathVariable int eid){
		if(empRepository.existsById(eid)) {
			empRepository.deleteById(eid);
			return ResponseEntity.ok("Record deleted successfully");
		}else {
			return ResponseEntity.ok("Record is not present");
		}
	}

// To delete all records
@DeleteMapping("/deleteAll")
public ResponseEntity<String> deleteAllEmp() {
    empRepository.deleteAll();
    return ResponseEntity.ok("All records deleted successfully");
}


}
