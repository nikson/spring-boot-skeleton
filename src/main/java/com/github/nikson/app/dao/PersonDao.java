package com.github.nikson.app.dao;

import com.github.nikson.app.entity.Person;
import java.io.Serializable;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nikson
 */
@Repository
@Transactional
public interface PersonDao extends JpaRepository<Person, Serializable> {

}
