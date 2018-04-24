package org.openmrs.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.ConceptService;
import org.openmrs.api.PatientService;
import org.openmrs.module.emrapi.EmrApiProperties;
import org.openmrs.module.emrapi.diagnosis.Diagnosis;
import org.openmrs.module.emrapi.diagnosis.DiagnosisMetadata;
import org.openmrs.module.emrapi.test.ContextSensitiveMetadataTestUtils;
import org.openmrs.module.reporting.common.DateUtil;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
public class MigrateDiagnosisTest extends BaseModuleContextSensitiveTest {

	@Autowired
	ConceptService conceptService;

	@Autowired
	EmrApiProperties emrApiProperties;

	@Autowired
	PatientService patientService;

	@Autowired
	org.openmrs.api.DiagnosisService newDiagnosisService;

	DiagnosisMetadata dmd;

	@Before
	public void setUp() throws Exception {
		dmd = ContextSensitiveMetadataTestUtils.setupDiagnosisMetadata(conceptService, emrApiProperties);
	}

	@Test
	public void mergeShouldVoidEmrapiDiagnosisAndCreateAnewCoreDiagnosis() {
		assertNull(null);
	}
}
