package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vt20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37982a;
    public final String b;
    public final int c;
    public final boolean d;

    public vt20(int i, long j, String str, boolean z) {
        str.getClass();
        this.f37982a = j;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt20)) {
            return false;
        }
        vt20 vt20Var = (vt20) obj;
        return this.f37982a == vt20Var.f37982a && Intrinsics.d(this.b, vt20Var.b) && this.c == vt20Var.c && this.d == vt20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, ua80.b(Long.hashCode(this.f37982a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f37982a, "MarketFilterModel(id=", ", name=", this.b);
        dw9.v(this.c, ", pinnedPosition=", ", hidden=", sbO, this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
