package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class a7i0 {
    public static final w6i0 Companion = new w6i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f372a;
    public final int b;
    public final String c;

    public /* synthetic */ a7i0(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, s6i0.f31704a.getDescriptor());
            throw null;
        }
        this.f372a = i2;
        this.b = i3;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7i0)) {
            return false;
        }
        a7i0 a7i0Var = (a7i0) obj;
        return this.f372a == a7i0Var.f372a && this.b == a7i0Var.b && Intrinsics.d(this.c, a7i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f372a) * 31, 31);
    }

    public final String toString() {
        return axq.n(dw9.t("SelfExcludeLimitsValue(limitValue=", this.f372a, ", limitType=", ", limitMeasure=", this.b), this.c, Separators.RPAREN);
    }

    public a7i0(int i, String str) {
        str.getClass();
        this.f372a = i;
        this.b = 30;
        this.c = str;
    }
}
