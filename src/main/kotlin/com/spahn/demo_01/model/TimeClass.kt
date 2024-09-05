package com.spahn.demo_01.model

import jakarta.persistence.*
import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "time")
class TimeClass {
    @Id
    @GeneratedValue
    var id: UUID? = UUID.randomUUID()

    @Column
    var createdAt : String? = LocalDateTime.now().toString()

    @Column
    var trasferTime : String = ""
}