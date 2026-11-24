package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b3s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1924a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final zbk e;

    public b3s(boolean z, boolean z2, boolean z3, boolean z4, zbk zbkVar) {
        this.f1924a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = zbkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b3s) {
            b3s b3sVar = (b3s) obj;
            return this.f1924a == b3sVar.f1924a && this.b == b3sVar.b && this.c == b3sVar.c && this.d == b3sVar.d && this.e == b3sVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f1924a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("GameClassicToolbarUiModel(menuEnabled=", ", quickBetVisible=", ", quickBetEnabled=", this.f1924a, this.b);
        ua80.u(", quickBetActive=", ", title=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
