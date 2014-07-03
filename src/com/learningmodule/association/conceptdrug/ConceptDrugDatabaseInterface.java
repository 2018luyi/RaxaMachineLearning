package com.learningmodule.association.conceptdrug;

import java.util.LinkedList;

import com.learningmodule.association.conceptdrug.model.ConceptNameModel;
import com.learningmodule.association.conceptdrug.model.ConceptWordModel;
import com.learningmodule.association.conceptdrug.model.EncounterIdConceptDrug;

public interface ConceptDrugDatabaseInterface {

	/*
	 * get name of file that will contain the prediction matrix generated by
	 * algorithm
	 */
	public String getMatrixFileName();

	/*
	 * Method to get all the medical records containing encounterId(integer that
	 * represent an id for prescriptions written for a patient),
	 * ConceptId(integer that represent a diagnosis/diseases/observation for
	 * patient has been treated), DrugId(integer representing a drug that was
	 * written in the prescription)
	 */
	public LinkedList<EncounterIdConceptDrug> getData();

	/*
	 * Method to get the list of conceptId and concept_name for given list of conceptId(integer)
	 */
	public LinkedList<ConceptNameModel> getConceptIdNameByConceptIds(LinkedList<Integer> conceptIds);

	/*
	 * Method to get the list of Drugs for given drugIds(integers)
	 */
	public LinkedList<AbstractDrugModel> getDrugInfoByDrugIds(LinkedList<Integer> conceptIds);

	/*
	 * Method to get the list of all conceptId and concept_words
	 */
	public LinkedList<ConceptWordModel> getConceptWords();
}
