/*
 * generated by Xtext
 */
package org.xtext.example.qdsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.qdsl.qDsl.AnswerType;
import org.xtext.example.qdsl.qDsl.ChooseFrom;
import org.xtext.example.qdsl.qDsl.Model;
import org.xtext.example.qdsl.qDsl.QDslPackage;
import org.xtext.example.qdsl.qDsl.Question;
import org.xtext.example.qdsl.qDsl.questionContent;
import org.xtext.example.qdsl.services.QDslGrammarAccess;

@SuppressWarnings("all")
public class QDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QDslPackage.ANSWER_TYPE:
				sequence_AnswerType(context, (AnswerType) semanticObject); 
				return; 
			case QDslPackage.CHOOSE_FROM:
				sequence_ChooseFrom(context, (ChooseFrom) semanticObject); 
				return; 
			case QDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case QDslPackage.QUESTION:
				sequence_Question(context, (Question) semanticObject); 
				return; 
			case QDslPackage.QUESTION_CONTENT:
				sequence_questionContent(context, (questionContent) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (atype='radio_button' | atype='check_box' | atype='free_text')
	 */
	protected void sequence_AnswerType(EObject context, AnswerType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (choices+=STRING*)
	 */
	protected void sequence_ChooseFrom(EObject context, ChooseFrom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID questions+=Question*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID contents=questionContent answerTypes=AnswerType chooseFroms=ChooseFrom?)
	 */
	protected void sequence_Question(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qcontent=STRING
	 */
	protected void sequence_questionContent(EObject context, questionContent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QDslPackage.Literals.QUESTION_CONTENT__QCONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QDslPackage.Literals.QUESTION_CONTENT__QCONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQuestionContentAccess().getQcontentSTRINGTerminalRuleCall_1_0(), semanticObject.getQcontent());
		feeder.finish();
	}
}
