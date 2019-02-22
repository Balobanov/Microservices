package apex.client.heroes.repositories;

import apex.db.common.models.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HeroRepository extends JpaRepository<Hero, UUID> {
}
