package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xfq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40804a;
    public final xeq0 b;
    public final yeq0 c;
    public final csr d;
    public final long e;
    public final double f;
    public final double g;
    public final double h;

    public xfq0(int i, xeq0 xeq0Var, yeq0 yeq0Var, csr csrVar, long j, double d, double d2, double d3) {
        csrVar.getClass();
        this.f40804a = i;
        this.b = xeq0Var;
        this.c = yeq0Var;
        this.d = csrVar;
        this.e = j;
        this.f = d;
        this.g = d2;
        this.h = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfq0)) {
            return false;
        }
        xfq0 xfq0Var = (xfq0) obj;
        return this.f40804a == xfq0Var.f40804a && this.b.equals(xfq0Var.b) && this.c == xfq0Var.c && Intrinsics.d(this.d, xfq0Var.d) && this.e == xfq0Var.e && Double.compare(this.f, xfq0Var.f) == 0 && Double.compare(this.g, xfq0Var.g) == 0 && Double.compare(this.h, xfq0Var.h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.h) + brm0.d(this.g, brm0.d(this.f, rw2.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f40804a) * 31)) * 31)) * 31)) * 31, 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileMatchingModel(actionNumber=");
        sb.append(this.f40804a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", bonusInfo=");
        sb.append(this.d);
        sb.append(", accountId=");
        sb.append(this.e);
        ohs0.A(sb, this.f, ", betSum=", ", winSum=");
        sb.append(this.g);
        return brm0.m(sb, this.h, ", balanceNew=", Separators.RPAREN);
    }
}
