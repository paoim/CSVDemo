package com.pao.csv.service;

import java.io.InputStream;
import java.io.Writer;
import java.util.Collection;

import com.pao.csv.model.FileContent;

public interface FileContentService {

	Collection<FileContent> getAllOriginalContents();

	Collection<FileContent> getAllCustomContents();

	Collection<FileContent> getByInsuranceCompany(String insuranceCompany);

	Collection<FileContent> uploadCsv(InputStream is, String fileName);

	void writeContentToCsv(Writer writer, String insuranceCompany);
}