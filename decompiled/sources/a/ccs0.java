package a;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ccs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4128a;
    public final String b;
    public final int c;
    public final androidx.media3.common.b[] d;
    public int e;

    static {
        vtt0.H(0);
        vtt0.H(1);
    }

    public ccs0(String str, androidx.media3.common.b... bVarArr) {
        x0x.A(bVarArr.length > 0);
        this.b = str;
        this.d = bVarArr;
        this.f4128a = bVarArr.length;
        String str2 = bVarArr[0].p;
        this.c = TextUtils.isEmpty(str2) ? mg40.h(bVarArr[0].o) : mg40.h(str2);
        String str3 = bVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = bVarArr[0].f | 16384;
        for (int i2 = 1; i2 < bVarArr.length; i2++) {
            String str4 = bVarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                b("languages", i2, bVarArr[0].d, bVarArr[i2].d);
                return;
            } else {
                if (i != (bVarArr[i2].f | 16384)) {
                    b("role flags", i2, Integer.toBinaryString(bVarArr[0].f), Integer.toBinaryString(bVarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        f1t0.R("TrackGroup", "", new IllegalStateException(brm0.j(i, str3, "' (track ", Separators.RPAREN, b1j.n("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '"))));
    }

    public final int a(androidx.media3.common.b bVar) {
        int i = 0;
        while (true) {
            androidx.media3.common.b[] bVarArr = this.d;
            if (i >= bVarArr.length) {
                return -1;
            }
            if (bVar == bVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ccs0.class == obj.getClass()) {
            ccs0 ccs0Var = (ccs0) obj;
            if (this.b.equals(ccs0Var.b) && Arrays.equals(this.d, ccs0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d) + ua80.b(527, 31, this.b);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
