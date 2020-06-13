package com.eduardoritter.S4Connector.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardoritter.S4Connector.model.CommunicationArrangement;

@RestController
@RequestMapping("/CommArrangement")
public class S4ConnectorController {

	@GetMapping(path = "/quote", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CommunicationArrangement> getQuote() {

		//ResponseEntity<JsonNode> response = new ResponseEntity<>(HttpStatus.NO_CONTENT);

		CommunicationArrangement ca = new CommunicationArrangement();

		ca.setId("12345");
		ca.setHostname("host");
		ca.setUrl("url");
		
		return new ResponseEntity<CommunicationArrangement>(ca, HttpStatus.OK);
	}

}
