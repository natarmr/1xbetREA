package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22809a;
    public final String b;
    public final a4x c;

    public n2n(i4 i4Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f22809a = str;
        this.b = str2;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2n)) {
            return false;
        }
        n2n n2nVar = (n2n) obj;
        return Intrinsics.d(this.f22809a, n2nVar.f22809a) && Intrinsics.d(this.b, n2nVar.b) && Intrinsics.d(this.c, n2nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f22809a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("V4(opponentName=", this.f22809a, ", formulaValue=", this.b, ", scores="), this.c, Separators.RPAREN);
    }
}
