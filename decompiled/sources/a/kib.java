package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18328a;
    public final boolean b;
    public final vhb c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public kib(boolean z, boolean z2, vhb vhbVar, boolean z3, boolean z4, String str) {
        this.f18328a = z;
        this.b = z2;
        this.c = vhbVar;
        this.d = z3;
        this.e = z4;
        this.f = str;
    }

    public static kib a(kib kibVar, boolean z, boolean z2, vhb vhbVar, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = kibVar.f18328a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = kibVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            vhbVar = kibVar.c;
        }
        vhb vhbVar2 = vhbVar;
        boolean z6 = (i & 8) != 0 ? kibVar.d : true;
        if ((i & 16) != 0) {
            z3 = kibVar.e;
        }
        String str = kibVar.f;
        kibVar.getClass();
        return new kib(z4, z5, vhbVar2, z6, z3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kib)) {
            return false;
        }
        kib kibVar = (kib) obj;
        return this.f18328a == kibVar.f18328a && this.b == kibVar.b && this.c == kibVar.c && this.d == kibVar.d && this.e == kibVar.e && this.f.equals(kibVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e((this.c.hashCode() + brm0.e(Boolean.hashCode(this.f18328a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ChampionsClubState(isLoading=", ", hasConnection=", ", errorType=", this.f18328a, this.b);
        sbQ.append(this.c);
        sbQ.append(", hasOpenedWebView=");
        sbQ.append(this.d);
        sbQ.append(", wasAuthorized=");
        return twn.q(", loaltyProgramName=", this.f, Separators.RPAREN, sbQ, this.e);
    }
}
