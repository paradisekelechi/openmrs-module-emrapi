select
  distinct patient_id
from
  Patient p
where
    obs.concept_id = : diagnosisSetConceptId
    and p.voided = 0
    and p.patient_id in(select distinct person_id from obs)
