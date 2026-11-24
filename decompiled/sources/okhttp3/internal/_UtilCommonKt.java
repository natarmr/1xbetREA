package okhttp3.internal;

import a.f99;
import a.gl5;
import a.kng0;
import a.qg9;
import a.u99;
import a.xvw;
import a.y190;
import a.yzp;
import a.z680;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _UtilCommonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f46121a = new byte[0];
    public static final z680 b;

    static {
        int i = z680.d;
        qg9 qg9Var = qg9.d;
        b = xvw.S(gl5.h("efbbbf"), gl5.h("feff"), gl5.h("fffe0000"), gl5.h("fffe"), gl5.h("0000feff"));
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbQ = kng0.q(j, "length=", ", offset=");
            sbQ.append(j2);
            sbQ.append(", count=");
            sbQ.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbQ.toString());
        }
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void c(yzp yzpVar, y190 y190Var) {
        yzpVar.getClass();
        y190Var.getClass();
        try {
            IOException iOException = null;
            for (y190 y190Var2 : yzpVar.q(y190Var)) {
                try {
                    if (yzpVar.r(y190Var2).c) {
                        c(yzpVar, y190Var2);
                    }
                    yzpVar.k(y190Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(yzp yzpVar, y190 y190Var) {
        yzpVar.getClass();
        y190Var.getClass();
        try {
            yzpVar.k(y190Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(int i, String str, int i2, String str2) {
        str.getClass();
        while (i < i2) {
            if (StringsKt.P(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return f(str, c, i, i2);
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int i(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.e(cCharAt, 31) <= 0 || Intrinsics.e(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int j(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int k(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] l(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean m(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int n(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int o(u99 u99Var) {
        u99Var.getClass();
        return (u99Var.readByte() & 255) | ((u99Var.readByte() & 255) << 16) | ((u99Var.readByte() & 255) << 8);
    }

    public static final int p(f99 f99Var) {
        int i = 0;
        while (!f99Var.v0() && f99Var.n(0L) == 61) {
            i++;
            f99Var.readByte();
        }
        return i;
    }

    public static final int q(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
