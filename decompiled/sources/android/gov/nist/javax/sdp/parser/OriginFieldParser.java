package android.gov.nist.javax.sdp.parser;

import a.hny;
import android.gov.nist.core.HostNameParser;
import android.gov.nist.core.LexerCore;
import android.gov.nist.javax.sdp.fields.OriginField;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class OriginFieldParser extends SDPParser {
    public OriginFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public static void main(String[] strArr) throws ParseException {
        String[] strArr2 = {"o=- 45ec4ba1.1 45ec4ba1 in ip4 10.1.80.200\r\n", "o=- 4322650003578 0 IN IP4 192.53.18.122\r\n", "o=4855 12345678901234567890 12345678901234567890 IN IP4 166.35.224.216\n", "o=mh/andley 2890844526 2890842807 IN IP4 126.16.64.4\n", "o=UserB 2890844527 2890844527 IN IP4 everywhere.com\n", "o=UserA 2890844526 2890844526 IN IP4 here.com\n", "o=IFAXTERMINAL01 2890844527 2890844527 IN IP4 ift.here.com\n", "o=GATEWAY1 2890844527 2890844527 IN IP4 gatewayone.wcom.com\n", "o=- 2890844527 2890844527 IN IP4 gatewayone.wcom.com\n"};
        for (int i = 0; i < 9; i++) {
            OriginField originField = new OriginFieldParser(strArr2[i]).originField();
            System.out.println("toParse :" + strArr2[i]);
            System.out.println("encoded: " + originField.encode());
        }
    }

    public OriginField originField() throws ParseException {
        try {
            OriginField originField = new OriginField();
            this.lexer.match(111);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            this.lexer.match(LexerCore.ID_NO_WHITESPACE);
            originField.setUsername(this.lexer.getNextToken().getTokenValue());
            this.lexer.SPorHT();
            this.lexer.match(4095);
            String tokenValue = this.lexer.getNextToken().getTokenValue();
            try {
                originField.setSessId(Long.parseLong(tokenValue));
            } catch (NumberFormatException unused) {
                if (tokenValue.length() > 18) {
                    tokenValue = tokenValue.substring(tokenValue.length() - 18);
                }
                originField.setSessionId(tokenValue);
            }
            this.lexer.SPorHT();
            this.lexer.match(4095);
            String tokenValue2 = this.lexer.getNextToken().getTokenValue();
            try {
                originField.setSessVersion(Long.parseLong(tokenValue2));
            } catch (NumberFormatException unused2) {
                if (tokenValue2.length() > 18) {
                    tokenValue2 = tokenValue2.substring(tokenValue2.length() - 18);
                }
                originField.setSessVersion(tokenValue2);
            }
            this.lexer.SPorHT();
            this.lexer.match(4095);
            originField.setNettype(this.lexer.getNextToken().getTokenValue());
            this.lexer.SPorHT();
            this.lexer.match(4095);
            originField.setAddrtype(this.lexer.getNextToken().getTokenValue());
            this.lexer.SPorHT();
            originField.setAddress(new HostNameParser(this.lexer.getRest()).host());
            return originField;
        } catch (Exception e) {
            e.printStackTrace();
            hny.j(this.lexer.getPtr(), this.lexer.getBuffer());
            return null;
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return originField();
    }
}
