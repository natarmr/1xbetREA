package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class c7i0 {
    public static final y6i0 Companion = new y6i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3864a;
    public final int b;
    public final String c;
    public final int d;

    public /* synthetic */ c7i0(int i, int i2, int i3, int i4, String str) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, u6i0.f35138a.getDescriptor());
            throw null;
        }
        this.f3864a = i2;
        this.b = i3;
        this.c = str;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7i0)) {
            return false;
        }
        c7i0 c7i0Var = (c7i0) obj;
        return this.f3864a == c7i0Var.f3864a && this.b == c7i0Var.b && Intrinsics.d(this.c, c7i0Var.c) && this.d == c7i0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(twn.a(this.b, Integer.hashCode(this.f3864a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return brm0.j(this.d, this.c, ", selfExcludeReasonId=", Separators.RPAREN, dw9.t("SelfExcludeLimitsValue(limitValue=", this.f3864a, ", limitType=", ", limitMeasure=", this.b));
    }

    public c7i0(int i, int i2, String str) {
        str.getClass();
        this.f3864a = i;
        this.b = 30;
        this.c = str;
        this.d = i2;
    }
}
