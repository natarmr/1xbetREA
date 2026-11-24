package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21069a;
    public final String b;
    public final a4x c;

    public m2n(i4 i4Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f21069a = str;
        this.b = str2;
        this.c = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2n)) {
            return false;
        }
        m2n m2nVar = (m2n) obj;
        return Intrinsics.d(this.f21069a, m2nVar.f21069a) && Intrinsics.d(this.b, m2nVar.b) && Intrinsics.d(this.c, m2nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f21069a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("V3(opponentName=", this.f21069a, ", formulaValue=", this.b, ", scores="), this.c, Separators.RPAREN);
    }
}
