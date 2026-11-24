package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class riq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitNeGroupEnum f30556a;
    public final wrz b;
    public final boolean c;
    public final orz d;
    public final long e;
    public final String f;
    public final double g;
    public final boolean h;
    public final Long i;
    public final long j;
    public final List k;
    public final i8r l;

    public riq0(LimitNeGroupEnum limitNeGroupEnum, wrz wrzVar, boolean z, orz orzVar, long j, String str, double d, boolean z2, Long l, long j2, List list, i8r i8rVar) {
        list.getClass();
        this.f30556a = limitNeGroupEnum;
        this.b = wrzVar;
        this.c = z;
        this.d = orzVar;
        this.e = j;
        this.f = str;
        this.g = d;
        this.h = z2;
        this.i = l;
        this.j = j2;
        this.k = list;
        this.l = i8rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof riq0)) {
            return false;
        }
        riq0 riq0Var = (riq0) obj;
        return this.f30556a == riq0Var.f30556a && this.b.equals(riq0Var.b) && this.c == riq0Var.c && this.d == riq0Var.d && this.e == riq0Var.e && this.f.equals(riq0Var.f) && Double.compare(this.g, riq0Var.g) == 0 && this.h == riq0Var.h && Intrinsics.d(this.i, riq0Var.i) && this.j == riq0Var.j && Intrinsics.d(this.k, riq0Var.k) && Intrinsics.d(this.l, riq0Var.l);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.d(this.g, ua80.b(rw2.b((this.d.hashCode() + brm0.e((this.b.hashCode() + (this.f30556a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31), 31, this.h);
        Long l = this.i;
        int iA = dw9.a(rw2.b((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.j), 31, this.k);
        i8r i8rVar = this.l;
        return iA + (i8rVar != null ? i8rVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitModel(limitGroup=");
        sb.append(this.f30556a);
        sb.append(", limitType=");
        sb.append(this.b);
        sb.append(", freeValue=");
        sb.append(this.c);
        sb.append(", limitState=");
        sb.append(this.d);
        sb.append(", endsAt=");
        kng0.z(sb, this.e, ", endsAtView=", this.f);
        ohs0.A(sb, this.g, ", limitValue=", ", needApprove=");
        sb.append(this.h);
        sb.append(", pendingValue=");
        sb.append(this.i);
        sb.append(", pendingEndsAt=");
        hne.x(sb, this.j, ", availableValueModels=", this.k);
        sb.append(", freeValueConfiguration=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
