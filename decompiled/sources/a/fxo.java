package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fxo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixo f10319a;
    public final ixo b;
    public final ixo c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public fxo(ixo ixoVar, ixo ixoVar2, ixo ixoVar3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f10319a = ixoVar;
        this.b = ixoVar2;
        this.c = ixoVar3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static fxo a(fxo fxoVar, boolean z, boolean z2, boolean z3, int i) {
        ixo ixoVar = fxoVar.f10319a;
        ixo ixoVar2 = fxoVar.b;
        ixo ixoVar3 = fxoVar.c;
        boolean z4 = fxoVar.d;
        boolean z5 = (i & 16) != 0 ? fxoVar.e : false;
        if ((i & 32) != 0) {
            z = fxoVar.f;
        }
        boolean z6 = z;
        if ((i & 128) != 0) {
            z3 = fxoVar.h;
        }
        fxoVar.getClass();
        return new fxo(ixoVar, ixoVar2, ixoVar3, z4, z5, z6, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxo)) {
            return false;
        }
        fxo fxoVar = (fxo) obj;
        return this.f10319a.equals(fxoVar.f10319a) && this.b.equals(fxoVar.b) && this.c.equals(fxoVar.c) && this.d == fxoVar.d && this.e == fxoVar.e && this.f == fxoVar.f && this.g == fxoVar.g && this.h == fxoVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f10319a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FastBetStateModel(firstFastBetValue=");
        sb.append(this.f10319a);
        sb.append(", secondFastBetValue=");
        sb.append(this.b);
        sb.append(", thirdFastBetValue=");
        sb.append(this.c);
        sb.append(", valuesLoaded=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        ua80.u(", isHidden=", ", isLoading=", sb, this.e, this.f);
        return ohs0.p(", isDisabled=", Separators.RPAREN, sb, this.g, this.h);
    }
}
