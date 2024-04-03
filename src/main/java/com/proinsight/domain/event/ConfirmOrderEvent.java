package com.proinsight.domain.event;

import com.proinsight.domain.model.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ConfirmOrderEvent {

    private Order order;

}
