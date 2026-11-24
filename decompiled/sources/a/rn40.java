package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class rn40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitKenyaGroupEnum f30770a;
    public final vrz b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final nrz h;
    public final long i;
    public final long j;
    public final long k;
    public final String l;
    public final boolean m;
    public final String n;
    public final long o;
    public final List p;
    public final boolean q;

    public rn40(LimitKenyaGroupEnum limitKenyaGroupEnum, vrz vrzVar, String str, String str2, boolean z, boolean z2, boolean z3, nrz nrzVar, long j, long j2, long j3, String str3, boolean z4, String str4, long j4, List list, boolean z5) {
        str.getClass();
        list.getClass();
        this.f30770a = limitKenyaGroupEnum;
        this.b = vrzVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = nrzVar;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = str3;
        this.m = z4;
        this.n = str4;
        this.o = j4;
        this.p = list;
        this.q = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn40)) {
            return false;
        }
        rn40 rn40Var = (rn40) obj;
        return this.f30770a == rn40Var.f30770a && this.b.equals(rn40Var.b) && Intrinsics.d(this.c, rn40Var.c) && this.d.equals(rn40Var.d) && this.e == rn40Var.e && this.f == rn40Var.f && this.g == rn40Var.g && this.h == rn40Var.h && this.i == rn40Var.i && this.j == rn40Var.j && this.k == rn40Var.k && this.l.equals(rn40Var.l) && this.m == rn40Var.m && this.n.equals(rn40Var.n) && this.o == rn40Var.o && Intrinsics.d(this.p, rn40Var.p) && this.q == rn40Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + dw9.a(rw2.b(ua80.b(brm0.e(ua80.b(rw2.b(rw2.b(rw2.b((this.h.hashCode() + brm0.e(brm0.e(brm0.e(ua80.b(ua80.b((this.b.hashCode() + (this.f30770a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyLimitModel(limitGroup=");
        sb.append(this.f30770a);
        sb.append(", limitType=");
        sb.append(this.b);
        sb.append(", currency=");
        f140.v(sb, this.c, ", limitBalance=", this.d, ", freeValue=");
        ua80.u(", changeAvailable=", ", deleteAvailable=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", limitState=");
        sb.append(this.h);
        sb.append(", startedAt=");
        sb.append(this.i);
        kng0.A(sb, ", endsAt=", this.j, ", createdAt=");
        kng0.z(sb, this.k, ", limitValue=", this.l);
        hne.u(", needApprove=", ", pendingValue=", this.n, sb, this.m);
        kng0.A(sb, ", pendingEndsAt=", this.o, ", availableValueModels=");
        sb.append(this.p);
        sb.append(", setWithoutValue=");
        sb.append(this.q);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
