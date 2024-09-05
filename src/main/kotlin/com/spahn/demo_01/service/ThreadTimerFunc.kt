package com.spahn.demo_01.service

import com.spahn.demo_01.model.TimeClass
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.time.LocalDateTime


@Service
class ThreadTimerFunc {
    val log: Logger = LoggerFactory.getLogger(this::class.toString())

    @Autowired
    var timeRepo: TimeServiceImpl? = null
    var data = TimeClass();

    @Scheduled(fixedDelay = 1000)
    fun timeCheckApi() {
        if((LocalDateTime.now().second%10) == 0){
            data.trasferTime = "10Second"
            data.createdAt = "${LocalDateTime.now()}"
            timeRepo?.save(data)
            log.info("10Second")
        } else {
            log.info("None")
        }
    }
}