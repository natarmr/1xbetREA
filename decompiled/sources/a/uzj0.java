package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uzj0 implements vzj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36538a;
    public final boolean b;
    public final long c;
    public final long d;
    public final znq0 e;

    public uzj0(long j, boolean z, long j2, long j3, znq0 znq0Var) {
        this.f36538a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = znq0Var;
    }

    @Override // a.vzj0
    public final znq0 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzj0)) {
            return false;
        }
        uzj0 uzj0Var = (uzj0) obj;
        return this.f36538a == uzj0Var.f36538a && this.b == uzj0Var.b && this.c == uzj0Var.c && this.d == uzj0Var.d && Intrinsics.d(this.e, uzj0Var.e);
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(brm0.e(Long.hashCode(this.f36538a) * 31, 31, this.b), 31, this.c), 31, this.d);
        znq0 znq0Var = this.e;
        return iB + (znq0Var == null ? 0 : Long.hashCode(znq0Var.f44687a));
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f36538a, "Simulation(gameId=", ", live=", this.b);
        kng0.A(sbR, ", sportId=", this.c, ", subSportId=");
        sbR.append(this.d);
        sbR.append(", timeStart=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
