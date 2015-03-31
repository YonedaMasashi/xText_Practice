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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questions'", "'{'", "'}'", "'questionItem'", "'questionContent'", "'answerType'", "'radio_button'", "'check_box'", "'free_text'", "'chooseFrom'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalQDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'questions' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:79:28: ( (otherlv_0= 'questions' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:80:1: (otherlv_0= 'questions' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:80:1: (otherlv_0= 'questions' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '}' )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:80:3: otherlv_0= 'questions' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_questions_3_0= ruleQuestion ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getQuestionsKeyword_0());
                
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:106:1: ( (lv_questions_3_0= ruleQuestion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:107:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:107:1: (lv_questions_3_0= ruleQuestion )
            	    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:108:3: lv_questions_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleModel177);
            	    lv_questions_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel190); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:136:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:137:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:138:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion226);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:145:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'questionItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= rulequestionContent ) ) ( (lv_answerTypes_4_0= ruleAnswerType ) ) ( (lv_chooseFroms_5_0= ruleChooseFrom ) )? otherlv_6= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_contents_3_0 = null;

        EObject lv_answerTypes_4_0 = null;

        EObject lv_chooseFroms_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:148:28: ( (otherlv_0= 'questionItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= rulequestionContent ) ) ( (lv_answerTypes_4_0= ruleAnswerType ) ) ( (lv_chooseFroms_5_0= ruleChooseFrom ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:149:1: (otherlv_0= 'questionItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= rulequestionContent ) ) ( (lv_answerTypes_4_0= ruleAnswerType ) ) ( (lv_chooseFroms_5_0= ruleChooseFrom ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:149:1: (otherlv_0= 'questionItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= rulequestionContent ) ) ( (lv_answerTypes_4_0= ruleAnswerType ) ) ( (lv_chooseFroms_5_0= ruleChooseFrom ) )? otherlv_6= '}' )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:149:3: otherlv_0= 'questionItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contents_3_0= rulequestionContent ) ) ( (lv_answerTypes_4_0= ruleAnswerType ) ) ( (lv_chooseFroms_5_0= ruleChooseFrom ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQuestion273); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionItemKeyword_0());
                
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:154:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:154:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestion307); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:175:1: ( (lv_contents_3_0= rulequestionContent ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:176:1: (lv_contents_3_0= rulequestionContent )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:176:1: (lv_contents_3_0= rulequestionContent )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:177:3: lv_contents_3_0= rulequestionContent
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getContentsQuestionContentParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulequestionContent_in_ruleQuestion328);
            lv_contents_3_0=rulequestionContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"contents",
                    		lv_contents_3_0, 
                    		"questionContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:193:2: ( (lv_answerTypes_4_0= ruleAnswerType ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:194:1: (lv_answerTypes_4_0= ruleAnswerType )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:194:1: (lv_answerTypes_4_0= ruleAnswerType )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:195:3: lv_answerTypes_4_0= ruleAnswerType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswerTypesAnswerTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswerType_in_ruleQuestion349);
            lv_answerTypes_4_0=ruleAnswerType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"answerTypes",
                    		lv_answerTypes_4_0, 
                    		"AnswerType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:211:2: ( (lv_chooseFroms_5_0= ruleChooseFrom ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:212:1: (lv_chooseFroms_5_0= ruleChooseFrom )
                    {
                    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:212:1: (lv_chooseFroms_5_0= ruleChooseFrom )
                    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:213:3: lv_chooseFroms_5_0= ruleChooseFrom
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAccess().getChooseFromsChooseFromParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChooseFrom_in_ruleQuestion370);
                    lv_chooseFroms_5_0=ruleChooseFrom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"chooseFroms",
                            		lv_chooseFroms_5_0, 
                            		"ChooseFrom");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleQuestion383); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRulequestionContent"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:241:1: entryRulequestionContent returns [EObject current=null] : iv_rulequestionContent= rulequestionContent EOF ;
    public final EObject entryRulequestionContent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulequestionContent = null;


        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:242:2: (iv_rulequestionContent= rulequestionContent EOF )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:243:2: iv_rulequestionContent= rulequestionContent EOF
            {
             newCompositeNode(grammarAccess.getQuestionContentRule()); 
            pushFollow(FOLLOW_rulequestionContent_in_entryRulequestionContent419);
            iv_rulequestionContent=rulequestionContent();

            state._fsp--;

             current =iv_rulequestionContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulequestionContent429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulequestionContent"


    // $ANTLR start "rulequestionContent"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:250:1: rulequestionContent returns [EObject current=null] : (otherlv_0= 'questionContent' ( (lv_qcontent_1_0= RULE_STRING ) ) ) ;
    public final EObject rulequestionContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_qcontent_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:253:28: ( (otherlv_0= 'questionContent' ( (lv_qcontent_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:254:1: (otherlv_0= 'questionContent' ( (lv_qcontent_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:254:1: (otherlv_0= 'questionContent' ( (lv_qcontent_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:254:3: otherlv_0= 'questionContent' ( (lv_qcontent_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulequestionContent466); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionContentAccess().getQuestionContentKeyword_0());
                
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:258:1: ( (lv_qcontent_1_0= RULE_STRING ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:259:1: (lv_qcontent_1_0= RULE_STRING )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:259:1: (lv_qcontent_1_0= RULE_STRING )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:260:3: lv_qcontent_1_0= RULE_STRING
            {
            lv_qcontent_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulequestionContent483); 

            			newLeafNode(lv_qcontent_1_0, grammarAccess.getQuestionContentAccess().getQcontentSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionContentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"qcontent",
                    		lv_qcontent_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulequestionContent"


    // $ANTLR start "entryRuleAnswerType"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:284:1: entryRuleAnswerType returns [EObject current=null] : iv_ruleAnswerType= ruleAnswerType EOF ;
    public final EObject entryRuleAnswerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerType = null;


        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:285:2: (iv_ruleAnswerType= ruleAnswerType EOF )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:286:2: iv_ruleAnswerType= ruleAnswerType EOF
            {
             newCompositeNode(grammarAccess.getAnswerTypeRule()); 
            pushFollow(FOLLOW_ruleAnswerType_in_entryRuleAnswerType524);
            iv_ruleAnswerType=ruleAnswerType();

            state._fsp--;

             current =iv_ruleAnswerType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswerType534); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswerType"


    // $ANTLR start "ruleAnswerType"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:293:1: ruleAnswerType returns [EObject current=null] : (otherlv_0= 'answerType' ( ( (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' ) ) ) ) ;
    public final EObject ruleAnswerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_atype_1_1=null;
        Token lv_atype_1_2=null;
        Token lv_atype_1_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:296:28: ( (otherlv_0= 'answerType' ( ( (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' ) ) ) ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:297:1: (otherlv_0= 'answerType' ( ( (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' ) ) ) )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:297:1: (otherlv_0= 'answerType' ( ( (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' ) ) ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:297:3: otherlv_0= 'answerType' ( ( (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAnswerType571); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerTypeAccess().getAnswerTypeKeyword_0());
                
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:301:1: ( ( (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' ) ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:302:1: ( (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' ) )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:302:1: ( (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:303:1: (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:303:1: (lv_atype_1_1= 'radio_button' | lv_atype_1_2= 'check_box' | lv_atype_1_3= 'free_text' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:304:3: lv_atype_1_1= 'radio_button'
                    {
                    lv_atype_1_1=(Token)match(input,17,FOLLOW_17_in_ruleAnswerType591); 

                            newLeafNode(lv_atype_1_1, grammarAccess.getAnswerTypeAccess().getAtypeRadio_buttonKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerTypeRule());
                    	        }
                           		setWithLastConsumed(current, "atype", lv_atype_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:316:8: lv_atype_1_2= 'check_box'
                    {
                    lv_atype_1_2=(Token)match(input,18,FOLLOW_18_in_ruleAnswerType620); 

                            newLeafNode(lv_atype_1_2, grammarAccess.getAnswerTypeAccess().getAtypeCheck_boxKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerTypeRule());
                    	        }
                           		setWithLastConsumed(current, "atype", lv_atype_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:328:8: lv_atype_1_3= 'free_text'
                    {
                    lv_atype_1_3=(Token)match(input,19,FOLLOW_19_in_ruleAnswerType649); 

                            newLeafNode(lv_atype_1_3, grammarAccess.getAnswerTypeAccess().getAtypeFree_textKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerTypeRule());
                    	        }
                           		setWithLastConsumed(current, "atype", lv_atype_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswerType"


    // $ANTLR start "entryRuleChooseFrom"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:351:1: entryRuleChooseFrom returns [EObject current=null] : iv_ruleChooseFrom= ruleChooseFrom EOF ;
    public final EObject entryRuleChooseFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChooseFrom = null;


        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:352:2: (iv_ruleChooseFrom= ruleChooseFrom EOF )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:353:2: iv_ruleChooseFrom= ruleChooseFrom EOF
            {
             newCompositeNode(grammarAccess.getChooseFromRule()); 
            pushFollow(FOLLOW_ruleChooseFrom_in_entryRuleChooseFrom701);
            iv_ruleChooseFrom=ruleChooseFrom();

            state._fsp--;

             current =iv_ruleChooseFrom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChooseFrom711); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChooseFrom"


    // $ANTLR start "ruleChooseFrom"
    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:360:1: ruleChooseFrom returns [EObject current=null] : ( () otherlv_1= 'chooseFrom' ( (lv_choices_2_0= RULE_STRING ) )* ) ;
    public final EObject ruleChooseFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_choices_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:363:28: ( ( () otherlv_1= 'chooseFrom' ( (lv_choices_2_0= RULE_STRING ) )* ) )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:364:1: ( () otherlv_1= 'chooseFrom' ( (lv_choices_2_0= RULE_STRING ) )* )
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:364:1: ( () otherlv_1= 'chooseFrom' ( (lv_choices_2_0= RULE_STRING ) )* )
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:364:2: () otherlv_1= 'chooseFrom' ( (lv_choices_2_0= RULE_STRING ) )*
            {
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:364:2: ()
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:365:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getChooseFromAccess().getChooseFromAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleChooseFrom757); 

                	newLeafNode(otherlv_1, grammarAccess.getChooseFromAccess().getChooseFromKeyword_1());
                
            // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:374:1: ( (lv_choices_2_0= RULE_STRING ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:375:1: (lv_choices_2_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:375:1: (lv_choices_2_0= RULE_STRING )
            	    // ../org.xtext.example.qdsl/src-gen/org/xtext/example/qdsl/parser/antlr/internal/InternalQDsl.g:376:3: lv_choices_2_0= RULE_STRING
            	    {
            	    lv_choices_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChooseFrom774); 

            	    			newLeafNode(lv_choices_2_0, grammarAccess.getChooseFromAccess().getChoicesSTRINGTerminalRuleCall_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getChooseFromRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"choices",
            	            		lv_choices_2_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChooseFrom"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleModel177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleModel190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleQuestion273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestion307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rulequestionContent_in_ruleQuestion328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAnswerType_in_ruleQuestion349 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_ruleChooseFrom_in_ruleQuestion370 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuestion383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequestionContent_in_entryRulequestionContent419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequestionContent429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulequestionContent466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulequestionContent483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswerType_in_entryRuleAnswerType524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswerType534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAnswerType571 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleAnswerType591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAnswerType620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAnswerType649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChooseFrom_in_entryRuleChooseFrom701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChooseFrom711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleChooseFrom757 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChooseFrom774 = new BitSet(new long[]{0x0000000000000022L});

}