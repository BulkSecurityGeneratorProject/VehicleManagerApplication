package fr.drn.app.vma.service;

import fr.drn.app.vma.domain.VehicleTaskDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing VehicleTaskDetails.
 */
public interface VehicleTaskDetailsService {

    /**
     * Save a vehicleTaskDetails.
     *
     * @param vehicleTaskDetails the entity to save
     * @return the persisted entity
     */
    VehicleTaskDetails save(VehicleTaskDetails vehicleTaskDetails);

    /**
     * Get all the vehicleTaskDetails.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<VehicleTaskDetails> findAll(Pageable pageable);

    /**
     * @param taskId       task id
     * @return the list of entities filter by task id
     */
    List<VehicleTaskDetails> findAllByTaskId(Long taskId);

    /**
     * Get the "id" vehicleTaskDetails.
     *
     * @param id the id of the entity
     * @return the entity
     */
    VehicleTaskDetails findOne(Long id);

    /**
     * Delete the "id" vehicleTaskDetails.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
