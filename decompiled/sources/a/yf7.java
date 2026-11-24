package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class yf7 {
    public static final xf7 Companion = new xf7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f42526a;
    public final int b;
    public final String c;
    public final long d;

    public /* synthetic */ yf7(int i, double d, int i2, String str, long j) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, wf7.f39056a.getDescriptor());
            throw null;
        }
        this.f42526a = d;
        this.b = i2;
        this.c = str;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf7)) {
            return false;
        }
        yf7 yf7Var = (yf7) obj;
        return Double.compare(this.f42526a, yf7Var.f42526a) == 0 && this.b == yf7Var.b && Intrinsics.d(this.c, yf7Var.c) && this.d == yf7Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ua80.b(twn.a(this.b, Double.hashCode(this.f42526a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetLimitsWithPeriodValueRequest(limitValue=");
        sb.append(this.f42526a);
        sb.append(", limitType=");
        sb.append(this.b);
        hne.B(sb, ", currency=", this.c, ", numberOfPeriods=");
        return brm0.k(this.d, Separators.RPAREN, sb);
    }

    public yf7(double d, int i, String str, long j) {
        str.getClass();
        this.f42526a = d;
        this.b = i;
        this.c = str;
        this.d = j;
    }
}
