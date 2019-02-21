package apex.client.heroes.repositories;

import apex.client.heroes.heroes.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HeroRepository extends JpaRepository<Hero, UUID> {
}
