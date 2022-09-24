package com.pao.csv.model;

import java.util.Comparator;

public class FirstAndLastNameComparator implements Comparator<FileContent> {

	@Override
	public int compare(FileContent o1, FileContent o2) {
		return o1.getFirstAndLastName().compareToIgnoreCase(o2.getFirstAndLastName());
	}
}
