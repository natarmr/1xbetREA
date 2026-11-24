package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class seo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32082a;
    public final int b;
    public final double c;
    public final reo d;
    public final double e;
    public final Double f;
    public final String g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;

    public seo(int i, int i2, double d, reo reoVar, double d2, Double d3, String str, boolean z, int i3, boolean z2, boolean z3, String str2, String str3) {
        this.f32082a = i;
        this.b = i2;
        this.c = d;
        this.d = reoVar;
        this.e = d2;
        this.f = d3;
        this.g = str;
        this.h = z;
        this.i = i3;
        this.j = z2;
        this.k = z3;
        this.l = str2;
        this.m = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof seo)) {
            return false;
        }
        seo seoVar = (seo) obj;
        return this.f32082a == seoVar.f32082a && this.b == seoVar.b && Double.compare(this.c, seoVar.c) == 0 && this.d.equals(seoVar.d) && Double.compare(this.e, seoVar.e) == 0 && Intrinsics.d(this.f, seoVar.f) && this.g.equals(seoVar.g) && this.h == seoVar.h && this.i == seoVar.i && this.j == seoVar.j && this.k == seoVar.k && this.l.equals(seoVar.l) && this.m.equals(seoVar.m);
    }

    public final int hashCode() {
        int iD = brm0.d(this.e, (this.d.hashCode() + brm0.d(this.c, twn.a(this.b, Integer.hashCode(this.f32082a) * 31, 31), 31)) * 31, 31);
        Double d = this.f;
        return this.m.hashCode() + ua80.b(brm0.e(brm0.e(twn.a(this.i, brm0.e(ua80.b((iD + (d == null ? 0 : d.hashCode())) * 31, 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("EventModel(groupId=", this.f32082a, ", type=", ", parameter=", this.b);
        sbT.append(this.c);
        sbT.append(", player=");
        sbT.append(this.d);
        ohs0.A(sbT, this.e, ", cf=", ", previousCf=");
        ua80.w(sbT, this.f, ", cfView=", this.g, ", blocked=");
        ua80.q(this.i, ", gameId=", ", isAddedToCoupon=", sbT, this.h);
        ua80.u(", isTracked=", ", marketName=", sbT, this.j, this.k);
        return ua80.m(sbT, this.l, ", eventName=", this.m, Separators.RPAREN);
    }
}
