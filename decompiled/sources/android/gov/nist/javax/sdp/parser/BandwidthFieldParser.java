package android.gov.nist.javax.sdp.parser;

import a.hny;
import android.gov.nist.core.NameValue;
import android.gov.nist.javax.sdp.fields.BandwidthField;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class BandwidthFieldParser extends SDPParser {
    public BandwidthFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public BandwidthField bandwidthField() throws ParseException {
        try {
            this.lexer.match(98);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            BandwidthField bandwidthField = new BandwidthField();
            NameValue nameValue = nameValue(':');
            String name = nameValue.getName();
            bandwidthField.setBandwidth(Integer.parseInt(((String) nameValue.getValueAsObject()).trim()));
            bandwidthField.setBwtype(name);
            this.lexer.SPorHT();
            return bandwidthField;
        } catch (Exception e) {
            e.printStackTrace();
            hny.j(this.lexer.getPtr(), this.lexer.getBuffer());
            return null;
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() {
        return bandwidthField();
    }
}
