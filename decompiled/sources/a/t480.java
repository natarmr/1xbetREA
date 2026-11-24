package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t480 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33307a;
    public final String b;

    public t480(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f33307a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t480)) {
            return false;
        }
        t480 t480Var = (t480) obj;
        return Intrinsics.d(this.f33307a, t480Var.f33307a) && Intrinsics.d(this.b, t480Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33307a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OpponentsScore(firstOpponentScore=", this.f33307a, ", secondOpponentScore=", this.b, Separators.RPAREN);
    }
}
