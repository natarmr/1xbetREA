package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_ee.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class piq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitGroupEnum f27056a;
    public final urz b;
    public final long c;
    public final String d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final mrz i;
    public final List j;
    public final boolean k;

    public piq0(LimitGroupEnum limitGroupEnum, urz urzVar, long j, String str, long j2, boolean z, boolean z2, boolean z3, mrz mrzVar, List list, boolean z4) {
        list.getClass();
        this.f27056a = limitGroupEnum;
        this.b = urzVar;
        this.c = j;
        this.d = str;
        this.e = j2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = mrzVar;
        this.j = list;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piq0)) {
            return false;
        }
        piq0 piq0Var = (piq0) obj;
        return this.f27056a == piq0Var.f27056a && this.b.equals(piq0Var.b) && this.c == piq0Var.c && this.d.equals(piq0Var.d) && this.e == piq0Var.e && this.f == piq0Var.f && this.g == piq0Var.g && this.h == piq0Var.h && this.i == piq0Var.i && Intrinsics.d(this.j, piq0Var.j) && this.k == piq0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + dw9.a((this.i.hashCode() + brm0.e(brm0.e(brm0.e(rw2.b(ua80.b(rw2.b((this.b.hashCode() + (this.f27056a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitModel(limitGroup=");
        sb.append(this.f27056a);
        sb.append(", limitType=");
        sb.append(this.b);
        sb.append(", endsAt=");
        kng0.z(sb, this.c, ", endsAtView=", this.d);
        kng0.A(sb, ", limitValue=", this.e, ", freeValue=");
        ua80.u(", changeAvailable=", ", deleteAvailable=", sb, this.f, this.g);
        sb.append(this.h);
        sb.append(", limitState=");
        sb.append(this.i);
        sb.append(", availableValueModels=");
        sb.append(this.j);
        sb.append(", setWithoutValue=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
