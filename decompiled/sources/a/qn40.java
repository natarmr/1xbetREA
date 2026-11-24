package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_ee.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class qn40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitGroupEnum f29014a;
    public final l810 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final mrz h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final boolean m;
    public final long n;
    public final long o;
    public final List p;
    public final boolean q;

    public qn40(LimitGroupEnum limitGroupEnum, l810 l810Var, String str, String str2, boolean z, boolean z2, boolean z3, mrz mrzVar, long j, long j2, long j3, long j4, boolean z4, long j5, long j6, List list, boolean z5) {
        str.getClass();
        list.getClass();
        this.f29014a = limitGroupEnum;
        this.b = l810Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = mrzVar;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = z4;
        this.n = j5;
        this.o = j6;
        this.p = list;
        this.q = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn40)) {
            return false;
        }
        qn40 qn40Var = (qn40) obj;
        return this.f29014a == qn40Var.f29014a && this.b == qn40Var.b && Intrinsics.d(this.c, qn40Var.c) && this.d.equals(qn40Var.d) && this.e == qn40Var.e && this.f == qn40Var.f && this.g == qn40Var.g && this.h == qn40Var.h && this.i == qn40Var.i && this.j == qn40Var.j && this.k == qn40Var.k && this.l == qn40Var.l && this.m == qn40Var.m && this.n == qn40Var.n && this.o == qn40Var.o && Intrinsics.d(this.p, qn40Var.p) && this.q == qn40Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + dw9.a(rw2.b(rw2.b(brm0.e(rw2.b(rw2.b(rw2.b(rw2.b((this.h.hashCode() + brm0.e(brm0.e(brm0.e(ua80.b(ua80.b((this.b.hashCode() + (this.f29014a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyLimitModel(limitGroup=");
        sb.append(this.f29014a);
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
        sb.append(this.k);
        kng0.A(sb, ", limitValue=", this.l, ", needApprove=");
        rw2.v(this.n, ", pendingValue=", sb, this.m);
        kng0.A(sb, ", pendingEndsAt=", this.o, ", availableValueModels=");
        sb.append(this.p);
        sb.append(", setWithoutValue=");
        sb.append(this.q);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
