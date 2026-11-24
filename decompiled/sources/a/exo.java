package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class exo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hxo f8588a;
    public final hxo b;
    public final hxo c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public exo(hxo hxoVar, hxo hxoVar2, hxo hxoVar3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f8588a = hxoVar;
        this.b = hxoVar2;
        this.c = hxoVar3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static exo a(exo exoVar, boolean z, boolean z2, boolean z3, int i) {
        hxo hxoVar = exoVar.f8588a;
        hxo hxoVar2 = exoVar.b;
        hxo hxoVar3 = exoVar.c;
        boolean z4 = exoVar.d;
        boolean z5 = (i & 16) != 0 ? exoVar.e : false;
        if ((i & 32) != 0) {
            z = exoVar.f;
        }
        boolean z6 = z;
        if ((i & 128) != 0) {
            z3 = exoVar.h;
        }
        exoVar.getClass();
        return new exo(hxoVar, hxoVar2, hxoVar3, z4, z5, z6, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exo)) {
            return false;
        }
        exo exoVar = (exo) obj;
        return this.f8588a.equals(exoVar.f8588a) && this.b.equals(exoVar.b) && this.c.equals(exoVar.c) && this.d == exoVar.d && this.e == exoVar.e && this.f == exoVar.f && this.g == exoVar.g && this.h == exoVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f8588a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FastBetStateModel(firstFastBetValue=");
        sb.append(this.f8588a);
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
