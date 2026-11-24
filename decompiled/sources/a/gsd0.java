package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gsd0 extends v8b implements isd0 {
    public final String d;
    public final int e;

    public gsd0(String str, int i) {
        super(30, null, null, q3d.j(vqd.e(str, str), new g9b(i)));
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsd0)) {
            return false;
        }
        gsd0 gsd0Var = (gsd0) obj;
        return Intrinsics.d(this.d, gsd0Var.d) && this.e == gsd0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "RaceResultsColumnHeader(title=", this.d, ", spaceWidth=", Separators.RPAREN);
    }
}
