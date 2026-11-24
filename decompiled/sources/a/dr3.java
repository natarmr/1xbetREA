package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6541a;
    public final int b;
    public final double c;
    public final double d;
    public final lnm0 e;
    public final double f;
    public final List g;
    public final List h;
    public final List i;
    public final csr j;
    public final List k;

    public dr3(long j, int i, double d, double d2, lnm0 lnm0Var, double d3, List list, List list2, List list3, csr csrVar, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        csrVar.getClass();
        list4.getClass();
        this.f6541a = j;
        this.b = i;
        this.c = d;
        this.d = d2;
        this.e = lnm0Var;
        this.f = d3;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = csrVar;
        this.k = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr3)) {
            return false;
        }
        dr3 dr3Var = (dr3) obj;
        return this.f6541a == dr3Var.f6541a && this.b == dr3Var.b && Double.compare(this.c, dr3Var.c) == 0 && Double.compare(this.d, dr3Var.d) == 0 && this.e == dr3Var.e && Double.compare(this.f, dr3Var.f) == 0 && Intrinsics.d(this.g, dr3Var.g) && Intrinsics.d(this.h, dr3Var.h) && Intrinsics.d(this.i, dr3Var.i) && Intrinsics.d(this.j, dr3Var.j) && Intrinsics.d(this.k, dr3Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + dw9.a(dw9.a(dw9.a(brm0.d(this.f, (this.e.hashCode() + brm0.d(this.d, brm0.d(this.c, twn.a(this.b, Long.hashCode(this.f6541a) * 31, 31), 31), 31)) * 31, 31), 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f6541a, "AppleFortuneScrollCellModel(accountId=", ", actionStep=");
        ohs0.A(sbQ, this.c, ", betSum=", ", newBalance=");
        sbQ.append(this.d);
        sbQ.append(", gameStatus=");
        sbQ.append(this.e);
        ohs0.A(sbQ, this.f, ", winSum=", ", coefficients=");
        b1j.y(", winSums=", ", playerPositions=", sbQ, this.g, this.h);
        sbQ.append(this.i);
        sbQ.append(", bonusInfo=");
        sbQ.append(this.j);
        sbQ.append(", itemPositions=");
        return dw9.r(sbQ, this.k, Separators.RPAREN);
    }
}
