package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vyk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38252a;
    public final double b;
    public final double c;
    public final List d;
    public final iyk0 e;
    public final double f;
    public final String g;

    public vyk0(long j, double d, double d2, List list, iyk0 iyk0Var, double d3, String str) {
        list.getClass();
        this.f38252a = j;
        this.b = d;
        this.c = d2;
        this.d = list;
        this.e = iyk0Var;
        this.f = d3;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyk0)) {
            return false;
        }
        vyk0 vyk0Var = (vyk0) obj;
        return this.f38252a == vyk0Var.f38252a && Double.compare(this.b, vyk0Var.b) == 0 && Double.compare(this.c, vyk0Var.c) == 0 && Intrinsics.d(this.d, vyk0Var.d) && this.e == vyk0Var.e && Double.compare(this.f, vyk0Var.f) == 0 && Intrinsics.d(this.g, vyk0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.d(this.f, (this.e.hashCode() + dw9.a(brm0.d(this.c, brm0.d(this.b, Long.hashCode(this.f38252a) * 31, 31), 31), 31, this.d)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f38252a, "SpinAndWinModel(accountId=", ", coefficient=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", balanceNew=", ", result=");
        sbQ.append(this.d);
        sbQ.append(", gameState=");
        sbQ.append(this.e);
        sbQ.append(", winSum=");
        hne.w(sbQ, this.f, ", gameId=", this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public vyk0() {
        this(0L, 0.0d, 0.0d, iun.f15405a, iyk0.b, 0.0d, "");
    }
}
