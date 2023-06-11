package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;

    /**
     * FAST : 빠른 배송
     * NORMAL : 일반 배송
     * SLOW : 느린 배송
     * --> 시스템에서 전달하는 값
     *
     * displayName : 고객에게 보여지는 값
     */
}
