package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class siq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bnz f32275a;
    public final xrz b;
    public final long c;
    public final String d;
    public final double e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final lrz j;
    public final List k;
    public final tl l;
    public final boolean m;

    public siq0(bnz bnzVar, xrz xrzVar, long j, String str, double d, boolean z, boolean z2, boolean z3, boolean z4, lrz lrzVar, List list, tl tlVar, boolean z5) {
        bnzVar.getClass();
        list.getClass();
        this.f32275a = bnzVar;
        this.b = xrzVar;
        this.c = j;
        this.d = str;
        this.e = d;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = lrzVar;
        this.k = list;
        this.l = tlVar;
        this.m = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof siq0)) {
            return false;
        }
        siq0 siq0Var = (siq0) obj;
        return this.f32275a == siq0Var.f32275a && this.b.equals(siq0Var.b) && this.c == siq0Var.c && this.d.equals(siq0Var.d) && Double.compare(this.e, siq0Var.e) == 0 && this.f == siq0Var.f && this.g == siq0Var.g && this.h == siq0Var.h && this.i == siq0Var.i && this.j == siq0Var.j && Intrinsics.d(this.k, siq0Var.k) && Intrinsics.d(this.l, siq0Var.l) && this.m == siq0Var.m;
    }

    public final int hashCode() {
        int iA = dw9.a((this.j.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.d(this.e, ua80.b(rw2.b((this.b.hashCode() + (this.f32275a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k);
        tl tlVar = this.l;
        return Boolean.hashCode(this.m) + ((iA + (tlVar == null ? 0 : tlVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitModel(group=");
        sb.append(this.f32275a);
        sb.append(", limitType=");
        sb.append(this.b);
        sb.append(", endsAt=");
        kng0.z(sb, this.c, ", endsAtView=", this.d);
        ohs0.A(sb, this.e, ", limitValue=", ", needApprove=");
        ua80.u(", freeValue=", ", changeAvailable=", sb, this.f, this.g);
        ua80.u(", deleteAvailable=", ", limitState=", sb, this.h, this.i);
        sb.append(this.j);
        sb.append(", availableValueModels=");
        sb.append(this.k);
        sb.append(", activeLimitValue=");
        sb.append(this.l);
        sb.append(", setWithoutValue=");
        sb.append(this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
