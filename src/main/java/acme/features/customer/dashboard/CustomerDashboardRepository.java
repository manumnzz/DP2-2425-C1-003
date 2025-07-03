
package acme.features.customer.dashboard;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.client.repositories.AbstractRepository;
import acme.entities.S2.Booking;

@Repository
public interface CustomerDashboardRepository extends AbstractRepository {

	@Query("select b from Booking b where b.customer.id =:customerId and b.draftMode = false")
	Collection<Booking> findAllBookings(int customerId);
}
