package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.LexerCore;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AuthenticationInfo;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationInfoParser extends ParametersParser {
    public AuthenticationInfoParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        LexerCore lexerCore;
        if (ParserCore.debug) {
            dbg_enter("AuthenticationInfoParser.parse");
        }
        try {
            headerName(TokenTypes.AUTHENTICATION_INFO);
            AuthenticationInfo authenticationInfo = new AuthenticationInfo();
            authenticationInfo.setHeaderName("Authentication-Info");
            this.lexer.SPorHT();
            NameValue nameValue = super.nameValue();
            if ("".equals(nameValue.getValue()) && !nameValue.isValueQuoted()) {
                authenticationInfo.setScheme(nameValue.getKey());
                nameValue = super.nameValue();
            }
            authenticationInfo.setParameter(nameValue);
            this.lexer.SPorHT();
            while (true) {
                char cLookAhead = this.lexer.lookAhead(0);
                lexerCore = this.lexer;
                if (cLookAhead != ',') {
                    break;
                }
                lexerCore.match(44);
                this.lexer.SPorHT();
                authenticationInfo.setParameter(super.nameValue());
                this.lexer.SPorHT();
            }
            lexerCore.SPorHT();
            this.lexer.match(10);
            return authenticationInfo;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("AuthenticationInfoParser.parse");
            }
        }
    }

    public AuthenticationInfoParser(Lexer lexer) {
        super(lexer);
    }
}
