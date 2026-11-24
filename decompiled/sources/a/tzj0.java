package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tzj0 implements vzj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34807a;
    public final boolean b;
    public final long c;
    public final long d;
    public final znq0 e;

    public tzj0(long j, boolean z, long j2, long j3, znq0 znq0Var) {
        this.f34807a = j;
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
        if (!(obj instanceof tzj0)) {
            return false;
        }
        tzj0 tzj0Var = (tzj0) obj;
        return this.f34807a == tzj0Var.f34807a && this.b == tzj0Var.b && this.c == tzj0Var.c && this.d == tzj0Var.d && Intrinsics.d(this.e, tzj0Var.e);
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(brm0.e(Long.hashCode(this.f34807a) * 31, 31, this.b), 31, this.c), 31, this.d);
        znq0 znq0Var = this.e;
        return iB + (znq0Var == null ? 0 : Long.hashCode(znq0Var.f44687a));
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f34807a, "Real(gameId=", ", live=", this.b);
        kng0.A(sbR, ", sportId=", this.c, ", subSportId=");
        sbR.append(this.d);
        sbR.append(", timeStart=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
