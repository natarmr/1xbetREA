package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class for0 implements a5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9896a;
    public final q4f b;
    public final double c;
    public final long d;
    public final double e;
    public final double f;
    public final i0w g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final hxu l;
    public final List m;
    public final long n;
    public final a6w o;

    static {
        hxu hxuVar = hxu.h;
    }

    public for0(String str, q4f q4fVar, double d, long j, double d2, double d3, i0w i0wVar, String str2, String str3, boolean z, boolean z2, hxu hxuVar, List list, long j2, a6w a6wVar) {
        str.getClass();
        str3.getClass();
        hxuVar.getClass();
        list.getClass();
        this.f9896a = str;
        this.b = q4fVar;
        this.c = d;
        this.d = j;
        this.e = d2;
        this.f = d3;
        this.g = i0wVar;
        this.h = str2;
        this.i = str3;
        this.j = z;
        this.k = z2;
        this.l = hxuVar;
        this.m = list;
        this.n = j2;
        this.o = a6wVar;
    }

    @Override // a.a5w
    public final jvw b() {
        return this.g;
    }

    @Override // a.a5w
    public final q4f c() {
        return this.b;
    }

    @Override // a.a5w
    public final String d() {
        return this.f9896a;
    }

    @Override // a.a5w
    public final double e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof for0)) {
            return false;
        }
        for0 for0Var = (for0) obj;
        return Intrinsics.d(this.f9896a, for0Var.f9896a) && this.b == for0Var.b && Double.compare(this.c, for0Var.c) == 0 && this.d == for0Var.d && Double.compare(this.e, for0Var.e) == 0 && Double.compare(this.f, for0Var.f) == 0 && this.g == for0Var.g && this.h.equals(for0Var.h) && Intrinsics.d(this.i, for0Var.i) && this.j == for0Var.j && this.k == for0Var.k && Intrinsics.d(this.l, for0Var.l) && Intrinsics.d(this.m, for0Var.m) && this.n == for0Var.n && this.o == for0Var.o;
    }

    public final int hashCode() {
        return this.o.hashCode() + rw2.b(dw9.a((this.l.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b((this.g.hashCode() + brm0.d(this.f, brm0.d(this.e, rw2.b(brm0.d(this.c, vqd.b(this.b, this.f9896a.hashCode() * 31, 31), 31), 31, this.d), 31), 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoHistoryItemModel(betId=");
        sb.append(this.f9896a);
        sb.append(", couponType=");
        sb.append(this.b);
        sb.append(", winSum=");
        sb.append(this.c);
        kng0.A(sb, ", date=", this.d, ", coefficient=");
        sb.append(this.e);
        ohs0.A(sb, this.f, ", betSum=", ", status=");
        sb.append(this.g);
        sb.append(", coefficientString=");
        sb.append(this.h);
        sb.append(", betTitle=");
        brm0.C(this.i, ", isApproved=", ", promo=", sb, this.j);
        sb.append(this.k);
        sb.append(", taxBet=");
        sb.append(this.l);
        sb.append(", eventsList=");
        sb.append(this.m);
        sb.append(", betApproveId=");
        sb.append(this.n);
        sb.append(", historyPayoutType=");
        sb.append(this.o);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
