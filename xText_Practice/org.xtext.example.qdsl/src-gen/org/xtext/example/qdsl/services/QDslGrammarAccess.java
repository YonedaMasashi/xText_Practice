/*
 * generated by Xtext
 */
package org.xtext.example.qdsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class QDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cQuestionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQuestionsQuestionParserRuleCall_3_0 = (RuleCall)cQuestionsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Model:
		//	"questions" name=ID "{" questions+=Question* "}";
		@Override public ParserRule getRule() { return rule; }

		//"questions" name=ID "{" questions+=Question* "}"
		public Group getGroup() { return cGroup; }

		//"questions"
		public Keyword getQuestionsKeyword_0() { return cQuestionsKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//questions+=Question*
		public Assignment getQuestionsAssignment_3() { return cQuestionsAssignment_3; }

		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_3_0() { return cQuestionsQuestionParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContentsQuestionContentParserRuleCall_3_0 = (RuleCall)cContentsAssignment_3.eContents().get(0);
		private final Assignment cAnswerTypesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAnswerTypesAnswerTypeParserRuleCall_4_0 = (RuleCall)cAnswerTypesAssignment_4.eContents().get(0);
		private final Assignment cChooseFromsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cChooseFromsChooseFromParserRuleCall_5_0 = (RuleCall)cChooseFromsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Question:
		//	"questionItem" name=ID "{" contents=questionContent answerTypes=AnswerType chooseFroms=ChooseFrom? "}";
		@Override public ParserRule getRule() { return rule; }

		//"questionItem" name=ID "{" contents=questionContent answerTypes=AnswerType chooseFroms=ChooseFrom? "}"
		public Group getGroup() { return cGroup; }

		//"questionItem"
		public Keyword getQuestionItemKeyword_0() { return cQuestionItemKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//contents=questionContent
		public Assignment getContentsAssignment_3() { return cContentsAssignment_3; }

		//questionContent
		public RuleCall getContentsQuestionContentParserRuleCall_3_0() { return cContentsQuestionContentParserRuleCall_3_0; }

		//answerTypes=AnswerType
		public Assignment getAnswerTypesAssignment_4() { return cAnswerTypesAssignment_4; }

		//AnswerType
		public RuleCall getAnswerTypesAnswerTypeParserRuleCall_4_0() { return cAnswerTypesAnswerTypeParserRuleCall_4_0; }

		//chooseFroms=ChooseFrom?
		public Assignment getChooseFromsAssignment_5() { return cChooseFromsAssignment_5; }

		//ChooseFrom
		public RuleCall getChooseFromsChooseFromParserRuleCall_5_0() { return cChooseFromsChooseFromParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class QuestionContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "questionContent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionContentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQcontentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQcontentSTRINGTerminalRuleCall_1_0 = (RuleCall)cQcontentAssignment_1.eContents().get(0);
		
		//questionContent:
		//	"questionContent" qcontent=STRING;
		@Override public ParserRule getRule() { return rule; }

		//"questionContent" qcontent=STRING
		public Group getGroup() { return cGroup; }

		//"questionContent"
		public Keyword getQuestionContentKeyword_0() { return cQuestionContentKeyword_0; }

		//qcontent=STRING
		public Assignment getQcontentAssignment_1() { return cQcontentAssignment_1; }

		//STRING
		public RuleCall getQcontentSTRINGTerminalRuleCall_1_0() { return cQcontentSTRINGTerminalRuleCall_1_0; }
	}

	public class AnswerTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnswerType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnswerTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAtypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cAtypeAlternatives_1_0 = (Alternatives)cAtypeAssignment_1.eContents().get(0);
		private final Keyword cAtypeRadio_buttonKeyword_1_0_0 = (Keyword)cAtypeAlternatives_1_0.eContents().get(0);
		private final Keyword cAtypeCheck_boxKeyword_1_0_1 = (Keyword)cAtypeAlternatives_1_0.eContents().get(1);
		private final Keyword cAtypeFree_textKeyword_1_0_2 = (Keyword)cAtypeAlternatives_1_0.eContents().get(2);
		
		//AnswerType:
		//	"answerType" atype=("radio_button" | "check_box" | "free_text");
		@Override public ParserRule getRule() { return rule; }

		//"answerType" atype=("radio_button" | "check_box" | "free_text")
		public Group getGroup() { return cGroup; }

		//"answerType"
		public Keyword getAnswerTypeKeyword_0() { return cAnswerTypeKeyword_0; }

		//atype=("radio_button" | "check_box" | "free_text")
		public Assignment getAtypeAssignment_1() { return cAtypeAssignment_1; }

		//"radio_button" | "check_box" | "free_text"
		public Alternatives getAtypeAlternatives_1_0() { return cAtypeAlternatives_1_0; }

		//"radio_button"
		public Keyword getAtypeRadio_buttonKeyword_1_0_0() { return cAtypeRadio_buttonKeyword_1_0_0; }

		//"check_box"
		public Keyword getAtypeCheck_boxKeyword_1_0_1() { return cAtypeCheck_boxKeyword_1_0_1; }

		//"free_text"
		public Keyword getAtypeFree_textKeyword_1_0_2() { return cAtypeFree_textKeyword_1_0_2; }
	}

	public class ChooseFromElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ChooseFrom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cChooseFromAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cChooseFromKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cChoicesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cChoicesSTRINGTerminalRuleCall_2_0 = (RuleCall)cChoicesAssignment_2.eContents().get(0);
		
		//ChooseFrom:
		//	{ChooseFrom} "chooseFrom" choices+=STRING*;
		@Override public ParserRule getRule() { return rule; }

		//{ChooseFrom} "chooseFrom" choices+=STRING*
		public Group getGroup() { return cGroup; }

		//{ChooseFrom}
		public Action getChooseFromAction_0() { return cChooseFromAction_0; }

		//"chooseFrom"
		public Keyword getChooseFromKeyword_1() { return cChooseFromKeyword_1; }

		//choices+=STRING*
		public Assignment getChoicesAssignment_2() { return cChoicesAssignment_2; }

		//STRING
		public RuleCall getChoicesSTRINGTerminalRuleCall_2_0() { return cChoicesSTRINGTerminalRuleCall_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final QuestionElements pQuestion;
	private final QuestionContentElements pQuestionContent;
	private final AnswerTypeElements pAnswerType;
	private final ChooseFromElements pChooseFrom;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public QDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pQuestion = new QuestionElements();
		this.pQuestionContent = new QuestionContentElements();
		this.pAnswerType = new AnswerTypeElements();
		this.pChooseFrom = new ChooseFromElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.qdsl.QDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"questions" name=ID "{" questions+=Question* "}";
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Question:
	//	"questionItem" name=ID "{" contents=questionContent answerTypes=AnswerType chooseFroms=ChooseFrom? "}";
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//questionContent:
	//	"questionContent" qcontent=STRING;
	public QuestionContentElements getQuestionContentAccess() {
		return pQuestionContent;
	}
	
	public ParserRule getQuestionContentRule() {
		return getQuestionContentAccess().getRule();
	}

	//AnswerType:
	//	"answerType" atype=("radio_button" | "check_box" | "free_text");
	public AnswerTypeElements getAnswerTypeAccess() {
		return pAnswerType;
	}
	
	public ParserRule getAnswerTypeRule() {
		return getAnswerTypeAccess().getRule();
	}

	//ChooseFrom:
	//	{ChooseFrom} "chooseFrom" choices+=STRING*;
	public ChooseFromElements getChooseFromAccess() {
		return pChooseFrom;
	}
	
	public ParserRule getChooseFromRule() {
		return getChooseFromAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
