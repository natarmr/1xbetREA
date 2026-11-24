package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.LexerCore;
import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AllowEvents;
import android.gov.nist.javax.sip.header.AllowEventsList;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class AllowEventsParser extends HeaderParser {
    public AllowEventsParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        LexerCore lexerCore;
        if (ParserCore.debug) {
            dbg_enter("AllowEventsParser.parse");
        }
        AllowEventsList allowEventsList = new AllowEventsList();
        try {
            headerName(TokenTypes.ALLOW_EVENTS);
            AllowEvents allowEvents = new AllowEvents();
            this.lexer.match(4095);
            allowEvents.setEventType(this.lexer.getNextToken().getTokenValue());
            allowEventsList.add(allowEvents);
            this.lexer.SPorHT();
            while (true) {
                char cLookAhead = this.lexer.lookAhead(0);
                lexerCore = this.lexer;
                if (cLookAhead != ',') {
                    break;
                }
                lexerCore.match(44);
                this.lexer.SPorHT();
                AllowEvents allowEvents2 = new AllowEvents();
                this.lexer.match(4095);
                allowEvents2.setEventType(this.lexer.getNextToken().getTokenValue());
                allowEventsList.add(allowEvents2);
                this.lexer.SPorHT();
            }
            lexerCore.SPorHT();
            this.lexer.match(10);
            return allowEventsList;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("AllowEventsParser.parse");
            }
        }
    }

    public AllowEventsParser(Lexer lexer) {
        super(lexer);
    }
}
