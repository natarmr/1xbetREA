package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class sn40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitNeGroupEnum f32475a;
    public final wrz b;
    public final String c;
    public final boolean d;
    public final orz e;
    public final long f;
    public final double g;
    public final boolean h;
    public final Long i;
    public final long j;
    public final i8r k;

    public sn40(LimitNeGroupEnum limitNeGroupEnum, wrz wrzVar, String str, boolean z, orz orzVar, long j, double d, boolean z2, Long l, long j2, i8r i8rVar) {
        str.getClass();
        this.f32475a = limitNeGroupEnum;
        this.b = wrzVar;
        this.c = str;
        this.d = z;
        this.e = orzVar;
        this.f = j;
        this.g = d;
        this.h = z2;
        this.i = l;
        this.j = j2;
        this.k = i8rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn40)) {
            return false;
        }
        sn40 sn40Var = (sn40) obj;
        return this.f32475a == sn40Var.f32475a && this.b.equals(sn40Var.b) && Intrinsics.d(this.c, sn40Var.c) && this.d == sn40Var.d && this.e == sn40Var.e && this.f == sn40Var.f && Double.compare(this.g, sn40Var.g) == 0 && this.h == sn40Var.h && Intrinsics.d(this.i, sn40Var.i) && this.j == sn40Var.j && Intrinsics.d(this.k, sn40Var.k);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.d(this.g, rw2.b((this.e.hashCode() + brm0.e(ua80.b((this.b.hashCode() + (this.f32475a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31), 31, this.h);
        Long l = this.i;
        int iB = rw2.b((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.j);
        i8r i8rVar = this.k;
        return iB + (i8rVar != null ? i8rVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyLimitModel(limitGroup=");
        sb.append(this.f32475a);
        sb.append(", limitType=");
        sb.append(this.b);
        sb.append(", currency=");
        brm0.C(this.c, ", freeValue=", ", limitState=", sb, this.d);
        sb.append(this.e);
        sb.append(", endsAt=");
        sb.append(this.f);
        ohs0.A(sb, this.g, ", limitValue=", ", needApprove=");
        sb.append(this.h);
        sb.append(", pendingValue=");
        sb.append(this.i);
        sb.append(", pendingEndsAt=");
        sb.append(this.j);
        sb.append(", freeValueConfiguration=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
