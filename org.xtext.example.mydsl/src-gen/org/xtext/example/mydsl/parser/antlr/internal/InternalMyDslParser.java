package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'camp'", "'colorseniors'", "'{'", "'}'", "'cardseniors'", "'roomseniors'", "'colors'", "'year'", "':'", "'color'", "'inferiors'", "','", "'card'", "'superior'", "'type'", "'colorsenior'", "'cards'", "'cardsenior'", "'rooms'", "'roomsenior'", "'BlackColor'", "'BlueColor'", "'RedColor'", "'WhiteColor'", "'YellowColor'", "'BlueCard'", "'GreenCard'", "'OrangeCard'", "'YellowCard'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Camp";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCamp"
    // InternalMyDsl.g:65:1: entryRuleCamp returns [EObject current=null] : iv_ruleCamp= ruleCamp EOF ;
    public final EObject entryRuleCamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCamp = null;


        try {
            // InternalMyDsl.g:65:45: (iv_ruleCamp= ruleCamp EOF )
            // InternalMyDsl.g:66:2: iv_ruleCamp= ruleCamp EOF
            {
             newCompositeNode(grammarAccess.getCampRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCamp=ruleCamp();

            state._fsp--;

             current =iv_ruleCamp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCamp"


    // $ANTLR start "ruleCamp"
    // InternalMyDsl.g:72:1: ruleCamp returns [EObject current=null] : (otherlv_0= 'camp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'colorseniors' otherlv_3= '{' ( (lv_colorseniors_4_0= ruleColorSenior ) )* otherlv_5= '}' otherlv_6= 'cardseniors' otherlv_7= '{' ( (lv_cardseniors_8_0= ruleCardSenior ) )* otherlv_9= '}' otherlv_10= 'roomseniors' otherlv_11= '{' ( (lv_roomseniors_12_0= ruleRoomSenior ) )* otherlv_13= '}' otherlv_14= 'colors' otherlv_15= '{' ( (lv_colors_16_0= ruleColor ) )* otherlv_17= '}' ) ;
    public final EObject ruleCamp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_colorseniors_4_0 = null;

        EObject lv_cardseniors_8_0 = null;

        EObject lv_roomseniors_12_0 = null;

        EObject lv_colors_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'camp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'colorseniors' otherlv_3= '{' ( (lv_colorseniors_4_0= ruleColorSenior ) )* otherlv_5= '}' otherlv_6= 'cardseniors' otherlv_7= '{' ( (lv_cardseniors_8_0= ruleCardSenior ) )* otherlv_9= '}' otherlv_10= 'roomseniors' otherlv_11= '{' ( (lv_roomseniors_12_0= ruleRoomSenior ) )* otherlv_13= '}' otherlv_14= 'colors' otherlv_15= '{' ( (lv_colors_16_0= ruleColor ) )* otherlv_17= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'camp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'colorseniors' otherlv_3= '{' ( (lv_colorseniors_4_0= ruleColorSenior ) )* otherlv_5= '}' otherlv_6= 'cardseniors' otherlv_7= '{' ( (lv_cardseniors_8_0= ruleCardSenior ) )* otherlv_9= '}' otherlv_10= 'roomseniors' otherlv_11= '{' ( (lv_roomseniors_12_0= ruleRoomSenior ) )* otherlv_13= '}' otherlv_14= 'colors' otherlv_15= '{' ( (lv_colors_16_0= ruleColor ) )* otherlv_17= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'camp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'colorseniors' otherlv_3= '{' ( (lv_colorseniors_4_0= ruleColorSenior ) )* otherlv_5= '}' otherlv_6= 'cardseniors' otherlv_7= '{' ( (lv_cardseniors_8_0= ruleCardSenior ) )* otherlv_9= '}' otherlv_10= 'roomseniors' otherlv_11= '{' ( (lv_roomseniors_12_0= ruleRoomSenior ) )* otherlv_13= '}' otherlv_14= 'colors' otherlv_15= '{' ( (lv_colors_16_0= ruleColor ) )* otherlv_17= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'camp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'colorseniors' otherlv_3= '{' ( (lv_colorseniors_4_0= ruleColorSenior ) )* otherlv_5= '}' otherlv_6= 'cardseniors' otherlv_7= '{' ( (lv_cardseniors_8_0= ruleCardSenior ) )* otherlv_9= '}' otherlv_10= 'roomseniors' otherlv_11= '{' ( (lv_roomseniors_12_0= ruleRoomSenior ) )* otherlv_13= '}' otherlv_14= 'colors' otherlv_15= '{' ( (lv_colors_16_0= ruleColor ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCampAccess().getCampKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCampAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCampAccess().getColorseniorsKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:110:3: ( (lv_colorseniors_4_0= ruleColorSenior ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:111:4: (lv_colorseniors_4_0= ruleColorSenior )
            	    {
            	    // InternalMyDsl.g:111:4: (lv_colorseniors_4_0= ruleColorSenior )
            	    // InternalMyDsl.g:112:5: lv_colorseniors_4_0= ruleColorSenior
            	    {

            	    					newCompositeNode(grammarAccess.getCampAccess().getColorseniorsColorSeniorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_colorseniors_4_0=ruleColorSenior();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCampRule());
            	    					}
            	    					add(
            	    						current,
            	    						"colorseniors",
            	    						lv_colorseniors_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.ColorSenior");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getCampAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getCampAccess().getCardseniorsKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:141:3: ( (lv_cardseniors_8_0= ruleCardSenior ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:142:4: (lv_cardseniors_8_0= ruleCardSenior )
            	    {
            	    // InternalMyDsl.g:142:4: (lv_cardseniors_8_0= ruleCardSenior )
            	    // InternalMyDsl.g:143:5: lv_cardseniors_8_0= ruleCardSenior
            	    {

            	    					newCompositeNode(grammarAccess.getCampAccess().getCardseniorsCardSeniorParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_cardseniors_8_0=ruleCardSenior();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCampRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cardseniors",
            	    						lv_cardseniors_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.CardSenior");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getCampAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getCampAccess().getRoomseniorsKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMyDsl.g:172:3: ( (lv_roomseniors_12_0= ruleRoomSenior ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:173:4: (lv_roomseniors_12_0= ruleRoomSenior )
            	    {
            	    // InternalMyDsl.g:173:4: (lv_roomseniors_12_0= ruleRoomSenior )
            	    // InternalMyDsl.g:174:5: lv_roomseniors_12_0= ruleRoomSenior
            	    {

            	    					newCompositeNode(grammarAccess.getCampAccess().getRoomseniorsRoomSeniorParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_roomseniors_12_0=ruleRoomSenior();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCampRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roomseniors",
            	    						lv_roomseniors_12_0,
            	    						"org.xtext.example.mydsl.MyDsl.RoomSenior");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getCampAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getCampAccess().getColorsKeyword_14());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalMyDsl.g:203:3: ( (lv_colors_16_0= ruleColor ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:204:4: (lv_colors_16_0= ruleColor )
            	    {
            	    // InternalMyDsl.g:204:4: (lv_colors_16_0= ruleColor )
            	    // InternalMyDsl.g:205:5: lv_colors_16_0= ruleColor
            	    {

            	    					newCompositeNode(grammarAccess.getCampAccess().getColorsColorParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_colors_16_0=ruleColor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCampRule());
            	    					}
            	    					add(
            	    						current,
            	    						"colors",
            	    						lv_colors_16_0,
            	    						"org.xtext.example.mydsl.MyDsl.Color");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getCampAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleCamp"


    // $ANTLR start "entryRuleColorSenior"
    // InternalMyDsl.g:230:1: entryRuleColorSenior returns [EObject current=null] : iv_ruleColorSenior= ruleColorSenior EOF ;
    public final EObject entryRuleColorSenior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSenior = null;


        try {
            // InternalMyDsl.g:230:52: (iv_ruleColorSenior= ruleColorSenior EOF )
            // InternalMyDsl.g:231:2: iv_ruleColorSenior= ruleColorSenior EOF
            {
             newCompositeNode(grammarAccess.getColorSeniorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorSenior=ruleColorSenior();

            state._fsp--;

             current =iv_ruleColorSenior; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColorSenior"


    // $ANTLR start "ruleColorSenior"
    // InternalMyDsl.g:237:1: ruleColorSenior returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'inferiors' otherlv_9= ':' ( ( ruleName ) ) (otherlv_11= ',' ( ( ruleName ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleColorSenior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_color_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:243:2: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'inferiors' otherlv_9= ':' ( ( ruleName ) ) (otherlv_11= ',' ( ( ruleName ) ) )* otherlv_13= '}' ) )
            // InternalMyDsl.g:244:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'inferiors' otherlv_9= ':' ( ( ruleName ) ) (otherlv_11= ',' ( ( ruleName ) ) )* otherlv_13= '}' )
            {
            // InternalMyDsl.g:244:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'inferiors' otherlv_9= ':' ( ( ruleName ) ) (otherlv_11= ',' ( ( ruleName ) ) )* otherlv_13= '}' )
            // InternalMyDsl.g:245:3: ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'inferiors' otherlv_9= ':' ( ( ruleName ) ) (otherlv_11= ',' ( ( ruleName ) ) )* otherlv_13= '}'
            {
            // InternalMyDsl.g:245:3: ( (lv_name_0_0= ruleName ) )
            // InternalMyDsl.g:246:4: (lv_name_0_0= ruleName )
            {
            // InternalMyDsl.g:246:4: (lv_name_0_0= ruleName )
            // InternalMyDsl.g:247:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getColorSeniorAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorSeniorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getColorSeniorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getColorSeniorAccess().getYearKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getColorSeniorAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:276:3: ( (lv_year_4_0= RULE_INT ) )
            // InternalMyDsl.g:277:4: (lv_year_4_0= RULE_INT )
            {
            // InternalMyDsl.g:277:4: (lv_year_4_0= RULE_INT )
            // InternalMyDsl.g:278:5: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_year_4_0, grammarAccess.getColorSeniorAccess().getYearINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorSeniorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getColorSeniorAccess().getColorKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getColorSeniorAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:302:3: ( (lv_color_7_0= ruleColorType ) )
            // InternalMyDsl.g:303:4: (lv_color_7_0= ruleColorType )
            {
            // InternalMyDsl.g:303:4: (lv_color_7_0= ruleColorType )
            // InternalMyDsl.g:304:5: lv_color_7_0= ruleColorType
            {

            					newCompositeNode(grammarAccess.getColorSeniorAccess().getColorColorTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_color_7_0=ruleColorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorSeniorRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_7_0,
            						"org.xtext.example.mydsl.MyDsl.ColorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getColorSeniorAccess().getInferiorsKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getColorSeniorAccess().getColonKeyword_9());
            		
            // InternalMyDsl.g:329:3: ( ( ruleName ) )
            // InternalMyDsl.g:330:4: ( ruleName )
            {
            // InternalMyDsl.g:330:4: ( ruleName )
            // InternalMyDsl.g:331:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorSeniorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorCrossReference_10_0());
            				
            pushFollow(FOLLOW_16);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:345:3: (otherlv_11= ',' ( ( ruleName ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:346:4: otherlv_11= ',' ( ( ruleName ) )
            	    {
            	    otherlv_11=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getColorSeniorAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMyDsl.g:350:4: ( ( ruleName ) )
            	    // InternalMyDsl.g:351:5: ( ruleName )
            	    {
            	    // InternalMyDsl.g:351:5: ( ruleName )
            	    // InternalMyDsl.g:352:6: ruleName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getColorSeniorRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getColorSeniorAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleColorSenior"


    // $ANTLR start "entryRuleCardSenior"
    // InternalMyDsl.g:375:1: entryRuleCardSenior returns [EObject current=null] : iv_ruleCardSenior= ruleCardSenior EOF ;
    public final EObject entryRuleCardSenior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardSenior = null;


        try {
            // InternalMyDsl.g:375:51: (iv_ruleCardSenior= ruleCardSenior EOF )
            // InternalMyDsl.g:376:2: iv_ruleCardSenior= ruleCardSenior EOF
            {
             newCompositeNode(grammarAccess.getCardSeniorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardSenior=ruleCardSenior();

            state._fsp--;

             current =iv_ruleCardSenior; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCardSenior"


    // $ANTLR start "ruleCardSenior"
    // InternalMyDsl.g:382:1: ruleCardSenior returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= 'inferiors' otherlv_15= ':' ( ( ruleName ) ) (otherlv_17= ',' ( ( ruleName ) ) )* otherlv_19= '}' ) ;
    public final EObject ruleCardSenior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_color_7_0 = null;

        Enumerator lv_card_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:388:2: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= 'inferiors' otherlv_15= ':' ( ( ruleName ) ) (otherlv_17= ',' ( ( ruleName ) ) )* otherlv_19= '}' ) )
            // InternalMyDsl.g:389:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= 'inferiors' otherlv_15= ':' ( ( ruleName ) ) (otherlv_17= ',' ( ( ruleName ) ) )* otherlv_19= '}' )
            {
            // InternalMyDsl.g:389:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= 'inferiors' otherlv_15= ':' ( ( ruleName ) ) (otherlv_17= ',' ( ( ruleName ) ) )* otherlv_19= '}' )
            // InternalMyDsl.g:390:3: ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= 'inferiors' otherlv_15= ':' ( ( ruleName ) ) (otherlv_17= ',' ( ( ruleName ) ) )* otherlv_19= '}'
            {
            // InternalMyDsl.g:390:3: ( (lv_name_0_0= ruleName ) )
            // InternalMyDsl.g:391:4: (lv_name_0_0= ruleName )
            {
            // InternalMyDsl.g:391:4: (lv_name_0_0= ruleName )
            // InternalMyDsl.g:392:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getCardSeniorAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardSeniorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCardSeniorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCardSeniorAccess().getYearKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getCardSeniorAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:421:3: ( (lv_year_4_0= RULE_INT ) )
            // InternalMyDsl.g:422:4: (lv_year_4_0= RULE_INT )
            {
            // InternalMyDsl.g:422:4: (lv_year_4_0= RULE_INT )
            // InternalMyDsl.g:423:5: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_year_4_0, grammarAccess.getCardSeniorAccess().getYearINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardSeniorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getCardSeniorAccess().getColorKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCardSeniorAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:447:3: ( (lv_color_7_0= ruleColorType ) )
            // InternalMyDsl.g:448:4: (lv_color_7_0= ruleColorType )
            {
            // InternalMyDsl.g:448:4: (lv_color_7_0= ruleColorType )
            // InternalMyDsl.g:449:5: lv_color_7_0= ruleColorType
            {

            					newCompositeNode(grammarAccess.getCardSeniorAccess().getColorColorTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_color_7_0=ruleColorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardSeniorRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_7_0,
            						"org.xtext.example.mydsl.MyDsl.ColorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getCardSeniorAccess().getCardKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getCardSeniorAccess().getColonKeyword_9());
            		
            // InternalMyDsl.g:474:3: ( (lv_card_10_0= ruleCardType ) )
            // InternalMyDsl.g:475:4: (lv_card_10_0= ruleCardType )
            {
            // InternalMyDsl.g:475:4: (lv_card_10_0= ruleCardType )
            // InternalMyDsl.g:476:5: lv_card_10_0= ruleCardType
            {

            					newCompositeNode(grammarAccess.getCardSeniorAccess().getCardCardTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_card_10_0=ruleCardType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardSeniorRule());
            					}
            					set(
            						current,
            						"card",
            						lv_card_10_0,
            						"org.xtext.example.mydsl.MyDsl.CardType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getCardSeniorAccess().getSuperiorKeyword_11());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getCardSeniorAccess().getColonKeyword_12());
            		
            // InternalMyDsl.g:501:3: ( ( ruleName ) )
            // InternalMyDsl.g:502:4: ( ruleName )
            {
            // InternalMyDsl.g:502:4: ( ruleName )
            // InternalMyDsl.g:503:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardSeniorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCardSeniorAccess().getSuperiorColorSeniorCrossReference_13_0());
            				
            pushFollow(FOLLOW_15);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getCardSeniorAccess().getInferiorsKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getCardSeniorAccess().getColonKeyword_15());
            		
            // InternalMyDsl.g:525:3: ( ( ruleName ) )
            // InternalMyDsl.g:526:4: ( ruleName )
            {
            // InternalMyDsl.g:526:4: ( ruleName )
            // InternalMyDsl.g:527:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardSeniorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorCrossReference_16_0());
            				
            pushFollow(FOLLOW_16);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:541:3: (otherlv_17= ',' ( ( ruleName ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:542:4: otherlv_17= ',' ( ( ruleName ) )
            	    {
            	    otherlv_17=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_17, grammarAccess.getCardSeniorAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalMyDsl.g:546:4: ( ( ruleName ) )
            	    // InternalMyDsl.g:547:5: ( ruleName )
            	    {
            	    // InternalMyDsl.g:547:5: ( ruleName )
            	    // InternalMyDsl.g:548:6: ruleName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCardSeniorRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorCrossReference_17_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getCardSeniorAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleCardSenior"


    // $ANTLR start "entryRuleRoomSenior"
    // InternalMyDsl.g:571:1: entryRuleRoomSenior returns [EObject current=null] : iv_ruleRoomSenior= ruleRoomSenior EOF ;
    public final EObject entryRuleRoomSenior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomSenior = null;


        try {
            // InternalMyDsl.g:571:51: (iv_ruleRoomSenior= ruleRoomSenior EOF )
            // InternalMyDsl.g:572:2: iv_ruleRoomSenior= ruleRoomSenior EOF
            {
             newCompositeNode(grammarAccess.getRoomSeniorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoomSenior=ruleRoomSenior();

            state._fsp--;

             current =iv_ruleRoomSenior; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoomSenior"


    // $ANTLR start "ruleRoomSenior"
    // InternalMyDsl.g:578:1: ruleRoomSenior returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= '}' ) ;
    public final EObject ruleRoomSenior() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_color_7_0 = null;

        Enumerator lv_card_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:584:2: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= '}' ) )
            // InternalMyDsl.g:585:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= '}' )
            {
            // InternalMyDsl.g:585:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= '}' )
            // InternalMyDsl.g:586:3: ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'year' otherlv_3= ':' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'color' otherlv_6= ':' ( (lv_color_7_0= ruleColorType ) ) otherlv_8= 'card' otherlv_9= ':' ( (lv_card_10_0= ruleCardType ) ) otherlv_11= 'superior' otherlv_12= ':' ( ( ruleName ) ) otherlv_14= '}'
            {
            // InternalMyDsl.g:586:3: ( (lv_name_0_0= ruleName ) )
            // InternalMyDsl.g:587:4: (lv_name_0_0= ruleName )
            {
            // InternalMyDsl.g:587:4: (lv_name_0_0= ruleName )
            // InternalMyDsl.g:588:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getRoomSeniorAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomSeniorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomSeniorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomSeniorAccess().getYearKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomSeniorAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:617:3: ( (lv_year_4_0= RULE_INT ) )
            // InternalMyDsl.g:618:4: (lv_year_4_0= RULE_INT )
            {
            // InternalMyDsl.g:618:4: (lv_year_4_0= RULE_INT )
            // InternalMyDsl.g:619:5: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_year_4_0, grammarAccess.getRoomSeniorAccess().getYearINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomSeniorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomSeniorAccess().getColorKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getRoomSeniorAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:643:3: ( (lv_color_7_0= ruleColorType ) )
            // InternalMyDsl.g:644:4: (lv_color_7_0= ruleColorType )
            {
            // InternalMyDsl.g:644:4: (lv_color_7_0= ruleColorType )
            // InternalMyDsl.g:645:5: lv_color_7_0= ruleColorType
            {

            					newCompositeNode(grammarAccess.getRoomSeniorAccess().getColorColorTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_color_7_0=ruleColorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomSeniorRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_7_0,
            						"org.xtext.example.mydsl.MyDsl.ColorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getRoomSeniorAccess().getCardKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getRoomSeniorAccess().getColonKeyword_9());
            		
            // InternalMyDsl.g:670:3: ( (lv_card_10_0= ruleCardType ) )
            // InternalMyDsl.g:671:4: (lv_card_10_0= ruleCardType )
            {
            // InternalMyDsl.g:671:4: (lv_card_10_0= ruleCardType )
            // InternalMyDsl.g:672:5: lv_card_10_0= ruleCardType
            {

            					newCompositeNode(grammarAccess.getRoomSeniorAccess().getCardCardTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_card_10_0=ruleCardType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomSeniorRule());
            					}
            					set(
            						current,
            						"card",
            						lv_card_10_0,
            						"org.xtext.example.mydsl.MyDsl.CardType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getRoomSeniorAccess().getSuperiorKeyword_11());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getRoomSeniorAccess().getColonKeyword_12());
            		
            // InternalMyDsl.g:697:3: ( ( ruleName ) )
            // InternalMyDsl.g:698:4: ( ruleName )
            {
            // InternalMyDsl.g:698:4: ( ruleName )
            // InternalMyDsl.g:699:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomSeniorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoomSeniorAccess().getSuperiorCardSeniorCrossReference_13_0());
            				
            pushFollow(FOLLOW_20);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getRoomSeniorAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleRoomSenior"


    // $ANTLR start "entryRuleColor"
    // InternalMyDsl.g:721:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalMyDsl.g:721:46: (iv_ruleColor= ruleColor EOF )
            // InternalMyDsl.g:722:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalMyDsl.g:728:1: ruleColor returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleColorType ) ) otherlv_5= 'colorsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'cards' otherlv_9= '{' ( (lv_cards_10_0= ruleCard ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_cards_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:734:2: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleColorType ) ) otherlv_5= 'colorsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'cards' otherlv_9= '{' ( (lv_cards_10_0= ruleCard ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalMyDsl.g:735:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleColorType ) ) otherlv_5= 'colorsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'cards' otherlv_9= '{' ( (lv_cards_10_0= ruleCard ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalMyDsl.g:735:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleColorType ) ) otherlv_5= 'colorsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'cards' otherlv_9= '{' ( (lv_cards_10_0= ruleCard ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalMyDsl.g:736:3: ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleColorType ) ) otherlv_5= 'colorsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'cards' otherlv_9= '{' ( (lv_cards_10_0= ruleCard ) )* otherlv_11= '}' otherlv_12= '}'
            {
            // InternalMyDsl.g:736:3: ( (lv_name_0_0= ruleName ) )
            // InternalMyDsl.g:737:4: (lv_name_0_0= ruleName )
            {
            // InternalMyDsl.g:737:4: (lv_name_0_0= ruleName )
            // InternalMyDsl.g:738:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getColorAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getColorAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:767:3: ( (lv_type_4_0= ruleColorType ) )
            // InternalMyDsl.g:768:4: (lv_type_4_0= ruleColorType )
            {
            // InternalMyDsl.g:768:4: (lv_type_4_0= ruleColorType )
            // InternalMyDsl.g:769:5: lv_type_4_0= ruleColorType
            {

            					newCompositeNode(grammarAccess.getColorAccess().getTypeColorTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_4_0=ruleColorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.example.mydsl.MyDsl.ColorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getColorAccess().getColorseniorKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getColorAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:794:3: ( ( ruleName ) )
            // InternalMyDsl.g:795:4: ( ruleName )
            {
            // InternalMyDsl.g:795:4: ( ruleName )
            // InternalMyDsl.g:796:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getColorAccess().getColorseniorColorSeniorCrossReference_7_0());
            				
            pushFollow(FOLLOW_23);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getColorAccess().getCardsKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:818:3: ( (lv_cards_10_0= ruleCard ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:819:4: (lv_cards_10_0= ruleCard )
            	    {
            	    // InternalMyDsl.g:819:4: (lv_cards_10_0= ruleCard )
            	    // InternalMyDsl.g:820:5: lv_cards_10_0= ruleCard
            	    {

            	    					newCompositeNode(grammarAccess.getColorAccess().getCardsCardParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_cards_10_0=ruleCard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getColorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cards",
            	    						lv_cards_10_0,
            	    						"org.xtext.example.mydsl.MyDsl.Card");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_11, grammarAccess.getColorAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getColorAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleCard"
    // InternalMyDsl.g:849:1: entryRuleCard returns [EObject current=null] : iv_ruleCard= ruleCard EOF ;
    public final EObject entryRuleCard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCard = null;


        try {
            // InternalMyDsl.g:849:45: (iv_ruleCard= ruleCard EOF )
            // InternalMyDsl.g:850:2: iv_ruleCard= ruleCard EOF
            {
             newCompositeNode(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCard=ruleCard();

            state._fsp--;

             current =iv_ruleCard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalMyDsl.g:856:1: ruleCard returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleCardType ) ) otherlv_5= 'cardsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'rooms' otherlv_9= '{' ( (lv_rooms_10_0= ruleRoom ) )* otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleCard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_rooms_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:862:2: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleCardType ) ) otherlv_5= 'cardsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'rooms' otherlv_9= '{' ( (lv_rooms_10_0= ruleRoom ) )* otherlv_11= '}' otherlv_12= '}' ) )
            // InternalMyDsl.g:863:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleCardType ) ) otherlv_5= 'cardsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'rooms' otherlv_9= '{' ( (lv_rooms_10_0= ruleRoom ) )* otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalMyDsl.g:863:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleCardType ) ) otherlv_5= 'cardsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'rooms' otherlv_9= '{' ( (lv_rooms_10_0= ruleRoom ) )* otherlv_11= '}' otherlv_12= '}' )
            // InternalMyDsl.g:864:3: ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':' ( (lv_type_4_0= ruleCardType ) ) otherlv_5= 'cardsenior' otherlv_6= ':' ( ( ruleName ) ) otherlv_8= 'rooms' otherlv_9= '{' ( (lv_rooms_10_0= ruleRoom ) )* otherlv_11= '}' otherlv_12= '}'
            {
            // InternalMyDsl.g:864:3: ( (lv_name_0_0= ruleName ) )
            // InternalMyDsl.g:865:4: (lv_name_0_0= ruleName )
            {
            // InternalMyDsl.g:865:4: (lv_name_0_0= ruleName )
            // InternalMyDsl.g:866:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getCardAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCardAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getCardAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:895:3: ( (lv_type_4_0= ruleCardType ) )
            // InternalMyDsl.g:896:4: (lv_type_4_0= ruleCardType )
            {
            // InternalMyDsl.g:896:4: (lv_type_4_0= ruleCardType )
            // InternalMyDsl.g:897:5: lv_type_4_0= ruleCardType
            {

            					newCompositeNode(grammarAccess.getCardAccess().getTypeCardTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_type_4_0=ruleCardType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.example.mydsl.MyDsl.CardType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getCardAccess().getCardseniorKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCardAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:922:3: ( ( ruleName ) )
            // InternalMyDsl.g:923:4: ( ruleName )
            {
            // InternalMyDsl.g:923:4: ( ruleName )
            // InternalMyDsl.g:924:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCardAccess().getCardseniorCardSeniorCrossReference_7_0());
            				
            pushFollow(FOLLOW_25);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getCardAccess().getRoomsKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMyDsl.g:946:3: ( (lv_rooms_10_0= ruleRoom ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:947:4: (lv_rooms_10_0= ruleRoom )
            	    {
            	    // InternalMyDsl.g:947:4: (lv_rooms_10_0= ruleRoom )
            	    // InternalMyDsl.g:948:5: lv_rooms_10_0= ruleRoom
            	    {

            	    					newCompositeNode(grammarAccess.getCardAccess().getRoomsRoomParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_rooms_10_0=ruleRoom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rooms",
            	    						lv_rooms_10_0,
            	    						"org.xtext.example.mydsl.MyDsl.Room");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_11, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleCard"


    // $ANTLR start "entryRuleRoom"
    // InternalMyDsl.g:977:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalMyDsl.g:977:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalMyDsl.g:978:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalMyDsl.g:984:1: ruleRoom returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'roomsenior' otherlv_3= ':' ( ( ruleName ) ) otherlv_5= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:990:2: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'roomsenior' otherlv_3= ':' ( ( ruleName ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:991:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'roomsenior' otherlv_3= ':' ( ( ruleName ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:991:2: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'roomsenior' otherlv_3= ':' ( ( ruleName ) ) otherlv_5= '}' )
            // InternalMyDsl.g:992:3: ( (lv_name_0_0= ruleName ) ) otherlv_1= '{' otherlv_2= 'roomsenior' otherlv_3= ':' ( ( ruleName ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:992:3: ( (lv_name_0_0= ruleName ) )
            // InternalMyDsl.g:993:4: (lv_name_0_0= ruleName )
            {
            // InternalMyDsl.g:993:4: (lv_name_0_0= ruleName )
            // InternalMyDsl.g:994:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getRoomseniorKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1023:3: ( ( ruleName ) )
            // InternalMyDsl.g:1024:4: ( ruleName )
            {
            // InternalMyDsl.g:1024:4: ( ruleName )
            // InternalMyDsl.g:1025:5: ruleName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoomAccess().getRoomseniorRoomSeniorCrossReference_4_0());
            				
            pushFollow(FOLLOW_20);
            ruleName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:1047:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalMyDsl.g:1047:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:1048:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMyDsl.g:1054:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1060:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) )
            // InternalMyDsl.g:1061:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            {
            // InternalMyDsl.g:1061:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            // InternalMyDsl.g:1062:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:1069:3: (this_ID_1= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1070:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getNameAccess().getIDTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleColorType"
    // InternalMyDsl.g:1082:1: ruleColorType returns [Enumerator current=null] : ( (enumLiteral_0= 'BlackColor' ) | (enumLiteral_1= 'BlueColor' ) | (enumLiteral_2= 'RedColor' ) | (enumLiteral_3= 'WhiteColor' ) | (enumLiteral_4= 'YellowColor' ) ) ;
    public final Enumerator ruleColorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1088:2: ( ( (enumLiteral_0= 'BlackColor' ) | (enumLiteral_1= 'BlueColor' ) | (enumLiteral_2= 'RedColor' ) | (enumLiteral_3= 'WhiteColor' ) | (enumLiteral_4= 'YellowColor' ) ) )
            // InternalMyDsl.g:1089:2: ( (enumLiteral_0= 'BlackColor' ) | (enumLiteral_1= 'BlueColor' ) | (enumLiteral_2= 'RedColor' ) | (enumLiteral_3= 'WhiteColor' ) | (enumLiteral_4= 'YellowColor' ) )
            {
            // InternalMyDsl.g:1089:2: ( (enumLiteral_0= 'BlackColor' ) | (enumLiteral_1= 'BlueColor' ) | (enumLiteral_2= 'RedColor' ) | (enumLiteral_3= 'WhiteColor' ) | (enumLiteral_4= 'YellowColor' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            case 35:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1090:3: (enumLiteral_0= 'BlackColor' )
                    {
                    // InternalMyDsl.g:1090:3: (enumLiteral_0= 'BlackColor' )
                    // InternalMyDsl.g:1091:4: enumLiteral_0= 'BlackColor'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getColorTypeAccess().getBlackColorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorTypeAccess().getBlackColorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1098:3: (enumLiteral_1= 'BlueColor' )
                    {
                    // InternalMyDsl.g:1098:3: (enumLiteral_1= 'BlueColor' )
                    // InternalMyDsl.g:1099:4: enumLiteral_1= 'BlueColor'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getColorTypeAccess().getBlueColorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorTypeAccess().getBlueColorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1106:3: (enumLiteral_2= 'RedColor' )
                    {
                    // InternalMyDsl.g:1106:3: (enumLiteral_2= 'RedColor' )
                    // InternalMyDsl.g:1107:4: enumLiteral_2= 'RedColor'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getColorTypeAccess().getRedColorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorTypeAccess().getRedColorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1114:3: (enumLiteral_3= 'WhiteColor' )
                    {
                    // InternalMyDsl.g:1114:3: (enumLiteral_3= 'WhiteColor' )
                    // InternalMyDsl.g:1115:4: enumLiteral_3= 'WhiteColor'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getColorTypeAccess().getWhiteColorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorTypeAccess().getWhiteColorEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1122:3: (enumLiteral_4= 'YellowColor' )
                    {
                    // InternalMyDsl.g:1122:3: (enumLiteral_4= 'YellowColor' )
                    // InternalMyDsl.g:1123:4: enumLiteral_4= 'YellowColor'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getColorTypeAccess().getYellowColorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorTypeAccess().getYellowColorEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleColorType"


    // $ANTLR start "ruleCardType"
    // InternalMyDsl.g:1133:1: ruleCardType returns [Enumerator current=null] : ( (enumLiteral_0= 'BlueCard' ) | (enumLiteral_1= 'GreenCard' ) | (enumLiteral_2= 'OrangeCard' ) | (enumLiteral_3= 'YellowCard' ) ) ;
    public final Enumerator ruleCardType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1139:2: ( ( (enumLiteral_0= 'BlueCard' ) | (enumLiteral_1= 'GreenCard' ) | (enumLiteral_2= 'OrangeCard' ) | (enumLiteral_3= 'YellowCard' ) ) )
            // InternalMyDsl.g:1140:2: ( (enumLiteral_0= 'BlueCard' ) | (enumLiteral_1= 'GreenCard' ) | (enumLiteral_2= 'OrangeCard' ) | (enumLiteral_3= 'YellowCard' ) )
            {
            // InternalMyDsl.g:1140:2: ( (enumLiteral_0= 'BlueCard' ) | (enumLiteral_1= 'GreenCard' ) | (enumLiteral_2= 'OrangeCard' ) | (enumLiteral_3= 'YellowCard' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1141:3: (enumLiteral_0= 'BlueCard' )
                    {
                    // InternalMyDsl.g:1141:3: (enumLiteral_0= 'BlueCard' )
                    // InternalMyDsl.g:1142:4: enumLiteral_0= 'BlueCard'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCardTypeAccess().getBlueColorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardTypeAccess().getBlueColorEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1149:3: (enumLiteral_1= 'GreenCard' )
                    {
                    // InternalMyDsl.g:1149:3: (enumLiteral_1= 'GreenCard' )
                    // InternalMyDsl.g:1150:4: enumLiteral_1= 'GreenCard'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCardTypeAccess().getGreenColorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardTypeAccess().getGreenColorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1157:3: (enumLiteral_2= 'OrangeCard' )
                    {
                    // InternalMyDsl.g:1157:3: (enumLiteral_2= 'OrangeCard' )
                    // InternalMyDsl.g:1158:4: enumLiteral_2= 'OrangeCard'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getCardTypeAccess().getOrangeColorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardTypeAccess().getOrangeColorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1165:3: (enumLiteral_3= 'YellowCard' )
                    {
                    // InternalMyDsl.g:1165:3: (enumLiteral_3= 'YellowCard' )
                    // InternalMyDsl.g:1166:4: enumLiteral_3= 'YellowCard'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getCardTypeAccess().getYellowColorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCardTypeAccess().getYellowColorEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleCardType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000012L});

}