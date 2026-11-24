package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.LexerCore;
import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentity;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentityList;
import android.gov.nist.javax.sip.parser.AddressParametersParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;

/* JADX INFO: loaded from: classes.dex */
public class PAssertedIdentityParser extends AddressParametersParser implements TokenTypes {
    public PAssertedIdentityParser(String str) {
        super(str);
        this.allowParameters = false;
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        LexerCore lexerCore;
        if (ParserCore.debug) {
            dbg_enter("AssertedIdentityParser.parse");
        }
        PAssertedIdentityList pAssertedIdentityList = new PAssertedIdentityList();
        try {
            headerName(TokenTypes.P_ASSERTED_IDENTITY);
            PAssertedIdentity pAssertedIdentity = new PAssertedIdentity();
            pAssertedIdentity.setHeaderName("P-Asserted-Identity");
            super.parse((AddressParametersHeader) pAssertedIdentity);
            pAssertedIdentityList.add(pAssertedIdentity);
            this.lexer.SPorHT();
            while (true) {
                char cLookAhead = this.lexer.lookAhead(0);
                lexerCore = this.lexer;
                if (cLookAhead != ',') {
                    break;
                }
                lexerCore.match(44);
                this.lexer.SPorHT();
                PAssertedIdentity pAssertedIdentity2 = new PAssertedIdentity();
                super.parse((AddressParametersHeader) pAssertedIdentity2);
                pAssertedIdentityList.add(pAssertedIdentity2);
                this.lexer.SPorHT();
            }
            lexerCore.SPorHT();
            this.lexer.match(10);
            return pAssertedIdentityList;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("AssertedIdentityParser.parse");
            }
        }
    }

    public PAssertedIdentityParser(Lexer lexer) {
        super(lexer);
        this.allowParameters = false;
    }
}
