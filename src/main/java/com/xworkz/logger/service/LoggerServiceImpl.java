package com.xworkz.logger.service;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.xworkz.logger.dto.MailDTO;
@Component
public class LoggerServiceImpl implements LoggerService {
	private static final Logger LOGGER = Logger.getLogger(LoggerServiceImpl.class);

	public LoggerServiceImpl() {
		LOGGER.info("created\t" + this.getClass().getSimpleName());
	}

	public void create(MailDTO dto) {
		try {
			if (Objects.nonNull(dto)) {
				LOGGER.info("MailDTO not null");

			} else {
				LOGGER.info("MailDTO is  null");
			}

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

	}

}
