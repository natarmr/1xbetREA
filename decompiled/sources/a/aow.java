package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aow extends w8b {
    public final String d;
    public final int e;

    public aow(String str, int i) {
        super(vqd.e(str, str), Integer.valueOf(i), Integer.valueOf(i), 6);
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aow)) {
            return false;
        }
        aow aowVar = (aow) obj;
        return Intrinsics.d(this.d, aowVar.d) && this.e == aowVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "CornerCell(title=", this.d, ", fixedWidth=", Separators.RPAREN);
    }
}
