package hello.itemservice.domain.item;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    final String description;

}
