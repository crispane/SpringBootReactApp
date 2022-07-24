package crispane.springbootreactapp.repo;

import crispane.springbootreactapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
