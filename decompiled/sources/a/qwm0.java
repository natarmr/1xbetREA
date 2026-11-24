package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qwm0 extends swm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29442a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final String f;
    public final int g;

    public qwm0(long j, long j2, long j3, String str, boolean z, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.f29442a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.g = i;
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
        if (!(obj instanceof qwm0)) {
            return false;
        }
        qwm0 qwm0Var = (qwm0) obj;
        return this.f29442a == qwm0Var.f29442a && this.b == qwm0Var.b && this.c == qwm0Var.c && Intrinsics.d(this.d, qwm0Var.d) && this.e == qwm0Var.e && Intrinsics.d(this.f, qwm0Var.f) && this.g == qwm0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ua80.b(brm0.e(ua80.b(rw2.b(rw2.b(Long.hashCode(this.f29442a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f29442a, "Markets(sportId=", ", gameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subGameId=", this.c, ", name=");
        brm0.C(this.d, ", live=", ", componentKey=", sbQ, this.e);
        return brm0.j(this.g, this.f, ", typeId=", Separators.RPAREN, sbQ);
    }
}
