package ch.clip.samples.authapi.shirt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShirtRepository extends JpaRepository<Shirt, Long> {

}
