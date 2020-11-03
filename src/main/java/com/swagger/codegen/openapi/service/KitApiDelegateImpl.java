package com.swagger.codegen.openapi.service;

import com.swagger.codegen.openapi.controller.KitApiDelegate;
import com.swagger.codegen.openapi.model.KitArticle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class KitApiDelegateImpl implements KitApiDelegate {

	@Override
	public ResponseEntity<String> addKitArticle(KitArticle body) {
		return null;
	}

	@Override
	public ResponseEntity<List<KitArticle>> getkitArticles() {
		return null;
	}
}
