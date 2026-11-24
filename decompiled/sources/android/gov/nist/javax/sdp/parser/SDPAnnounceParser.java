package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.SessionDescriptionImpl;
import java.text.ParseException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class SDPAnnounceParser extends ParserCore {
    protected Lexer lexer;
    protected Vector sdpMessage;

    public SDPAnnounceParser(String str) {
        String strSubstring;
        int i;
        int i2;
        if (str == null) {
            return;
        }
        this.sdpMessage = new Vector();
        String str2 = str.trim() + Separators.NEWLINE;
        int i3 = 0;
        String str3 = null;
        while (i3 < str2.length()) {
            int iIndexOf = str2.indexOf(Separators.RETURN, i3);
            int iIndexOf2 = str2.indexOf("\r", i3);
            if (iIndexOf < 0 || iIndexOf2 >= 0) {
                if (iIndexOf >= 0 || iIndexOf2 < 0) {
                    if (iIndexOf < 0 || iIndexOf2 < 0) {
                        if (iIndexOf < 0 && iIndexOf2 < 0) {
                            return;
                        }
                    } else if (iIndexOf > iIndexOf2) {
                        strSubstring = str2.substring(i3, iIndexOf2);
                        i2 = iIndexOf2 + 1;
                        if (iIndexOf != i2) {
                            str3 = strSubstring;
                            i3 = i2;
                        }
                    } else {
                        strSubstring = str2.substring(i3, iIndexOf);
                        i = iIndexOf + 1;
                        if (iIndexOf2 != i) {
                            str3 = strSubstring;
                            i3 = i;
                        }
                    }
                    this.sdpMessage.addElement(str3);
                } else {
                    strSubstring = str2.substring(i3, iIndexOf2);
                }
                i2 = iIndexOf2 + 1;
                str3 = strSubstring;
                i3 = i2;
                this.sdpMessage.addElement(str3);
            } else {
                strSubstring = str2.substring(i3, iIndexOf);
            }
            i = iIndexOf + 1;
            str3 = strSubstring;
            i3 = i;
            this.sdpMessage.addElement(str3);
        }
    }

    public SessionDescriptionImpl parse() throws ParseException {
        SessionDescriptionImpl sessionDescriptionImpl = new SessionDescriptionImpl();
        for (int i = 0; i < this.sdpMessage.size(); i++) {
            SDPParser sDPParserCreateParser = ParserFactory.createParser((String) this.sdpMessage.elementAt(i));
            sessionDescriptionImpl.addField(sDPParserCreateParser != null ? sDPParserCreateParser.parse() : null);
        }
        return sessionDescriptionImpl;
    }

    public SDPAnnounceParser(Vector vector) {
        this.sdpMessage = vector;
    }
}
