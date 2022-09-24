package com.pao.csv.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.pao.csv.util.FileUtil;

public class FileUtilTest {

	@Test
	public void test_getBufferedReader() {
		assertThat(FileUtil.getBufferedReader(null)).isNull();
	}

	@Test
	public void test_readInputStreamCsv() {
		assertThat(FileUtil.readInputStreamCsv(null)).isEmpty();
	}

	@Test
	public void test_getResourceFileInputStream() {
		assertThat(FileUtil.getResourceFileInputStream(null)).isNull();
	}

	@Test
	public void test_getInputStream() {
		assertThat(FileUtil.getInputStream(null)).isNull();
	}
}
