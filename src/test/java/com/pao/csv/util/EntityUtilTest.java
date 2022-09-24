package com.pao.csv.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.pao.csv.model.FileContent;
import com.pao.csv.util.EntityUtil;

public class EntityUtilTest {

	@Test
	public void test_isNullEntity() {
		assertThat(EntityUtil.isNullEntity(null)).isTrue();
	}

	@Test
	public void test_isNotNullEntity() {
		assertThat(EntityUtil.isNotNullEntity(new FileContent())).isTrue();
	}

	@Test
	public void test_isEmpltyList() {
		List<FileContent> fileContentList = new ArrayList<FileContent>();
		assertThat(EntityUtil.isEmpltyList(fileContentList)).isTrue();
	}

	@Test
	public void test_isValidList() {
		List<FileContent> fileContentList = new ArrayList<FileContent>();
		assertThat(EntityUtil.isValidList(fileContentList)).isFalse();
	}

	@Test
	public void test_isValidString() {
		assertThat(EntityUtil.isValidString("")).isFalse();
	}

	@Test
	public void test_toEmpty() {
		assertThat(EntityUtil.toEmpty("")).isEmpty();
	}

	@Test
	public void test_equalsIgnoreCase() {
		assertThat(EntityUtil.equalsIgnoreCase("", "1232")).isFalse();
	}
}
