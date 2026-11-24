package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pwm0 extends swm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27718a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final String f;

    public pwm0(long j, long j2, long j3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f27718a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
        this.f = str2;
    }

    @Override // a.swm0
    public final String a() {
        return this.d;
    }

    @Override // a.swm0
    public final long b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwm0)) {
            return false;
        }
        pwm0 pwm0Var = (pwm0) obj;
        return this.f27718a == pwm0Var.f27718a && this.b == pwm0Var.b && this.c == pwm0Var.c && Intrinsics.d(this.d, pwm0Var.d) && this.e == pwm0Var.e && Intrinsics.d(this.f, pwm0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f27718a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f27718a, "Insights(sportId=", ", gameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subGameId=", this.c, ", name=");
        brm0.C(this.d, ", live=", ", componentKey=", sbQ, this.e);
        return axq.n(sbQ, this.f, Separators.RPAREN);
    }
}
