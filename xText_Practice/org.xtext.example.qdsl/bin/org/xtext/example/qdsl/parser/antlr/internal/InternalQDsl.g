/*
 * generated by Xtext
 */
grammar InternalQDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.qdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.qdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.qdsl.services.QDslGrammarAccess;

}

@parser::members {

 	private QDslGrammarAccess grammarAccess;
 	
    public InternalQDslParser(TokenStream input, QDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected QDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='questions' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getQuestionsKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getQuestionsQuestionParserRuleCall_3_0()); 
	    }
		lv_questions_3_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='questionItem' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionItemKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionAccess().getContentsQuestionContentParserRuleCall_3_0()); 
	    }
		lv_contents_3_0=rulequestionContent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionRule());
	        }
       		set(
       			$current, 
       			"contents",
        		lv_contents_3_0, 
        		"questionContent");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswerTypesAnswerTypeParserRuleCall_4_0()); 
	    }
		lv_answerTypes_4_0=ruleAnswerType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionRule());
	        }
       		set(
       			$current, 
       			"answerTypes",
        		lv_answerTypes_4_0, 
        		"AnswerType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionAccess().getChooseFromsChooseFromParserRuleCall_5_0()); 
	    }
		lv_chooseFroms_5_0=ruleChooseFrom		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionRule());
	        }
       		set(
       			$current, 
       			"chooseFroms",
        		lv_chooseFroms_5_0, 
        		"ChooseFrom");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRulequestionContent
entryRulequestionContent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionContentRule()); }
	 iv_rulequestionContent=rulequestionContent 
	 { $current=$iv_rulequestionContent.current; } 
	 EOF 
;

// Rule questionContent
rulequestionContent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='questionContent' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionContentAccess().getQuestionContentKeyword_0());
    }
(
(
		lv_qcontent_1_0=RULE_STRING
		{
			newLeafNode(lv_qcontent_1_0, grammarAccess.getQuestionContentAccess().getQcontentSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionContentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"qcontent",
        		lv_qcontent_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleAnswerType
entryRuleAnswerType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnswerTypeRule()); }
	 iv_ruleAnswerType=ruleAnswerType 
	 { $current=$iv_ruleAnswerType.current; } 
	 EOF 
;

// Rule AnswerType
ruleAnswerType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='answerType' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAnswerTypeAccess().getAnswerTypeKeyword_0());
    }
(
(
(
		lv_atype_1_1=	'radio_button' 
    {
        newLeafNode(lv_atype_1_1, grammarAccess.getAnswerTypeAccess().getAtypeRadio_buttonKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnswerTypeRule());
	        }
       		setWithLastConsumed($current, "atype", lv_atype_1_1, null);
	    }

    |		lv_atype_1_2=	'check_box' 
    {
        newLeafNode(lv_atype_1_2, grammarAccess.getAnswerTypeAccess().getAtypeCheck_boxKeyword_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnswerTypeRule());
	        }
       		setWithLastConsumed($current, "atype", lv_atype_1_2, null);
	    }

    |		lv_atype_1_3=	'free_text' 
    {
        newLeafNode(lv_atype_1_3, grammarAccess.getAnswerTypeAccess().getAtypeFree_textKeyword_1_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnswerTypeRule());
	        }
       		setWithLastConsumed($current, "atype", lv_atype_1_3, null);
	    }

)

)
))
;





// Entry rule entryRuleChooseFrom
entryRuleChooseFrom returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChooseFromRule()); }
	 iv_ruleChooseFrom=ruleChooseFrom 
	 { $current=$iv_ruleChooseFrom.current; } 
	 EOF 
;

// Rule ChooseFrom
ruleChooseFrom returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getChooseFromAccess().getChooseFromAction_0(),
            $current);
    }
)	otherlv_1='chooseFrom' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getChooseFromAccess().getChooseFromKeyword_1());
    }
(
(
		lv_choices_2_0=RULE_STRING
		{
			newLeafNode(lv_choices_2_0, grammarAccess.getChooseFromAccess().getChoicesSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getChooseFromRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"choices",
        		lv_choices_2_0, 
        		"STRING");
	    }

)
)*)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


