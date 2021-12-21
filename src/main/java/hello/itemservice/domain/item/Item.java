package hello.itemservice.domain.item;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Item {

    Long id;
    String itemName;
    Integer price;
    Integer quantity;

    Boolean open; //판매 여부
    List<String> regions; //등록 지역
    ItemType itemType; //상품 종류
    String deliveryCode; //배송 방식


    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}
