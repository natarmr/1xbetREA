package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sng0 extends ung0 {
    public final String c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sng0(String str, boolean z) {
        super(str, z);
        str.getClass();
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sng0)) {
            return false;
        }
        sng0 sng0Var = (sng0) obj;
        return Intrinsics.d(this.c, sng0Var.c) && this.d == sng0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Loading(title=", this.c, ", show=", this.d, Separators.RPAREN);
    }
}
