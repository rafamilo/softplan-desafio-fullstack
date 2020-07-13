package com.softplan.api.repository.repositories;

import com.softplan.api.repository.entities.Process;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends CrudRepository<Process, Long> {
}
