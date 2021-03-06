/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getColorTypeAccess().getAlternatives(), "rule__ColorType__Alternatives");
					put(grammarAccess.getCardTypeAccess().getAlternatives(), "rule__CardType__Alternatives");
					put(grammarAccess.getCampAccess().getGroup(), "rule__Camp__Group__0");
					put(grammarAccess.getFreshmanAccess().getGroup(), "rule__Freshman__Group__0");
					put(grammarAccess.getColorSeniorAccess().getGroup(), "rule__ColorSenior__Group__0");
					put(grammarAccess.getColorSeniorAccess().getGroup_11(), "rule__ColorSenior__Group_11__0");
					put(grammarAccess.getCardSeniorAccess().getGroup(), "rule__CardSenior__Group__0");
					put(grammarAccess.getCardSeniorAccess().getGroup_17(), "rule__CardSenior__Group_17__0");
					put(grammarAccess.getRoomSeniorAccess().getGroup(), "rule__RoomSenior__Group__0");
					put(grammarAccess.getOperativeOrganizerAccess().getGroup(), "rule__OperativeOrganizer__Group__0");
					put(grammarAccess.getOperativeOrganizerAccess().getGroup_14(), "rule__OperativeOrganizer__Group_14__0");
					put(grammarAccess.getColorAccess().getGroup(), "rule__Color__Group__0");
					put(grammarAccess.getCardAccess().getGroup(), "rule__Card__Group__0");
					put(grammarAccess.getRoomAccess().getGroup(), "rule__Room__Group__0");
					put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
					put(grammarAccess.getCampAccess().getNameAssignment_1(), "rule__Camp__NameAssignment_1");
					put(grammarAccess.getCampAccess().getColorseniorsAssignment_4(), "rule__Camp__ColorseniorsAssignment_4");
					put(grammarAccess.getCampAccess().getCardseniorsAssignment_8(), "rule__Camp__CardseniorsAssignment_8");
					put(grammarAccess.getCampAccess().getRoomseniorsAssignment_12(), "rule__Camp__RoomseniorsAssignment_12");
					put(grammarAccess.getCampAccess().getColorsAssignment_16(), "rule__Camp__ColorsAssignment_16");
					put(grammarAccess.getFreshmanAccess().getNameAssignment_0(), "rule__Freshman__NameAssignment_0");
					put(grammarAccess.getFreshmanAccess().getNeptunAssignment_4(), "rule__Freshman__NeptunAssignment_4");
					put(grammarAccess.getFreshmanAccess().getColorAssignment_7(), "rule__Freshman__ColorAssignment_7");
					put(grammarAccess.getFreshmanAccess().getCardAssignment_10(), "rule__Freshman__CardAssignment_10");
					put(grammarAccess.getColorSeniorAccess().getNameAssignment_0(), "rule__ColorSenior__NameAssignment_0");
					put(grammarAccess.getColorSeniorAccess().getYearAssignment_4(), "rule__ColorSenior__YearAssignment_4");
					put(grammarAccess.getColorSeniorAccess().getColorAssignment_7(), "rule__ColorSenior__ColorAssignment_7");
					put(grammarAccess.getColorSeniorAccess().getInferiorsAssignment_10(), "rule__ColorSenior__InferiorsAssignment_10");
					put(grammarAccess.getColorSeniorAccess().getInferiorsAssignment_11_1(), "rule__ColorSenior__InferiorsAssignment_11_1");
					put(grammarAccess.getCardSeniorAccess().getNameAssignment_0(), "rule__CardSenior__NameAssignment_0");
					put(grammarAccess.getCardSeniorAccess().getYearAssignment_4(), "rule__CardSenior__YearAssignment_4");
					put(grammarAccess.getCardSeniorAccess().getColorAssignment_7(), "rule__CardSenior__ColorAssignment_7");
					put(grammarAccess.getCardSeniorAccess().getCardAssignment_10(), "rule__CardSenior__CardAssignment_10");
					put(grammarAccess.getCardSeniorAccess().getSuperiorAssignment_13(), "rule__CardSenior__SuperiorAssignment_13");
					put(grammarAccess.getCardSeniorAccess().getInferiorsAssignment_16(), "rule__CardSenior__InferiorsAssignment_16");
					put(grammarAccess.getCardSeniorAccess().getInferiorsAssignment_17_1(), "rule__CardSenior__InferiorsAssignment_17_1");
					put(grammarAccess.getRoomSeniorAccess().getNameAssignment_0(), "rule__RoomSenior__NameAssignment_0");
					put(grammarAccess.getRoomSeniorAccess().getYearAssignment_4(), "rule__RoomSenior__YearAssignment_4");
					put(grammarAccess.getRoomSeniorAccess().getColorAssignment_7(), "rule__RoomSenior__ColorAssignment_7");
					put(grammarAccess.getRoomSeniorAccess().getCardAssignment_10(), "rule__RoomSenior__CardAssignment_10");
					put(grammarAccess.getRoomSeniorAccess().getSuperiorAssignment_13(), "rule__RoomSenior__SuperiorAssignment_13");
					put(grammarAccess.getOperativeOrganizerAccess().getNameAssignment_0(), "rule__OperativeOrganizer__NameAssignment_0");
					put(grammarAccess.getOperativeOrganizerAccess().getYearAssignment_4(), "rule__OperativeOrganizer__YearAssignment_4");
					put(grammarAccess.getOperativeOrganizerAccess().getColorAssignment_7(), "rule__OperativeOrganizer__ColorAssignment_7");
					put(grammarAccess.getOperativeOrganizerAccess().getSuperiorAssignment_10(), "rule__OperativeOrganizer__SuperiorAssignment_10");
					put(grammarAccess.getOperativeOrganizerAccess().getInferiorsAssignment_13(), "rule__OperativeOrganizer__InferiorsAssignment_13");
					put(grammarAccess.getOperativeOrganizerAccess().getInferiorsAssignment_14_1(), "rule__OperativeOrganizer__InferiorsAssignment_14_1");
					put(grammarAccess.getColorAccess().getNameAssignment_0(), "rule__Color__NameAssignment_0");
					put(grammarAccess.getColorAccess().getTypeAssignment_4(), "rule__Color__TypeAssignment_4");
					put(grammarAccess.getColorAccess().getColorseniorAssignment_7(), "rule__Color__ColorseniorAssignment_7");
					put(grammarAccess.getColorAccess().getCardsAssignment_10(), "rule__Color__CardsAssignment_10");
					put(grammarAccess.getCardAccess().getNameAssignment_0(), "rule__Card__NameAssignment_0");
					put(grammarAccess.getCardAccess().getTypeAssignment_4(), "rule__Card__TypeAssignment_4");
					put(grammarAccess.getCardAccess().getCardseniorAssignment_7(), "rule__Card__CardseniorAssignment_7");
					put(grammarAccess.getCardAccess().getRoomsAssignment_10(), "rule__Card__RoomsAssignment_10");
					put(grammarAccess.getRoomAccess().getNameAssignment_0(), "rule__Room__NameAssignment_0");
					put(grammarAccess.getRoomAccess().getRoomseniorAssignment_4(), "rule__Room__RoomseniorAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleCamp();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
