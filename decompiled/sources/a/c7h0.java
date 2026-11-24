package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c7h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3862a;
    public final double b;
    public final double c;
    public final double d;
    public final j7h0 e;
    public final List f;
    public final List g;

    public c7h0(long j, double d, double d2, double d3, j7h0 j7h0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f3862a = j;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = j7h0Var;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7h0)) {
            return false;
        }
        c7h0 c7h0Var = (c7h0) obj;
        return this.f3862a == c7h0Var.f3862a && Double.compare(this.b, c7h0Var.b) == 0 && Double.compare(this.c, c7h0Var.c) == 0 && Double.compare(this.d, c7h0Var.d) == 0 && this.e == c7h0Var.e && Intrinsics.d(this.f, c7h0Var.f) && Intrinsics.d(this.g, c7h0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a((this.e.hashCode() + brm0.d(this.d, brm0.d(this.c, brm0.d(this.b, Long.hashCode(this.f3862a) * 31, 31), 31), 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f3862a, "ScratchCardModel(accountId=", ", newBalance=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", winSum=", ", coefficient=");
        sbQ.append(this.d);
        sbQ.append(", gameStatus=");
        sbQ.append(this.e);
        hne.v(", gameField=", ", winLines=", sbQ, this.f, this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
