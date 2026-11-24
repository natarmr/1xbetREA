package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class io8 extends cwr0 {
    public final String q;
    public final String r;

    public io8(String str, String str2) {
        str.getClass();
        this.q = str;
        this.r = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io8)) {
            return false;
        }
        io8 io8Var = (io8) obj;
        return Intrinsics.d(this.q, io8Var.q) && this.r.equals(io8Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + (this.q.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("BottomMarketHeaderTitle(title=", this.q, ", additionalTitle=", this.r, Separators.RPAREN);
    }
}
