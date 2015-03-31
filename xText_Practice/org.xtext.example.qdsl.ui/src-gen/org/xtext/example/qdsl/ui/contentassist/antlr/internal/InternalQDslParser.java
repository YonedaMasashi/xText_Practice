package org.xtext.example.qdsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.qdsl.services.QDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'radio_button'", "'check_box'", "'free_text'", "'questions'", "'{'", "'}'", "'questionItem'", "'questionContent'", "'answerType'", "'chooseFrom'"
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
    public String getGrammarFileName() { return "../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g"; }


     
     	private QDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:89:1: ( ruleQuestion EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion121);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:97:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:101:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:102:1: ( ( rule__Question__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:102:1: ( ( rule__Question__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:103:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:104:1: ( rule__Question__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:104:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion154);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRulequestionContent"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:116:1: entryRulequestionContent : rulequestionContent EOF ;
    public final void entryRulequestionContent() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:117:1: ( rulequestionContent EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:118:1: rulequestionContent EOF
            {
             before(grammarAccess.getQuestionContentRule()); 
            pushFollow(FOLLOW_rulequestionContent_in_entryRulequestionContent181);
            rulequestionContent();

            state._fsp--;

             after(grammarAccess.getQuestionContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulequestionContent188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulequestionContent"


    // $ANTLR start "rulequestionContent"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:125:1: rulequestionContent : ( ( rule__QuestionContent__Group__0 ) ) ;
    public final void rulequestionContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:129:2: ( ( ( rule__QuestionContent__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:130:1: ( ( rule__QuestionContent__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:130:1: ( ( rule__QuestionContent__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:131:1: ( rule__QuestionContent__Group__0 )
            {
             before(grammarAccess.getQuestionContentAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:132:1: ( rule__QuestionContent__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:132:2: rule__QuestionContent__Group__0
            {
            pushFollow(FOLLOW_rule__QuestionContent__Group__0_in_rulequestionContent214);
            rule__QuestionContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulequestionContent"


    // $ANTLR start "entryRuleAnswerType"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:144:1: entryRuleAnswerType : ruleAnswerType EOF ;
    public final void entryRuleAnswerType() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:145:1: ( ruleAnswerType EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:146:1: ruleAnswerType EOF
            {
             before(grammarAccess.getAnswerTypeRule()); 
            pushFollow(FOLLOW_ruleAnswerType_in_entryRuleAnswerType241);
            ruleAnswerType();

            state._fsp--;

             after(grammarAccess.getAnswerTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswerType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnswerType"


    // $ANTLR start "ruleAnswerType"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:153:1: ruleAnswerType : ( ( rule__AnswerType__Group__0 ) ) ;
    public final void ruleAnswerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:157:2: ( ( ( rule__AnswerType__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:158:1: ( ( rule__AnswerType__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:158:1: ( ( rule__AnswerType__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:159:1: ( rule__AnswerType__Group__0 )
            {
             before(grammarAccess.getAnswerTypeAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:160:1: ( rule__AnswerType__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:160:2: rule__AnswerType__Group__0
            {
            pushFollow(FOLLOW_rule__AnswerType__Group__0_in_ruleAnswerType274);
            rule__AnswerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswerType"


    // $ANTLR start "entryRuleChooseFrom"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:172:1: entryRuleChooseFrom : ruleChooseFrom EOF ;
    public final void entryRuleChooseFrom() throws RecognitionException {
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:173:1: ( ruleChooseFrom EOF )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:174:1: ruleChooseFrom EOF
            {
             before(grammarAccess.getChooseFromRule()); 
            pushFollow(FOLLOW_ruleChooseFrom_in_entryRuleChooseFrom301);
            ruleChooseFrom();

            state._fsp--;

             after(grammarAccess.getChooseFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChooseFrom308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChooseFrom"


    // $ANTLR start "ruleChooseFrom"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:181:1: ruleChooseFrom : ( ( rule__ChooseFrom__Group__0 ) ) ;
    public final void ruleChooseFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:185:2: ( ( ( rule__ChooseFrom__Group__0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:186:1: ( ( rule__ChooseFrom__Group__0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:186:1: ( ( rule__ChooseFrom__Group__0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:187:1: ( rule__ChooseFrom__Group__0 )
            {
             before(grammarAccess.getChooseFromAccess().getGroup()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:188:1: ( rule__ChooseFrom__Group__0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:188:2: rule__ChooseFrom__Group__0
            {
            pushFollow(FOLLOW_rule__ChooseFrom__Group__0_in_ruleChooseFrom334);
            rule__ChooseFrom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChooseFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChooseFrom"


    // $ANTLR start "rule__AnswerType__AtypeAlternatives_1_0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:200:1: rule__AnswerType__AtypeAlternatives_1_0 : ( ( 'radio_button' ) | ( 'check_box' ) | ( 'free_text' ) );
    public final void rule__AnswerType__AtypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:204:1: ( ( 'radio_button' ) | ( 'check_box' ) | ( 'free_text' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:205:1: ( 'radio_button' )
                    {
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:205:1: ( 'radio_button' )
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:206:1: 'radio_button'
                    {
                     before(grammarAccess.getAnswerTypeAccess().getAtypeRadio_buttonKeyword_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__AnswerType__AtypeAlternatives_1_0371); 
                     after(grammarAccess.getAnswerTypeAccess().getAtypeRadio_buttonKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:213:6: ( 'check_box' )
                    {
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:213:6: ( 'check_box' )
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:214:1: 'check_box'
                    {
                     before(grammarAccess.getAnswerTypeAccess().getAtypeCheck_boxKeyword_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__AnswerType__AtypeAlternatives_1_0391); 
                     after(grammarAccess.getAnswerTypeAccess().getAtypeCheck_boxKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:221:6: ( 'free_text' )
                    {
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:221:6: ( 'free_text' )
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:222:1: 'free_text'
                    {
                     before(grammarAccess.getAnswerTypeAccess().getAtypeFree_textKeyword_1_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__AnswerType__AtypeAlternatives_1_0411); 
                     after(grammarAccess.getAnswerTypeAccess().getAtypeFree_textKeyword_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerType__AtypeAlternatives_1_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:236:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:240:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:241:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0443);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0446);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:248:1: rule__Model__Group__0__Impl : ( 'questions' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:252:1: ( ( 'questions' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:253:1: ( 'questions' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:253:1: ( 'questions' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:254:1: 'questions'
            {
             before(grammarAccess.getModelAccess().getQuestionsKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Model__Group__0__Impl474); 
             after(grammarAccess.getModelAccess().getQuestionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:267:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:271:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:272:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1505);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1508);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:279:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:283:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:284:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:284:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:285:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:286:1: ( rule__Model__NameAssignment_1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:286:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl535);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:296:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:300:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:301:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2565);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2568);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:308:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:312:1: ( ( '{' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:313:1: ( '{' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:313:1: ( '{' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:314:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Model__Group__2__Impl596); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:327:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:331:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:332:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3627);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3630);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:339:1: rule__Model__Group__3__Impl : ( ( rule__Model__QuestionsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:343:1: ( ( ( rule__Model__QuestionsAssignment_3 )* ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:344:1: ( ( rule__Model__QuestionsAssignment_3 )* )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:344:1: ( ( rule__Model__QuestionsAssignment_3 )* )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:345:1: ( rule__Model__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getQuestionsAssignment_3()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:346:1: ( rule__Model__QuestionsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:346:2: rule__Model__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__QuestionsAssignment_3_in_rule__Model__Group__3__Impl657);
            	    rule__Model__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQuestionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:356:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:360:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:361:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4688);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:367:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:371:1: ( ( '}' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:372:1: ( '}' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:372:1: ( '}' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:373:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group__4__Impl716); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:396:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:400:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:401:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0757);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0760);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:408:1: rule__Question__Group__0__Impl : ( 'questionItem' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:412:1: ( ( 'questionItem' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:413:1: ( 'questionItem' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:413:1: ( 'questionItem' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:414:1: 'questionItem'
            {
             before(grammarAccess.getQuestionAccess().getQuestionItemKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Question__Group__0__Impl788); 
             after(grammarAccess.getQuestionAccess().getQuestionItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:427:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:431:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:432:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1819);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1822);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:439:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:443:1: ( ( ( rule__Question__NameAssignment_1 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:444:1: ( ( rule__Question__NameAssignment_1 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:444:1: ( ( rule__Question__NameAssignment_1 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:445:1: ( rule__Question__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:446:1: ( rule__Question__NameAssignment_1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:446:2: rule__Question__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl849);
            rule__Question__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:456:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:460:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:461:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2879);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2882);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:468:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:472:1: ( ( '{' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:473:1: ( '{' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:473:1: ( '{' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:474:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Question__Group__2__Impl910); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:487:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:491:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:492:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3941);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3944);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:499:1: rule__Question__Group__3__Impl : ( ( rule__Question__ContentsAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:503:1: ( ( ( rule__Question__ContentsAssignment_3 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:504:1: ( ( rule__Question__ContentsAssignment_3 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:504:1: ( ( rule__Question__ContentsAssignment_3 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:505:1: ( rule__Question__ContentsAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getContentsAssignment_3()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:506:1: ( rule__Question__ContentsAssignment_3 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:506:2: rule__Question__ContentsAssignment_3
            {
            pushFollow(FOLLOW_rule__Question__ContentsAssignment_3_in_rule__Question__Group__3__Impl971);
            rule__Question__ContentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getContentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:516:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:520:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:521:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41001);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41004);
            rule__Question__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:528:1: rule__Question__Group__4__Impl : ( ( rule__Question__AnswerTypesAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:532:1: ( ( ( rule__Question__AnswerTypesAssignment_4 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:533:1: ( ( rule__Question__AnswerTypesAssignment_4 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:533:1: ( ( rule__Question__AnswerTypesAssignment_4 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:534:1: ( rule__Question__AnswerTypesAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getAnswerTypesAssignment_4()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:535:1: ( rule__Question__AnswerTypesAssignment_4 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:535:2: rule__Question__AnswerTypesAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__AnswerTypesAssignment_4_in_rule__Question__Group__4__Impl1031);
            rule__Question__AnswerTypesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAnswerTypesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:545:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:549:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:550:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51061);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51064);
            rule__Question__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:557:1: rule__Question__Group__5__Impl : ( ( rule__Question__ChooseFromsAssignment_5 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:561:1: ( ( ( rule__Question__ChooseFromsAssignment_5 )? ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:562:1: ( ( rule__Question__ChooseFromsAssignment_5 )? )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:562:1: ( ( rule__Question__ChooseFromsAssignment_5 )? )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:563:1: ( rule__Question__ChooseFromsAssignment_5 )?
            {
             before(grammarAccess.getQuestionAccess().getChooseFromsAssignment_5()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:564:1: ( rule__Question__ChooseFromsAssignment_5 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:564:2: rule__Question__ChooseFromsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Question__ChooseFromsAssignment_5_in_rule__Question__Group__5__Impl1091);
                    rule__Question__ChooseFromsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getChooseFromsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:574:1: rule__Question__Group__6 : rule__Question__Group__6__Impl ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:578:1: ( rule__Question__Group__6__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:579:2: rule__Question__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61122);
            rule__Question__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:585:1: rule__Question__Group__6__Impl : ( '}' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:589:1: ( ( '}' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:590:1: ( '}' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:590:1: ( '}' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:591:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Question__Group__6__Impl1150); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__QuestionContent__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:618:1: rule__QuestionContent__Group__0 : rule__QuestionContent__Group__0__Impl rule__QuestionContent__Group__1 ;
    public final void rule__QuestionContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:622:1: ( rule__QuestionContent__Group__0__Impl rule__QuestionContent__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:623:2: rule__QuestionContent__Group__0__Impl rule__QuestionContent__Group__1
            {
            pushFollow(FOLLOW_rule__QuestionContent__Group__0__Impl_in_rule__QuestionContent__Group__01195);
            rule__QuestionContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionContent__Group__1_in_rule__QuestionContent__Group__01198);
            rule__QuestionContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionContent__Group__0"


    // $ANTLR start "rule__QuestionContent__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:630:1: rule__QuestionContent__Group__0__Impl : ( 'questionContent' ) ;
    public final void rule__QuestionContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:634:1: ( ( 'questionContent' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:635:1: ( 'questionContent' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:635:1: ( 'questionContent' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:636:1: 'questionContent'
            {
             before(grammarAccess.getQuestionContentAccess().getQuestionContentKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__QuestionContent__Group__0__Impl1226); 
             after(grammarAccess.getQuestionContentAccess().getQuestionContentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionContent__Group__0__Impl"


    // $ANTLR start "rule__QuestionContent__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:649:1: rule__QuestionContent__Group__1 : rule__QuestionContent__Group__1__Impl ;
    public final void rule__QuestionContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:653:1: ( rule__QuestionContent__Group__1__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:654:2: rule__QuestionContent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QuestionContent__Group__1__Impl_in_rule__QuestionContent__Group__11257);
            rule__QuestionContent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionContent__Group__1"


    // $ANTLR start "rule__QuestionContent__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:660:1: rule__QuestionContent__Group__1__Impl : ( ( rule__QuestionContent__QcontentAssignment_1 ) ) ;
    public final void rule__QuestionContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:664:1: ( ( ( rule__QuestionContent__QcontentAssignment_1 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:665:1: ( ( rule__QuestionContent__QcontentAssignment_1 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:665:1: ( ( rule__QuestionContent__QcontentAssignment_1 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:666:1: ( rule__QuestionContent__QcontentAssignment_1 )
            {
             before(grammarAccess.getQuestionContentAccess().getQcontentAssignment_1()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:667:1: ( rule__QuestionContent__QcontentAssignment_1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:667:2: rule__QuestionContent__QcontentAssignment_1
            {
            pushFollow(FOLLOW_rule__QuestionContent__QcontentAssignment_1_in_rule__QuestionContent__Group__1__Impl1284);
            rule__QuestionContent__QcontentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionContentAccess().getQcontentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionContent__Group__1__Impl"


    // $ANTLR start "rule__AnswerType__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:681:1: rule__AnswerType__Group__0 : rule__AnswerType__Group__0__Impl rule__AnswerType__Group__1 ;
    public final void rule__AnswerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:685:1: ( rule__AnswerType__Group__0__Impl rule__AnswerType__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:686:2: rule__AnswerType__Group__0__Impl rule__AnswerType__Group__1
            {
            pushFollow(FOLLOW_rule__AnswerType__Group__0__Impl_in_rule__AnswerType__Group__01318);
            rule__AnswerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnswerType__Group__1_in_rule__AnswerType__Group__01321);
            rule__AnswerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerType__Group__0"


    // $ANTLR start "rule__AnswerType__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:693:1: rule__AnswerType__Group__0__Impl : ( 'answerType' ) ;
    public final void rule__AnswerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:697:1: ( ( 'answerType' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:698:1: ( 'answerType' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:698:1: ( 'answerType' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:699:1: 'answerType'
            {
             before(grammarAccess.getAnswerTypeAccess().getAnswerTypeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__AnswerType__Group__0__Impl1349); 
             after(grammarAccess.getAnswerTypeAccess().getAnswerTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerType__Group__0__Impl"


    // $ANTLR start "rule__AnswerType__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:712:1: rule__AnswerType__Group__1 : rule__AnswerType__Group__1__Impl ;
    public final void rule__AnswerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:716:1: ( rule__AnswerType__Group__1__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:717:2: rule__AnswerType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AnswerType__Group__1__Impl_in_rule__AnswerType__Group__11380);
            rule__AnswerType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerType__Group__1"


    // $ANTLR start "rule__AnswerType__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:723:1: rule__AnswerType__Group__1__Impl : ( ( rule__AnswerType__AtypeAssignment_1 ) ) ;
    public final void rule__AnswerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:727:1: ( ( ( rule__AnswerType__AtypeAssignment_1 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:728:1: ( ( rule__AnswerType__AtypeAssignment_1 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:728:1: ( ( rule__AnswerType__AtypeAssignment_1 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:729:1: ( rule__AnswerType__AtypeAssignment_1 )
            {
             before(grammarAccess.getAnswerTypeAccess().getAtypeAssignment_1()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:730:1: ( rule__AnswerType__AtypeAssignment_1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:730:2: rule__AnswerType__AtypeAssignment_1
            {
            pushFollow(FOLLOW_rule__AnswerType__AtypeAssignment_1_in_rule__AnswerType__Group__1__Impl1407);
            rule__AnswerType__AtypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerTypeAccess().getAtypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerType__Group__1__Impl"


    // $ANTLR start "rule__ChooseFrom__Group__0"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:744:1: rule__ChooseFrom__Group__0 : rule__ChooseFrom__Group__0__Impl rule__ChooseFrom__Group__1 ;
    public final void rule__ChooseFrom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:748:1: ( rule__ChooseFrom__Group__0__Impl rule__ChooseFrom__Group__1 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:749:2: rule__ChooseFrom__Group__0__Impl rule__ChooseFrom__Group__1
            {
            pushFollow(FOLLOW_rule__ChooseFrom__Group__0__Impl_in_rule__ChooseFrom__Group__01441);
            rule__ChooseFrom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChooseFrom__Group__1_in_rule__ChooseFrom__Group__01444);
            rule__ChooseFrom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChooseFrom__Group__0"


    // $ANTLR start "rule__ChooseFrom__Group__0__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:756:1: rule__ChooseFrom__Group__0__Impl : ( () ) ;
    public final void rule__ChooseFrom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:760:1: ( ( () ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:761:1: ( () )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:761:1: ( () )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:762:1: ()
            {
             before(grammarAccess.getChooseFromAccess().getChooseFromAction_0()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:763:1: ()
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:765:1: 
            {
            }

             after(grammarAccess.getChooseFromAccess().getChooseFromAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChooseFrom__Group__0__Impl"


    // $ANTLR start "rule__ChooseFrom__Group__1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:775:1: rule__ChooseFrom__Group__1 : rule__ChooseFrom__Group__1__Impl rule__ChooseFrom__Group__2 ;
    public final void rule__ChooseFrom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:779:1: ( rule__ChooseFrom__Group__1__Impl rule__ChooseFrom__Group__2 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:780:2: rule__ChooseFrom__Group__1__Impl rule__ChooseFrom__Group__2
            {
            pushFollow(FOLLOW_rule__ChooseFrom__Group__1__Impl_in_rule__ChooseFrom__Group__11502);
            rule__ChooseFrom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChooseFrom__Group__2_in_rule__ChooseFrom__Group__11505);
            rule__ChooseFrom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChooseFrom__Group__1"


    // $ANTLR start "rule__ChooseFrom__Group__1__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:787:1: rule__ChooseFrom__Group__1__Impl : ( 'chooseFrom' ) ;
    public final void rule__ChooseFrom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:791:1: ( ( 'chooseFrom' ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:792:1: ( 'chooseFrom' )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:792:1: ( 'chooseFrom' )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:793:1: 'chooseFrom'
            {
             before(grammarAccess.getChooseFromAccess().getChooseFromKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ChooseFrom__Group__1__Impl1533); 
             after(grammarAccess.getChooseFromAccess().getChooseFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChooseFrom__Group__1__Impl"


    // $ANTLR start "rule__ChooseFrom__Group__2"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:806:1: rule__ChooseFrom__Group__2 : rule__ChooseFrom__Group__2__Impl ;
    public final void rule__ChooseFrom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:810:1: ( rule__ChooseFrom__Group__2__Impl )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:811:2: rule__ChooseFrom__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ChooseFrom__Group__2__Impl_in_rule__ChooseFrom__Group__21564);
            rule__ChooseFrom__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChooseFrom__Group__2"


    // $ANTLR start "rule__ChooseFrom__Group__2__Impl"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:817:1: rule__ChooseFrom__Group__2__Impl : ( ( rule__ChooseFrom__ChoicesAssignment_2 )* ) ;
    public final void rule__ChooseFrom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:821:1: ( ( ( rule__ChooseFrom__ChoicesAssignment_2 )* ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:822:1: ( ( rule__ChooseFrom__ChoicesAssignment_2 )* )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:822:1: ( ( rule__ChooseFrom__ChoicesAssignment_2 )* )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:823:1: ( rule__ChooseFrom__ChoicesAssignment_2 )*
            {
             before(grammarAccess.getChooseFromAccess().getChoicesAssignment_2()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:824:1: ( rule__ChooseFrom__ChoicesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:824:2: rule__ChooseFrom__ChoicesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ChooseFrom__ChoicesAssignment_2_in_rule__ChooseFrom__Group__2__Impl1591);
            	    rule__ChooseFrom__ChoicesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getChooseFromAccess().getChoicesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChooseFrom__Group__2__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:841:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:845:1: ( ( RULE_ID ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:846:1: ( RULE_ID )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:846:1: ( RULE_ID )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:847:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_11633); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__QuestionsAssignment_3"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:856:1: rule__Model__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Model__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:860:1: ( ( ruleQuestion ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:861:1: ( ruleQuestion )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:861:1: ( ruleQuestion )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:862:1: ruleQuestion
            {
             before(grammarAccess.getModelAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Model__QuestionsAssignment_31664);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQuestionsQuestionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__QuestionsAssignment_3"


    // $ANTLR start "rule__Question__NameAssignment_1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:871:1: rule__Question__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:875:1: ( ( RULE_ID ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:876:1: ( RULE_ID )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:876:1: ( RULE_ID )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:877:1: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Question__NameAssignment_11695); 
             after(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__NameAssignment_1"


    // $ANTLR start "rule__Question__ContentsAssignment_3"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:886:1: rule__Question__ContentsAssignment_3 : ( rulequestionContent ) ;
    public final void rule__Question__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:890:1: ( ( rulequestionContent ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:891:1: ( rulequestionContent )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:891:1: ( rulequestionContent )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:892:1: rulequestionContent
            {
             before(grammarAccess.getQuestionAccess().getContentsQuestionContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulequestionContent_in_rule__Question__ContentsAssignment_31726);
            rulequestionContent();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getContentsQuestionContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ContentsAssignment_3"


    // $ANTLR start "rule__Question__AnswerTypesAssignment_4"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:901:1: rule__Question__AnswerTypesAssignment_4 : ( ruleAnswerType ) ;
    public final void rule__Question__AnswerTypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:905:1: ( ( ruleAnswerType ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:906:1: ( ruleAnswerType )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:906:1: ( ruleAnswerType )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:907:1: ruleAnswerType
            {
             before(grammarAccess.getQuestionAccess().getAnswerTypesAnswerTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAnswerType_in_rule__Question__AnswerTypesAssignment_41757);
            ruleAnswerType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAnswerTypesAnswerTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__AnswerTypesAssignment_4"


    // $ANTLR start "rule__Question__ChooseFromsAssignment_5"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:916:1: rule__Question__ChooseFromsAssignment_5 : ( ruleChooseFrom ) ;
    public final void rule__Question__ChooseFromsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:920:1: ( ( ruleChooseFrom ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:921:1: ( ruleChooseFrom )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:921:1: ( ruleChooseFrom )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:922:1: ruleChooseFrom
            {
             before(grammarAccess.getQuestionAccess().getChooseFromsChooseFromParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleChooseFrom_in_rule__Question__ChooseFromsAssignment_51788);
            ruleChooseFrom();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getChooseFromsChooseFromParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ChooseFromsAssignment_5"


    // $ANTLR start "rule__QuestionContent__QcontentAssignment_1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:931:1: rule__QuestionContent__QcontentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__QuestionContent__QcontentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:935:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:936:1: ( RULE_STRING )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:936:1: ( RULE_STRING )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:937:1: RULE_STRING
            {
             before(grammarAccess.getQuestionContentAccess().getQcontentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__QuestionContent__QcontentAssignment_11819); 
             after(grammarAccess.getQuestionContentAccess().getQcontentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionContent__QcontentAssignment_1"


    // $ANTLR start "rule__AnswerType__AtypeAssignment_1"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:946:1: rule__AnswerType__AtypeAssignment_1 : ( ( rule__AnswerType__AtypeAlternatives_1_0 ) ) ;
    public final void rule__AnswerType__AtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:950:1: ( ( ( rule__AnswerType__AtypeAlternatives_1_0 ) ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:951:1: ( ( rule__AnswerType__AtypeAlternatives_1_0 ) )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:951:1: ( ( rule__AnswerType__AtypeAlternatives_1_0 ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:952:1: ( rule__AnswerType__AtypeAlternatives_1_0 )
            {
             before(grammarAccess.getAnswerTypeAccess().getAtypeAlternatives_1_0()); 
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:953:1: ( rule__AnswerType__AtypeAlternatives_1_0 )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:953:2: rule__AnswerType__AtypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__AnswerType__AtypeAlternatives_1_0_in_rule__AnswerType__AtypeAssignment_11850);
            rule__AnswerType__AtypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerTypeAccess().getAtypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerType__AtypeAssignment_1"


    // $ANTLR start "rule__ChooseFrom__ChoicesAssignment_2"
    // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:962:1: rule__ChooseFrom__ChoicesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChooseFrom__ChoicesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:966:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:967:1: ( RULE_STRING )
            {
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:967:1: ( RULE_STRING )
            // ../org.xtext.example.qdsl.ui/src-gen/org/xtext/example/qdsl/ui/contentassist/antlr/internal/InternalQDsl.g:968:1: RULE_STRING
            {
             before(grammarAccess.getChooseFromAccess().getChoicesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChooseFrom__ChoicesAssignment_21883); 
             after(grammarAccess.getChooseFromAccess().getChoicesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChooseFrom__ChoicesAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequestionContent_in_entryRulequestionContent181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequestionContent188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionContent__Group__0_in_rulequestionContent214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswerType_in_entryRuleAnswerType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswerType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__Group__0_in_ruleAnswerType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChooseFrom_in_entryRuleChooseFrom301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChooseFrom308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__0_in_ruleChooseFrom334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AnswerType__AtypeAlternatives_1_0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AnswerType__AtypeAlternatives_1_0391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AnswerType__AtypeAlternatives_1_0411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__0__Impl474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1505 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2565 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group__2__Impl596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3627 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__QuestionsAssignment_3_in_rule__Model__Group__3__Impl657 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__4__Impl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Question__Group__0__Impl788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1819 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2879 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Question__Group__2__Impl910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3941 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__ContentsAssignment_3_in_rule__Question__Group__3__Impl971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41001 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__AnswerTypesAssignment_4_in_rule__Question__Group__4__Impl1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51061 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__ChooseFromsAssignment_5_in_rule__Question__Group__5__Impl1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__61122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Question__Group__6__Impl1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionContent__Group__0__Impl_in_rule__QuestionContent__Group__01195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QuestionContent__Group__1_in_rule__QuestionContent__Group__01198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QuestionContent__Group__0__Impl1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionContent__Group__1__Impl_in_rule__QuestionContent__Group__11257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionContent__QcontentAssignment_1_in_rule__QuestionContent__Group__1__Impl1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__Group__0__Impl_in_rule__AnswerType__Group__01318 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__AnswerType__Group__1_in_rule__AnswerType__Group__01321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AnswerType__Group__0__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__Group__1__Impl_in_rule__AnswerType__Group__11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__AtypeAssignment_1_in_rule__AnswerType__Group__1__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__0__Impl_in_rule__ChooseFrom__Group__01441 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__1_in_rule__ChooseFrom__Group__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__1__Impl_in_rule__ChooseFrom__Group__11502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__2_in_rule__ChooseFrom__Group__11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ChooseFrom__Group__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__Group__2__Impl_in_rule__ChooseFrom__Group__21564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChooseFrom__ChoicesAssignment_2_in_rule__ChooseFrom__Group__2__Impl1591 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Model__QuestionsAssignment_31664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Question__NameAssignment_11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequestionContent_in_rule__Question__ContentsAssignment_31726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswerType_in_rule__Question__AnswerTypesAssignment_41757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChooseFrom_in_rule__Question__ChooseFromsAssignment_51788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__QuestionContent__QcontentAssignment_11819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnswerType__AtypeAlternatives_1_0_in_rule__AnswerType__AtypeAssignment_11850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChooseFrom__ChoicesAssignment_21883 = new BitSet(new long[]{0x0000000000000002L});

}