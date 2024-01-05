package personal.project.domain.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import personal.project.domain.Creator;

import java.util.Optional;

@ApplicationScoped
public class CreatorRepository {
    @PersistenceContext
    EntityManager em;

    public Creator getById(Long id) {
        return em.find(Creator.class, id);
    }
}
