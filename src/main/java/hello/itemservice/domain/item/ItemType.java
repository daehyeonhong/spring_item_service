package hello.itemservice.domain.item;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    final String description;

}
