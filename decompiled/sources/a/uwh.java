package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uwh extends v8b implements xwh {
    public final String d;
    public final int e;

    public uwh(String str, int i) {
        super(30, null, null, q3d.j(vqd.e(str, str), new g9b(i)));
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwh)) {
            return false;
        }
        uwh uwhVar = (uwh) obj;
        return Intrinsics.d(this.d, uwhVar.d) && this.e == uwhVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "CyclingResultsColumnHeader(title=", this.d, ", spaceWidth=", Separators.RPAREN);
    }
}
