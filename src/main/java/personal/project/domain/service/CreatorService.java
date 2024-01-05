package personal.project.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import personal.project.domain.Creator;
import personal.project.domain.dto.CreatorDTO;
import personal.project.domain.dto.DocumentDTO;
import personal.project.domain.enums.DocumentType;
import personal.project.domain.repository.CreatorRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.logging.Logger;

@ApplicationScoped
public class CreatorService {

    @Inject
    CreatorRepository creatorRepository;

    private static final Logger logger = Logger.getLogger(String.valueOf(CreatorService.class));

    public CreatorDTO create() {

        logger.info("SERVICE WAS CALLED");
        Creator creator = creatorRepository.getById(1L);
        logger.info("Query executed");
        if(creator == null) {
            logger.info("Doesnt exist any creator");
        }
        return new CreatorDTO(
                "Joao",
                "sjoao@@gmail",
                "hjoao123",
                "joao2222",
                LocalDateTime.now(),
                new DocumentDTO(
                        123L,
                        DocumentType.CPF,
                        1L
                )
        );
    }
}
