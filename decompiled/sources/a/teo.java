package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class teo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33830a;
    public final boolean b;
    public final c9a0 c;
    public final double d;
    public final double e;
    public final Double f;
    public final String g;
    public final boolean h;
    public final int i;
    public final int j;
    public final bfo k;

    public teo(int i, boolean z, c9a0 c9a0Var, double d, double d2, Double d3, String str, boolean z2, int i2, int i3, bfo bfoVar) {
        this.f33830a = i;
        this.b = z;
        this.c = c9a0Var;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = str;
        this.h = z2;
        this.i = i2;
        this.j = i3;
        this.k = bfoVar;
    }

    public static teo a(teo teoVar, double d, Double d2, String str) {
        return new teo(teoVar.f33830a, teoVar.b, teoVar.c, teoVar.d, d, d2, str, teoVar.h, teoVar.i, teoVar.j, teoVar.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof teo)) {
            return false;
        }
        teo teoVar = (teo) obj;
        return this.f33830a == teoVar.f33830a && this.b == teoVar.b && this.c.equals(teoVar.c) && Double.compare(this.d, teoVar.d) == 0 && Double.compare(this.e, teoVar.e) == 0 && Intrinsics.d(this.f, teoVar.f) && this.g.equals(teoVar.g) && this.h == teoVar.h && this.i == teoVar.i && this.j == teoVar.j && this.k.equals(teoVar.k);
    }

    public final int hashCode() {
        int iD = brm0.d(this.e, brm0.d(this.d, (this.c.hashCode() + brm0.e(Integer.hashCode(this.f33830a) * 31, 31, this.b)) * 31, 31), 31);
        Double d = this.f;
        return this.k.hashCode() + twn.a(this.j, twn.a(this.i, brm0.e(ua80.b((iD + (d == null ? 0 : d.hashCode())) * 31, 31, this.g), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f33830a, "EventModel(type=", ", blocked=", ", player=", this.b);
        sbL.append(this.c);
        sbL.append(", parameter=");
        sbL.append(this.d);
        ohs0.A(sbL, this.e, ", cf=", ", previousCf=");
        ua80.w(sbL, this.f, ", cfView=", this.g, ", isCenter=");
        ua80.q(this.i, ", group=", ", smallGroup=", sbL, this.h);
        sbL.append(this.j);
        sbL.append(", eventParams=");
        sbL.append(this.k);
        sbL.append(Separators.RPAREN);
        return sbL.toString();
    }
}
