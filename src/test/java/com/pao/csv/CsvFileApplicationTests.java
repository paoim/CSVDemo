package com.pao.csv;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pao.csv.controller.FileContentController;

@SpringBootTest
class CsvFileApplicationTests {

	@Autowired
	private FileContentController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
