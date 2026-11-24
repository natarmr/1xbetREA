package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s7s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31765a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public s7s(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31765a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7s)) {
            return false;
        }
        s7s s7sVar = (s7s) obj;
        return this.f31765a == s7sVar.f31765a && this.b == s7sVar.b && this.c == s7sVar.c && this.d == s7sVar.d && this.e.equals(s7sVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f31765a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("GameDashboardToolbarUiModel(menuEnabled=", ", quickBetVisible=", ", quickBetEnabled=", this.f31765a, this.b);
        ua80.u(", quickBetActive=", ", title=", sbQ, this.c, this.d);
        return axq.n(sbQ, this.e, Separators.RPAREN);
    }
}
