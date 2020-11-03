package com.swagger.codegen.openapi.service;

import com.swagger.codegen.openapi.controller.OrderRulesApiDelegate;
import com.swagger.codegen.openapi.model.OrderRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class OrderRuleApiDelegateImpl implements OrderRulesApiDelegate {

	@Override
	public ResponseEntity<List<OrderRule>> getOrderRuleById(Integer orderRuleId) {
		return null;
	}

	@Override
	public ResponseEntity<String> addOrderRule(OrderRule body) {
		return null;
	}

	@Override
	public ResponseEntity<List<OrderRule>> getOrderRules() {
		log.info("sdfs");
		OrderRule orderRule = new OrderRule();
		orderRule.setItemNumber(1234L);
		orderRule.setOrderRuleId(1L);
		orderRule.setItemDescription("sdfsmhdf");
		return ResponseEntity.ok(Collections.singletonList(orderRule));
	}
}
