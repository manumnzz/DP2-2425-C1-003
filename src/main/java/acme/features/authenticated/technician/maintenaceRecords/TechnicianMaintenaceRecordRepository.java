
package acme.features.authenticated.technician.maintenaceRecords;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;

import acme.client.repositories.AbstractRepository;
import acme.entities.maintenance.MaintenanceRecord;
import acme.realms.Technician;

public interface TechnicianMaintenaceRecordRepository extends AbstractRepository {

	@Query("select t from Technician t where t.userAccount.id = :id")
	Technician findTechnicianById(int id);

	@Query("select mr from MaintenanceRecord mr where mr.technician.userAccount.id = :id")
	Collection<MaintenanceRecord> findMrByTechnicianId(int id);

	@Query("select mr from MaintenanceRecord mr")
	Collection<MaintenanceRecord> findAllMr(int id);

}
