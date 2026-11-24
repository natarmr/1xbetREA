package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oa20 implements pa20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24910a;
    public final double b;
    public final long c;
    public final String d;
    public final long e;
    public final double f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final double j;
    public final q4f k;
    public final List l;

    public oa20(String str, double d, long j, String str2, long j2, double d2, String str3, boolean z, boolean z2, double d3, q4f q4fVar, List list) {
        str.getClass();
        list.getClass();
        this.f24910a = str;
        this.b = d;
        this.c = j;
        this.d = str2;
        this.e = j2;
        this.f = d2;
        this.g = str3;
        this.h = z;
        this.i = z2;
        this.j = d3;
        this.k = q4fVar;
        this.l = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa20)) {
            return false;
        }
        oa20 oa20Var = (oa20) obj;
        return Intrinsics.d(this.f24910a, oa20Var.f24910a) && Double.compare(this.b, oa20Var.b) == 0 && this.c == oa20Var.c && this.d.equals(oa20Var.d) && this.e == oa20Var.e && Double.compare(this.f, oa20Var.f) == 0 && this.g.equals(oa20Var.g) && this.h == oa20Var.h && this.i == oa20Var.i && Double.compare(this.j, oa20Var.j) == 0 && this.k == oa20Var.k && Intrinsics.d(this.l, oa20Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + vqd.b(this.k, brm0.d(this.j, brm0.e(brm0.e(ua80.b(brm0.d(this.f, rw2.b(ua80.b(rw2.b(brm0.d(this.b, this.f24910a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MakeBetSuccessModel(id=");
        sb.append(this.f24910a);
        sb.append(", balance=");
        sb.append(this.b);
        kng0.A(sb, ", waitTime=", this.c, ", betGUID=");
        defpackage.c.i(sb, this.e, this.d, ", walletId=");
        ohs0.A(sb, this.f, ", coef=", ", coefView=");
        brm0.C(this.g, ", lnC=", ", lvC=", sb, this.h);
        sb.append(this.i);
        sb.append(", summ=");
        sb.append(this.j);
        sb.append(", couponTypeModel=");
        sb.append(this.k);
        sb.append(", eventModels=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
