package com.sportsecho.memberProduct.entity;

import com.sportsecho.member.entity.Member;
import com.sportsecho.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class MemberProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer productsQuantity;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Builder
    public MemberProduct(Integer productsQuantity) {
        this.productsQuantity = productsQuantity;
    }

    public MemberProduct create(Integer productsQuantity) {
        return MemberProduct.builder()
            .productsQuantity(productsQuantity)
            .build();
    }

    public void update(Integer productsQuantity) {
        this.productsQuantity = productsQuantity;
    }
}