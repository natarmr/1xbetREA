package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xgl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40846a;
    public final double b;
    public final double c;
    public final String d;
    public final int e;
    public final long f;
    public final byte g;
    public final long h;
    public final boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public xgl0(long j, double d, double d2, String str, int i, long j2, int i2, long j3, boolean z) {
        str.getClass();
        this.f40846a = j;
        this.b = d;
        this.c = d2;
        this.d = str;
        this.e = i;
        this.f = j2;
        this.g = i2;
        this.h = j3;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgl0)) {
            return false;
        }
        xgl0 xgl0Var = (xgl0) obj;
        return this.f40846a == xgl0Var.f40846a && Double.compare(this.b, xgl0Var.b) == 0 && Double.compare(this.c, xgl0Var.c) == 0 && Intrinsics.d(this.d, xgl0Var.d) && this.e == xgl0Var.e && this.f == xgl0Var.f && this.g == xgl0Var.g && this.h == xgl0Var.h && this.i == xgl0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + rw2.b(twn.a(this.g, rw2.b(twn.a(this.e, ua80.b(brm0.d(this.c, brm0.d(this.b, Long.hashCode(this.f40846a) * 31, 31), 31), 31, this.d), 31), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f40846a, "SportMarketCoefParams(typeId=", ", param=");
        sbQ.append(this.b);
        ohs0.A(sbQ, this.c, ", coef=", ", betName=");
        twn.w(this.e, this.d, ", id=", ", marketGroupId=", sbQ);
        ua80.v(sbQ, this.f, ", kindId=", this.g);
        kng0.A(sbQ, ", gameId=", this.h, ", isHighlight=");
        return rw2.p(sbQ, this.i, Separators.RPAREN);
    }
}
