package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l3h0 extends zdx {
    public final String b;
    public final String c;

    public l3h0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3h0)) {
            return false;
        }
        l3h0 l3h0Var = (l3h0) obj;
        return Intrinsics.d(this.b, l3h0Var.b) && Intrinsics.d(this.c, l3h0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Score(firstScore=", this.b, ", secondScore=", this.c, Separators.RPAREN);
    }
}
