package com.pao.csv.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.pao.csv.model.FileContent;
import com.pao.csv.util.ConvertUtil;

public class ConvertUtilTest {

	@Test
	public void test_isValidArrayWithNullInput() {
		String[] cells = null;
		assertThat(ConvertUtil.isValidArray(cells)).isFalse();
	}

	@Test
	public void test_isValidArrayWithEmptyInput() {
		String[] cells = {};
		assertThat(ConvertUtil.isValidArray(cells)).isFalse();
	}

	@Test
	public void test_isValidArrayWithValidInput() {
		String[] cells = {"ABC"};
		assertThat(ConvertUtil.isValidArray(cells)).isTrue();
	}

	@Test
	public void test_getDataWithNullInput() {
		String[] cells = null;
		assertThat(ConvertUtil.getData(cells, 0)).isEmpty();
	}

	@Test
	public void test_getDataWithEmptyInput() {
		String[] cells = {};
		assertThat(ConvertUtil.getData(cells, 0)).isEmpty();
	}

	@Test
	public void test_getDataWithValidInput() {
		String[] cells = {"ZAC"};
		assertThat(ConvertUtil.getData(cells, 0)).isEqualTo("ZAC");
	}

	@Test
	public void test_getIntValueWithNullInput() {
		assertThat(ConvertUtil.getIntValue(null)).isZero();
	}

	@Test
	public void test_getIntValueWithEmptyInput() {
		assertThat(ConvertUtil.getIntValue("")).isZero();
	}

	@Test
	public void test_getIntValueWithValidInput() {
		assertThat(ConvertUtil.getIntValue("123")).isEqualTo(123);
	}

	@Test
	public void test_convertCellsWithNullInput() {
		String[] cells = null;
		assertThat(ConvertUtil.convertCells(cells)).isNotNull();
	}

	@Test
	public void test_convertCellsWithEmptyInput() {
		String[] cells = {};
		assertThat(ConvertUtil.convertCells(cells)).isNotNull();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test_convertCellsWithValidInput() {
		String[] cells = {"1", "AZ Test", "1", "ZBC"};
		assertThat(ConvertUtil.convertCells(cells)).isEqualToComparingFieldByField(new FileContent("1", "AZ Test", 1, "ZBC"));
	}
}
