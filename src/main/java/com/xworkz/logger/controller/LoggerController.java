package com.xworkz.logger.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.logger.dto.MailDTO;
import com.xworkz.logger.service.LoggerService;

@Component
@RequestMapping("/")
public class LoggerController {
	@Autowired
	private LoggerService service;
	private static final Logger LOGGER = Logger.getLogger(LoggerController.class);

	public LoggerController() {

		LOGGER.info("created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/submit.do")
	public String doSend(MailDTO dto, Model model) {
		LOGGER.info("MailId: " + dto.getMail());
		LOGGER.info("Subject: " + dto.getSubject());
		LOGGER.info("Body: " + dto.getBody());

		model.addAttribute("message", "Mail has been sent successfully...");
		return "/index.jsp";

	}

}
