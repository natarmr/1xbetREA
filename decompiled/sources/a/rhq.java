package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rhq extends w8b {
    public final String d;
    public final boolean e;
    public final int f;

    public rhq(String str, int i, boolean z) {
        super(vqd.e(str, str), null, null, 30);
        this.d = str;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhq)) {
            return false;
        }
        rhq rhqVar = (rhq) obj;
        return Intrinsics.d(this.d, rhqVar.d) && this.e == rhqVar.e && this.f == rhqVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + brm0.e(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return rz4.j(this.f, Separators.RPAREN, brm0.u("FirstColumnRatingCell(title=", this.d, ", hasPosition=", this.e, ", columnCount="));
    }
}
