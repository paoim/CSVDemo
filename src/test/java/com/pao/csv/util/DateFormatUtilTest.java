package com.pao.csv.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.pao.csv.util.DateFormatUtil;

public class DateFormatUtilTest {

	@Test
	public void test_todayDate() {
		assertThat(DateFormatUtil.todayDate()).isNotNull();
	}

	@Test
	public void test_getMMDDYYYYHHMMSSADate() {
		assertThat(DateFormatUtil.getMMDDYYYYHHMMSSADate()).isNotBlank();
	}
}
