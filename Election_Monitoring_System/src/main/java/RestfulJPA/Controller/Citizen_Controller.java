package RestfulJPA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import RestfulJPA.Model.Report;
import RestfulJPA.Repository.ReportRepository;


@RestController
@RequestMapping("/citizen")
public class Citizen_Controller {

	@Autowired
	private ReportRepository reportRepository;
	
	//Add report 
	@PostMapping("/addreport")
   public ResponseEntity<Report> addreport(@RequestBody Report report ){
	   Report obj = reportRepository.save(report);
	   return ResponseEntity.ok(report);
   }
	//Get report by id
	@GetMapping("/myreport/{userid}")
   public ResponseEntity<Report> getreport(@PathVariable int userid){
		Optional<Report> obj = reportRepository.findById(userid);
		if(obj.isPresent()) {
			return ResponseEntity.ok(obj.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	//Get all report
	@GetMapping("/allreports")
	public List<Report> getallreport(){
		return reportRepository.findAll();
	}

   
}