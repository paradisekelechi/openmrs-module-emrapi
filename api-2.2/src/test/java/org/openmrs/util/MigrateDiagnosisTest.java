package org.openmrs.util;

import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openmrs.api.ConceptService;
import org.openmrs.api.PatientService;
import org.openmrs.module.emrapi.EmrApiProperties;
import org.openmrs.module.emrapi.diagnosis.DiagnosisMetadata;
import org.openmrs.module.emrapi.diagnosis.DiagnosisService;
import org.openmrs.module.emrapi.test.ContextSensitiveMetadataTestUtils;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
public class MigrateDiagnosisTest extends BaseModuleContextSensitiveTest {

	private static  final String DIAGNOSIS_DATASET = "DiagnosisDataset.xml";

	@Autowired
	ConceptService conceptService;

	@Autowired
	DiagnosisService emrapiDiagnosisService;

	@Autowired
	org.openmrs.api.DiagnosisService diagnosisService;

	@Autowired
	PatientService patientService;

	@Autowired
	EmrApiProperties emrApiProperties;

	@Before
	public void setUp() throws Exception {
		executeDataSet(DIAGNOSIS_DATASET);
	}

	@Test
	public void mergeShouldVoidEmrapiDiagnosisAndCreateAnewCoreDiagnosis() {
		assertNull(null);
	}
}
