package okhttp3.internal.idn;

import a.e9d0;
import a.gl5;
import a.qg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/idn/Punycode;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Punycode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qg9 f46206a;

    static {
        qg9 qg9Var = qg9.d;
        f46206a = gl5.i("xn--");
    }

    public static int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        e9d0.d(i, "unexpected digit: ");
        return 0;
    }
}
