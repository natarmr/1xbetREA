package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zdf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44210a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zdf(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f44210a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdf)) {
            return false;
        }
        zdf zdfVar = (zdf) obj;
        return this.f44210a == zdfVar.f44210a && this.b == zdfVar.b && this.c == zdfVar.c && this.d == zdfVar.d && this.e == zdfVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f44210a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("CriticalConfigModel(hasSectionToto=", ", hasBetConstructor=", ", hasFinancial=", this.f44210a, this.b);
        ua80.u(", hasSectionXGames=", ", hasSectionAggregator=", sbQ, this.c, this.d);
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
