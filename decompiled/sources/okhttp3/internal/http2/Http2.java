package okhttp3.internal.http2;

import a.axq;
import a.gl5;
import a.qg9;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Http2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qg9 f46185a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        qg9 qg9Var = qg9.d;
        f46185a = gl5.i("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String strReplace = _UtilJvmKt.d("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i] = strReplace;
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = axq.n(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = axq.n(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = b;
        return i < strArr.length ? strArr[i] : _UtilJvmKt.d("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    public static String b(boolean z, int i, int i2, int i3, int i4) {
        String strR;
        String str;
        String strA = a(i3);
        if (i4 == 0) {
            strR = "";
        } else {
            String[] strArr = d;
            if (i3 == 2 || i3 == 3) {
                strR = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strR = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 == 7 || i3 == 8) {
                strR = strArr[i4];
            } else {
                String[] strArr2 = c;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    str.getClass();
                } else {
                    str = strArr[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strR = (i3 != 0 || (i4 & 32) == 0) ? str : kotlin.text.c.r(str, "PRIORITY", "COMPRESSED", false);
                } else {
                    strR = kotlin.text.c.r(str, "HEADERS", "PUSH_PROMISE", false);
                }
            }
        }
        return _UtilJvmKt.d("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strA, strR);
    }

    public static String c(int i, int i2, long j, boolean z) {
        return _UtilJvmKt.d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a(8), Long.valueOf(j));
    }
}
