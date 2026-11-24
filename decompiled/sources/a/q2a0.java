package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f27992a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public q2a0(i4 i4Var, long j, long j2, long j3, long j4) {
        i4Var.getClass();
        this.f27992a = i4Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2a0)) {
            return false;
        }
        q2a0 q2a0Var = (q2a0) obj;
        if (!Intrinsics.d(this.f27992a, q2a0Var.f27992a)) {
            return false;
        }
        long j = q2a0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && h2t0.a(this.c, q2a0Var.c) && h2t0.a(this.d, q2a0Var.d) && h2t0.a(this.e, q2a0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f27992a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + rw2.b(rw2.b(rw2.b(iHashCode, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.c);
        String strI3 = y3d.i(this.d);
        String strI4 = y3d.i(this.e);
        StringBuilder sb = new StringBuilder("PlayerDuelStatisticUiModel(playerDuelStatisticValues=");
        sb.append(this.f27992a);
        sb.append(", firstPlayerMainColor=");
        sb.append(strI);
        sb.append(", secondPlayerMainColor=");
        f140.v(sb, strI2, ", firstPlayerGradientColor=", strI3, ", secondPlayerGradientColor=");
        return axq.n(sb, strI4, Separators.RPAREN);
    }
}
