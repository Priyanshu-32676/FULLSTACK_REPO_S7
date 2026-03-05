package RestfulJPA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import RestfulJPA.Model.Report;
//extends JParepository will do all crud operation automatically
public interface ReportRepository extends JpaRepository<Report, Integer>{ 

	List<Report> findByUserid(int userid);
}
