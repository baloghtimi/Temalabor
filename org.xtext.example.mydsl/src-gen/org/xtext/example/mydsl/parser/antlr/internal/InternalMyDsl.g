/*
 * generated by Xtext 2.10.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCamp
entryRuleCamp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCampRule()); }
	iv_ruleCamp=ruleCamp
	{ $current=$iv_ruleCamp.current; }
	EOF;

// Rule Camp
ruleCamp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='camp'
		{
			newLeafNode(otherlv_0, grammarAccess.getCampAccess().getCampKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCampAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCampRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='colorseniors'
		{
			newLeafNode(otherlv_2, grammarAccess.getCampAccess().getColorseniorsKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCampAccess().getColorseniorsColorSeniorParserRuleCall_4_0());
				}
				lv_colorseniors_4_0=ruleColorSenior
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCampRule());
					}
					add(
						$current,
						"colorseniors",
						lv_colorseniors_4_0,
						"org.xtext.example.mydsl.MyDsl.ColorSenior");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getCampAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_6='cardseniors'
		{
			newLeafNode(otherlv_6, grammarAccess.getCampAccess().getCardseniorsKeyword_6());
		}
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCampAccess().getCardseniorsCardSeniorParserRuleCall_8_0());
				}
				lv_cardseniors_8_0=ruleCardSenior
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCampRule());
					}
					add(
						$current,
						"cardseniors",
						lv_cardseniors_8_0,
						"org.xtext.example.mydsl.MyDsl.CardSenior");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getCampAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_10='roomseniors'
		{
			newLeafNode(otherlv_10, grammarAccess.getCampAccess().getRoomseniorsKeyword_10());
		}
		otherlv_11='{'
		{
			newLeafNode(otherlv_11, grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCampAccess().getRoomseniorsRoomSeniorParserRuleCall_12_0());
				}
				lv_roomseniors_12_0=ruleRoomSenior
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCampRule());
					}
					add(
						$current,
						"roomseniors",
						lv_roomseniors_12_0,
						"org.xtext.example.mydsl.MyDsl.RoomSenior");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getCampAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_14='colors'
		{
			newLeafNode(otherlv_14, grammarAccess.getCampAccess().getColorsKeyword_14());
		}
		otherlv_15='{'
		{
			newLeafNode(otherlv_15, grammarAccess.getCampAccess().getLeftCurlyBracketKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCampAccess().getColorsColorParserRuleCall_16_0());
				}
				lv_colors_16_0=ruleColor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCampRule());
					}
					add(
						$current,
						"colors",
						lv_colors_16_0,
						"org.xtext.example.mydsl.MyDsl.Color");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getCampAccess().getRightCurlyBracketKeyword_17());
		}
	)
;

// Entry rule entryRuleColorSenior
entryRuleColorSenior returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorSeniorRule()); }
	iv_ruleColorSenior=ruleColorSenior
	{ $current=$iv_ruleColorSenior.current; }
	EOF;

// Rule ColorSenior
ruleColorSenior returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getColorSeniorAccess().getNameNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColorSeniorRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.example.mydsl.MyDsl.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getColorSeniorAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='year'
		{
			newLeafNode(otherlv_2, grammarAccess.getColorSeniorAccess().getYearKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getColorSeniorAccess().getColonKeyword_3());
		}
		(
			(
				lv_year_4_0=RULE_INT
				{
					newLeafNode(lv_year_4_0, grammarAccess.getColorSeniorAccess().getYearINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColorSeniorRule());
					}
					setWithLastConsumed(
						$current,
						"year",
						lv_year_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='color'
		{
			newLeafNode(otherlv_5, grammarAccess.getColorSeniorAccess().getColorKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getColorSeniorAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getColorSeniorAccess().getColorColorTypeEnumRuleCall_7_0());
				}
				lv_color_7_0=ruleColorType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColorSeniorRule());
					}
					set(
						$current,
						"color",
						lv_color_7_0,
						"org.xtext.example.mydsl.MyDsl.ColorType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='inferiors'
		{
			newLeafNode(otherlv_8, grammarAccess.getColorSeniorAccess().getInferiorsKeyword_8());
		}
		otherlv_9=':'
		{
			newLeafNode(otherlv_9, grammarAccess.getColorSeniorAccess().getColonKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColorSeniorRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorCrossReference_10_0());
				}
				ruleName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getColorSeniorAccess().getCommaKeyword_11_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColorSeniorRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getColorSeniorAccess().getInferiorsCardSeniorCrossReference_11_1_0());
					}
					ruleName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getColorSeniorAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleCardSenior
entryRuleCardSenior returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCardSeniorRule()); }
	iv_ruleCardSenior=ruleCardSenior
	{ $current=$iv_ruleCardSenior.current; }
	EOF;

// Rule CardSenior
ruleCardSenior returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCardSeniorAccess().getNameNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardSeniorRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.example.mydsl.MyDsl.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getCardSeniorAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='year'
		{
			newLeafNode(otherlv_2, grammarAccess.getCardSeniorAccess().getYearKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getCardSeniorAccess().getColonKeyword_3());
		}
		(
			(
				lv_year_4_0=RULE_INT
				{
					newLeafNode(lv_year_4_0, grammarAccess.getCardSeniorAccess().getYearINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardSeniorRule());
					}
					setWithLastConsumed(
						$current,
						"year",
						lv_year_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='color'
		{
			newLeafNode(otherlv_5, grammarAccess.getCardSeniorAccess().getColorKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getCardSeniorAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardSeniorAccess().getColorColorTypeEnumRuleCall_7_0());
				}
				lv_color_7_0=ruleColorType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardSeniorRule());
					}
					set(
						$current,
						"color",
						lv_color_7_0,
						"org.xtext.example.mydsl.MyDsl.ColorType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='card'
		{
			newLeafNode(otherlv_8, grammarAccess.getCardSeniorAccess().getCardKeyword_8());
		}
		otherlv_9=':'
		{
			newLeafNode(otherlv_9, grammarAccess.getCardSeniorAccess().getColonKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardSeniorAccess().getCardCardTypeEnumRuleCall_10_0());
				}
				lv_card_10_0=ruleCardType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardSeniorRule());
					}
					set(
						$current,
						"card",
						lv_card_10_0,
						"org.xtext.example.mydsl.MyDsl.CardType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='superior'
		{
			newLeafNode(otherlv_11, grammarAccess.getCardSeniorAccess().getSuperiorKeyword_11());
		}
		otherlv_12=':'
		{
			newLeafNode(otherlv_12, grammarAccess.getCardSeniorAccess().getColonKeyword_12());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardSeniorRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCardSeniorAccess().getSuperiorColorSeniorCrossReference_13_0());
				}
				ruleName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='inferiors'
		{
			newLeafNode(otherlv_14, grammarAccess.getCardSeniorAccess().getInferiorsKeyword_14());
		}
		otherlv_15=':'
		{
			newLeafNode(otherlv_15, grammarAccess.getCardSeniorAccess().getColonKeyword_15());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardSeniorRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorCrossReference_16_0());
				}
				ruleName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_17=','
			{
				newLeafNode(otherlv_17, grammarAccess.getCardSeniorAccess().getCommaKeyword_17_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCardSeniorRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getCardSeniorAccess().getInferiorsRoomSeniorCrossReference_17_1_0());
					}
					ruleName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_19='}'
		{
			newLeafNode(otherlv_19, grammarAccess.getCardSeniorAccess().getRightCurlyBracketKeyword_18());
		}
	)
;

// Entry rule entryRuleRoomSenior
entryRuleRoomSenior returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoomSeniorRule()); }
	iv_ruleRoomSenior=ruleRoomSenior
	{ $current=$iv_ruleRoomSenior.current; }
	EOF;

// Rule RoomSenior
ruleRoomSenior returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRoomSeniorAccess().getNameNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoomSeniorRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.example.mydsl.MyDsl.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getRoomSeniorAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='year'
		{
			newLeafNode(otherlv_2, grammarAccess.getRoomSeniorAccess().getYearKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getRoomSeniorAccess().getColonKeyword_3());
		}
		(
			(
				lv_year_4_0=RULE_INT
				{
					newLeafNode(lv_year_4_0, grammarAccess.getRoomSeniorAccess().getYearINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRoomSeniorRule());
					}
					setWithLastConsumed(
						$current,
						"year",
						lv_year_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='color'
		{
			newLeafNode(otherlv_5, grammarAccess.getRoomSeniorAccess().getColorKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getRoomSeniorAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRoomSeniorAccess().getColorColorTypeEnumRuleCall_7_0());
				}
				lv_color_7_0=ruleColorType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoomSeniorRule());
					}
					set(
						$current,
						"color",
						lv_color_7_0,
						"org.xtext.example.mydsl.MyDsl.ColorType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='card'
		{
			newLeafNode(otherlv_8, grammarAccess.getRoomSeniorAccess().getCardKeyword_8());
		}
		otherlv_9=':'
		{
			newLeafNode(otherlv_9, grammarAccess.getRoomSeniorAccess().getColonKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRoomSeniorAccess().getCardCardTypeEnumRuleCall_10_0());
				}
				lv_card_10_0=ruleCardType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoomSeniorRule());
					}
					set(
						$current,
						"card",
						lv_card_10_0,
						"org.xtext.example.mydsl.MyDsl.CardType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='superior'
		{
			newLeafNode(otherlv_11, grammarAccess.getRoomSeniorAccess().getSuperiorKeyword_11());
		}
		otherlv_12=':'
		{
			newLeafNode(otherlv_12, grammarAccess.getRoomSeniorAccess().getColonKeyword_12());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRoomSeniorRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRoomSeniorAccess().getSuperiorCardSeniorCrossReference_13_0());
				}
				ruleName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getRoomSeniorAccess().getRightCurlyBracketKeyword_14());
		}
	)
;

// Entry rule entryRuleColor
entryRuleColor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorRule()); }
	iv_ruleColor=ruleColor
	{ $current=$iv_ruleColor.current; }
	EOF;

// Rule Color
ruleColor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getColorAccess().getNameNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColorRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.example.mydsl.MyDsl.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getTypeKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getColorAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getColorAccess().getTypeColorTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleColorType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColorRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"org.xtext.example.mydsl.MyDsl.ColorType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='colorsenior'
		{
			newLeafNode(otherlv_5, grammarAccess.getColorAccess().getColorseniorKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getColorAccess().getColonKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColorRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getColorAccess().getColorseniorColorSeniorCrossReference_7_0());
				}
				ruleName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='cards'
		{
			newLeafNode(otherlv_8, grammarAccess.getColorAccess().getCardsKeyword_8());
		}
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getColorAccess().getCardsCardParserRuleCall_10_0());
				}
				lv_cards_10_0=ruleCard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColorRule());
					}
					add(
						$current,
						"cards",
						lv_cards_10_0,
						"org.xtext.example.mydsl.MyDsl.Card");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getColorAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getColorAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleCard
entryRuleCard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCardRule()); }
	iv_ruleCard=ruleCard
	{ $current=$iv_ruleCard.current; }
	EOF;

// Rule Card
ruleCard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCardAccess().getNameNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.example.mydsl.MyDsl.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getCardAccess().getTypeKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getCardAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardAccess().getTypeCardTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleCardType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"org.xtext.example.mydsl.MyDsl.CardType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='cardsenior'
		{
			newLeafNode(otherlv_5, grammarAccess.getCardAccess().getCardseniorKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getCardAccess().getColonKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCardAccess().getCardseniorCardSeniorCrossReference_7_0());
				}
				ruleName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='rooms'
		{
			newLeafNode(otherlv_8, grammarAccess.getCardAccess().getRoomsKeyword_8());
		}
		otherlv_9='{'
		{
			newLeafNode(otherlv_9, grammarAccess.getCardAccess().getLeftCurlyBracketKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardAccess().getRoomsRoomParserRuleCall_10_0());
				}
				lv_rooms_10_0=ruleRoom
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardRule());
					}
					add(
						$current,
						"rooms",
						lv_rooms_10_0,
						"org.xtext.example.mydsl.MyDsl.Room");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getCardAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleRoom
entryRuleRoom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoomRule()); }
	iv_ruleRoom=ruleRoom
	{ $current=$iv_ruleRoom.current; }
	EOF;

// Rule Room
ruleRoom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRoomAccess().getNameNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoomRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.xtext.example.mydsl.MyDsl.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='roomsenior'
		{
			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getRoomseniorKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getColonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRoomRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRoomAccess().getRoomseniorRoomSeniorCrossReference_4_0());
				}
				ruleName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleName
entryRuleName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNameRule()); }
	iv_ruleName=ruleName
	{ $current=$iv_ruleName.current.getText(); }
	EOF;

// Rule Name
ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
		}
		(
			this_ID_1=RULE_ID
			{
				$current.merge(this_ID_1);
			}
			{
				newLeafNode(this_ID_1, grammarAccess.getNameAccess().getIDTerminalRuleCall_1());
			}
		)*
	)
;

// Rule ColorType
ruleColorType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BlackColor'
			{
				$current = grammarAccess.getColorTypeAccess().getBlackColorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getColorTypeAccess().getBlackColorEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='BlueColor'
			{
				$current = grammarAccess.getColorTypeAccess().getBlueColorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getColorTypeAccess().getBlueColorEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='RedColor'
			{
				$current = grammarAccess.getColorTypeAccess().getRedColorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getColorTypeAccess().getRedColorEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='WhiteColor'
			{
				$current = grammarAccess.getColorTypeAccess().getWhiteColorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getColorTypeAccess().getWhiteColorEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='YellowColor'
			{
				$current = grammarAccess.getColorTypeAccess().getYellowColorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getColorTypeAccess().getYellowColorEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule CardType
ruleCardType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BlueCard'
			{
				$current = grammarAccess.getCardTypeAccess().getBlueColorEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCardTypeAccess().getBlueColorEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='GreenCard'
			{
				$current = grammarAccess.getCardTypeAccess().getGreenColorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCardTypeAccess().getGreenColorEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='OrangeCard'
			{
				$current = grammarAccess.getCardTypeAccess().getOrangeColorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getCardTypeAccess().getOrangeColorEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='YellowCard'
			{
				$current = grammarAccess.getCardTypeAccess().getYellowColorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getCardTypeAccess().getYellowColorEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
