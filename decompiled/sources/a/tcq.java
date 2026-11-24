package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class tcq {
    public static final scq Companion = new scq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f33729a;
    public final int b;
    public final String c;

    public /* synthetic */ tcq(double d, int i, int i2, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, rcq.f30252a.getDescriptor());
            throw null;
        }
        this.f33729a = d;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcq)) {
            return false;
        }
        tcq tcqVar = (tcq) obj;
        return Double.compare(this.f33729a, tcqVar.f33729a) == 0 && this.b == tcqVar.b && Intrinsics.d(this.c, tcqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Double.hashCode(this.f33729a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinancialLimitsValueRequest(limitValue=");
        sb.append(this.f33729a);
        sb.append(", limitType=");
        sb.append(this.b);
        return rw2.o(sb, ", currency=", this.c, Separators.RPAREN);
    }

    public tcq(double d, int i, String str) {
        str.getClass();
        this.f33729a = d;
        this.b = i;
        this.c = str;
    }
}
