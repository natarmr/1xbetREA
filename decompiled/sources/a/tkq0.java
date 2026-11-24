package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class tkq0 {
    public static final qkq0 Companion = new qkq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34109a;
    public final int b;
    public final String c;

    public /* synthetic */ tkq0(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, nkq0.f23693a.getDescriptor());
            throw null;
        }
        this.f34109a = i2;
        this.b = i3;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkq0)) {
            return false;
        }
        tkq0 tkq0Var = (tkq0) obj;
        return this.f34109a == tkq0Var.f34109a && this.b == tkq0Var.b && Intrinsics.d(this.c, tkq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f34109a) * 31, 31);
    }

    public final String toString() {
        return axq.n(dw9.t("TimeLimitsValue(limitValue=", this.f34109a, ", limitType=", ", limitMeasure=", this.b), this.c, Separators.RPAREN);
    }

    public tkq0(int i, int i2, String str) {
        this.f34109a = i;
        this.b = i2;
        this.c = str;
    }
}
