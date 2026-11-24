package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.LexerCore;

/* JADX INFO: loaded from: classes.dex */
public class Lexer extends LexerCore {
    public Lexer(String str, String str2) {
        super(str, str2);
    }

    public static String getFieldName(String str) {
        int iIndexOf = str.indexOf("=");
        if (iIndexOf == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    @Override // android.gov.nist.core.LexerCore
    public void selectLexer(String str) {
    }
}
