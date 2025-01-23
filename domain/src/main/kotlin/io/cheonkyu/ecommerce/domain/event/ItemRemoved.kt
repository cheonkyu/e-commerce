package io.cheonkyu.ecommerce.domain.event

import java.time.LocalDateTime
import java.util.UUID

class ItemRemoved(
    val eventId: String = UUID.randomUUID().toString(),
    val itemId: Long,
    val time: LocalDateTime = LocalDateTime.now(),
)