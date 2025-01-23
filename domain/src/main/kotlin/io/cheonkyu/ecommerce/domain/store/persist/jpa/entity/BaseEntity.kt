package io.cheonkyu.ecommerce.domain.store.persist.jpa.entity

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.Comment
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("id")
    private val id: Long? = null;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    @Comment("생성일")
    private val createdAt: LocalDateTime = LocalDateTime.now();

    @LastModifiedDate
    @Column(nullable = false, updatable = false)
    @Comment("갱신일")
    private val updatedAt: LocalDateTime = LocalDateTime.now();

    @Column(nullable = false)
    @ColumnDefault("false")
    @Comment("삭제여부")
    private val deleted: Boolean = false;
}
