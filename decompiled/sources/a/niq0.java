package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class niq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bnz f23602a;
    public final xrz b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final krz h;
    public final List i;
    public final sl j;
    public final boolean k;

    public niq0(bnz bnzVar, xrz xrzVar, long j, long j2, boolean z, boolean z2, boolean z3, krz krzVar, List list, sl slVar, boolean z4) {
        bnzVar.getClass();
        list.getClass();
        this.f23602a = bnzVar;
        this.b = xrzVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = krzVar;
        this.i = list;
        this.j = slVar;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niq0)) {
            return false;
        }
        niq0 niq0Var = (niq0) obj;
        return this.f23602a == niq0Var.f23602a && this.b.equals(niq0Var.b) && this.c == niq0Var.c && this.d == niq0Var.d && this.e == niq0Var.e && this.f == niq0Var.f && this.g == niq0Var.g && this.h == niq0Var.h && Intrinsics.d(this.i, niq0Var.i) && Intrinsics.d(this.j, niq0Var.j) && this.k == niq0Var.k;
    }

    public final int hashCode() {
        int iA = dw9.a((this.h.hashCode() + brm0.e(brm0.e(brm0.e(rw2.b(rw2.b((this.b.hashCode() + (this.f23602a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i);
        sl slVar = this.j;
        return Boolean.hashCode(this.k) + ((iA + (slVar == null ? 0 : slVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitModel(group=");
        sb.append(this.f23602a);
        sb.append(", limitType=");
        sb.append(this.b);
        sb.append(", endsAt=");
        sb.append(this.c);
        kng0.A(sb, ", limitValue=", this.d, ", freeValue=");
        ua80.u(", changeAvailable=", ", deleteAvailable=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", limitState=");
        sb.append(this.h);
        sb.append(", availableValueModels=");
        sb.append(this.i);
        sb.append(", activeLimitValue=");
        sb.append(this.j);
        sb.append(", setWithoutValue=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }
}
