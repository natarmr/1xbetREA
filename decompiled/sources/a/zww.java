package a;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zww extends zdx {
    public static final Pattern d = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder b = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder c = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // a.zdx
    public final ed40 y(md40 md40Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.c;
        CharsetDecoder charsetDecoder2 = this.b;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new ed40(new bxw(null, null, bArr));
        }
        Matcher matcher = d.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strH0 = j47.H0(strGroup);
                strH0.getClass();
                if (strH0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strH0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new ed40(new bxw(str, str2, bArr));
    }
}
