package com.Spring.repository;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Spring.entity.Holiday;

@Repository
public interface HolidayRepository extends CrudRepository<Holiday, Long> {

    Holiday findByDate(Date date);

    @Transactional
    void deleteByDate(long date);

}
