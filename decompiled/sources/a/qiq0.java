package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class qiq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitKenyaGroupEnum f28804a;
    public final vrz b;
    public final long c;
    public final String d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final nrz i;
    public final List j;
    public final boolean k;

    public qiq0(LimitKenyaGroupEnum limitKenyaGroupEnum, vrz vrzVar, long j, String str, long j2, boolean z, boolean z2, boolean z3, nrz nrzVar, List list, boolean z4) {
        list.getClass();
        this.f28804a = limitKenyaGroupEnum;
        this.b = vrzVar;
        this.c = j;
        this.d = str;
        this.e = j2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = nrzVar;
        this.j = list;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qiq0)) {
            return false;
        }
        qiq0 qiq0Var = (qiq0) obj;
        return this.f28804a == qiq0Var.f28804a && this.b.equals(qiq0Var.b) && this.c == qiq0Var.c && this.d.equals(qiq0Var.d) && this.e == qiq0Var.e && this.f == qiq0Var.f && this.g == qiq0Var.g && this.h == qiq0Var.h && this.i == qiq0Var.i && Intrinsics.d(this.j, qiq0Var.j) && this.k == qiq0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + dw9.a((this.i.hashCode() + brm0.e(brm0.e(brm0.e(rw2.b(ua80.b(rw2.b((this.b.hashCode() + (this.f28804a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitModel(limitGroup=");
        sb.append(this.f28804a);
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
