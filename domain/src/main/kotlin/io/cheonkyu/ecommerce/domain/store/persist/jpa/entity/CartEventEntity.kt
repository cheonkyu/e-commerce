package io.cheonkyu.ecommerce.domain.store.persist.jpa.entity

import jakarta.persistence.AttributeOverride
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Lob
import jakarta.persistence.Table
import org.hibernate.annotations.Comment
import org.hibernate.annotations.SQLDelete
import org.hibernate.annotations.Where

@Entity
@AttributeOverride(name = "id", column = Column(name = "event_id"))
@Table(name = "TB_CART_EVENT")
@SQLDelete(sql = "UPDATE TB_CART_EVENT SET deleted = true WHERE event_id = ?")
@Where(clause = "deleted = false")
open class CartEventEntity: BaseEntity() {
    @Column
    @Comment("카트 아이디")
    private val cartId: Long? = null;

    @Lob
    @Comment("변경내역 json(delta)")
    private val payload: String? = null;
}