package android.gov.nist.javax.sip.address;

import a.e9d0;
import a.jf4;
import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes.dex */
public class UriDecoder {
    static Charset utf8CharSet;

    static {
        try {
            utf8CharSet = Charset.forName("UTF8");
        } catch (UnsupportedCharsetException e) {
            e9d0.m("Problem in decodePath: UTF-8 charset not supported.", e);
        }
    }

    public static String decode(String str) {
        int iIndexOf = str.indexOf(Separators.PERCENT);
        StringBuilder sb = new StringBuilder();
        while (iIndexOf != -1) {
            sb.append(str.substring(0, iIndexOf));
            if (iIndexOf + 2 < str.length()) {
                String strSubstring = str.substring(iIndexOf + 1, iIndexOf + 3);
                try {
                    sb.append(utf8CharSet.decode(ByteBuffer.wrap(new byte[]{(byte) Integer.parseInt(strSubstring, 16)})).toString());
                } catch (NumberFormatException unused) {
                    jf4.o("Illegal hex characters in pattern %".concat(strSubstring));
                    return null;
                }
            }
            str = str.substring(iIndexOf + 3);
            iIndexOf = str.indexOf(Separators.PERCENT);
        }
        sb.append(str);
        return sb.toString();
    }
}
