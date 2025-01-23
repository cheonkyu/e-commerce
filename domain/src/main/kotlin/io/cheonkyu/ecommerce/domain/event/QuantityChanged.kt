package io.cheonkyu.ecommerce.domain.event

import java.time.LocalDateTime
import java.util.UUID

class QuantityChanged(
    val eventId: String = UUID.randomUUID().toString(),
    val itemId: Long,
    val quantity: Long,
    val time: LocalDateTime = LocalDateTime.now()
)