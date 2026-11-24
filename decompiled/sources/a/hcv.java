package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hcv extends w8b {
    public final String d;
    public final int e;

    public hcv(String str, int i) {
        super(vqd.e(str, str), null, null, 30);
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcv)) {
            return false;
        }
        hcv hcvVar = (hcv) obj;
        return Intrinsics.d(this.d, hcvVar.d) && this.e == hcvVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "GrandPrixColumnHeader(title=", this.d, ", gravity=", Separators.RPAREN);
    }
}
