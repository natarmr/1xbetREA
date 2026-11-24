package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.LexerCore;
import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AlertInfo;
import android.gov.nist.javax.sip.header.AlertInfoList;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class AlertInfoParser extends ParametersParser {
    public AlertInfoParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("AlertInfoParser.parse");
        }
        AlertInfoList alertInfoList = new AlertInfoList();
        try {
            headerName(TokenTypes.ALERT_INFO);
            for (int i = 0; this.lexer.lookAhead(0) != '\n' && i < 20; i++) {
                while (true) {
                    AlertInfo alertInfo = new AlertInfo();
                    alertInfo.setHeaderName("Alert-Info");
                    this.lexer.SPorHT();
                    char cLookAhead = this.lexer.lookAhead(0);
                    LexerCore lexerCore = this.lexer;
                    if (cLookAhead == '<') {
                        lexerCore.match(60);
                        alertInfo.setAlertInfo(new URLParser((Lexer) this.lexer).uriReference(true));
                        this.lexer.match(62);
                    } else {
                        alertInfo.setAlertInfo(lexerCore.byteStringNoSemicolon());
                    }
                    this.lexer.SPorHT();
                    super.parse(alertInfo);
                    alertInfoList.add(alertInfo);
                    if (this.lexer.lookAhead(0) == ',') {
                        this.lexer.match(44);
                    }
                }
            }
            if (ParserCore.debug) {
                dbg_leave("AlertInfoParser.parse");
            }
            return alertInfoList;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave("AlertInfoParser.parse");
            }
            throw th;
        }
    }

    public AlertInfoParser(Lexer lexer) {
        super(lexer);
    }
}
