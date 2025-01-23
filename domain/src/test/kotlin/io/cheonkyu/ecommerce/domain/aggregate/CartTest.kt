package io.cheonkyu.ecommerce.domain.aggregate

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe


class CartTest : BehaviorSpec({
    lateinit var cart: Cart;
    val CART_ID = 1000L;
    val ITEM_ID = 100L;
    beforeEach {
        cart = Cart(CART_ID);
        cart.addItem(ITEM_ID, "에어팟", 10);
    }

    given("1개 물품이 있는 장바구니") {
        `when`("초기값은") {
            then("1") {
                cart.items.size shouldBe 1;
            }
        }
        `when`("장바구니 물품 해제 시 (상품 아이디 100번이 삭제)") {
            then("삭제됨") {
                cart.removeItem(ITEM_ID);
                cart.items.size shouldBe 0;
            }
        }
        `when`("장바구니 수량 변경 시 (상품 아이디 100번 수량 10 -> 5개로 변경)") {
            then("수랑 변경 완료") {
//                cart.changeQuantity(ITEM_ID, 5L);
//                val item = cart.items.find { it.id == ITEM_ID }
//                item?.quantity shouldBe 5L;
            }
        }
    }
})