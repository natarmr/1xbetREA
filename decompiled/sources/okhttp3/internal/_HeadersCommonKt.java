package okhttp3.internal;

import a.brm0;
import a.jf4;
import a.twn;
import a.tx3;
import a.v4i0;
import a.w3d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _HeadersCommonKt {
    public static final void a(Headers.Builder builder, String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = builder.f46099a;
        arrayList.add(str);
        arrayList.add(StringsKt.u0(str2).toString());
    }

    public static final Headers b(Headers.Builder builder) {
        builder.getClass();
        return new Headers((String[]) builder.f46099a.toArray(new String[0]));
    }

    public static final String c(Headers headers, int i) {
        headers.getClass();
        String str = (String) tx3.G(i * 2, headers.f46098a);
        if (str != null) {
            return str;
        }
        v4i0.m(brm0.l("name[", i, ']'));
        return null;
    }

    public static final Headers.Builder d(Headers headers) {
        headers.getClass();
        Headers.Builder builder = new Headers.Builder();
        w3d.v(builder.f46099a, headers.f46098a);
        return builder;
    }

    public static final String e(Headers headers, int i) {
        headers.getClass();
        String str = (String) tx3.G((i * 2) + 1, headers.f46098a);
        if (str != null) {
            return str;
        }
        v4i0.m(brm0.l("value[", i, ']'));
        return null;
    }

    public static final void f(String str) {
        str.getClass();
        if (str.length() <= 0) {
            jf4.o("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                String string = Integer.toString(cCharAt, CharsKt.checkRadix(16));
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                twn.w(i, string, " at ", " in header name: ", sb);
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void g(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                String string = Integer.toString(cCharAt, CharsKt.checkRadix(16));
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                twn.w(i, string, " at ", " in ", sb);
                sb.append(str2);
                sb.append(" value");
                sb.append(_UtilCommonKt.m(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
