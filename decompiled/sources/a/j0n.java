package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j0n implements m0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15689a;
    public final g0n b;
    public final String c;
    public final mpm d;
    public final ows0 e;
    public final ows0 f;

    public j0n(boolean z, g0n g0nVar, String str, mpm mpmVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        this.f15689a = z;
        this.b = g0nVar;
        this.c = str;
        this.d = mpmVar;
        this.e = ows0Var;
        this.f = ows0Var2;
    }

    @Override // a.m0n
    public final boolean a() {
        return this.f15689a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0n)) {
            return false;
        }
        j0n j0nVar = (j0n) obj;
        return this.f15689a == j0nVar.f15689a && Intrinsics.d(this.b, j0nVar.b) && Intrinsics.d(this.c, j0nVar.c) && this.d.equals(j0nVar.d) && this.e.equals(j0nVar.e) && this.f.equals(j0nVar.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f15689a) * 31;
        g0n g0nVar = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ohs0.e(this.d, ua80.b((iHashCode + (g0nVar == null ? 0 : g0nVar.hashCode())) * 31, 31, this.c), 31)) * 31);
    }

    public final String toString() {
        return "V2(supportRtl=" + this.f15689a + ", timerModel=" + this.b + ", championshipLabel=" + this.c + ", scoreSection=" + this.d + ", teamOneModel=" + this.e + ", teamTwoModel=" + this.f + Separators.RPAREN;
    }
}
