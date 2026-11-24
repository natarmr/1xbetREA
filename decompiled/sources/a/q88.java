package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q88 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28287a;
    public final int b;
    public final double c;
    public final double d;
    public final double e;
    public final String f;
    public final String g;

    public q88(double d, double d2, double d3, int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f28287a = i;
        this.b = i2;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q88)) {
            return false;
        }
        q88 q88Var = (q88) obj;
        return this.f28287a == q88Var.f28287a && this.b == q88Var.b && Double.compare(this.c, q88Var.c) == 0 && Double.compare(this.d, q88Var.d) == 0 && Double.compare(this.e, q88Var.e) == 0 && Intrinsics.d(this.f, q88Var.f) && Intrinsics.d(this.g, q88Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, twn.a(this.b, Integer.hashCode(this.f28287a) * 31, 31), 31), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("BlockInfo(blockId=", this.f28287a, ", blockNumber=", ", minBet=", this.b);
        sbT.append(this.c);
        ohs0.A(sbT, this.d, ", maxBet=", ", blockBet=");
        hne.w(sbT, this.e, ", currency=", this.f);
        return rw2.o(sbT, ", savedBlockBet=", this.g, Separators.RPAREN);
    }
}
