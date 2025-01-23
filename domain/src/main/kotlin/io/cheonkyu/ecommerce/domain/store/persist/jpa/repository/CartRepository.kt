package io.cheonkyu.ecommerce.domain.store.persist.jpa.repository

import io.cheonkyu.ecommerce.domain.store.persist.jpa.entity.CartEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CartRepository : JpaRepository<CartEntity, Long> {
}