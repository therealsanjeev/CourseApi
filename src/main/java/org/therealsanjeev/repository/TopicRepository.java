package org.therealsanjeev.repository;

import org.springframework.data.repository.CrudRepository;
import org.therealsanjeev.model.Topic;

public interface TopicRepository extends CrudRepository<Topic,String> {

}
