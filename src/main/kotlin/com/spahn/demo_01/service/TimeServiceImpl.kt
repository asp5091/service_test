package com.spahn.demo_01.service

import com.spahn.demo_01.model.TimeClass
import org.springframework.data.jpa.repository.JpaRepository

interface TimeServiceImpl :  JpaRepository<TimeClass, Long>{

}