package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rnp0 implements tnp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30800a;
    public final long b;
    public final long c;
    public final Integer d;

    public rnp0(long j, long j2, long j3, Integer num) {
        this.f30800a = j;
        this.b = j2;
        this.c = j3;
        this.d = num;
    }

    @Override // a.tnp0
    public final long a() {
        return this.f30800a;
    }

    @Override // a.tnp0
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnp0)) {
            return false;
        }
        rnp0 rnp0Var = (rnp0) obj;
        return this.f30800a == rnp0Var.f30800a && this.b == rnp0Var.b && this.c == rnp0Var.c && Intrinsics.d(this.d, rnp0Var.d);
    }

    public final int hashCode() {
        int iB = rw2.b(rw2.b(Long.hashCode(this.f30800a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30800a, "Cyber(teamId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", cyberType=");
        return dw9.q(sbQ, this.d, Separators.RPAREN);
    }
}
