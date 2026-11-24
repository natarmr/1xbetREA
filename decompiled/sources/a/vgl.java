package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37386a;
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

    public vgl(long j, int i, double d, double d2, lnm0 lnm0Var, double d3, List list, List list2, List list3, csr csrVar, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        csrVar.getClass();
        list4.getClass();
        this.f37386a = j;
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
        if (!(obj instanceof vgl)) {
            return false;
        }
        vgl vglVar = (vgl) obj;
        return this.f37386a == vglVar.f37386a && this.b == vglVar.b && Double.compare(this.c, vglVar.c) == 0 && Double.compare(this.d, vglVar.d) == 0 && this.e == vglVar.e && Double.compare(this.f, vglVar.f) == 0 && Intrinsics.d(this.g, vglVar.g) && Intrinsics.d(this.h, vglVar.h) && Intrinsics.d(this.i, vglVar.i) && Intrinsics.d(this.j, vglVar.j) && Intrinsics.d(this.k, vglVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + dw9.a(dw9.a(dw9.a(brm0.d(this.f, (this.e.hashCode() + brm0.d(this.d, brm0.d(this.c, twn.a(this.b, Long.hashCode(this.f37386a) * 31, 31), 31), 31)) * 31, 31), 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f37386a, "DragonsGoldScrollCellModel(accountId=", ", actionStep=");
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
