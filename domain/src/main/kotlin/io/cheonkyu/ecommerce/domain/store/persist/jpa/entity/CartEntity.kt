package io.cheonkyu.ecommerce.domain.store.persist.jpa.entity

import jakarta.persistence.AttributeOverride
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.hibernate.annotations.SQLDelete
import org.hibernate.annotations.Where

@Entity
@AttributeOverride(name = "id", column = Column(name = "cart_id"))
@Table(name = "TB_CART")
@SQLDelete(sql = "UPDATE TB_CART SET deleted = true WHERE cart_id = ?")
@Where(clause = "deleted = false")
open class CartEntity: BaseEntity() {

}