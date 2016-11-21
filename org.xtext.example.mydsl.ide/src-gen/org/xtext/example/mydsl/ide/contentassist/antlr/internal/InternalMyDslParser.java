package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BlackColor'", "'BlueColor'", "'RedColor'", "'WhiteColor'", "'YellowColor'", "'BlueCard'", "'GreenCard'", "'OrangeCard'", "'YellowCard'", "'camp'", "'colorseniors'", "'{'", "'}'", "'cardseniors'", "'roomseniors'", "'colors'", "'year'", "':'", "'color'", "'inferiors'", "','", "'card'", "'superior'", "'type'", "'colorsenior'", "'cards'", "'cardsenior'", "'rooms'", "'roomsenior'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCamp"
    // InternalMyDsl.g:53:1: entryRuleCamp : ruleCamp EOF ;
    public final void entryRuleCamp() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleCamp EOF )
            // InternalMyDsl.g:55:1: ruleCamp EOF
            {
             before(grammarAccess.getCampRule()); 
            pushFollow(FOLLOW_1);
            ruleCamp();

            state._fsp--;

             after(grammarAccess.getCampRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCamp"


    // $ANTLR start "ruleCamp"
    // InternalMyDsl.g:62:1: ruleCamp : ( ( rule__Camp__Group__0 ) ) ;
    public final void ruleCamp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Camp__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Camp__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Camp__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Camp__Group__0 )
            {
             before(grammarAccess.getCampAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Camp__Group__0 )
            // InternalMyDsl.g:69:4: rule__Camp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Camp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCampAccess().getGroup()); 

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
    // $ANTLR end "ruleCamp"


    // $ANTLR start "entryRuleColorSenior"
    // InternalMyDsl.g:78:1: entryRuleColorSenior : ruleColorSenior EOF ;
    public final void entryRuleColorSenior() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleColorSenior EOF )
            // InternalMyDsl.g:80:1: ruleColorSenior EOF
            {
             before(grammarAccess.getColorSeniorRule()); 
            pushFollow(FOLLOW_1);
            ruleColorSenior();

            state._fsp--;

             after(grammarAccess.getColorSeniorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColorSenior"


    // $ANTLR start "ruleColorSenior"
    // InternalMyDsl.g:87:1: ruleColorSenior : ( ( rule__ColorSenior__Group__0 ) ) ;
    public final void ruleColorSenior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ColorSenior__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ColorSenior__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ColorSenior__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__ColorSenior__Group__0 )
            {
             before(grammarAccess.getColorSeniorAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__ColorSenior__Group__0 )
            // InternalMyDsl.g:94:4: rule__ColorSenior__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorSeniorAccess().getGroup()); 

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
    // $ANTLR end "ruleColorSenior"


    // $ANTLR start "entryRuleCardSenior"
    // InternalMyDsl.g:103:1: entryRuleCardSenior : ruleCardSenior EOF ;
    public final void entryRuleCardSenior() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCardSenior EOF )
            // InternalMyDsl.g:105:1: ruleCardSenior EOF
            {
             before(grammarAccess.getCardSeniorRule()); 
            pushFollow(FOLLOW_1);
            ruleCardSenior();

            state._fsp--;

             after(grammarAccess.getCardSeniorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCardSenior"


    // $ANTLR start "ruleCardSenior"
    // InternalMyDsl.g:112:1: ruleCardSenior : ( ( rule__CardSenior__Group__0 ) ) ;
    public final void ruleCardSenior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__CardSenior__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__CardSenior__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__CardSenior__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__CardSenior__Group__0 )
            {
             before(grammarAccess.getCardSeniorAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__CardSenior__Group__0 )
            // InternalMyDsl.g:119:4: rule__CardSenior__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardSeniorAccess().getGroup()); 

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
    // $ANTLR end "ruleCardSenior"


    // $ANTLR start "entryRuleRoomSenior"
    // InternalMyDsl.g:128:1: entryRuleRoomSenior : ruleRoomSenior EOF ;
    public final void entryRuleRoomSenior() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRoomSenior EOF )
            // InternalMyDsl.g:130:1: ruleRoomSenior EOF
            {
             before(grammarAccess.getRoomSeniorRule()); 
            pushFollow(FOLLOW_1);
            ruleRoomSenior();

            state._fsp--;

             after(grammarAccess.getRoomSeniorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoomSenior"


    // $ANTLR start "ruleRoomSenior"
    // InternalMyDsl.g:137:1: ruleRoomSenior : ( ( rule__RoomSenior__Group__0 ) ) ;
    public final void ruleRoomSenior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__RoomSenior__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__RoomSenior__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__RoomSenior__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__RoomSenior__Group__0 )
            {
             before(grammarAccess.getRoomSeniorAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__RoomSenior__Group__0 )
            // InternalMyDsl.g:144:4: rule__RoomSenior__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomSeniorAccess().getGroup()); 

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
    // $ANTLR end "ruleRoomSenior"


    // $ANTLR start "entryRuleColor"
    // InternalMyDsl.g:153:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleColor EOF )
            // InternalMyDsl.g:155:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalMyDsl.g:162:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Color__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Color__Group__0 )
            // InternalMyDsl.g:169:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleCard"
    // InternalMyDsl.g:178:1: entryRuleCard : ruleCard EOF ;
    public final void entryRuleCard() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleCard EOF )
            // InternalMyDsl.g:180:1: ruleCard EOF
            {
             before(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getCardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalMyDsl.g:187:1: ruleCard : ( ( rule__Card__Group__0 ) ) ;
    public final void ruleCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Card__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Card__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Card__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Card__Group__0 )
            {
             before(grammarAccess.getCardAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Card__Group__0 )
            // InternalMyDsl.g:194:4: rule__Card__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getGroup()); 

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
    // $ANTLR end "ruleCard"


    // $ANTLR start "entryRuleRoom"
    // InternalMyDsl.g:203:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleRoom EOF )
            // InternalMyDsl.g:205:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalMyDsl.g:212:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Room__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Room__Group__0 )
            // InternalMyDsl.g:219:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:228:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleName EOF )
            // InternalMyDsl.g:230:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMyDsl.g:237:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Name__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Name__Group__0 )
            // InternalMyDsl.g:244:4: rule__Name__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

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
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleColorType"
    // InternalMyDsl.g:253:1: ruleColorType : ( ( rule__ColorType__Alternatives ) ) ;
    public final void ruleColorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:257:1: ( ( ( rule__ColorType__Alternatives ) ) )
            // InternalMyDsl.g:258:2: ( ( rule__ColorType__Alternatives ) )
            {
            // InternalMyDsl.g:258:2: ( ( rule__ColorType__Alternatives ) )
            // InternalMyDsl.g:259:3: ( rule__ColorType__Alternatives )
            {
             before(grammarAccess.getColorTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:260:3: ( rule__ColorType__Alternatives )
            // InternalMyDsl.g:260:4: rule__ColorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColorType"


    // $ANTLR start "ruleCardType"
    // InternalMyDsl.g:269:1: ruleCardType : ( ( rule__CardType__Alternatives ) ) ;
    public final void ruleCardType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:273:1: ( ( ( rule__CardType__Alternatives ) ) )
            // InternalMyDsl.g:274:2: ( ( rule__CardType__Alternatives ) )
            {
            // InternalMyDsl.g:274:2: ( ( rule__CardType__Alternatives ) )
            // InternalMyDsl.g:275:3: ( rule__CardType__Alternatives )
            {
             before(grammarAccess.getCardTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:276:3: ( rule__CardType__Alternatives )
            // InternalMyDsl.g:276:4: rule__CardType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CardType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCardType"


    // $ANTLR start "rule__ColorType__Alternatives"
    // InternalMyDsl.g:284:1: rule__ColorType__Alternatives : ( ( ( 'BlackColor' ) ) | ( ( 'BlueColor' ) ) | ( ( 'RedColor' ) ) | ( ( 'WhiteColor' ) ) | ( ( 'YellowColor' ) ) );
    public final void rule__ColorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:288:1: ( ( ( 'BlackColor' ) ) | ( ( 'BlueColor' ) ) | ( ( 'RedColor' ) ) | ( ( 'WhiteColor' ) ) | ( ( 'YellowColor' ) ) )
            int alt1=5;
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
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:289:2: ( ( 'BlackColor' ) )
                    {
                    // InternalMyDsl.g:289:2: ( ( 'BlackColor' ) )
                    // InternalMyDsl.g:290:3: ( 'BlackColor' )
                    {
                     before(grammarAccess.getColorTypeAccess().getBlackColorEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:291:3: ( 'BlackColor' )
                    // InternalMyDsl.g:291:4: 'BlackColor'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorTypeAccess().getBlackColorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:295:2: ( ( 'BlueColor' ) )
                    {
                    // InternalMyDsl.g:295:2: ( ( 'BlueColor' ) )
                    // InternalMyDsl.g:296:3: ( 'BlueColor' )
                    {
                     before(grammarAccess.getColorTypeAccess().getBlueColorEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:297:3: ( 'BlueColor' )
                    // InternalMyDsl.g:297:4: 'BlueColor'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorTypeAccess().getBlueColorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:301:2: ( ( 'RedColor' ) )
                    {
                    // InternalMyDsl.g:301:2: ( ( 'RedColor' ) )
                    // InternalMyDsl.g:302:3: ( 'RedColor' )
                    {
                     before(grammarAccess.getColorTypeAccess().getRedColorEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:303:3: ( 'RedColor' )
                    // InternalMyDsl.g:303:4: 'RedColor'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorTypeAccess().getRedColorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:307:2: ( ( 'WhiteColor' ) )
                    {
                    // InternalMyDsl.g:307:2: ( ( 'WhiteColor' ) )
                    // InternalMyDsl.g:308:3: ( 'WhiteColor' )
                    {
                     before(grammarAccess.getColorTypeAccess().getWhiteColorEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:309:3: ( 'WhiteColor' )
                    // InternalMyDsl.g:309:4: 'WhiteColor'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorTypeAccess().getWhiteColorEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:313:2: ( ( 'YellowColor' ) )
                    {
                    // InternalMyDsl.g:313:2: ( ( 'YellowColor' ) )
                    // InternalMyDsl.g:314:3: ( 'YellowColor' )
                    {
                     before(grammarAccess.getColorTypeAccess().getYellowColorEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:315:3: ( 'YellowColor' )
                    // InternalMyDsl.g:315:4: 'YellowColor'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorTypeAccess().getYellowColorEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__ColorType__Alternatives"


    // $ANTLR start "rule__CardType__Alternatives"
    // InternalMyDsl.g:323:1: rule__CardType__Alternatives : ( ( ( 'BlueCard' ) ) | ( ( 'GreenCard' ) ) | ( ( 'OrangeCard' ) ) | ( ( 'YellowCard' ) ) );
    public final void rule__CardType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:327:1: ( ( ( 'BlueCard' ) ) | ( ( 'GreenCard' ) ) | ( ( 'OrangeCard' ) ) | ( ( 'YellowCard' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:328:2: ( ( 'BlueCard' ) )
                    {
                    // InternalMyDsl.g:328:2: ( ( 'BlueCard' ) )
                    // InternalMyDsl.g:329:3: ( 'BlueCard' )
                    {
                     before(grammarAccess.getCardTypeAccess().getBlueColorEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:330:3: ( 'BlueCard' )
                    // InternalMyDsl.g:330:4: 'BlueCard'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardTypeAccess().getBlueColorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:334:2: ( ( 'GreenCard' ) )
                    {
                    // InternalMyDsl.g:334:2: ( ( 'GreenCard' ) )
                    // InternalMyDsl.g:335:3: ( 'GreenCard' )
                    {
                     before(grammarAccess.getCardTypeAccess().getGreenColorEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:336:3: ( 'GreenCard' )
                    // InternalMyDsl.g:336:4: 'GreenCard'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardTypeAccess().getGreenColorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:340:2: ( ( 'OrangeCard' ) )
                    {
                    // InternalMyDsl.g:340:2: ( ( 'OrangeCard' ) )
                    // InternalMyDsl.g:341:3: ( 'OrangeCard' )
                    {
                     before(grammarAccess.getCardTypeAccess().getOrangeColorEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:342:3: ( 'OrangeCard' )
                    // InternalMyDsl.g:342:4: 'OrangeCard'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardTypeAccess().getOrangeColorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:346:2: ( ( 'YellowCard' ) )
                    {
                    // InternalMyDsl.g:346:2: ( ( 'YellowCard' ) )
                    // InternalMyDsl.g:347:3: ( 'YellowCard' )
                    {
                     before(grammarAccess.getCardTypeAccess().getYellowColorEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:348:3: ( 'YellowCard' )
                    // InternalMyDsl.g:348:4: 'YellowCard'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardTypeAccess().getYellowColorEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__CardType__Alternatives"


    // $ANTLR start "rule__Camp__Group__0"
    // InternalMyDsl.g:356:1: rule__Camp__Group__0 : rule__Camp__Group__0__Impl rule__Camp__Group__1 ;
    public final void rule__Camp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( rule__Camp__Group__0__Impl rule__Camp__Group__1 )
            // InternalMyDsl.g:361:2: rule__Camp__Group__0__Impl rule__Camp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Camp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__1();

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
    // $ANTLR end "rule__Camp__Group__0"


    // $ANTLR start "rule__Camp__Group__0__Impl"
    // InternalMyDsl.g:368:1: rule__Camp__Group__0__Impl : ( 'camp' ) ;
    public final void rule__Camp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( ( 'camp' ) )
            // InternalMyDsl.g:373:1: ( 'camp' )
            {
            // InternalMyDsl.g:373:1: ( 'camp' )
            // InternalMyDsl.g:374:2: 'camp'
            {
             before(grammarAccess.getCampAccess().getCampKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getCampKeyword_0()); 

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
    // $ANTLR end "rule__Camp__Group__0__Impl"


    // $ANTLR start "rule__Camp__Group__1"
    // InternalMyDsl.g:383:1: rule__Camp__Group__1 : rule__Camp__Group__1__Impl rule__Camp__Group__2 ;
    public final void rule__Camp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( rule__Camp__Group__1__Impl rule__Camp__Group__2 )
            // InternalMyDsl.g:388:2: rule__Camp__Group__1__Impl rule__Camp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Camp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__2();

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
    // $ANTLR end "rule__Camp__Group__1"


    // $ANTLR start "rule__Camp__Group__1__Impl"
    // InternalMyDsl.g:395:1: rule__Camp__Group__1__Impl : ( ( rule__Camp__NameAssignment_1 ) ) ;
    public final void rule__Camp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( ( rule__Camp__NameAssignment_1 ) ) )
            // InternalMyDsl.g:400:1: ( ( rule__Camp__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:400:1: ( ( rule__Camp__NameAssignment_1 ) )
            // InternalMyDsl.g:401:2: ( rule__Camp__NameAssignment_1 )
            {
             before(grammarAccess.getCampAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:402:2: ( rule__Camp__NameAssignment_1 )
            // InternalMyDsl.g:402:3: rule__Camp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Camp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCampAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Camp__Group__1__Impl"


    // $ANTLR start "rule__Camp__Group__2"
    // InternalMyDsl.g:410:1: rule__Camp__Group__2 : rule__Camp__Group__2__Impl rule__Camp__Group__3 ;
    public final void rule__Camp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( rule__Camp__Group__2__Impl rule__Camp__Group__3 )
            // InternalMyDsl.g:415:2: rule__Camp__Group__2__Impl rule__Camp__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Camp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__3();

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
    // $ANTLR end "rule__Camp__Group__2"


    // $ANTLR start "rule__Camp__Group__2__Impl"
    // InternalMyDsl.g:422:1: rule__Camp__Group__2__Impl : ( 'colorseniors' ) ;
    public final void rule__Camp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( ( 'colorseniors' ) )
            // InternalMyDsl.g:427:1: ( 'colorseniors' )
            {
            // InternalMyDsl.g:427:1: ( 'colorseniors' )
            // InternalMyDsl.g:428:2: 'colorseniors'
            {
             before(grammarAccess.getCampAccess().getColorseniorsKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getColorseniorsKeyword_2()); 

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
    // $ANTLR end "rule__Camp__Group__2__Impl"


    // $ANTLR start "rule__Camp__Group__3"
    // InternalMyDsl.g:437:1: rule__Camp__Group__3 : rule__Camp__Group__3__Impl rule__Camp__Group__4 ;
    public final void rule__Camp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( rule__Camp__Group__3__Impl rule__Camp__Group__4 )
            // InternalMyDsl.g:442:2: rule__Camp__Group__3__Impl rule__Camp__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Camp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__4();

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
    // $ANTLR end "rule__Camp__Group__3"


    // $ANTLR start "rule__Camp__Group__3__Impl"
    // InternalMyDsl.g:449:1: rule__Camp__Group__3__Impl : ( '{' ) ;
    public final void rule__Camp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( '{' ) )
            // InternalMyDsl.g:454:1: ( '{' )
            {
            // InternalMyDsl.g:454:1: ( '{' )
            // InternalMyDsl.g:455:2: '{'
            {
             before(grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Camp__Group__3__Impl"


    // $ANTLR start "rule__Camp__Group__4"
    // InternalMyDsl.g:464:1: rule__Camp__Group__4 : rule__Camp__Group__4__Impl rule__Camp__Group__5 ;
    public final void rule__Camp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:468:1: ( rule__Camp__Group__4__Impl rule__Camp__Group__5 )
            // InternalMyDsl.g:469:2: rule__Camp__Group__4__Impl rule__Camp__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Camp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__5();

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
    // $ANTLR end "rule__Camp__Group__4"


    // $ANTLR start "rule__Camp__Group__4__Impl"
    // InternalMyDsl.g:476:1: rule__Camp__Group__4__Impl : ( ( rule__Camp__ColorseniorsAssignment_4 )* ) ;
    public final void rule__Camp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( ( rule__Camp__ColorseniorsAssignment_4 )* ) )
            // InternalMyDsl.g:481:1: ( ( rule__Camp__ColorseniorsAssignment_4 )* )
            {
            // InternalMyDsl.g:481:1: ( ( rule__Camp__ColorseniorsAssignment_4 )* )
            // InternalMyDsl.g:482:2: ( rule__Camp__ColorseniorsAssignment_4 )*
            {
             before(grammarAccess.getCampAccess().getColorseniorsAssignment_4()); 
            // InternalMyDsl.g:483:2: ( rule__Camp__ColorseniorsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:483:3: rule__Camp__ColorseniorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Camp__ColorseniorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCampAccess().getColorseniorsAssignment_4()); 

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
    // $ANTLR end "rule__Camp__Group__4__Impl"


    // $ANTLR start "rule__Camp__Group__5"
    // InternalMyDsl.g:491:1: rule__Camp__Group__5 : rule__Camp__Group__5__Impl rule__Camp__Group__6 ;
    public final void rule__Camp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( rule__Camp__Group__5__Impl rule__Camp__Group__6 )
            // InternalMyDsl.g:496:2: rule__Camp__Group__5__Impl rule__Camp__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Camp__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__6();

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
    // $ANTLR end "rule__Camp__Group__5"


    // $ANTLR start "rule__Camp__Group__5__Impl"
    // InternalMyDsl.g:503:1: rule__Camp__Group__5__Impl : ( '}' ) ;
    public final void rule__Camp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( '}' ) )
            // InternalMyDsl.g:508:1: ( '}' )
            {
            // InternalMyDsl.g:508:1: ( '}' )
            // InternalMyDsl.g:509:2: '}'
            {
             before(grammarAccess.getCampAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Camp__Group__5__Impl"


    // $ANTLR start "rule__Camp__Group__6"
    // InternalMyDsl.g:518:1: rule__Camp__Group__6 : rule__Camp__Group__6__Impl rule__Camp__Group__7 ;
    public final void rule__Camp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( rule__Camp__Group__6__Impl rule__Camp__Group__7 )
            // InternalMyDsl.g:523:2: rule__Camp__Group__6__Impl rule__Camp__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Camp__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__7();

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
    // $ANTLR end "rule__Camp__Group__6"


    // $ANTLR start "rule__Camp__Group__6__Impl"
    // InternalMyDsl.g:530:1: rule__Camp__Group__6__Impl : ( 'cardseniors' ) ;
    public final void rule__Camp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( ( 'cardseniors' ) )
            // InternalMyDsl.g:535:1: ( 'cardseniors' )
            {
            // InternalMyDsl.g:535:1: ( 'cardseniors' )
            // InternalMyDsl.g:536:2: 'cardseniors'
            {
             before(grammarAccess.getCampAccess().getCardseniorsKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getCardseniorsKeyword_6()); 

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
    // $ANTLR end "rule__Camp__Group__6__Impl"


    // $ANTLR start "rule__Camp__Group__7"
    // InternalMyDsl.g:545:1: rule__Camp__Group__7 : rule__Camp__Group__7__Impl rule__Camp__Group__8 ;
    public final void rule__Camp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( rule__Camp__Group__7__Impl rule__Camp__Group__8 )
            // InternalMyDsl.g:550:2: rule__Camp__Group__7__Impl rule__Camp__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Camp__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__8();

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
    // $ANTLR end "rule__Camp__Group__7"


    // $ANTLR start "rule__Camp__Group__7__Impl"
    // InternalMyDsl.g:557:1: rule__Camp__Group__7__Impl : ( '{' ) ;
    public final void rule__Camp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( '{' ) )
            // InternalMyDsl.g:562:1: ( '{' )
            {
            // InternalMyDsl.g:562:1: ( '{' )
            // InternalMyDsl.g:563:2: '{'
            {
             before(grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Camp__Group__7__Impl"


    // $ANTLR start "rule__Camp__Group__8"
    // InternalMyDsl.g:572:1: rule__Camp__Group__8 : rule__Camp__Group__8__Impl rule__Camp__Group__9 ;
    public final void rule__Camp__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( rule__Camp__Group__8__Impl rule__Camp__Group__9 )
            // InternalMyDsl.g:577:2: rule__Camp__Group__8__Impl rule__Camp__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Camp__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__9();

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
    // $ANTLR end "rule__Camp__Group__8"


    // $ANTLR start "rule__Camp__Group__8__Impl"
    // InternalMyDsl.g:584:1: rule__Camp__Group__8__Impl : ( ( rule__Camp__CardseniorsAssignment_8 )* ) ;
    public final void rule__Camp__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( ( ( rule__Camp__CardseniorsAssignment_8 )* ) )
            // InternalMyDsl.g:589:1: ( ( rule__Camp__CardseniorsAssignment_8 )* )
            {
            // InternalMyDsl.g:589:1: ( ( rule__Camp__CardseniorsAssignment_8 )* )
            // InternalMyDsl.g:590:2: ( rule__Camp__CardseniorsAssignment_8 )*
            {
             before(grammarAccess.getCampAccess().getCardseniorsAssignment_8()); 
            // InternalMyDsl.g:591:2: ( rule__Camp__CardseniorsAssignment_8 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:591:3: rule__Camp__CardseniorsAssignment_8
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Camp__CardseniorsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCampAccess().getCardseniorsAssignment_8()); 

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
    // $ANTLR end "rule__Camp__Group__8__Impl"


    // $ANTLR start "rule__Camp__Group__9"
    // InternalMyDsl.g:599:1: rule__Camp__Group__9 : rule__Camp__Group__9__Impl rule__Camp__Group__10 ;
    public final void rule__Camp__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( rule__Camp__Group__9__Impl rule__Camp__Group__10 )
            // InternalMyDsl.g:604:2: rule__Camp__Group__9__Impl rule__Camp__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Camp__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__10();

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
    // $ANTLR end "rule__Camp__Group__9"


    // $ANTLR start "rule__Camp__Group__9__Impl"
    // InternalMyDsl.g:611:1: rule__Camp__Group__9__Impl : ( '}' ) ;
    public final void rule__Camp__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( ( '}' ) )
            // InternalMyDsl.g:616:1: ( '}' )
            {
            // InternalMyDsl.g:616:1: ( '}' )
            // InternalMyDsl.g:617:2: '}'
            {
             before(grammarAccess.getCampAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Camp__Group__9__Impl"


    // $ANTLR start "rule__Camp__Group__10"
    // InternalMyDsl.g:626:1: rule__Camp__Group__10 : rule__Camp__Group__10__Impl rule__Camp__Group__11 ;
    public final void rule__Camp__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( rule__Camp__Group__10__Impl rule__Camp__Group__11 )
            // InternalMyDsl.g:631:2: rule__Camp__Group__10__Impl rule__Camp__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Camp__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__11();

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
    // $ANTLR end "rule__Camp__Group__10"


    // $ANTLR start "rule__Camp__Group__10__Impl"
    // InternalMyDsl.g:638:1: rule__Camp__Group__10__Impl : ( 'roomseniors' ) ;
    public final void rule__Camp__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( 'roomseniors' ) )
            // InternalMyDsl.g:643:1: ( 'roomseniors' )
            {
            // InternalMyDsl.g:643:1: ( 'roomseniors' )
            // InternalMyDsl.g:644:2: 'roomseniors'
            {
             before(grammarAccess.getCampAccess().getRoomseniorsKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getRoomseniorsKeyword_10()); 

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
    // $ANTLR end "rule__Camp__Group__10__Impl"


    // $ANTLR start "rule__Camp__Group__11"
    // InternalMyDsl.g:653:1: rule__Camp__Group__11 : rule__Camp__Group__11__Impl rule__Camp__Group__12 ;
    public final void rule__Camp__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:1: ( rule__Camp__Group__11__Impl rule__Camp__Group__12 )
            // InternalMyDsl.g:658:2: rule__Camp__Group__11__Impl rule__Camp__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Camp__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__12();

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
    // $ANTLR end "rule__Camp__Group__11"


    // $ANTLR start "rule__Camp__Group__11__Impl"
    // InternalMyDsl.g:665:1: rule__Camp__Group__11__Impl : ( '{' ) ;
    public final void rule__Camp__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( ( '{' ) )
            // InternalMyDsl.g:670:1: ( '{' )
            {
            // InternalMyDsl.g:670:1: ( '{' )
            // InternalMyDsl.g:671:2: '{'
            {
             before(grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Camp__Group__11__Impl"


    // $ANTLR start "rule__Camp__Group__12"
    // InternalMyDsl.g:680:1: rule__Camp__Group__12 : rule__Camp__Group__12__Impl rule__Camp__Group__13 ;
    public final void rule__Camp__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( rule__Camp__Group__12__Impl rule__Camp__Group__13 )
            // InternalMyDsl.g:685:2: rule__Camp__Group__12__Impl rule__Camp__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__Camp__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__13();

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
    // $ANTLR end "rule__Camp__Group__12"


    // $ANTLR start "rule__Camp__Group__12__Impl"
    // InternalMyDsl.g:692:1: rule__Camp__Group__12__Impl : ( ( rule__Camp__RoomseniorsAssignment_12 )* ) ;
    public final void rule__Camp__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( ( rule__Camp__RoomseniorsAssignment_12 )* ) )
            // InternalMyDsl.g:697:1: ( ( rule__Camp__RoomseniorsAssignment_12 )* )
            {
            // InternalMyDsl.g:697:1: ( ( rule__Camp__RoomseniorsAssignment_12 )* )
            // InternalMyDsl.g:698:2: ( rule__Camp__RoomseniorsAssignment_12 )*
            {
             before(grammarAccess.getCampAccess().getRoomseniorsAssignment_12()); 
            // InternalMyDsl.g:699:2: ( rule__Camp__RoomseniorsAssignment_12 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:699:3: rule__Camp__RoomseniorsAssignment_12
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Camp__RoomseniorsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCampAccess().getRoomseniorsAssignment_12()); 

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
    // $ANTLR end "rule__Camp__Group__12__Impl"


    // $ANTLR start "rule__Camp__Group__13"
    // InternalMyDsl.g:707:1: rule__Camp__Group__13 : rule__Camp__Group__13__Impl rule__Camp__Group__14 ;
    public final void rule__Camp__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( rule__Camp__Group__13__Impl rule__Camp__Group__14 )
            // InternalMyDsl.g:712:2: rule__Camp__Group__13__Impl rule__Camp__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Camp__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__14();

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
    // $ANTLR end "rule__Camp__Group__13"


    // $ANTLR start "rule__Camp__Group__13__Impl"
    // InternalMyDsl.g:719:1: rule__Camp__Group__13__Impl : ( '}' ) ;
    public final void rule__Camp__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( '}' ) )
            // InternalMyDsl.g:724:1: ( '}' )
            {
            // InternalMyDsl.g:724:1: ( '}' )
            // InternalMyDsl.g:725:2: '}'
            {
             before(grammarAccess.getCampAccess().getRightCurlyBracketKeyword_13()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Camp__Group__13__Impl"


    // $ANTLR start "rule__Camp__Group__14"
    // InternalMyDsl.g:734:1: rule__Camp__Group__14 : rule__Camp__Group__14__Impl rule__Camp__Group__15 ;
    public final void rule__Camp__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:1: ( rule__Camp__Group__14__Impl rule__Camp__Group__15 )
            // InternalMyDsl.g:739:2: rule__Camp__Group__14__Impl rule__Camp__Group__15
            {
            pushFollow(FOLLOW_5);
            rule__Camp__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__15();

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
    // $ANTLR end "rule__Camp__Group__14"


    // $ANTLR start "rule__Camp__Group__14__Impl"
    // InternalMyDsl.g:746:1: rule__Camp__Group__14__Impl : ( 'colors' ) ;
    public final void rule__Camp__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( 'colors' ) )
            // InternalMyDsl.g:751:1: ( 'colors' )
            {
            // InternalMyDsl.g:751:1: ( 'colors' )
            // InternalMyDsl.g:752:2: 'colors'
            {
             before(grammarAccess.getCampAccess().getColorsKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getColorsKeyword_14()); 

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
    // $ANTLR end "rule__Camp__Group__14__Impl"


    // $ANTLR start "rule__Camp__Group__15"
    // InternalMyDsl.g:761:1: rule__Camp__Group__15 : rule__Camp__Group__15__Impl rule__Camp__Group__16 ;
    public final void rule__Camp__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( rule__Camp__Group__15__Impl rule__Camp__Group__16 )
            // InternalMyDsl.g:766:2: rule__Camp__Group__15__Impl rule__Camp__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__Camp__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__16();

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
    // $ANTLR end "rule__Camp__Group__15"


    // $ANTLR start "rule__Camp__Group__15__Impl"
    // InternalMyDsl.g:773:1: rule__Camp__Group__15__Impl : ( '{' ) ;
    public final void rule__Camp__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( '{' ) )
            // InternalMyDsl.g:778:1: ( '{' )
            {
            // InternalMyDsl.g:778:1: ( '{' )
            // InternalMyDsl.g:779:2: '{'
            {
             before(grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Camp__Group__15__Impl"


    // $ANTLR start "rule__Camp__Group__16"
    // InternalMyDsl.g:788:1: rule__Camp__Group__16 : rule__Camp__Group__16__Impl rule__Camp__Group__17 ;
    public final void rule__Camp__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( rule__Camp__Group__16__Impl rule__Camp__Group__17 )
            // InternalMyDsl.g:793:2: rule__Camp__Group__16__Impl rule__Camp__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__Camp__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Camp__Group__17();

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
    // $ANTLR end "rule__Camp__Group__16"


    // $ANTLR start "rule__Camp__Group__16__Impl"
    // InternalMyDsl.g:800:1: rule__Camp__Group__16__Impl : ( ( rule__Camp__ColorsAssignment_16 )* ) ;
    public final void rule__Camp__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( ( rule__Camp__ColorsAssignment_16 )* ) )
            // InternalMyDsl.g:805:1: ( ( rule__Camp__ColorsAssignment_16 )* )
            {
            // InternalMyDsl.g:805:1: ( ( rule__Camp__ColorsAssignment_16 )* )
            // InternalMyDsl.g:806:2: ( rule__Camp__ColorsAssignment_16 )*
            {
             before(grammarAccess.getCampAccess().getColorsAssignment_16()); 
            // InternalMyDsl.g:807:2: ( rule__Camp__ColorsAssignment_16 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:807:3: rule__Camp__ColorsAssignment_16
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Camp__ColorsAssignment_16();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCampAccess().getColorsAssignment_16()); 

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
    // $ANTLR end "rule__Camp__Group__16__Impl"


    // $ANTLR start "rule__Camp__Group__17"
    // InternalMyDsl.g:815:1: rule__Camp__Group__17 : rule__Camp__Group__17__Impl ;
    public final void rule__Camp__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( rule__Camp__Group__17__Impl )
            // InternalMyDsl.g:820:2: rule__Camp__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Camp__Group__17__Impl();

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
    // $ANTLR end "rule__Camp__Group__17"


    // $ANTLR start "rule__Camp__Group__17__Impl"
    // InternalMyDsl.g:826:1: rule__Camp__Group__17__Impl : ( '}' ) ;
    public final void rule__Camp__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( ( '}' ) )
            // InternalMyDsl.g:831:1: ( '}' )
            {
            // InternalMyDsl.g:831:1: ( '}' )
            // InternalMyDsl.g:832:2: '}'
            {
             before(grammarAccess.getCampAccess().getRightCurlyBracketKeyword_17()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__Camp__Group__17__Impl"


    // $ANTLR start "rule__ColorSenior__Group__0"
    // InternalMyDsl.g:842:1: rule__ColorSenior__Group__0 : rule__ColorSenior__Group__0__Impl rule__ColorSenior__Group__1 ;
    public final void rule__ColorSenior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:846:1: ( rule__ColorSenior__Group__0__Impl rule__ColorSenior__Group__1 )
            // InternalMyDsl.g:847:2: rule__ColorSenior__Group__0__Impl rule__ColorSenior__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ColorSenior__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__1();

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
    // $ANTLR end "rule__ColorSenior__Group__0"


    // $ANTLR start "rule__ColorSenior__Group__0__Impl"
    // InternalMyDsl.g:854:1: rule__ColorSenior__Group__0__Impl : ( ( rule__ColorSenior__NameAssignment_0 ) ) ;
    public final void rule__ColorSenior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( ( ( rule__ColorSenior__NameAssignment_0 ) ) )
            // InternalMyDsl.g:859:1: ( ( rule__ColorSenior__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:859:1: ( ( rule__ColorSenior__NameAssignment_0 ) )
            // InternalMyDsl.g:860:2: ( rule__ColorSenior__NameAssignment_0 )
            {
             before(grammarAccess.getColorSeniorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:861:2: ( rule__ColorSenior__NameAssignment_0 )
            // InternalMyDsl.g:861:3: rule__ColorSenior__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ColorSenior__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColorSeniorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ColorSenior__Group__0__Impl"


    // $ANTLR start "rule__ColorSenior__Group__1"
    // InternalMyDsl.g:869:1: rule__ColorSenior__Group__1 : rule__ColorSenior__Group__1__Impl rule__ColorSenior__Group__2 ;
    public final void rule__ColorSenior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( rule__ColorSenior__Group__1__Impl rule__ColorSenior__Group__2 )
            // InternalMyDsl.g:874:2: rule__ColorSenior__Group__1__Impl rule__ColorSenior__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ColorSenior__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__2();

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
    // $ANTLR end "rule__ColorSenior__Group__1"


    // $ANTLR start "rule__ColorSenior__Group__1__Impl"
    // InternalMyDsl.g:881:1: rule__ColorSenior__Group__1__Impl : ( '{' ) ;
    public final void rule__ColorSenior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( ( '{' ) )
            // InternalMyDsl.g:886:1: ( '{' )
            {
            // InternalMyDsl.g:886:1: ( '{' )
            // InternalMyDsl.g:887:2: '{'
            {
             before(grammarAccess.getColorSeniorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ColorSenior__Group__1__Impl"


    // $ANTLR start "rule__ColorSenior__Group__2"
    // InternalMyDsl.g:896:1: rule__ColorSenior__Group__2 : rule__ColorSenior__Group__2__Impl rule__ColorSenior__Group__3 ;
    public final void rule__ColorSenior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( rule__ColorSenior__Group__2__Impl rule__ColorSenior__Group__3 )
            // InternalMyDsl.g:901:2: rule__ColorSenior__Group__2__Impl rule__ColorSenior__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ColorSenior__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__3();

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
    // $ANTLR end "rule__ColorSenior__Group__2"


    // $ANTLR start "rule__ColorSenior__Group__2__Impl"
    // InternalMyDsl.g:908:1: rule__ColorSenior__Group__2__Impl : ( 'year' ) ;
    public final void rule__ColorSenior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( ( 'year' ) )
            // InternalMyDsl.g:913:1: ( 'year' )
            {
            // InternalMyDsl.g:913:1: ( 'year' )
            // InternalMyDsl.g:914:2: 'year'
            {
             before(grammarAccess.getColorSeniorAccess().getYearKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getYearKeyword_2()); 

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
    // $ANTLR end "rule__ColorSenior__Group__2__Impl"


    // $ANTLR start "rule__ColorSenior__Group__3"
    // InternalMyDsl.g:923:1: rule__ColorSenior__Group__3 : rule__ColorSenior__Group__3__Impl rule__ColorSenior__Group__4 ;
    public final void rule__ColorSenior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( rule__ColorSenior__Group__3__Impl rule__ColorSenior__Group__4 )
            // InternalMyDsl.g:928:2: rule__ColorSenior__Group__3__Impl rule__ColorSenior__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ColorSenior__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__4();

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
    // $ANTLR end "rule__ColorSenior__Group__3"


    // $ANTLR start "rule__ColorSenior__Group__3__Impl"
    // InternalMyDsl.g:935:1: rule__ColorSenior__Group__3__Impl : ( ':' ) ;
    public final void rule__ColorSenior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ':' ) )
            // InternalMyDsl.g:940:1: ( ':' )
            {
            // InternalMyDsl.g:940:1: ( ':' )
            // InternalMyDsl.g:941:2: ':'
            {
             before(grammarAccess.getColorSeniorAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__ColorSenior__Group__3__Impl"


    // $ANTLR start "rule__ColorSenior__Group__4"
    // InternalMyDsl.g:950:1: rule__ColorSenior__Group__4 : rule__ColorSenior__Group__4__Impl rule__ColorSenior__Group__5 ;
    public final void rule__ColorSenior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( rule__ColorSenior__Group__4__Impl rule__ColorSenior__Group__5 )
            // InternalMyDsl.g:955:2: rule__ColorSenior__Group__4__Impl rule__ColorSenior__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ColorSenior__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__5();

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
    // $ANTLR end "rule__ColorSenior__Group__4"


    // $ANTLR start "rule__ColorSenior__Group__4__Impl"
    // InternalMyDsl.g:962:1: rule__ColorSenior__Group__4__Impl : ( ( rule__ColorSenior__YearAssignment_4 ) ) ;
    public final void rule__ColorSenior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:1: ( ( ( rule__ColorSenior__YearAssignment_4 ) ) )
            // InternalMyDsl.g:967:1: ( ( rule__ColorSenior__YearAssignment_4 ) )
            {
            // InternalMyDsl.g:967:1: ( ( rule__ColorSenior__YearAssignment_4 ) )
            // InternalMyDsl.g:968:2: ( rule__ColorSenior__YearAssignment_4 )
            {
             before(grammarAccess.getColorSeniorAccess().getYearAssignment_4()); 
            // InternalMyDsl.g:969:2: ( rule__ColorSenior__YearAssignment_4 )
            // InternalMyDsl.g:969:3: rule__ColorSenior__YearAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ColorSenior__YearAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getColorSeniorAccess().getYearAssignment_4()); 

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
    // $ANTLR end "rule__ColorSenior__Group__4__Impl"


    // $ANTLR start "rule__ColorSenior__Group__5"
    // InternalMyDsl.g:977:1: rule__ColorSenior__Group__5 : rule__ColorSenior__Group__5__Impl rule__ColorSenior__Group__6 ;
    public final void rule__ColorSenior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( rule__ColorSenior__Group__5__Impl rule__ColorSenior__Group__6 )
            // InternalMyDsl.g:982:2: rule__ColorSenior__Group__5__Impl rule__ColorSenior__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ColorSenior__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__6();

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
    // $ANTLR end "rule__ColorSenior__Group__5"


    // $ANTLR start "rule__ColorSenior__Group__5__Impl"
    // InternalMyDsl.g:989:1: rule__ColorSenior__Group__5__Impl : ( 'color' ) ;
    public final void rule__ColorSenior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( ( 'color' ) )
            // InternalMyDsl.g:994:1: ( 'color' )
            {
            // InternalMyDsl.g:994:1: ( 'color' )
            // InternalMyDsl.g:995:2: 'color'
            {
             before(grammarAccess.getColorSeniorAccess().getColorKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getColorKeyword_5()); 

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
    // $ANTLR end "rule__ColorSenior__Group__5__Impl"


    // $ANTLR start "rule__ColorSenior__Group__6"
    // InternalMyDsl.g:1004:1: rule__ColorSenior__Group__6 : rule__ColorSenior__Group__6__Impl rule__ColorSenior__Group__7 ;
    public final void rule__ColorSenior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( rule__ColorSenior__Group__6__Impl rule__ColorSenior__Group__7 )
            // InternalMyDsl.g:1009:2: rule__ColorSenior__Group__6__Impl rule__ColorSenior__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__ColorSenior__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__7();

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
    // $ANTLR end "rule__ColorSenior__Group__6"


    // $ANTLR start "rule__ColorSenior__Group__6__Impl"
    // InternalMyDsl.g:1016:1: rule__ColorSenior__Group__6__Impl : ( ':' ) ;
    public final void rule__ColorSenior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1020:1: ( ( ':' ) )
            // InternalMyDsl.g:1021:1: ( ':' )
            {
            // InternalMyDsl.g:1021:1: ( ':' )
            // InternalMyDsl.g:1022:2: ':'
            {
             before(grammarAccess.getColorSeniorAccess().getColonKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__ColorSenior__Group__6__Impl"


    // $ANTLR start "rule__ColorSenior__Group__7"
    // InternalMyDsl.g:1031:1: rule__ColorSenior__Group__7 : rule__ColorSenior__Group__7__Impl rule__ColorSenior__Group__8 ;
    public final void rule__ColorSenior__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( rule__ColorSenior__Group__7__Impl rule__ColorSenior__Group__8 )
            // InternalMyDsl.g:1036:2: rule__ColorSenior__Group__7__Impl rule__ColorSenior__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__ColorSenior__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__8();

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
    // $ANTLR end "rule__ColorSenior__Group__7"


    // $ANTLR start "rule__ColorSenior__Group__7__Impl"
    // InternalMyDsl.g:1043:1: rule__ColorSenior__Group__7__Impl : ( ( rule__ColorSenior__ColorAssignment_7 ) ) ;
    public final void rule__ColorSenior__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1047:1: ( ( ( rule__ColorSenior__ColorAssignment_7 ) ) )
            // InternalMyDsl.g:1048:1: ( ( rule__ColorSenior__ColorAssignment_7 ) )
            {
            // InternalMyDsl.g:1048:1: ( ( rule__ColorSenior__ColorAssignment_7 ) )
            // InternalMyDsl.g:1049:2: ( rule__ColorSenior__ColorAssignment_7 )
            {
             before(grammarAccess.getColorSeniorAccess().getColorAssignment_7()); 
            // InternalMyDsl.g:1050:2: ( rule__ColorSenior__ColorAssignment_7 )
            // InternalMyDsl.g:1050:3: rule__ColorSenior__ColorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ColorSenior__ColorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getColorSeniorAccess().getColorAssignment_7()); 

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
    // $ANTLR end "rule__ColorSenior__Group__7__Impl"


    // $ANTLR start "rule__ColorSenior__Group__8"
    // InternalMyDsl.g:1058:1: rule__ColorSenior__Group__8 : rule__ColorSenior__Group__8__Impl rule__ColorSenior__Group__9 ;
    public final void rule__ColorSenior__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( rule__ColorSenior__Group__8__Impl rule__ColorSenior__Group__9 )
            // InternalMyDsl.g:1063:2: rule__ColorSenior__Group__8__Impl rule__ColorSenior__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__ColorSenior__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__9();

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
    // $ANTLR end "rule__ColorSenior__Group__8"


    // $ANTLR start "rule__ColorSenior__Group__8__Impl"
    // InternalMyDsl.g:1070:1: rule__ColorSenior__Group__8__Impl : ( 'inferiors' ) ;
    public final void rule__ColorSenior__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( ( 'inferiors' ) )
            // InternalMyDsl.g:1075:1: ( 'inferiors' )
            {
            // InternalMyDsl.g:1075:1: ( 'inferiors' )
            // InternalMyDsl.g:1076:2: 'inferiors'
            {
             before(grammarAccess.getColorSeniorAccess().getInferiorsKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getInferiorsKeyword_8()); 

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
    // $ANTLR end "rule__ColorSenior__Group__8__Impl"


    // $ANTLR start "rule__ColorSenior__Group__9"
    // InternalMyDsl.g:1085:1: rule__ColorSenior__Group__9 : rule__ColorSenior__Group__9__Impl rule__ColorSenior__Group__10 ;
    public final void rule__ColorSenior__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( rule__ColorSenior__Group__9__Impl rule__ColorSenior__Group__10 )
            // InternalMyDsl.g:1090:2: rule__ColorSenior__Group__9__Impl rule__ColorSenior__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__ColorSenior__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__10();

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
    // $ANTLR end "rule__ColorSenior__Group__9"


    // $ANTLR start "rule__ColorSenior__Group__9__Impl"
    // InternalMyDsl.g:1097:1: rule__ColorSenior__Group__9__Impl : ( ':' ) ;
    public final void rule__ColorSenior__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1101:1: ( ( ':' ) )
            // InternalMyDsl.g:1102:1: ( ':' )
            {
            // InternalMyDsl.g:1102:1: ( ':' )
            // InternalMyDsl.g:1103:2: ':'
            {
             before(grammarAccess.getColorSeniorAccess().getColonKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getColonKeyword_9()); 

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
    // $ANTLR end "rule__ColorSenior__Group__9__Impl"


    // $ANTLR start "rule__ColorSenior__Group__10"
    // InternalMyDsl.g:1112:1: rule__ColorSenior__Group__10 : rule__ColorSenior__Group__10__Impl rule__ColorSenior__Group__11 ;
    public final void rule__ColorSenior__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:1: ( rule__ColorSenior__Group__10__Impl rule__ColorSenior__Group__11 )
            // InternalMyDsl.g:1117:2: rule__ColorSenior__Group__10__Impl rule__ColorSenior__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__ColorSenior__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__11();

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
    // $ANTLR end "rule__ColorSenior__Group__10"


    // $ANTLR start "rule__ColorSenior__Group__10__Impl"
    // InternalMyDsl.g:1124:1: rule__ColorSenior__Group__10__Impl : ( ( rule__ColorSenior__InferiorsAssignment_10 ) ) ;
    public final void rule__ColorSenior__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( ( ( rule__ColorSenior__InferiorsAssignment_10 ) ) )
            // InternalMyDsl.g:1129:1: ( ( rule__ColorSenior__InferiorsAssignment_10 ) )
            {
            // InternalMyDsl.g:1129:1: ( ( rule__ColorSenior__InferiorsAssignment_10 ) )
            // InternalMyDsl.g:1130:2: ( rule__ColorSenior__InferiorsAssignment_10 )
            {
             before(grammarAccess.getColorSeniorAccess().getInferiorsAssignment_10()); 
            // InternalMyDsl.g:1131:2: ( rule__ColorSenior__InferiorsAssignment_10 )
            // InternalMyDsl.g:1131:3: rule__ColorSenior__InferiorsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ColorSenior__InferiorsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getColorSeniorAccess().getInferiorsAssignment_10()); 

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
    // $ANTLR end "rule__ColorSenior__Group__10__Impl"


    // $ANTLR start "rule__ColorSenior__Group__11"
    // InternalMyDsl.g:1139:1: rule__ColorSenior__Group__11 : rule__ColorSenior__Group__11__Impl rule__ColorSenior__Group__12 ;
    public final void rule__ColorSenior__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( rule__ColorSenior__Group__11__Impl rule__ColorSenior__Group__12 )
            // InternalMyDsl.g:1144:2: rule__ColorSenior__Group__11__Impl rule__ColorSenior__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__ColorSenior__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__12();

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
    // $ANTLR end "rule__ColorSenior__Group__11"


    // $ANTLR start "rule__ColorSenior__Group__11__Impl"
    // InternalMyDsl.g:1151:1: rule__ColorSenior__Group__11__Impl : ( ( rule__ColorSenior__Group_11__0 )* ) ;
    public final void rule__ColorSenior__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( ( ( rule__ColorSenior__Group_11__0 )* ) )
            // InternalMyDsl.g:1156:1: ( ( rule__ColorSenior__Group_11__0 )* )
            {
            // InternalMyDsl.g:1156:1: ( ( rule__ColorSenior__Group_11__0 )* )
            // InternalMyDsl.g:1157:2: ( rule__ColorSenior__Group_11__0 )*
            {
             before(grammarAccess.getColorSeniorAccess().getGroup_11()); 
            // InternalMyDsl.g:1158:2: ( rule__ColorSenior__Group_11__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1158:3: rule__ColorSenior__Group_11__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ColorSenior__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getColorSeniorAccess().getGroup_11()); 

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
    // $ANTLR end "rule__ColorSenior__Group__11__Impl"


    // $ANTLR start "rule__ColorSenior__Group__12"
    // InternalMyDsl.g:1166:1: rule__ColorSenior__Group__12 : rule__ColorSenior__Group__12__Impl ;
    public final void rule__ColorSenior__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( rule__ColorSenior__Group__12__Impl )
            // InternalMyDsl.g:1171:2: rule__ColorSenior__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group__12__Impl();

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
    // $ANTLR end "rule__ColorSenior__Group__12"


    // $ANTLR start "rule__ColorSenior__Group__12__Impl"
    // InternalMyDsl.g:1177:1: rule__ColorSenior__Group__12__Impl : ( '}' ) ;
    public final void rule__ColorSenior__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( ( '}' ) )
            // InternalMyDsl.g:1182:1: ( '}' )
            {
            // InternalMyDsl.g:1182:1: ( '}' )
            // InternalMyDsl.g:1183:2: '}'
            {
             before(grammarAccess.getColorSeniorAccess().getRightCurlyBracketKeyword_12()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__ColorSenior__Group__12__Impl"


    // $ANTLR start "rule__ColorSenior__Group_11__0"
    // InternalMyDsl.g:1193:1: rule__ColorSenior__Group_11__0 : rule__ColorSenior__Group_11__0__Impl rule__ColorSenior__Group_11__1 ;
    public final void rule__ColorSenior__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( rule__ColorSenior__Group_11__0__Impl rule__ColorSenior__Group_11__1 )
            // InternalMyDsl.g:1198:2: rule__ColorSenior__Group_11__0__Impl rule__ColorSenior__Group_11__1
            {
            pushFollow(FOLLOW_3);
            rule__ColorSenior__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group_11__1();

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
    // $ANTLR end "rule__ColorSenior__Group_11__0"


    // $ANTLR start "rule__ColorSenior__Group_11__0__Impl"
    // InternalMyDsl.g:1205:1: rule__ColorSenior__Group_11__0__Impl : ( ',' ) ;
    public final void rule__ColorSenior__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( ( ',' ) )
            // InternalMyDsl.g:1210:1: ( ',' )
            {
            // InternalMyDsl.g:1210:1: ( ',' )
            // InternalMyDsl.g:1211:2: ','
            {
             before(grammarAccess.getColorSeniorAccess().getCommaKeyword_11_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__ColorSenior__Group_11__0__Impl"


    // $ANTLR start "rule__ColorSenior__Group_11__1"
    // InternalMyDsl.g:1220:1: rule__ColorSenior__Group_11__1 : rule__ColorSenior__Group_11__1__Impl ;
    public final void rule__ColorSenior__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( rule__ColorSenior__Group_11__1__Impl )
            // InternalMyDsl.g:1225:2: rule__ColorSenior__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorSenior__Group_11__1__Impl();

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
    // $ANTLR end "rule__ColorSenior__Group_11__1"


    // $ANTLR start "rule__ColorSenior__Group_11__1__Impl"
    // InternalMyDsl.g:1231:1: rule__ColorSenior__Group_11__1__Impl : ( ( rule__ColorSenior__InferiorsAssignment_11_1 ) ) ;
    public final void rule__ColorSenior__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1235:1: ( ( ( rule__ColorSenior__InferiorsAssignment_11_1 ) ) )
            // InternalMyDsl.g:1236:1: ( ( rule__ColorSenior__InferiorsAssignment_11_1 ) )
            {
            // InternalMyDsl.g:1236:1: ( ( rule__ColorSenior__InferiorsAssignment_11_1 ) )
            // InternalMyDsl.g:1237:2: ( rule__ColorSenior__InferiorsAssignment_11_1 )
            {
             before(grammarAccess.getColorSeniorAccess().getInferiorsAssignment_11_1()); 
            // InternalMyDsl.g:1238:2: ( rule__ColorSenior__InferiorsAssignment_11_1 )
            // InternalMyDsl.g:1238:3: rule__ColorSenior__InferiorsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__ColorSenior__InferiorsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getColorSeniorAccess().getInferiorsAssignment_11_1()); 

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
    // $ANTLR end "rule__ColorSenior__Group_11__1__Impl"


    // $ANTLR start "rule__CardSenior__Group__0"
    // InternalMyDsl.g:1247:1: rule__CardSenior__Group__0 : rule__CardSenior__Group__0__Impl rule__CardSenior__Group__1 ;
    public final void rule__CardSenior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( rule__CardSenior__Group__0__Impl rule__CardSenior__Group__1 )
            // InternalMyDsl.g:1252:2: rule__CardSenior__Group__0__Impl rule__CardSenior__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CardSenior__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__1();

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
    // $ANTLR end "rule__CardSenior__Group__0"


    // $ANTLR start "rule__CardSenior__Group__0__Impl"
    // InternalMyDsl.g:1259:1: rule__CardSenior__Group__0__Impl : ( ( rule__CardSenior__NameAssignment_0 ) ) ;
    public final void rule__CardSenior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1263:1: ( ( ( rule__CardSenior__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1264:1: ( ( rule__CardSenior__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1264:1: ( ( rule__CardSenior__NameAssignment_0 ) )
            // InternalMyDsl.g:1265:2: ( rule__CardSenior__NameAssignment_0 )
            {
             before(grammarAccess.getCardSeniorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1266:2: ( rule__CardSenior__NameAssignment_0 )
            // InternalMyDsl.g:1266:3: rule__CardSenior__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCardSeniorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__CardSenior__Group__0__Impl"


    // $ANTLR start "rule__CardSenior__Group__1"
    // InternalMyDsl.g:1274:1: rule__CardSenior__Group__1 : rule__CardSenior__Group__1__Impl rule__CardSenior__Group__2 ;
    public final void rule__CardSenior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1278:1: ( rule__CardSenior__Group__1__Impl rule__CardSenior__Group__2 )
            // InternalMyDsl.g:1279:2: rule__CardSenior__Group__1__Impl rule__CardSenior__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CardSenior__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__2();

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
    // $ANTLR end "rule__CardSenior__Group__1"


    // $ANTLR start "rule__CardSenior__Group__1__Impl"
    // InternalMyDsl.g:1286:1: rule__CardSenior__Group__1__Impl : ( '{' ) ;
    public final void rule__CardSenior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1290:1: ( ( '{' ) )
            // InternalMyDsl.g:1291:1: ( '{' )
            {
            // InternalMyDsl.g:1291:1: ( '{' )
            // InternalMyDsl.g:1292:2: '{'
            {
             before(grammarAccess.getCardSeniorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__CardSenior__Group__1__Impl"


    // $ANTLR start "rule__CardSenior__Group__2"
    // InternalMyDsl.g:1301:1: rule__CardSenior__Group__2 : rule__CardSenior__Group__2__Impl rule__CardSenior__Group__3 ;
    public final void rule__CardSenior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( rule__CardSenior__Group__2__Impl rule__CardSenior__Group__3 )
            // InternalMyDsl.g:1306:2: rule__CardSenior__Group__2__Impl rule__CardSenior__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CardSenior__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__3();

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
    // $ANTLR end "rule__CardSenior__Group__2"


    // $ANTLR start "rule__CardSenior__Group__2__Impl"
    // InternalMyDsl.g:1313:1: rule__CardSenior__Group__2__Impl : ( 'year' ) ;
    public final void rule__CardSenior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1317:1: ( ( 'year' ) )
            // InternalMyDsl.g:1318:1: ( 'year' )
            {
            // InternalMyDsl.g:1318:1: ( 'year' )
            // InternalMyDsl.g:1319:2: 'year'
            {
             before(grammarAccess.getCardSeniorAccess().getYearKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getYearKeyword_2()); 

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
    // $ANTLR end "rule__CardSenior__Group__2__Impl"


    // $ANTLR start "rule__CardSenior__Group__3"
    // InternalMyDsl.g:1328:1: rule__CardSenior__Group__3 : rule__CardSenior__Group__3__Impl rule__CardSenior__Group__4 ;
    public final void rule__CardSenior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( rule__CardSenior__Group__3__Impl rule__CardSenior__Group__4 )
            // InternalMyDsl.g:1333:2: rule__CardSenior__Group__3__Impl rule__CardSenior__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__CardSenior__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__4();

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
    // $ANTLR end "rule__CardSenior__Group__3"


    // $ANTLR start "rule__CardSenior__Group__3__Impl"
    // InternalMyDsl.g:1340:1: rule__CardSenior__Group__3__Impl : ( ':' ) ;
    public final void rule__CardSenior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( ( ':' ) )
            // InternalMyDsl.g:1345:1: ( ':' )
            {
            // InternalMyDsl.g:1345:1: ( ':' )
            // InternalMyDsl.g:1346:2: ':'
            {
             before(grammarAccess.getCardSeniorAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__CardSenior__Group__3__Impl"


    // $ANTLR start "rule__CardSenior__Group__4"
    // InternalMyDsl.g:1355:1: rule__CardSenior__Group__4 : rule__CardSenior__Group__4__Impl rule__CardSenior__Group__5 ;
    public final void rule__CardSenior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( rule__CardSenior__Group__4__Impl rule__CardSenior__Group__5 )
            // InternalMyDsl.g:1360:2: rule__CardSenior__Group__4__Impl rule__CardSenior__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__CardSenior__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__5();

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
    // $ANTLR end "rule__CardSenior__Group__4"


    // $ANTLR start "rule__CardSenior__Group__4__Impl"
    // InternalMyDsl.g:1367:1: rule__CardSenior__Group__4__Impl : ( ( rule__CardSenior__YearAssignment_4 ) ) ;
    public final void rule__CardSenior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( ( ( rule__CardSenior__YearAssignment_4 ) ) )
            // InternalMyDsl.g:1372:1: ( ( rule__CardSenior__YearAssignment_4 ) )
            {
            // InternalMyDsl.g:1372:1: ( ( rule__CardSenior__YearAssignment_4 ) )
            // InternalMyDsl.g:1373:2: ( rule__CardSenior__YearAssignment_4 )
            {
             before(grammarAccess.getCardSeniorAccess().getYearAssignment_4()); 
            // InternalMyDsl.g:1374:2: ( rule__CardSenior__YearAssignment_4 )
            // InternalMyDsl.g:1374:3: rule__CardSenior__YearAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__YearAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCardSeniorAccess().getYearAssignment_4()); 

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
    // $ANTLR end "rule__CardSenior__Group__4__Impl"


    // $ANTLR start "rule__CardSenior__Group__5"
    // InternalMyDsl.g:1382:1: rule__CardSenior__Group__5 : rule__CardSenior__Group__5__Impl rule__CardSenior__Group__6 ;
    public final void rule__CardSenior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( rule__CardSenior__Group__5__Impl rule__CardSenior__Group__6 )
            // InternalMyDsl.g:1387:2: rule__CardSenior__Group__5__Impl rule__CardSenior__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__CardSenior__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__6();

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
    // $ANTLR end "rule__CardSenior__Group__5"


    // $ANTLR start "rule__CardSenior__Group__5__Impl"
    // InternalMyDsl.g:1394:1: rule__CardSenior__Group__5__Impl : ( 'color' ) ;
    public final void rule__CardSenior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( ( 'color' ) )
            // InternalMyDsl.g:1399:1: ( 'color' )
            {
            // InternalMyDsl.g:1399:1: ( 'color' )
            // InternalMyDsl.g:1400:2: 'color'
            {
             before(grammarAccess.getCardSeniorAccess().getColorKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getColorKeyword_5()); 

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
    // $ANTLR end "rule__CardSenior__Group__5__Impl"


    // $ANTLR start "rule__CardSenior__Group__6"
    // InternalMyDsl.g:1409:1: rule__CardSenior__Group__6 : rule__CardSenior__Group__6__Impl rule__CardSenior__Group__7 ;
    public final void rule__CardSenior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( rule__CardSenior__Group__6__Impl rule__CardSenior__Group__7 )
            // InternalMyDsl.g:1414:2: rule__CardSenior__Group__6__Impl rule__CardSenior__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__CardSenior__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__7();

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
    // $ANTLR end "rule__CardSenior__Group__6"


    // $ANTLR start "rule__CardSenior__Group__6__Impl"
    // InternalMyDsl.g:1421:1: rule__CardSenior__Group__6__Impl : ( ':' ) ;
    public final void rule__CardSenior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( ( ':' ) )
            // InternalMyDsl.g:1426:1: ( ':' )
            {
            // InternalMyDsl.g:1426:1: ( ':' )
            // InternalMyDsl.g:1427:2: ':'
            {
             before(grammarAccess.getCardSeniorAccess().getColonKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__CardSenior__Group__6__Impl"


    // $ANTLR start "rule__CardSenior__Group__7"
    // InternalMyDsl.g:1436:1: rule__CardSenior__Group__7 : rule__CardSenior__Group__7__Impl rule__CardSenior__Group__8 ;
    public final void rule__CardSenior__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( rule__CardSenior__Group__7__Impl rule__CardSenior__Group__8 )
            // InternalMyDsl.g:1441:2: rule__CardSenior__Group__7__Impl rule__CardSenior__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__CardSenior__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__8();

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
    // $ANTLR end "rule__CardSenior__Group__7"


    // $ANTLR start "rule__CardSenior__Group__7__Impl"
    // InternalMyDsl.g:1448:1: rule__CardSenior__Group__7__Impl : ( ( rule__CardSenior__ColorAssignment_7 ) ) ;
    public final void rule__CardSenior__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1452:1: ( ( ( rule__CardSenior__ColorAssignment_7 ) ) )
            // InternalMyDsl.g:1453:1: ( ( rule__CardSenior__ColorAssignment_7 ) )
            {
            // InternalMyDsl.g:1453:1: ( ( rule__CardSenior__ColorAssignment_7 ) )
            // InternalMyDsl.g:1454:2: ( rule__CardSenior__ColorAssignment_7 )
            {
             before(grammarAccess.getCardSeniorAccess().getColorAssignment_7()); 
            // InternalMyDsl.g:1455:2: ( rule__CardSenior__ColorAssignment_7 )
            // InternalMyDsl.g:1455:3: rule__CardSenior__ColorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__ColorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCardSeniorAccess().getColorAssignment_7()); 

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
    // $ANTLR end "rule__CardSenior__Group__7__Impl"


    // $ANTLR start "rule__CardSenior__Group__8"
    // InternalMyDsl.g:1463:1: rule__CardSenior__Group__8 : rule__CardSenior__Group__8__Impl rule__CardSenior__Group__9 ;
    public final void rule__CardSenior__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( rule__CardSenior__Group__8__Impl rule__CardSenior__Group__9 )
            // InternalMyDsl.g:1468:2: rule__CardSenior__Group__8__Impl rule__CardSenior__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__CardSenior__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__9();

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
    // $ANTLR end "rule__CardSenior__Group__8"


    // $ANTLR start "rule__CardSenior__Group__8__Impl"
    // InternalMyDsl.g:1475:1: rule__CardSenior__Group__8__Impl : ( 'card' ) ;
    public final void rule__CardSenior__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( ( 'card' ) )
            // InternalMyDsl.g:1480:1: ( 'card' )
            {
            // InternalMyDsl.g:1480:1: ( 'card' )
            // InternalMyDsl.g:1481:2: 'card'
            {
             before(grammarAccess.getCardSeniorAccess().getCardKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getCardKeyword_8()); 

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
    // $ANTLR end "rule__CardSenior__Group__8__Impl"


    // $ANTLR start "rule__CardSenior__Group__9"
    // InternalMyDsl.g:1490:1: rule__CardSenior__Group__9 : rule__CardSenior__Group__9__Impl rule__CardSenior__Group__10 ;
    public final void rule__CardSenior__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( rule__CardSenior__Group__9__Impl rule__CardSenior__Group__10 )
            // InternalMyDsl.g:1495:2: rule__CardSenior__Group__9__Impl rule__CardSenior__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__CardSenior__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__10();

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
    // $ANTLR end "rule__CardSenior__Group__9"


    // $ANTLR start "rule__CardSenior__Group__9__Impl"
    // InternalMyDsl.g:1502:1: rule__CardSenior__Group__9__Impl : ( ':' ) ;
    public final void rule__CardSenior__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( ( ':' ) )
            // InternalMyDsl.g:1507:1: ( ':' )
            {
            // InternalMyDsl.g:1507:1: ( ':' )
            // InternalMyDsl.g:1508:2: ':'
            {
             before(grammarAccess.getCardSeniorAccess().getColonKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getColonKeyword_9()); 

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
    // $ANTLR end "rule__CardSenior__Group__9__Impl"


    // $ANTLR start "rule__CardSenior__Group__10"
    // InternalMyDsl.g:1517:1: rule__CardSenior__Group__10 : rule__CardSenior__Group__10__Impl rule__CardSenior__Group__11 ;
    public final void rule__CardSenior__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( rule__CardSenior__Group__10__Impl rule__CardSenior__Group__11 )
            // InternalMyDsl.g:1522:2: rule__CardSenior__Group__10__Impl rule__CardSenior__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__CardSenior__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__11();

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
    // $ANTLR end "rule__CardSenior__Group__10"


    // $ANTLR start "rule__CardSenior__Group__10__Impl"
    // InternalMyDsl.g:1529:1: rule__CardSenior__Group__10__Impl : ( ( rule__CardSenior__CardAssignment_10 ) ) ;
    public final void rule__CardSenior__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( ( rule__CardSenior__CardAssignment_10 ) ) )
            // InternalMyDsl.g:1534:1: ( ( rule__CardSenior__CardAssignment_10 ) )
            {
            // InternalMyDsl.g:1534:1: ( ( rule__CardSenior__CardAssignment_10 ) )
            // InternalMyDsl.g:1535:2: ( rule__CardSenior__CardAssignment_10 )
            {
             before(grammarAccess.getCardSeniorAccess().getCardAssignment_10()); 
            // InternalMyDsl.g:1536:2: ( rule__CardSenior__CardAssignment_10 )
            // InternalMyDsl.g:1536:3: rule__CardSenior__CardAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__CardAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCardSeniorAccess().getCardAssignment_10()); 

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
    // $ANTLR end "rule__CardSenior__Group__10__Impl"


    // $ANTLR start "rule__CardSenior__Group__11"
    // InternalMyDsl.g:1544:1: rule__CardSenior__Group__11 : rule__CardSenior__Group__11__Impl rule__CardSenior__Group__12 ;
    public final void rule__CardSenior__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( rule__CardSenior__Group__11__Impl rule__CardSenior__Group__12 )
            // InternalMyDsl.g:1549:2: rule__CardSenior__Group__11__Impl rule__CardSenior__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__CardSenior__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__12();

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
    // $ANTLR end "rule__CardSenior__Group__11"


    // $ANTLR start "rule__CardSenior__Group__11__Impl"
    // InternalMyDsl.g:1556:1: rule__CardSenior__Group__11__Impl : ( 'superior' ) ;
    public final void rule__CardSenior__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( ( 'superior' ) )
            // InternalMyDsl.g:1561:1: ( 'superior' )
            {
            // InternalMyDsl.g:1561:1: ( 'superior' )
            // InternalMyDsl.g:1562:2: 'superior'
            {
             before(grammarAccess.getCardSeniorAccess().getSuperiorKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getSuperiorKeyword_11()); 

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
    // $ANTLR end "rule__CardSenior__Group__11__Impl"


    // $ANTLR start "rule__CardSenior__Group__12"
    // InternalMyDsl.g:1571:1: rule__CardSenior__Group__12 : rule__CardSenior__Group__12__Impl rule__CardSenior__Group__13 ;
    public final void rule__CardSenior__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( rule__CardSenior__Group__12__Impl rule__CardSenior__Group__13 )
            // InternalMyDsl.g:1576:2: rule__CardSenior__Group__12__Impl rule__CardSenior__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__CardSenior__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__13();

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
    // $ANTLR end "rule__CardSenior__Group__12"


    // $ANTLR start "rule__CardSenior__Group__12__Impl"
    // InternalMyDsl.g:1583:1: rule__CardSenior__Group__12__Impl : ( ':' ) ;
    public final void rule__CardSenior__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1587:1: ( ( ':' ) )
            // InternalMyDsl.g:1588:1: ( ':' )
            {
            // InternalMyDsl.g:1588:1: ( ':' )
            // InternalMyDsl.g:1589:2: ':'
            {
             before(grammarAccess.getCardSeniorAccess().getColonKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getColonKeyword_12()); 

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
    // $ANTLR end "rule__CardSenior__Group__12__Impl"


    // $ANTLR start "rule__CardSenior__Group__13"
    // InternalMyDsl.g:1598:1: rule__CardSenior__Group__13 : rule__CardSenior__Group__13__Impl rule__CardSenior__Group__14 ;
    public final void rule__CardSenior__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( rule__CardSenior__Group__13__Impl rule__CardSenior__Group__14 )
            // InternalMyDsl.g:1603:2: rule__CardSenior__Group__13__Impl rule__CardSenior__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__CardSenior__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__14();

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
    // $ANTLR end "rule__CardSenior__Group__13"


    // $ANTLR start "rule__CardSenior__Group__13__Impl"
    // InternalMyDsl.g:1610:1: rule__CardSenior__Group__13__Impl : ( ( rule__CardSenior__SuperiorAssignment_13 ) ) ;
    public final void rule__CardSenior__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( ( ( rule__CardSenior__SuperiorAssignment_13 ) ) )
            // InternalMyDsl.g:1615:1: ( ( rule__CardSenior__SuperiorAssignment_13 ) )
            {
            // InternalMyDsl.g:1615:1: ( ( rule__CardSenior__SuperiorAssignment_13 ) )
            // InternalMyDsl.g:1616:2: ( rule__CardSenior__SuperiorAssignment_13 )
            {
             before(grammarAccess.getCardSeniorAccess().getSuperiorAssignment_13()); 
            // InternalMyDsl.g:1617:2: ( rule__CardSenior__SuperiorAssignment_13 )
            // InternalMyDsl.g:1617:3: rule__CardSenior__SuperiorAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__SuperiorAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getCardSeniorAccess().getSuperiorAssignment_13()); 

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
    // $ANTLR end "rule__CardSenior__Group__13__Impl"


    // $ANTLR start "rule__CardSenior__Group__14"
    // InternalMyDsl.g:1625:1: rule__CardSenior__Group__14 : rule__CardSenior__Group__14__Impl rule__CardSenior__Group__15 ;
    public final void rule__CardSenior__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( rule__CardSenior__Group__14__Impl rule__CardSenior__Group__15 )
            // InternalMyDsl.g:1630:2: rule__CardSenior__Group__14__Impl rule__CardSenior__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__CardSenior__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__15();

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
    // $ANTLR end "rule__CardSenior__Group__14"


    // $ANTLR start "rule__CardSenior__Group__14__Impl"
    // InternalMyDsl.g:1637:1: rule__CardSenior__Group__14__Impl : ( 'inferiors' ) ;
    public final void rule__CardSenior__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( ( 'inferiors' ) )
            // InternalMyDsl.g:1642:1: ( 'inferiors' )
            {
            // InternalMyDsl.g:1642:1: ( 'inferiors' )
            // InternalMyDsl.g:1643:2: 'inferiors'
            {
             before(grammarAccess.getCardSeniorAccess().getInferiorsKeyword_14()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getInferiorsKeyword_14()); 

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
    // $ANTLR end "rule__CardSenior__Group__14__Impl"


    // $ANTLR start "rule__CardSenior__Group__15"
    // InternalMyDsl.g:1652:1: rule__CardSenior__Group__15 : rule__CardSenior__Group__15__Impl rule__CardSenior__Group__16 ;
    public final void rule__CardSenior__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( rule__CardSenior__Group__15__Impl rule__CardSenior__Group__16 )
            // InternalMyDsl.g:1657:2: rule__CardSenior__Group__15__Impl rule__CardSenior__Group__16
            {
            pushFollow(FOLLOW_3);
            rule__CardSenior__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__16();

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
    // $ANTLR end "rule__CardSenior__Group__15"


    // $ANTLR start "rule__CardSenior__Group__15__Impl"
    // InternalMyDsl.g:1664:1: rule__CardSenior__Group__15__Impl : ( ':' ) ;
    public final void rule__CardSenior__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( ( ':' ) )
            // InternalMyDsl.g:1669:1: ( ':' )
            {
            // InternalMyDsl.g:1669:1: ( ':' )
            // InternalMyDsl.g:1670:2: ':'
            {
             before(grammarAccess.getCardSeniorAccess().getColonKeyword_15()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getColonKeyword_15()); 

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
    // $ANTLR end "rule__CardSenior__Group__15__Impl"


    // $ANTLR start "rule__CardSenior__Group__16"
    // InternalMyDsl.g:1679:1: rule__CardSenior__Group__16 : rule__CardSenior__Group__16__Impl rule__CardSenior__Group__17 ;
    public final void rule__CardSenior__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( rule__CardSenior__Group__16__Impl rule__CardSenior__Group__17 )
            // InternalMyDsl.g:1684:2: rule__CardSenior__Group__16__Impl rule__CardSenior__Group__17
            {
            pushFollow(FOLLOW_17);
            rule__CardSenior__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__17();

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
    // $ANTLR end "rule__CardSenior__Group__16"


    // $ANTLR start "rule__CardSenior__Group__16__Impl"
    // InternalMyDsl.g:1691:1: rule__CardSenior__Group__16__Impl : ( ( rule__CardSenior__InferiorsAssignment_16 ) ) ;
    public final void rule__CardSenior__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( ( ( rule__CardSenior__InferiorsAssignment_16 ) ) )
            // InternalMyDsl.g:1696:1: ( ( rule__CardSenior__InferiorsAssignment_16 ) )
            {
            // InternalMyDsl.g:1696:1: ( ( rule__CardSenior__InferiorsAssignment_16 ) )
            // InternalMyDsl.g:1697:2: ( rule__CardSenior__InferiorsAssignment_16 )
            {
             before(grammarAccess.getCardSeniorAccess().getInferiorsAssignment_16()); 
            // InternalMyDsl.g:1698:2: ( rule__CardSenior__InferiorsAssignment_16 )
            // InternalMyDsl.g:1698:3: rule__CardSenior__InferiorsAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__InferiorsAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getCardSeniorAccess().getInferiorsAssignment_16()); 

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
    // $ANTLR end "rule__CardSenior__Group__16__Impl"


    // $ANTLR start "rule__CardSenior__Group__17"
    // InternalMyDsl.g:1706:1: rule__CardSenior__Group__17 : rule__CardSenior__Group__17__Impl rule__CardSenior__Group__18 ;
    public final void rule__CardSenior__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( rule__CardSenior__Group__17__Impl rule__CardSenior__Group__18 )
            // InternalMyDsl.g:1711:2: rule__CardSenior__Group__17__Impl rule__CardSenior__Group__18
            {
            pushFollow(FOLLOW_17);
            rule__CardSenior__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__18();

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
    // $ANTLR end "rule__CardSenior__Group__17"


    // $ANTLR start "rule__CardSenior__Group__17__Impl"
    // InternalMyDsl.g:1718:1: rule__CardSenior__Group__17__Impl : ( ( rule__CardSenior__Group_17__0 )* ) ;
    public final void rule__CardSenior__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( ( ( rule__CardSenior__Group_17__0 )* ) )
            // InternalMyDsl.g:1723:1: ( ( rule__CardSenior__Group_17__0 )* )
            {
            // InternalMyDsl.g:1723:1: ( ( rule__CardSenior__Group_17__0 )* )
            // InternalMyDsl.g:1724:2: ( rule__CardSenior__Group_17__0 )*
            {
             before(grammarAccess.getCardSeniorAccess().getGroup_17()); 
            // InternalMyDsl.g:1725:2: ( rule__CardSenior__Group_17__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1725:3: rule__CardSenior__Group_17__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__CardSenior__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCardSeniorAccess().getGroup_17()); 

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
    // $ANTLR end "rule__CardSenior__Group__17__Impl"


    // $ANTLR start "rule__CardSenior__Group__18"
    // InternalMyDsl.g:1733:1: rule__CardSenior__Group__18 : rule__CardSenior__Group__18__Impl ;
    public final void rule__CardSenior__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( rule__CardSenior__Group__18__Impl )
            // InternalMyDsl.g:1738:2: rule__CardSenior__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__Group__18__Impl();

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
    // $ANTLR end "rule__CardSenior__Group__18"


    // $ANTLR start "rule__CardSenior__Group__18__Impl"
    // InternalMyDsl.g:1744:1: rule__CardSenior__Group__18__Impl : ( '}' ) ;
    public final void rule__CardSenior__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1748:1: ( ( '}' ) )
            // InternalMyDsl.g:1749:1: ( '}' )
            {
            // InternalMyDsl.g:1749:1: ( '}' )
            // InternalMyDsl.g:1750:2: '}'
            {
             before(grammarAccess.getCardSeniorAccess().getRightCurlyBracketKeyword_18()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getRightCurlyBracketKeyword_18()); 

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
    // $ANTLR end "rule__CardSenior__Group__18__Impl"


    // $ANTLR start "rule__CardSenior__Group_17__0"
    // InternalMyDsl.g:1760:1: rule__CardSenior__Group_17__0 : rule__CardSenior__Group_17__0__Impl rule__CardSenior__Group_17__1 ;
    public final void rule__CardSenior__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( rule__CardSenior__Group_17__0__Impl rule__CardSenior__Group_17__1 )
            // InternalMyDsl.g:1765:2: rule__CardSenior__Group_17__0__Impl rule__CardSenior__Group_17__1
            {
            pushFollow(FOLLOW_3);
            rule__CardSenior__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CardSenior__Group_17__1();

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
    // $ANTLR end "rule__CardSenior__Group_17__0"


    // $ANTLR start "rule__CardSenior__Group_17__0__Impl"
    // InternalMyDsl.g:1772:1: rule__CardSenior__Group_17__0__Impl : ( ',' ) ;
    public final void rule__CardSenior__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( ( ',' ) )
            // InternalMyDsl.g:1777:1: ( ',' )
            {
            // InternalMyDsl.g:1777:1: ( ',' )
            // InternalMyDsl.g:1778:2: ','
            {
             before(grammarAccess.getCardSeniorAccess().getCommaKeyword_17_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getCommaKeyword_17_0()); 

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
    // $ANTLR end "rule__CardSenior__Group_17__0__Impl"


    // $ANTLR start "rule__CardSenior__Group_17__1"
    // InternalMyDsl.g:1787:1: rule__CardSenior__Group_17__1 : rule__CardSenior__Group_17__1__Impl ;
    public final void rule__CardSenior__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( rule__CardSenior__Group_17__1__Impl )
            // InternalMyDsl.g:1792:2: rule__CardSenior__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__Group_17__1__Impl();

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
    // $ANTLR end "rule__CardSenior__Group_17__1"


    // $ANTLR start "rule__CardSenior__Group_17__1__Impl"
    // InternalMyDsl.g:1798:1: rule__CardSenior__Group_17__1__Impl : ( ( rule__CardSenior__InferiorsAssignment_17_1 ) ) ;
    public final void rule__CardSenior__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1802:1: ( ( ( rule__CardSenior__InferiorsAssignment_17_1 ) ) )
            // InternalMyDsl.g:1803:1: ( ( rule__CardSenior__InferiorsAssignment_17_1 ) )
            {
            // InternalMyDsl.g:1803:1: ( ( rule__CardSenior__InferiorsAssignment_17_1 ) )
            // InternalMyDsl.g:1804:2: ( rule__CardSenior__InferiorsAssignment_17_1 )
            {
             before(grammarAccess.getCardSeniorAccess().getInferiorsAssignment_17_1()); 
            // InternalMyDsl.g:1805:2: ( rule__CardSenior__InferiorsAssignment_17_1 )
            // InternalMyDsl.g:1805:3: rule__CardSenior__InferiorsAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__CardSenior__InferiorsAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getCardSeniorAccess().getInferiorsAssignment_17_1()); 

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
    // $ANTLR end "rule__CardSenior__Group_17__1__Impl"


    // $ANTLR start "rule__RoomSenior__Group__0"
    // InternalMyDsl.g:1814:1: rule__RoomSenior__Group__0 : rule__RoomSenior__Group__0__Impl rule__RoomSenior__Group__1 ;
    public final void rule__RoomSenior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( rule__RoomSenior__Group__0__Impl rule__RoomSenior__Group__1 )
            // InternalMyDsl.g:1819:2: rule__RoomSenior__Group__0__Impl rule__RoomSenior__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RoomSenior__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__1();

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
    // $ANTLR end "rule__RoomSenior__Group__0"


    // $ANTLR start "rule__RoomSenior__Group__0__Impl"
    // InternalMyDsl.g:1826:1: rule__RoomSenior__Group__0__Impl : ( ( rule__RoomSenior__NameAssignment_0 ) ) ;
    public final void rule__RoomSenior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1830:1: ( ( ( rule__RoomSenior__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1831:1: ( ( rule__RoomSenior__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1831:1: ( ( rule__RoomSenior__NameAssignment_0 ) )
            // InternalMyDsl.g:1832:2: ( rule__RoomSenior__NameAssignment_0 )
            {
             before(grammarAccess.getRoomSeniorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1833:2: ( rule__RoomSenior__NameAssignment_0 )
            // InternalMyDsl.g:1833:3: rule__RoomSenior__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RoomSenior__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomSeniorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__RoomSenior__Group__0__Impl"


    // $ANTLR start "rule__RoomSenior__Group__1"
    // InternalMyDsl.g:1841:1: rule__RoomSenior__Group__1 : rule__RoomSenior__Group__1__Impl rule__RoomSenior__Group__2 ;
    public final void rule__RoomSenior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( rule__RoomSenior__Group__1__Impl rule__RoomSenior__Group__2 )
            // InternalMyDsl.g:1846:2: rule__RoomSenior__Group__1__Impl rule__RoomSenior__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RoomSenior__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__2();

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
    // $ANTLR end "rule__RoomSenior__Group__1"


    // $ANTLR start "rule__RoomSenior__Group__1__Impl"
    // InternalMyDsl.g:1853:1: rule__RoomSenior__Group__1__Impl : ( '{' ) ;
    public final void rule__RoomSenior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( ( '{' ) )
            // InternalMyDsl.g:1858:1: ( '{' )
            {
            // InternalMyDsl.g:1858:1: ( '{' )
            // InternalMyDsl.g:1859:2: '{'
            {
             before(grammarAccess.getRoomSeniorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__RoomSenior__Group__1__Impl"


    // $ANTLR start "rule__RoomSenior__Group__2"
    // InternalMyDsl.g:1868:1: rule__RoomSenior__Group__2 : rule__RoomSenior__Group__2__Impl rule__RoomSenior__Group__3 ;
    public final void rule__RoomSenior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( rule__RoomSenior__Group__2__Impl rule__RoomSenior__Group__3 )
            // InternalMyDsl.g:1873:2: rule__RoomSenior__Group__2__Impl rule__RoomSenior__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RoomSenior__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__3();

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
    // $ANTLR end "rule__RoomSenior__Group__2"


    // $ANTLR start "rule__RoomSenior__Group__2__Impl"
    // InternalMyDsl.g:1880:1: rule__RoomSenior__Group__2__Impl : ( 'year' ) ;
    public final void rule__RoomSenior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1884:1: ( ( 'year' ) )
            // InternalMyDsl.g:1885:1: ( 'year' )
            {
            // InternalMyDsl.g:1885:1: ( 'year' )
            // InternalMyDsl.g:1886:2: 'year'
            {
             before(grammarAccess.getRoomSeniorAccess().getYearKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getYearKeyword_2()); 

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
    // $ANTLR end "rule__RoomSenior__Group__2__Impl"


    // $ANTLR start "rule__RoomSenior__Group__3"
    // InternalMyDsl.g:1895:1: rule__RoomSenior__Group__3 : rule__RoomSenior__Group__3__Impl rule__RoomSenior__Group__4 ;
    public final void rule__RoomSenior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( rule__RoomSenior__Group__3__Impl rule__RoomSenior__Group__4 )
            // InternalMyDsl.g:1900:2: rule__RoomSenior__Group__3__Impl rule__RoomSenior__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RoomSenior__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__4();

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
    // $ANTLR end "rule__RoomSenior__Group__3"


    // $ANTLR start "rule__RoomSenior__Group__3__Impl"
    // InternalMyDsl.g:1907:1: rule__RoomSenior__Group__3__Impl : ( ':' ) ;
    public final void rule__RoomSenior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( ( ':' ) )
            // InternalMyDsl.g:1912:1: ( ':' )
            {
            // InternalMyDsl.g:1912:1: ( ':' )
            // InternalMyDsl.g:1913:2: ':'
            {
             before(grammarAccess.getRoomSeniorAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__RoomSenior__Group__3__Impl"


    // $ANTLR start "rule__RoomSenior__Group__4"
    // InternalMyDsl.g:1922:1: rule__RoomSenior__Group__4 : rule__RoomSenior__Group__4__Impl rule__RoomSenior__Group__5 ;
    public final void rule__RoomSenior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( rule__RoomSenior__Group__4__Impl rule__RoomSenior__Group__5 )
            // InternalMyDsl.g:1927:2: rule__RoomSenior__Group__4__Impl rule__RoomSenior__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__RoomSenior__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__5();

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
    // $ANTLR end "rule__RoomSenior__Group__4"


    // $ANTLR start "rule__RoomSenior__Group__4__Impl"
    // InternalMyDsl.g:1934:1: rule__RoomSenior__Group__4__Impl : ( ( rule__RoomSenior__YearAssignment_4 ) ) ;
    public final void rule__RoomSenior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1938:1: ( ( ( rule__RoomSenior__YearAssignment_4 ) ) )
            // InternalMyDsl.g:1939:1: ( ( rule__RoomSenior__YearAssignment_4 ) )
            {
            // InternalMyDsl.g:1939:1: ( ( rule__RoomSenior__YearAssignment_4 ) )
            // InternalMyDsl.g:1940:2: ( rule__RoomSenior__YearAssignment_4 )
            {
             before(grammarAccess.getRoomSeniorAccess().getYearAssignment_4()); 
            // InternalMyDsl.g:1941:2: ( rule__RoomSenior__YearAssignment_4 )
            // InternalMyDsl.g:1941:3: rule__RoomSenior__YearAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RoomSenior__YearAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomSeniorAccess().getYearAssignment_4()); 

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
    // $ANTLR end "rule__RoomSenior__Group__4__Impl"


    // $ANTLR start "rule__RoomSenior__Group__5"
    // InternalMyDsl.g:1949:1: rule__RoomSenior__Group__5 : rule__RoomSenior__Group__5__Impl rule__RoomSenior__Group__6 ;
    public final void rule__RoomSenior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( rule__RoomSenior__Group__5__Impl rule__RoomSenior__Group__6 )
            // InternalMyDsl.g:1954:2: rule__RoomSenior__Group__5__Impl rule__RoomSenior__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__RoomSenior__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__6();

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
    // $ANTLR end "rule__RoomSenior__Group__5"


    // $ANTLR start "rule__RoomSenior__Group__5__Impl"
    // InternalMyDsl.g:1961:1: rule__RoomSenior__Group__5__Impl : ( 'color' ) ;
    public final void rule__RoomSenior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( ( 'color' ) )
            // InternalMyDsl.g:1966:1: ( 'color' )
            {
            // InternalMyDsl.g:1966:1: ( 'color' )
            // InternalMyDsl.g:1967:2: 'color'
            {
             before(grammarAccess.getRoomSeniorAccess().getColorKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getColorKeyword_5()); 

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
    // $ANTLR end "rule__RoomSenior__Group__5__Impl"


    // $ANTLR start "rule__RoomSenior__Group__6"
    // InternalMyDsl.g:1976:1: rule__RoomSenior__Group__6 : rule__RoomSenior__Group__6__Impl rule__RoomSenior__Group__7 ;
    public final void rule__RoomSenior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( rule__RoomSenior__Group__6__Impl rule__RoomSenior__Group__7 )
            // InternalMyDsl.g:1981:2: rule__RoomSenior__Group__6__Impl rule__RoomSenior__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__RoomSenior__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__7();

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
    // $ANTLR end "rule__RoomSenior__Group__6"


    // $ANTLR start "rule__RoomSenior__Group__6__Impl"
    // InternalMyDsl.g:1988:1: rule__RoomSenior__Group__6__Impl : ( ':' ) ;
    public final void rule__RoomSenior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1992:1: ( ( ':' ) )
            // InternalMyDsl.g:1993:1: ( ':' )
            {
            // InternalMyDsl.g:1993:1: ( ':' )
            // InternalMyDsl.g:1994:2: ':'
            {
             before(grammarAccess.getRoomSeniorAccess().getColonKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__RoomSenior__Group__6__Impl"


    // $ANTLR start "rule__RoomSenior__Group__7"
    // InternalMyDsl.g:2003:1: rule__RoomSenior__Group__7 : rule__RoomSenior__Group__7__Impl rule__RoomSenior__Group__8 ;
    public final void rule__RoomSenior__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( rule__RoomSenior__Group__7__Impl rule__RoomSenior__Group__8 )
            // InternalMyDsl.g:2008:2: rule__RoomSenior__Group__7__Impl rule__RoomSenior__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__RoomSenior__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__8();

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
    // $ANTLR end "rule__RoomSenior__Group__7"


    // $ANTLR start "rule__RoomSenior__Group__7__Impl"
    // InternalMyDsl.g:2015:1: rule__RoomSenior__Group__7__Impl : ( ( rule__RoomSenior__ColorAssignment_7 ) ) ;
    public final void rule__RoomSenior__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( ( ( rule__RoomSenior__ColorAssignment_7 ) ) )
            // InternalMyDsl.g:2020:1: ( ( rule__RoomSenior__ColorAssignment_7 ) )
            {
            // InternalMyDsl.g:2020:1: ( ( rule__RoomSenior__ColorAssignment_7 ) )
            // InternalMyDsl.g:2021:2: ( rule__RoomSenior__ColorAssignment_7 )
            {
             before(grammarAccess.getRoomSeniorAccess().getColorAssignment_7()); 
            // InternalMyDsl.g:2022:2: ( rule__RoomSenior__ColorAssignment_7 )
            // InternalMyDsl.g:2022:3: rule__RoomSenior__ColorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__RoomSenior__ColorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRoomSeniorAccess().getColorAssignment_7()); 

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
    // $ANTLR end "rule__RoomSenior__Group__7__Impl"


    // $ANTLR start "rule__RoomSenior__Group__8"
    // InternalMyDsl.g:2030:1: rule__RoomSenior__Group__8 : rule__RoomSenior__Group__8__Impl rule__RoomSenior__Group__9 ;
    public final void rule__RoomSenior__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( rule__RoomSenior__Group__8__Impl rule__RoomSenior__Group__9 )
            // InternalMyDsl.g:2035:2: rule__RoomSenior__Group__8__Impl rule__RoomSenior__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__RoomSenior__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__9();

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
    // $ANTLR end "rule__RoomSenior__Group__8"


    // $ANTLR start "rule__RoomSenior__Group__8__Impl"
    // InternalMyDsl.g:2042:1: rule__RoomSenior__Group__8__Impl : ( 'card' ) ;
    public final void rule__RoomSenior__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( ( 'card' ) )
            // InternalMyDsl.g:2047:1: ( 'card' )
            {
            // InternalMyDsl.g:2047:1: ( 'card' )
            // InternalMyDsl.g:2048:2: 'card'
            {
             before(grammarAccess.getRoomSeniorAccess().getCardKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getCardKeyword_8()); 

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
    // $ANTLR end "rule__RoomSenior__Group__8__Impl"


    // $ANTLR start "rule__RoomSenior__Group__9"
    // InternalMyDsl.g:2057:1: rule__RoomSenior__Group__9 : rule__RoomSenior__Group__9__Impl rule__RoomSenior__Group__10 ;
    public final void rule__RoomSenior__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2061:1: ( rule__RoomSenior__Group__9__Impl rule__RoomSenior__Group__10 )
            // InternalMyDsl.g:2062:2: rule__RoomSenior__Group__9__Impl rule__RoomSenior__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__RoomSenior__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__10();

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
    // $ANTLR end "rule__RoomSenior__Group__9"


    // $ANTLR start "rule__RoomSenior__Group__9__Impl"
    // InternalMyDsl.g:2069:1: rule__RoomSenior__Group__9__Impl : ( ':' ) ;
    public final void rule__RoomSenior__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( ( ':' ) )
            // InternalMyDsl.g:2074:1: ( ':' )
            {
            // InternalMyDsl.g:2074:1: ( ':' )
            // InternalMyDsl.g:2075:2: ':'
            {
             before(grammarAccess.getRoomSeniorAccess().getColonKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getColonKeyword_9()); 

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
    // $ANTLR end "rule__RoomSenior__Group__9__Impl"


    // $ANTLR start "rule__RoomSenior__Group__10"
    // InternalMyDsl.g:2084:1: rule__RoomSenior__Group__10 : rule__RoomSenior__Group__10__Impl rule__RoomSenior__Group__11 ;
    public final void rule__RoomSenior__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( rule__RoomSenior__Group__10__Impl rule__RoomSenior__Group__11 )
            // InternalMyDsl.g:2089:2: rule__RoomSenior__Group__10__Impl rule__RoomSenior__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__RoomSenior__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__11();

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
    // $ANTLR end "rule__RoomSenior__Group__10"


    // $ANTLR start "rule__RoomSenior__Group__10__Impl"
    // InternalMyDsl.g:2096:1: rule__RoomSenior__Group__10__Impl : ( ( rule__RoomSenior__CardAssignment_10 ) ) ;
    public final void rule__RoomSenior__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2100:1: ( ( ( rule__RoomSenior__CardAssignment_10 ) ) )
            // InternalMyDsl.g:2101:1: ( ( rule__RoomSenior__CardAssignment_10 ) )
            {
            // InternalMyDsl.g:2101:1: ( ( rule__RoomSenior__CardAssignment_10 ) )
            // InternalMyDsl.g:2102:2: ( rule__RoomSenior__CardAssignment_10 )
            {
             before(grammarAccess.getRoomSeniorAccess().getCardAssignment_10()); 
            // InternalMyDsl.g:2103:2: ( rule__RoomSenior__CardAssignment_10 )
            // InternalMyDsl.g:2103:3: rule__RoomSenior__CardAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__RoomSenior__CardAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRoomSeniorAccess().getCardAssignment_10()); 

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
    // $ANTLR end "rule__RoomSenior__Group__10__Impl"


    // $ANTLR start "rule__RoomSenior__Group__11"
    // InternalMyDsl.g:2111:1: rule__RoomSenior__Group__11 : rule__RoomSenior__Group__11__Impl rule__RoomSenior__Group__12 ;
    public final void rule__RoomSenior__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( rule__RoomSenior__Group__11__Impl rule__RoomSenior__Group__12 )
            // InternalMyDsl.g:2116:2: rule__RoomSenior__Group__11__Impl rule__RoomSenior__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__RoomSenior__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__12();

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
    // $ANTLR end "rule__RoomSenior__Group__11"


    // $ANTLR start "rule__RoomSenior__Group__11__Impl"
    // InternalMyDsl.g:2123:1: rule__RoomSenior__Group__11__Impl : ( 'superior' ) ;
    public final void rule__RoomSenior__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( ( 'superior' ) )
            // InternalMyDsl.g:2128:1: ( 'superior' )
            {
            // InternalMyDsl.g:2128:1: ( 'superior' )
            // InternalMyDsl.g:2129:2: 'superior'
            {
             before(grammarAccess.getRoomSeniorAccess().getSuperiorKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getSuperiorKeyword_11()); 

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
    // $ANTLR end "rule__RoomSenior__Group__11__Impl"


    // $ANTLR start "rule__RoomSenior__Group__12"
    // InternalMyDsl.g:2138:1: rule__RoomSenior__Group__12 : rule__RoomSenior__Group__12__Impl rule__RoomSenior__Group__13 ;
    public final void rule__RoomSenior__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( rule__RoomSenior__Group__12__Impl rule__RoomSenior__Group__13 )
            // InternalMyDsl.g:2143:2: rule__RoomSenior__Group__12__Impl rule__RoomSenior__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__RoomSenior__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__13();

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
    // $ANTLR end "rule__RoomSenior__Group__12"


    // $ANTLR start "rule__RoomSenior__Group__12__Impl"
    // InternalMyDsl.g:2150:1: rule__RoomSenior__Group__12__Impl : ( ':' ) ;
    public final void rule__RoomSenior__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2154:1: ( ( ':' ) )
            // InternalMyDsl.g:2155:1: ( ':' )
            {
            // InternalMyDsl.g:2155:1: ( ':' )
            // InternalMyDsl.g:2156:2: ':'
            {
             before(grammarAccess.getRoomSeniorAccess().getColonKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getColonKeyword_12()); 

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
    // $ANTLR end "rule__RoomSenior__Group__12__Impl"


    // $ANTLR start "rule__RoomSenior__Group__13"
    // InternalMyDsl.g:2165:1: rule__RoomSenior__Group__13 : rule__RoomSenior__Group__13__Impl rule__RoomSenior__Group__14 ;
    public final void rule__RoomSenior__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2169:1: ( rule__RoomSenior__Group__13__Impl rule__RoomSenior__Group__14 )
            // InternalMyDsl.g:2170:2: rule__RoomSenior__Group__13__Impl rule__RoomSenior__Group__14
            {
            pushFollow(FOLLOW_22);
            rule__RoomSenior__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__14();

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
    // $ANTLR end "rule__RoomSenior__Group__13"


    // $ANTLR start "rule__RoomSenior__Group__13__Impl"
    // InternalMyDsl.g:2177:1: rule__RoomSenior__Group__13__Impl : ( ( rule__RoomSenior__SuperiorAssignment_13 ) ) ;
    public final void rule__RoomSenior__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2181:1: ( ( ( rule__RoomSenior__SuperiorAssignment_13 ) ) )
            // InternalMyDsl.g:2182:1: ( ( rule__RoomSenior__SuperiorAssignment_13 ) )
            {
            // InternalMyDsl.g:2182:1: ( ( rule__RoomSenior__SuperiorAssignment_13 ) )
            // InternalMyDsl.g:2183:2: ( rule__RoomSenior__SuperiorAssignment_13 )
            {
             before(grammarAccess.getRoomSeniorAccess().getSuperiorAssignment_13()); 
            // InternalMyDsl.g:2184:2: ( rule__RoomSenior__SuperiorAssignment_13 )
            // InternalMyDsl.g:2184:3: rule__RoomSenior__SuperiorAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__RoomSenior__SuperiorAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getRoomSeniorAccess().getSuperiorAssignment_13()); 

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
    // $ANTLR end "rule__RoomSenior__Group__13__Impl"


    // $ANTLR start "rule__RoomSenior__Group__14"
    // InternalMyDsl.g:2192:1: rule__RoomSenior__Group__14 : rule__RoomSenior__Group__14__Impl ;
    public final void rule__RoomSenior__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2196:1: ( rule__RoomSenior__Group__14__Impl )
            // InternalMyDsl.g:2197:2: rule__RoomSenior__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoomSenior__Group__14__Impl();

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
    // $ANTLR end "rule__RoomSenior__Group__14"


    // $ANTLR start "rule__RoomSenior__Group__14__Impl"
    // InternalMyDsl.g:2203:1: rule__RoomSenior__Group__14__Impl : ( '}' ) ;
    public final void rule__RoomSenior__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2207:1: ( ( '}' ) )
            // InternalMyDsl.g:2208:1: ( '}' )
            {
            // InternalMyDsl.g:2208:1: ( '}' )
            // InternalMyDsl.g:2209:2: '}'
            {
             before(grammarAccess.getRoomSeniorAccess().getRightCurlyBracketKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__RoomSenior__Group__14__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalMyDsl.g:2219:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalMyDsl.g:2224:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalMyDsl.g:2231:1: rule__Color__Group__0__Impl : ( ( rule__Color__NameAssignment_0 ) ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( ( ( rule__Color__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2236:1: ( ( rule__Color__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2236:1: ( ( rule__Color__NameAssignment_0 ) )
            // InternalMyDsl.g:2237:2: ( rule__Color__NameAssignment_0 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2238:2: ( rule__Color__NameAssignment_0 )
            // InternalMyDsl.g:2238:3: rule__Color__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Color__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalMyDsl.g:2246:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2250:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalMyDsl.g:2251:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalMyDsl.g:2258:1: rule__Color__Group__1__Impl : ( '{' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2262:1: ( ( '{' ) )
            // InternalMyDsl.g:2263:1: ( '{' )
            {
            // InternalMyDsl.g:2263:1: ( '{' )
            // InternalMyDsl.g:2264:2: '{'
            {
             before(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalMyDsl.g:2273:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2277:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalMyDsl.g:2278:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

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
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalMyDsl.g:2285:1: rule__Color__Group__2__Impl : ( 'type' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2289:1: ( ( 'type' ) )
            // InternalMyDsl.g:2290:1: ( 'type' )
            {
            // InternalMyDsl.g:2290:1: ( 'type' )
            // InternalMyDsl.g:2291:2: 'type'
            {
             before(grammarAccess.getColorAccess().getTypeKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalMyDsl.g:2300:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2304:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalMyDsl.g:2305:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Color__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__4();

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
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalMyDsl.g:2312:1: rule__Color__Group__3__Impl : ( ':' ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2316:1: ( ( ':' ) )
            // InternalMyDsl.g:2317:1: ( ':' )
            {
            // InternalMyDsl.g:2317:1: ( ':' )
            // InternalMyDsl.g:2318:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__4"
    // InternalMyDsl.g:2327:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2331:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalMyDsl.g:2332:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Color__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__5();

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
    // $ANTLR end "rule__Color__Group__4"


    // $ANTLR start "rule__Color__Group__4__Impl"
    // InternalMyDsl.g:2339:1: rule__Color__Group__4__Impl : ( ( rule__Color__TypeAssignment_4 ) ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2343:1: ( ( ( rule__Color__TypeAssignment_4 ) ) )
            // InternalMyDsl.g:2344:1: ( ( rule__Color__TypeAssignment_4 ) )
            {
            // InternalMyDsl.g:2344:1: ( ( rule__Color__TypeAssignment_4 ) )
            // InternalMyDsl.g:2345:2: ( rule__Color__TypeAssignment_4 )
            {
             before(grammarAccess.getColorAccess().getTypeAssignment_4()); 
            // InternalMyDsl.g:2346:2: ( rule__Color__TypeAssignment_4 )
            // InternalMyDsl.g:2346:3: rule__Color__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Color__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Color__Group__4__Impl"


    // $ANTLR start "rule__Color__Group__5"
    // InternalMyDsl.g:2354:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2358:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalMyDsl.g:2359:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Color__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__6();

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
    // $ANTLR end "rule__Color__Group__5"


    // $ANTLR start "rule__Color__Group__5__Impl"
    // InternalMyDsl.g:2366:1: rule__Color__Group__5__Impl : ( 'colorsenior' ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2370:1: ( ( 'colorsenior' ) )
            // InternalMyDsl.g:2371:1: ( 'colorsenior' )
            {
            // InternalMyDsl.g:2371:1: ( 'colorsenior' )
            // InternalMyDsl.g:2372:2: 'colorsenior'
            {
             before(grammarAccess.getColorAccess().getColorseniorKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorseniorKeyword_5()); 

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
    // $ANTLR end "rule__Color__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__6"
    // InternalMyDsl.g:2381:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalMyDsl.g:2386:2: rule__Color__Group__6__Impl rule__Color__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Color__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__7();

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
    // $ANTLR end "rule__Color__Group__6"


    // $ANTLR start "rule__Color__Group__6__Impl"
    // InternalMyDsl.g:2393:1: rule__Color__Group__6__Impl : ( ':' ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( ( ':' ) )
            // InternalMyDsl.g:2398:1: ( ':' )
            {
            // InternalMyDsl.g:2398:1: ( ':' )
            // InternalMyDsl.g:2399:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Color__Group__6__Impl"


    // $ANTLR start "rule__Color__Group__7"
    // InternalMyDsl.g:2408:1: rule__Color__Group__7 : rule__Color__Group__7__Impl rule__Color__Group__8 ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( rule__Color__Group__7__Impl rule__Color__Group__8 )
            // InternalMyDsl.g:2413:2: rule__Color__Group__7__Impl rule__Color__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Color__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__8();

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
    // $ANTLR end "rule__Color__Group__7"


    // $ANTLR start "rule__Color__Group__7__Impl"
    // InternalMyDsl.g:2420:1: rule__Color__Group__7__Impl : ( ( rule__Color__ColorseniorAssignment_7 ) ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2424:1: ( ( ( rule__Color__ColorseniorAssignment_7 ) ) )
            // InternalMyDsl.g:2425:1: ( ( rule__Color__ColorseniorAssignment_7 ) )
            {
            // InternalMyDsl.g:2425:1: ( ( rule__Color__ColorseniorAssignment_7 ) )
            // InternalMyDsl.g:2426:2: ( rule__Color__ColorseniorAssignment_7 )
            {
             before(grammarAccess.getColorAccess().getColorseniorAssignment_7()); 
            // InternalMyDsl.g:2427:2: ( rule__Color__ColorseniorAssignment_7 )
            // InternalMyDsl.g:2427:3: rule__Color__ColorseniorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Color__ColorseniorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getColorseniorAssignment_7()); 

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
    // $ANTLR end "rule__Color__Group__7__Impl"


    // $ANTLR start "rule__Color__Group__8"
    // InternalMyDsl.g:2435:1: rule__Color__Group__8 : rule__Color__Group__8__Impl rule__Color__Group__9 ;
    public final void rule__Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2439:1: ( rule__Color__Group__8__Impl rule__Color__Group__9 )
            // InternalMyDsl.g:2440:2: rule__Color__Group__8__Impl rule__Color__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Color__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__9();

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
    // $ANTLR end "rule__Color__Group__8"


    // $ANTLR start "rule__Color__Group__8__Impl"
    // InternalMyDsl.g:2447:1: rule__Color__Group__8__Impl : ( 'cards' ) ;
    public final void rule__Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2451:1: ( ( 'cards' ) )
            // InternalMyDsl.g:2452:1: ( 'cards' )
            {
            // InternalMyDsl.g:2452:1: ( 'cards' )
            // InternalMyDsl.g:2453:2: 'cards'
            {
             before(grammarAccess.getColorAccess().getCardsKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getCardsKeyword_8()); 

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
    // $ANTLR end "rule__Color__Group__8__Impl"


    // $ANTLR start "rule__Color__Group__9"
    // InternalMyDsl.g:2462:1: rule__Color__Group__9 : rule__Color__Group__9__Impl rule__Color__Group__10 ;
    public final void rule__Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2466:1: ( rule__Color__Group__9__Impl rule__Color__Group__10 )
            // InternalMyDsl.g:2467:2: rule__Color__Group__9__Impl rule__Color__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Color__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__10();

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
    // $ANTLR end "rule__Color__Group__9"


    // $ANTLR start "rule__Color__Group__9__Impl"
    // InternalMyDsl.g:2474:1: rule__Color__Group__9__Impl : ( '{' ) ;
    public final void rule__Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( ( '{' ) )
            // InternalMyDsl.g:2479:1: ( '{' )
            {
            // InternalMyDsl.g:2479:1: ( '{' )
            // InternalMyDsl.g:2480:2: '{'
            {
             before(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Color__Group__9__Impl"


    // $ANTLR start "rule__Color__Group__10"
    // InternalMyDsl.g:2489:1: rule__Color__Group__10 : rule__Color__Group__10__Impl rule__Color__Group__11 ;
    public final void rule__Color__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( rule__Color__Group__10__Impl rule__Color__Group__11 )
            // InternalMyDsl.g:2494:2: rule__Color__Group__10__Impl rule__Color__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Color__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__11();

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
    // $ANTLR end "rule__Color__Group__10"


    // $ANTLR start "rule__Color__Group__10__Impl"
    // InternalMyDsl.g:2501:1: rule__Color__Group__10__Impl : ( ( rule__Color__CardsAssignment_10 )* ) ;
    public final void rule__Color__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2505:1: ( ( ( rule__Color__CardsAssignment_10 )* ) )
            // InternalMyDsl.g:2506:1: ( ( rule__Color__CardsAssignment_10 )* )
            {
            // InternalMyDsl.g:2506:1: ( ( rule__Color__CardsAssignment_10 )* )
            // InternalMyDsl.g:2507:2: ( rule__Color__CardsAssignment_10 )*
            {
             before(grammarAccess.getColorAccess().getCardsAssignment_10()); 
            // InternalMyDsl.g:2508:2: ( rule__Color__CardsAssignment_10 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:2508:3: rule__Color__CardsAssignment_10
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Color__CardsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getColorAccess().getCardsAssignment_10()); 

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
    // $ANTLR end "rule__Color__Group__10__Impl"


    // $ANTLR start "rule__Color__Group__11"
    // InternalMyDsl.g:2516:1: rule__Color__Group__11 : rule__Color__Group__11__Impl rule__Color__Group__12 ;
    public final void rule__Color__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2520:1: ( rule__Color__Group__11__Impl rule__Color__Group__12 )
            // InternalMyDsl.g:2521:2: rule__Color__Group__11__Impl rule__Color__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__Color__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__12();

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
    // $ANTLR end "rule__Color__Group__11"


    // $ANTLR start "rule__Color__Group__11__Impl"
    // InternalMyDsl.g:2528:1: rule__Color__Group__11__Impl : ( '}' ) ;
    public final void rule__Color__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2532:1: ( ( '}' ) )
            // InternalMyDsl.g:2533:1: ( '}' )
            {
            // InternalMyDsl.g:2533:1: ( '}' )
            // InternalMyDsl.g:2534:2: '}'
            {
             before(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Color__Group__11__Impl"


    // $ANTLR start "rule__Color__Group__12"
    // InternalMyDsl.g:2543:1: rule__Color__Group__12 : rule__Color__Group__12__Impl ;
    public final void rule__Color__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2547:1: ( rule__Color__Group__12__Impl )
            // InternalMyDsl.g:2548:2: rule__Color__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__12__Impl();

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
    // $ANTLR end "rule__Color__Group__12"


    // $ANTLR start "rule__Color__Group__12__Impl"
    // InternalMyDsl.g:2554:1: rule__Color__Group__12__Impl : ( '}' ) ;
    public final void rule__Color__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2558:1: ( ( '}' ) )
            // InternalMyDsl.g:2559:1: ( '}' )
            {
            // InternalMyDsl.g:2559:1: ( '}' )
            // InternalMyDsl.g:2560:2: '}'
            {
             before(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_12()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Color__Group__12__Impl"


    // $ANTLR start "rule__Card__Group__0"
    // InternalMyDsl.g:2570:1: rule__Card__Group__0 : rule__Card__Group__0__Impl rule__Card__Group__1 ;
    public final void rule__Card__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2574:1: ( rule__Card__Group__0__Impl rule__Card__Group__1 )
            // InternalMyDsl.g:2575:2: rule__Card__Group__0__Impl rule__Card__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Card__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__1();

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
    // $ANTLR end "rule__Card__Group__0"


    // $ANTLR start "rule__Card__Group__0__Impl"
    // InternalMyDsl.g:2582:1: rule__Card__Group__0__Impl : ( ( rule__Card__NameAssignment_0 ) ) ;
    public final void rule__Card__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2586:1: ( ( ( rule__Card__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2587:1: ( ( rule__Card__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2587:1: ( ( rule__Card__NameAssignment_0 ) )
            // InternalMyDsl.g:2588:2: ( rule__Card__NameAssignment_0 )
            {
             before(grammarAccess.getCardAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2589:2: ( rule__Card__NameAssignment_0 )
            // InternalMyDsl.g:2589:3: rule__Card__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Card__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Card__Group__0__Impl"


    // $ANTLR start "rule__Card__Group__1"
    // InternalMyDsl.g:2597:1: rule__Card__Group__1 : rule__Card__Group__1__Impl rule__Card__Group__2 ;
    public final void rule__Card__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2601:1: ( rule__Card__Group__1__Impl rule__Card__Group__2 )
            // InternalMyDsl.g:2602:2: rule__Card__Group__1__Impl rule__Card__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Card__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__2();

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
    // $ANTLR end "rule__Card__Group__1"


    // $ANTLR start "rule__Card__Group__1__Impl"
    // InternalMyDsl.g:2609:1: rule__Card__Group__1__Impl : ( '{' ) ;
    public final void rule__Card__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2613:1: ( ( '{' ) )
            // InternalMyDsl.g:2614:1: ( '{' )
            {
            // InternalMyDsl.g:2614:1: ( '{' )
            // InternalMyDsl.g:2615:2: '{'
            {
             before(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Card__Group__1__Impl"


    // $ANTLR start "rule__Card__Group__2"
    // InternalMyDsl.g:2624:1: rule__Card__Group__2 : rule__Card__Group__2__Impl rule__Card__Group__3 ;
    public final void rule__Card__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( rule__Card__Group__2__Impl rule__Card__Group__3 )
            // InternalMyDsl.g:2629:2: rule__Card__Group__2__Impl rule__Card__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Card__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__3();

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
    // $ANTLR end "rule__Card__Group__2"


    // $ANTLR start "rule__Card__Group__2__Impl"
    // InternalMyDsl.g:2636:1: rule__Card__Group__2__Impl : ( 'type' ) ;
    public final void rule__Card__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2640:1: ( ( 'type' ) )
            // InternalMyDsl.g:2641:1: ( 'type' )
            {
            // InternalMyDsl.g:2641:1: ( 'type' )
            // InternalMyDsl.g:2642:2: 'type'
            {
             before(grammarAccess.getCardAccess().getTypeKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__Card__Group__2__Impl"


    // $ANTLR start "rule__Card__Group__3"
    // InternalMyDsl.g:2651:1: rule__Card__Group__3 : rule__Card__Group__3__Impl rule__Card__Group__4 ;
    public final void rule__Card__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2655:1: ( rule__Card__Group__3__Impl rule__Card__Group__4 )
            // InternalMyDsl.g:2656:2: rule__Card__Group__3__Impl rule__Card__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Card__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__4();

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
    // $ANTLR end "rule__Card__Group__3"


    // $ANTLR start "rule__Card__Group__3__Impl"
    // InternalMyDsl.g:2663:1: rule__Card__Group__3__Impl : ( ':' ) ;
    public final void rule__Card__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2667:1: ( ( ':' ) )
            // InternalMyDsl.g:2668:1: ( ':' )
            {
            // InternalMyDsl.g:2668:1: ( ':' )
            // InternalMyDsl.g:2669:2: ':'
            {
             before(grammarAccess.getCardAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Card__Group__3__Impl"


    // $ANTLR start "rule__Card__Group__4"
    // InternalMyDsl.g:2678:1: rule__Card__Group__4 : rule__Card__Group__4__Impl rule__Card__Group__5 ;
    public final void rule__Card__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2682:1: ( rule__Card__Group__4__Impl rule__Card__Group__5 )
            // InternalMyDsl.g:2683:2: rule__Card__Group__4__Impl rule__Card__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Card__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__5();

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
    // $ANTLR end "rule__Card__Group__4"


    // $ANTLR start "rule__Card__Group__4__Impl"
    // InternalMyDsl.g:2690:1: rule__Card__Group__4__Impl : ( ( rule__Card__TypeAssignment_4 ) ) ;
    public final void rule__Card__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2694:1: ( ( ( rule__Card__TypeAssignment_4 ) ) )
            // InternalMyDsl.g:2695:1: ( ( rule__Card__TypeAssignment_4 ) )
            {
            // InternalMyDsl.g:2695:1: ( ( rule__Card__TypeAssignment_4 ) )
            // InternalMyDsl.g:2696:2: ( rule__Card__TypeAssignment_4 )
            {
             before(grammarAccess.getCardAccess().getTypeAssignment_4()); 
            // InternalMyDsl.g:2697:2: ( rule__Card__TypeAssignment_4 )
            // InternalMyDsl.g:2697:3: rule__Card__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Card__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Card__Group__4__Impl"


    // $ANTLR start "rule__Card__Group__5"
    // InternalMyDsl.g:2705:1: rule__Card__Group__5 : rule__Card__Group__5__Impl rule__Card__Group__6 ;
    public final void rule__Card__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2709:1: ( rule__Card__Group__5__Impl rule__Card__Group__6 )
            // InternalMyDsl.g:2710:2: rule__Card__Group__5__Impl rule__Card__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Card__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__6();

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
    // $ANTLR end "rule__Card__Group__5"


    // $ANTLR start "rule__Card__Group__5__Impl"
    // InternalMyDsl.g:2717:1: rule__Card__Group__5__Impl : ( 'cardsenior' ) ;
    public final void rule__Card__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2721:1: ( ( 'cardsenior' ) )
            // InternalMyDsl.g:2722:1: ( 'cardsenior' )
            {
            // InternalMyDsl.g:2722:1: ( 'cardsenior' )
            // InternalMyDsl.g:2723:2: 'cardsenior'
            {
             before(grammarAccess.getCardAccess().getCardseniorKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getCardseniorKeyword_5()); 

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
    // $ANTLR end "rule__Card__Group__5__Impl"


    // $ANTLR start "rule__Card__Group__6"
    // InternalMyDsl.g:2732:1: rule__Card__Group__6 : rule__Card__Group__6__Impl rule__Card__Group__7 ;
    public final void rule__Card__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2736:1: ( rule__Card__Group__6__Impl rule__Card__Group__7 )
            // InternalMyDsl.g:2737:2: rule__Card__Group__6__Impl rule__Card__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Card__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__7();

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
    // $ANTLR end "rule__Card__Group__6"


    // $ANTLR start "rule__Card__Group__6__Impl"
    // InternalMyDsl.g:2744:1: rule__Card__Group__6__Impl : ( ':' ) ;
    public final void rule__Card__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( ( ':' ) )
            // InternalMyDsl.g:2749:1: ( ':' )
            {
            // InternalMyDsl.g:2749:1: ( ':' )
            // InternalMyDsl.g:2750:2: ':'
            {
             before(grammarAccess.getCardAccess().getColonKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Card__Group__6__Impl"


    // $ANTLR start "rule__Card__Group__7"
    // InternalMyDsl.g:2759:1: rule__Card__Group__7 : rule__Card__Group__7__Impl rule__Card__Group__8 ;
    public final void rule__Card__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( rule__Card__Group__7__Impl rule__Card__Group__8 )
            // InternalMyDsl.g:2764:2: rule__Card__Group__7__Impl rule__Card__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Card__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__8();

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
    // $ANTLR end "rule__Card__Group__7"


    // $ANTLR start "rule__Card__Group__7__Impl"
    // InternalMyDsl.g:2771:1: rule__Card__Group__7__Impl : ( ( rule__Card__CardseniorAssignment_7 ) ) ;
    public final void rule__Card__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( ( ( rule__Card__CardseniorAssignment_7 ) ) )
            // InternalMyDsl.g:2776:1: ( ( rule__Card__CardseniorAssignment_7 ) )
            {
            // InternalMyDsl.g:2776:1: ( ( rule__Card__CardseniorAssignment_7 ) )
            // InternalMyDsl.g:2777:2: ( rule__Card__CardseniorAssignment_7 )
            {
             before(grammarAccess.getCardAccess().getCardseniorAssignment_7()); 
            // InternalMyDsl.g:2778:2: ( rule__Card__CardseniorAssignment_7 )
            // InternalMyDsl.g:2778:3: rule__Card__CardseniorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Card__CardseniorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getCardseniorAssignment_7()); 

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
    // $ANTLR end "rule__Card__Group__7__Impl"


    // $ANTLR start "rule__Card__Group__8"
    // InternalMyDsl.g:2786:1: rule__Card__Group__8 : rule__Card__Group__8__Impl rule__Card__Group__9 ;
    public final void rule__Card__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2790:1: ( rule__Card__Group__8__Impl rule__Card__Group__9 )
            // InternalMyDsl.g:2791:2: rule__Card__Group__8__Impl rule__Card__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Card__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__9();

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
    // $ANTLR end "rule__Card__Group__8"


    // $ANTLR start "rule__Card__Group__8__Impl"
    // InternalMyDsl.g:2798:1: rule__Card__Group__8__Impl : ( 'rooms' ) ;
    public final void rule__Card__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2802:1: ( ( 'rooms' ) )
            // InternalMyDsl.g:2803:1: ( 'rooms' )
            {
            // InternalMyDsl.g:2803:1: ( 'rooms' )
            // InternalMyDsl.g:2804:2: 'rooms'
            {
             before(grammarAccess.getCardAccess().getRoomsKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getRoomsKeyword_8()); 

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
    // $ANTLR end "rule__Card__Group__8__Impl"


    // $ANTLR start "rule__Card__Group__9"
    // InternalMyDsl.g:2813:1: rule__Card__Group__9 : rule__Card__Group__9__Impl rule__Card__Group__10 ;
    public final void rule__Card__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( rule__Card__Group__9__Impl rule__Card__Group__10 )
            // InternalMyDsl.g:2818:2: rule__Card__Group__9__Impl rule__Card__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Card__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__10();

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
    // $ANTLR end "rule__Card__Group__9"


    // $ANTLR start "rule__Card__Group__9__Impl"
    // InternalMyDsl.g:2825:1: rule__Card__Group__9__Impl : ( '{' ) ;
    public final void rule__Card__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2829:1: ( ( '{' ) )
            // InternalMyDsl.g:2830:1: ( '{' )
            {
            // InternalMyDsl.g:2830:1: ( '{' )
            // InternalMyDsl.g:2831:2: '{'
            {
             before(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Card__Group__9__Impl"


    // $ANTLR start "rule__Card__Group__10"
    // InternalMyDsl.g:2840:1: rule__Card__Group__10 : rule__Card__Group__10__Impl rule__Card__Group__11 ;
    public final void rule__Card__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2844:1: ( rule__Card__Group__10__Impl rule__Card__Group__11 )
            // InternalMyDsl.g:2845:2: rule__Card__Group__10__Impl rule__Card__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Card__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__11();

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
    // $ANTLR end "rule__Card__Group__10"


    // $ANTLR start "rule__Card__Group__10__Impl"
    // InternalMyDsl.g:2852:1: rule__Card__Group__10__Impl : ( ( rule__Card__RoomsAssignment_10 )* ) ;
    public final void rule__Card__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2856:1: ( ( ( rule__Card__RoomsAssignment_10 )* ) )
            // InternalMyDsl.g:2857:1: ( ( rule__Card__RoomsAssignment_10 )* )
            {
            // InternalMyDsl.g:2857:1: ( ( rule__Card__RoomsAssignment_10 )* )
            // InternalMyDsl.g:2858:2: ( rule__Card__RoomsAssignment_10 )*
            {
             before(grammarAccess.getCardAccess().getRoomsAssignment_10()); 
            // InternalMyDsl.g:2859:2: ( rule__Card__RoomsAssignment_10 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2859:3: rule__Card__RoomsAssignment_10
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Card__RoomsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCardAccess().getRoomsAssignment_10()); 

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
    // $ANTLR end "rule__Card__Group__10__Impl"


    // $ANTLR start "rule__Card__Group__11"
    // InternalMyDsl.g:2867:1: rule__Card__Group__11 : rule__Card__Group__11__Impl rule__Card__Group__12 ;
    public final void rule__Card__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2871:1: ( rule__Card__Group__11__Impl rule__Card__Group__12 )
            // InternalMyDsl.g:2872:2: rule__Card__Group__11__Impl rule__Card__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__Card__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group__12();

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
    // $ANTLR end "rule__Card__Group__11"


    // $ANTLR start "rule__Card__Group__11__Impl"
    // InternalMyDsl.g:2879:1: rule__Card__Group__11__Impl : ( '}' ) ;
    public final void rule__Card__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( ( '}' ) )
            // InternalMyDsl.g:2884:1: ( '}' )
            {
            // InternalMyDsl.g:2884:1: ( '}' )
            // InternalMyDsl.g:2885:2: '}'
            {
             before(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Card__Group__11__Impl"


    // $ANTLR start "rule__Card__Group__12"
    // InternalMyDsl.g:2894:1: rule__Card__Group__12 : rule__Card__Group__12__Impl ;
    public final void rule__Card__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2898:1: ( rule__Card__Group__12__Impl )
            // InternalMyDsl.g:2899:2: rule__Card__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group__12__Impl();

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
    // $ANTLR end "rule__Card__Group__12"


    // $ANTLR start "rule__Card__Group__12__Impl"
    // InternalMyDsl.g:2905:1: rule__Card__Group__12__Impl : ( '}' ) ;
    public final void rule__Card__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2909:1: ( ( '}' ) )
            // InternalMyDsl.g:2910:1: ( '}' )
            {
            // InternalMyDsl.g:2910:1: ( '}' )
            // InternalMyDsl.g:2911:2: '}'
            {
             before(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_12()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Card__Group__12__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalMyDsl.g:2921:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2925:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalMyDsl.g:2926:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

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
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalMyDsl.g:2933:1: rule__Room__Group__0__Impl : ( ( rule__Room__NameAssignment_0 ) ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2937:1: ( ( ( rule__Room__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2938:1: ( ( rule__Room__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2938:1: ( ( rule__Room__NameAssignment_0 ) )
            // InternalMyDsl.g:2939:2: ( rule__Room__NameAssignment_0 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2940:2: ( rule__Room__NameAssignment_0 )
            // InternalMyDsl.g:2940:3: rule__Room__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalMyDsl.g:2948:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2952:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalMyDsl.g:2953:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

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
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalMyDsl.g:2960:1: rule__Room__Group__1__Impl : ( '{' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2964:1: ( ( '{' ) )
            // InternalMyDsl.g:2965:1: ( '{' )
            {
            // InternalMyDsl.g:2965:1: ( '{' )
            // InternalMyDsl.g:2966:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalMyDsl.g:2975:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2979:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalMyDsl.g:2980:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

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
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalMyDsl.g:2987:1: rule__Room__Group__2__Impl : ( 'roomsenior' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2991:1: ( ( 'roomsenior' ) )
            // InternalMyDsl.g:2992:1: ( 'roomsenior' )
            {
            // InternalMyDsl.g:2992:1: ( 'roomsenior' )
            // InternalMyDsl.g:2993:2: 'roomsenior'
            {
             before(grammarAccess.getRoomAccess().getRoomseniorKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomseniorKeyword_2()); 

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
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalMyDsl.g:3002:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3006:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalMyDsl.g:3007:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

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
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalMyDsl.g:3014:1: rule__Room__Group__3__Impl : ( ':' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3018:1: ( ( ':' ) )
            // InternalMyDsl.g:3019:1: ( ':' )
            {
            // InternalMyDsl.g:3019:1: ( ':' )
            // InternalMyDsl.g:3020:2: ':'
            {
             before(grammarAccess.getRoomAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalMyDsl.g:3029:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3033:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalMyDsl.g:3034:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

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
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalMyDsl.g:3041:1: rule__Room__Group__4__Impl : ( ( rule__Room__RoomseniorAssignment_4 ) ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( ( ( rule__Room__RoomseniorAssignment_4 ) ) )
            // InternalMyDsl.g:3046:1: ( ( rule__Room__RoomseniorAssignment_4 ) )
            {
            // InternalMyDsl.g:3046:1: ( ( rule__Room__RoomseniorAssignment_4 ) )
            // InternalMyDsl.g:3047:2: ( rule__Room__RoomseniorAssignment_4 )
            {
             before(grammarAccess.getRoomAccess().getRoomseniorAssignment_4()); 
            // InternalMyDsl.g:3048:2: ( rule__Room__RoomseniorAssignment_4 )
            // InternalMyDsl.g:3048:3: rule__Room__RoomseniorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Room__RoomseniorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getRoomseniorAssignment_4()); 

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
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalMyDsl.g:3056:1: rule__Room__Group__5 : rule__Room__Group__5__Impl ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3060:1: ( rule__Room__Group__5__Impl )
            // InternalMyDsl.g:3061:2: rule__Room__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__5__Impl();

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
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalMyDsl.g:3067:1: rule__Room__Group__5__Impl : ( '}' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3071:1: ( ( '}' ) )
            // InternalMyDsl.g:3072:1: ( '}' )
            {
            // InternalMyDsl.g:3072:1: ( '}' )
            // InternalMyDsl.g:3073:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalMyDsl.g:3083:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3087:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalMyDsl.g:3088:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__1();

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
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalMyDsl.g:3095:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3099:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3100:1: ( RULE_ID )
            {
            // InternalMyDsl.g:3100:1: ( RULE_ID )
            // InternalMyDsl.g:3101:2: RULE_ID
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // InternalMyDsl.g:3110:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3114:1: ( rule__Name__Group__1__Impl )
            // InternalMyDsl.g:3115:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__1__Impl();

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
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalMyDsl.g:3121:1: rule__Name__Group__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3125:1: ( ( ( RULE_ID )* ) )
            // InternalMyDsl.g:3126:1: ( ( RULE_ID )* )
            {
            // InternalMyDsl.g:3126:1: ( ( RULE_ID )* )
            // InternalMyDsl.g:3127:2: ( RULE_ID )*
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            // InternalMyDsl.g:3128:2: ( RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:3128:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_7); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Camp__NameAssignment_1"
    // InternalMyDsl.g:3137:1: rule__Camp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Camp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3141:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3142:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3142:2: ( RULE_ID )
            // InternalMyDsl.g:3143:3: RULE_ID
            {
             before(grammarAccess.getCampAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCampAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Camp__NameAssignment_1"


    // $ANTLR start "rule__Camp__ColorseniorsAssignment_4"
    // InternalMyDsl.g:3152:1: rule__Camp__ColorseniorsAssignment_4 : ( ruleColorSenior ) ;
    public final void rule__Camp__ColorseniorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3156:1: ( ( ruleColorSenior ) )
            // InternalMyDsl.g:3157:2: ( ruleColorSenior )
            {
            // InternalMyDsl.g:3157:2: ( ruleColorSenior )
            // InternalMyDsl.g:3158:3: ruleColorSenior
            {
             before(grammarAccess.getCampAccess().getColorseniorsColorSeniorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColorSenior();

            state._fsp--;

             after(grammarAccess.getCampAccess().getColorseniorsColorSeniorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Camp__ColorseniorsAssignment_4"


    // $ANTLR start "rule__Camp__CardseniorsAssignment_8"
    // InternalMyDsl.g:3167:1: rule__Camp__CardseniorsAssignment_8 : ( ruleCardSenior ) ;
    public final void rule__Camp__CardseniorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3171:1: ( ( ruleCardSenior ) )
            // InternalMyDsl.g:3172:2: ( ruleCardSenior )
            {
            // InternalMyDsl.g:3172:2: ( ruleCardSenior )
            // InternalMyDsl.g:3173:3: ruleCardSenior
            {
             before(grammarAccess.getCampAccess().getCardseniorsCardSeniorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCardSenior();

            state._fsp--;

             after(grammarAccess.getCampAccess().getCardseniorsCardSeniorParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Camp__CardseniorsAssignment_8"


    // $ANTLR start "rule__Camp__RoomseniorsAssignment_12"
    // InternalMyDsl.g:3182:1: rule__Camp__RoomseniorsAssignment_12 : ( ruleRoomSenior ) ;
    public final void rule__Camp__RoomseniorsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3186:1: ( ( ruleRoomSenior ) )
            // InternalMyDsl.g:3187:2: ( ruleRoomSenior )
            {
            // InternalMyDsl.g:3187:2: ( ruleRoomSenior )
            // InternalMyDsl.g:3188:3: ruleRoomSenior
            {
             before(grammarAccess.getCampAccess().getRoomseniorsRoomSeniorParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleRoomSenior();

            state._fsp--;

             after(grammarAccess.getCampAccess().getRoomseniorsRoomSeniorParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Camp__RoomseniorsAssignment_12"


    // $ANTLR start "rule__Camp__ColorsAssignment_16"
    // InternalMyDsl.g:3197:1: rule__Camp__ColorsAssignment_16 : ( ruleColor ) ;
    public final void rule__Camp__ColorsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3201:1: ( ( ruleColor ) )
            // InternalMyDsl.g:3202:2: ( ruleColor )
            {
            // InternalMyDsl.g:3202:2: ( ruleColor )
            // InternalMyDsl.g:3203:3: ruleColor
            {
             before(grammarAccess.getCampAccess().getColorsColorParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getCampAccess().getColorsColorParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__Camp__ColorsAssignment_16"


    // $ANTLR start "rule__ColorSenior__NameAssignment_0"
    // InternalMyDsl.g:3212:1: rule__ColorSenior__NameAssignment_0 : ( ruleName ) ;
    public final void rule__ColorSenior__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3216:1: ( ( ruleName ) )
            // InternalMyDsl.g:3217:2: ( ruleName )
            {
            // InternalMyDsl.g:3217:2: ( ruleName )
            // InternalMyDsl.g:3218:3: ruleName
            {
             before(grammarAccess.getColorSeniorAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getColorSeniorAccess().getNameNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ColorSenior__NameAssignment_0"


    // $ANTLR start "rule__ColorSenior__YearAssignment_4"
    // InternalMyDsl.g:3227:1: rule__ColorSenior__YearAssignment_4 : ( RULE_INT ) ;
    public final void rule__ColorSenior__YearAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3231:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3232:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3232:2: ( RULE_INT )
            // InternalMyDsl.g:3233:3: RULE_INT
            {
             before(grammarAccess.getColorSeniorAccess().getYearINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColorSeniorAccess().getYearINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ColorSenior__YearAssignment_4"


    // $ANTLR start "rule__ColorSenior__ColorAssignment_7"
    // InternalMyDsl.g:3242:1: rule__ColorSenior__ColorAssignment_7 : ( ruleColorType ) ;
    public final void rule__ColorSenior__ColorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3246:1: ( ( ruleColorType ) )
            // InternalMyDsl.g:3247:2: ( ruleColorType )
            {
            // InternalMyDsl.g:3247:2: ( ruleColorType )
            // InternalMyDsl.g:3248:3: ruleColorType
            {
             before(grammarAccess.getColorSeniorAccess().getColorColorTypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleColorType();

            state._fsp--;

             after(grammarAccess.getColorSeniorAccess().getColorColorTypeEnumRuleCall_7_0()); 

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
    // $ANTLR end "rule__ColorSenior__ColorAssignment_7"


    // $ANTLR start "rule__ColorSenior__InferiorsAssignment_10"
    // InternalMyDsl.g:3257:1: rule__ColorSenior__InferiorsAssignment_10 : ( ( ruleName ) ) ;
    public final void rule__ColorSenior__InferiorsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3261:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3262:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3262:2: ( ( ruleName ) )
            // InternalMyDsl.g:3263:3: ( ruleName )
            {
             before(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorCrossReference_10_0()); 
            // InternalMyDsl.g:3264:3: ( ruleName )
            // InternalMyDsl.g:3265:4: ruleName
            {
             before(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorNameParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorNameParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorCrossReference_10_0()); 

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
    // $ANTLR end "rule__ColorSenior__InferiorsAssignment_10"


    // $ANTLR start "rule__ColorSenior__InferiorsAssignment_11_1"
    // InternalMyDsl.g:3276:1: rule__ColorSenior__InferiorsAssignment_11_1 : ( ( ruleName ) ) ;
    public final void rule__ColorSenior__InferiorsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3280:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3281:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3281:2: ( ( ruleName ) )
            // InternalMyDsl.g:3282:3: ( ruleName )
            {
             before(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorCrossReference_11_1_0()); 
            // InternalMyDsl.g:3283:3: ( ruleName )
            // InternalMyDsl.g:3284:4: ruleName
            {
             before(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorNameParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorNameParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorCrossReference_11_1_0()); 

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
    // $ANTLR end "rule__ColorSenior__InferiorsAssignment_11_1"


    // $ANTLR start "rule__CardSenior__NameAssignment_0"
    // InternalMyDsl.g:3295:1: rule__CardSenior__NameAssignment_0 : ( ruleName ) ;
    public final void rule__CardSenior__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3299:1: ( ( ruleName ) )
            // InternalMyDsl.g:3300:2: ( ruleName )
            {
            // InternalMyDsl.g:3300:2: ( ruleName )
            // InternalMyDsl.g:3301:3: ruleName
            {
             before(grammarAccess.getCardSeniorAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getCardSeniorAccess().getNameNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__CardSenior__NameAssignment_0"


    // $ANTLR start "rule__CardSenior__YearAssignment_4"
    // InternalMyDsl.g:3310:1: rule__CardSenior__YearAssignment_4 : ( RULE_INT ) ;
    public final void rule__CardSenior__YearAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3314:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3315:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3315:2: ( RULE_INT )
            // InternalMyDsl.g:3316:3: RULE_INT
            {
             before(grammarAccess.getCardSeniorAccess().getYearINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCardSeniorAccess().getYearINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__CardSenior__YearAssignment_4"


    // $ANTLR start "rule__CardSenior__ColorAssignment_7"
    // InternalMyDsl.g:3325:1: rule__CardSenior__ColorAssignment_7 : ( ruleColorType ) ;
    public final void rule__CardSenior__ColorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3329:1: ( ( ruleColorType ) )
            // InternalMyDsl.g:3330:2: ( ruleColorType )
            {
            // InternalMyDsl.g:3330:2: ( ruleColorType )
            // InternalMyDsl.g:3331:3: ruleColorType
            {
             before(grammarAccess.getCardSeniorAccess().getColorColorTypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleColorType();

            state._fsp--;

             after(grammarAccess.getCardSeniorAccess().getColorColorTypeEnumRuleCall_7_0()); 

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
    // $ANTLR end "rule__CardSenior__ColorAssignment_7"


    // $ANTLR start "rule__CardSenior__CardAssignment_10"
    // InternalMyDsl.g:3340:1: rule__CardSenior__CardAssignment_10 : ( ruleCardType ) ;
    public final void rule__CardSenior__CardAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( ( ruleCardType ) )
            // InternalMyDsl.g:3345:2: ( ruleCardType )
            {
            // InternalMyDsl.g:3345:2: ( ruleCardType )
            // InternalMyDsl.g:3346:3: ruleCardType
            {
             before(grammarAccess.getCardSeniorAccess().getCardCardTypeEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleCardType();

            state._fsp--;

             after(grammarAccess.getCardSeniorAccess().getCardCardTypeEnumRuleCall_10_0()); 

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
    // $ANTLR end "rule__CardSenior__CardAssignment_10"


    // $ANTLR start "rule__CardSenior__SuperiorAssignment_13"
    // InternalMyDsl.g:3355:1: rule__CardSenior__SuperiorAssignment_13 : ( ( ruleName ) ) ;
    public final void rule__CardSenior__SuperiorAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3359:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3360:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3360:2: ( ( ruleName ) )
            // InternalMyDsl.g:3361:3: ( ruleName )
            {
             before(grammarAccess.getCardSeniorAccess().getSuperiorColorSeniorCrossReference_13_0()); 
            // InternalMyDsl.g:3362:3: ( ruleName )
            // InternalMyDsl.g:3363:4: ruleName
            {
             before(grammarAccess.getCardSeniorAccess().getSuperiorColorSeniorNameParserRuleCall_13_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getCardSeniorAccess().getSuperiorColorSeniorNameParserRuleCall_13_0_1()); 

            }

             after(grammarAccess.getCardSeniorAccess().getSuperiorColorSeniorCrossReference_13_0()); 

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
    // $ANTLR end "rule__CardSenior__SuperiorAssignment_13"


    // $ANTLR start "rule__CardSenior__InferiorsAssignment_16"
    // InternalMyDsl.g:3374:1: rule__CardSenior__InferiorsAssignment_16 : ( ( ruleName ) ) ;
    public final void rule__CardSenior__InferiorsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3378:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3379:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3379:2: ( ( ruleName ) )
            // InternalMyDsl.g:3380:3: ( ruleName )
            {
             before(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorCrossReference_16_0()); 
            // InternalMyDsl.g:3381:3: ( ruleName )
            // InternalMyDsl.g:3382:4: ruleName
            {
             before(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorNameParserRuleCall_16_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorNameParserRuleCall_16_0_1()); 

            }

             after(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorCrossReference_16_0()); 

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
    // $ANTLR end "rule__CardSenior__InferiorsAssignment_16"


    // $ANTLR start "rule__CardSenior__InferiorsAssignment_17_1"
    // InternalMyDsl.g:3393:1: rule__CardSenior__InferiorsAssignment_17_1 : ( ( ruleName ) ) ;
    public final void rule__CardSenior__InferiorsAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3397:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3398:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3398:2: ( ( ruleName ) )
            // InternalMyDsl.g:3399:3: ( ruleName )
            {
             before(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorCrossReference_17_1_0()); 
            // InternalMyDsl.g:3400:3: ( ruleName )
            // InternalMyDsl.g:3401:4: ruleName
            {
             before(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorNameParserRuleCall_17_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorNameParserRuleCall_17_1_0_1()); 

            }

             after(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorCrossReference_17_1_0()); 

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
    // $ANTLR end "rule__CardSenior__InferiorsAssignment_17_1"


    // $ANTLR start "rule__RoomSenior__NameAssignment_0"
    // InternalMyDsl.g:3412:1: rule__RoomSenior__NameAssignment_0 : ( ruleName ) ;
    public final void rule__RoomSenior__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3416:1: ( ( ruleName ) )
            // InternalMyDsl.g:3417:2: ( ruleName )
            {
            // InternalMyDsl.g:3417:2: ( ruleName )
            // InternalMyDsl.g:3418:3: ruleName
            {
             before(grammarAccess.getRoomSeniorAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getRoomSeniorAccess().getNameNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RoomSenior__NameAssignment_0"


    // $ANTLR start "rule__RoomSenior__YearAssignment_4"
    // InternalMyDsl.g:3427:1: rule__RoomSenior__YearAssignment_4 : ( RULE_INT ) ;
    public final void rule__RoomSenior__YearAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3431:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3432:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3432:2: ( RULE_INT )
            // InternalMyDsl.g:3433:3: RULE_INT
            {
             before(grammarAccess.getRoomSeniorAccess().getYearINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRoomSeniorAccess().getYearINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RoomSenior__YearAssignment_4"


    // $ANTLR start "rule__RoomSenior__ColorAssignment_7"
    // InternalMyDsl.g:3442:1: rule__RoomSenior__ColorAssignment_7 : ( ruleColorType ) ;
    public final void rule__RoomSenior__ColorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3446:1: ( ( ruleColorType ) )
            // InternalMyDsl.g:3447:2: ( ruleColorType )
            {
            // InternalMyDsl.g:3447:2: ( ruleColorType )
            // InternalMyDsl.g:3448:3: ruleColorType
            {
             before(grammarAccess.getRoomSeniorAccess().getColorColorTypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleColorType();

            state._fsp--;

             after(grammarAccess.getRoomSeniorAccess().getColorColorTypeEnumRuleCall_7_0()); 

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
    // $ANTLR end "rule__RoomSenior__ColorAssignment_7"


    // $ANTLR start "rule__RoomSenior__CardAssignment_10"
    // InternalMyDsl.g:3457:1: rule__RoomSenior__CardAssignment_10 : ( ruleCardType ) ;
    public final void rule__RoomSenior__CardAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3461:1: ( ( ruleCardType ) )
            // InternalMyDsl.g:3462:2: ( ruleCardType )
            {
            // InternalMyDsl.g:3462:2: ( ruleCardType )
            // InternalMyDsl.g:3463:3: ruleCardType
            {
             before(grammarAccess.getRoomSeniorAccess().getCardCardTypeEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleCardType();

            state._fsp--;

             after(grammarAccess.getRoomSeniorAccess().getCardCardTypeEnumRuleCall_10_0()); 

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
    // $ANTLR end "rule__RoomSenior__CardAssignment_10"


    // $ANTLR start "rule__RoomSenior__SuperiorAssignment_13"
    // InternalMyDsl.g:3472:1: rule__RoomSenior__SuperiorAssignment_13 : ( ( ruleName ) ) ;
    public final void rule__RoomSenior__SuperiorAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3476:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3477:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3477:2: ( ( ruleName ) )
            // InternalMyDsl.g:3478:3: ( ruleName )
            {
             before(grammarAccess.getRoomSeniorAccess().getSuperiorCardSeniorCrossReference_13_0()); 
            // InternalMyDsl.g:3479:3: ( ruleName )
            // InternalMyDsl.g:3480:4: ruleName
            {
             before(grammarAccess.getRoomSeniorAccess().getSuperiorCardSeniorNameParserRuleCall_13_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getRoomSeniorAccess().getSuperiorCardSeniorNameParserRuleCall_13_0_1()); 

            }

             after(grammarAccess.getRoomSeniorAccess().getSuperiorCardSeniorCrossReference_13_0()); 

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
    // $ANTLR end "rule__RoomSenior__SuperiorAssignment_13"


    // $ANTLR start "rule__Color__NameAssignment_0"
    // InternalMyDsl.g:3491:1: rule__Color__NameAssignment_0 : ( ruleName ) ;
    public final void rule__Color__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3495:1: ( ( ruleName ) )
            // InternalMyDsl.g:3496:2: ( ruleName )
            {
            // InternalMyDsl.g:3496:2: ( ruleName )
            // InternalMyDsl.g:3497:3: ruleName
            {
             before(grammarAccess.getColorAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getColorAccess().getNameNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Color__NameAssignment_0"


    // $ANTLR start "rule__Color__TypeAssignment_4"
    // InternalMyDsl.g:3506:1: rule__Color__TypeAssignment_4 : ( ruleColorType ) ;
    public final void rule__Color__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3510:1: ( ( ruleColorType ) )
            // InternalMyDsl.g:3511:2: ( ruleColorType )
            {
            // InternalMyDsl.g:3511:2: ( ruleColorType )
            // InternalMyDsl.g:3512:3: ruleColorType
            {
             before(grammarAccess.getColorAccess().getTypeColorTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColorType();

            state._fsp--;

             after(grammarAccess.getColorAccess().getTypeColorTypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Color__TypeAssignment_4"


    // $ANTLR start "rule__Color__ColorseniorAssignment_7"
    // InternalMyDsl.g:3521:1: rule__Color__ColorseniorAssignment_7 : ( ( ruleName ) ) ;
    public final void rule__Color__ColorseniorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3525:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3526:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3526:2: ( ( ruleName ) )
            // InternalMyDsl.g:3527:3: ( ruleName )
            {
             before(grammarAccess.getColorAccess().getColorseniorColorSeniorCrossReference_7_0()); 
            // InternalMyDsl.g:3528:3: ( ruleName )
            // InternalMyDsl.g:3529:4: ruleName
            {
             before(grammarAccess.getColorAccess().getColorseniorColorSeniorNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getColorAccess().getColorseniorColorSeniorNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getColorAccess().getColorseniorColorSeniorCrossReference_7_0()); 

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
    // $ANTLR end "rule__Color__ColorseniorAssignment_7"


    // $ANTLR start "rule__Color__CardsAssignment_10"
    // InternalMyDsl.g:3540:1: rule__Color__CardsAssignment_10 : ( ruleCard ) ;
    public final void rule__Color__CardsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3544:1: ( ( ruleCard ) )
            // InternalMyDsl.g:3545:2: ( ruleCard )
            {
            // InternalMyDsl.g:3545:2: ( ruleCard )
            // InternalMyDsl.g:3546:3: ruleCard
            {
             before(grammarAccess.getColorAccess().getCardsCardParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getColorAccess().getCardsCardParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Color__CardsAssignment_10"


    // $ANTLR start "rule__Card__NameAssignment_0"
    // InternalMyDsl.g:3555:1: rule__Card__NameAssignment_0 : ( ruleName ) ;
    public final void rule__Card__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( ( ruleName ) )
            // InternalMyDsl.g:3560:2: ( ruleName )
            {
            // InternalMyDsl.g:3560:2: ( ruleName )
            // InternalMyDsl.g:3561:3: ruleName
            {
             before(grammarAccess.getCardAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getCardAccess().getNameNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Card__NameAssignment_0"


    // $ANTLR start "rule__Card__TypeAssignment_4"
    // InternalMyDsl.g:3570:1: rule__Card__TypeAssignment_4 : ( ruleCardType ) ;
    public final void rule__Card__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3574:1: ( ( ruleCardType ) )
            // InternalMyDsl.g:3575:2: ( ruleCardType )
            {
            // InternalMyDsl.g:3575:2: ( ruleCardType )
            // InternalMyDsl.g:3576:3: ruleCardType
            {
             before(grammarAccess.getCardAccess().getTypeCardTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCardType();

            state._fsp--;

             after(grammarAccess.getCardAccess().getTypeCardTypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Card__TypeAssignment_4"


    // $ANTLR start "rule__Card__CardseniorAssignment_7"
    // InternalMyDsl.g:3585:1: rule__Card__CardseniorAssignment_7 : ( ( ruleName ) ) ;
    public final void rule__Card__CardseniorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3590:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3590:2: ( ( ruleName ) )
            // InternalMyDsl.g:3591:3: ( ruleName )
            {
             before(grammarAccess.getCardAccess().getCardseniorCardSeniorCrossReference_7_0()); 
            // InternalMyDsl.g:3592:3: ( ruleName )
            // InternalMyDsl.g:3593:4: ruleName
            {
             before(grammarAccess.getCardAccess().getCardseniorCardSeniorNameParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getCardAccess().getCardseniorCardSeniorNameParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getCardAccess().getCardseniorCardSeniorCrossReference_7_0()); 

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
    // $ANTLR end "rule__Card__CardseniorAssignment_7"


    // $ANTLR start "rule__Card__RoomsAssignment_10"
    // InternalMyDsl.g:3604:1: rule__Card__RoomsAssignment_10 : ( ruleRoom ) ;
    public final void rule__Card__RoomsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3608:1: ( ( ruleRoom ) )
            // InternalMyDsl.g:3609:2: ( ruleRoom )
            {
            // InternalMyDsl.g:3609:2: ( ruleRoom )
            // InternalMyDsl.g:3610:3: ruleRoom
            {
             before(grammarAccess.getCardAccess().getRoomsRoomParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getCardAccess().getRoomsRoomParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Card__RoomsAssignment_10"


    // $ANTLR start "rule__Room__NameAssignment_0"
    // InternalMyDsl.g:3619:1: rule__Room__NameAssignment_0 : ( ruleName ) ;
    public final void rule__Room__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3623:1: ( ( ruleName ) )
            // InternalMyDsl.g:3624:2: ( ruleName )
            {
            // InternalMyDsl.g:3624:2: ( ruleName )
            // InternalMyDsl.g:3625:3: ruleName
            {
             before(grammarAccess.getRoomAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getNameNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Room__NameAssignment_0"


    // $ANTLR start "rule__Room__RoomseniorAssignment_4"
    // InternalMyDsl.g:3634:1: rule__Room__RoomseniorAssignment_4 : ( ( ruleName ) ) ;
    public final void rule__Room__RoomseniorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3638:1: ( ( ( ruleName ) ) )
            // InternalMyDsl.g:3639:2: ( ( ruleName ) )
            {
            // InternalMyDsl.g:3639:2: ( ( ruleName ) )
            // InternalMyDsl.g:3640:3: ( ruleName )
            {
             before(grammarAccess.getRoomAccess().getRoomseniorRoomSeniorCrossReference_4_0()); 
            // InternalMyDsl.g:3641:3: ( ruleName )
            // InternalMyDsl.g:3642:4: ruleName
            {
             before(grammarAccess.getRoomAccess().getRoomseniorRoomSeniorNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getRoomseniorRoomSeniorNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRoomAccess().getRoomseniorRoomSeniorCrossReference_4_0()); 

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
    // $ANTLR end "rule__Room__RoomseniorAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});

}