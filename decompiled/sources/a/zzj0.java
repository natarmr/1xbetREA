package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zzj0 implements f0k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45257a;
    public final boolean b;
    public final long c;
    public final long d;
    public final qal0 e;

    public zzj0(long j, boolean z, long j2, long j3, qal0 qal0Var) {
        this.f45257a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = qal0Var;
    }

    @Override // a.f0k0
    public final long a() {
        return this.f45257a;
    }

    @Override // a.f0k0
    public final long c() {
        return this.c;
    }

    @Override // a.f0k0
    public final long d() {
        return this.d;
    }

    @Override // a.f0k0
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj0)) {
            return false;
        }
        zzj0 zzj0Var = (zzj0) obj;
        return this.f45257a == zzj0Var.f45257a && this.b == zzj0Var.b && this.c == zzj0Var.c && this.d == zzj0Var.d && Intrinsics.d(this.e, zzj0Var.e);
    }

    @Override // a.f0k0
    public final qal0 f() {
        return this.e;
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(brm0.e(Long.hashCode(this.f45257a) * 31, 31, this.b), 31, this.c), 31, this.d);
        qal0 qal0Var = this.e;
        return iB + (qal0Var == null ? 0 : qal0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f45257a, "BackToReal(gameId=", ", live=", this.b);
        kng0.A(sbR, ", sportId=", this.c, ", subSportId=");
        sbR.append(this.d);
        sbR.append(", timer=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
