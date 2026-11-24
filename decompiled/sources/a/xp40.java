package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class xp40 {
    public static final tp40 Companion = new tp40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41252a;
    public final int b;
    public final String c;

    public /* synthetic */ xp40(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, pp40.f27359a.getDescriptor());
            throw null;
        }
        this.f41252a = i2;
        this.b = i3;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp40)) {
            return false;
        }
        xp40 xp40Var = (xp40) obj;
        return this.f41252a == xp40Var.f41252a && this.b == xp40Var.b && Intrinsics.d(this.c, xp40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f41252a) * 31, 31);
    }

    public final String toString() {
        return axq.n(dw9.t("MoneyLimitsValue(limitValue=", this.f41252a, ", limitType=", ", currency=", this.b), this.c, Separators.RPAREN);
    }

    public xp40(int i, int i2, String str) {
        str.getClass();
        this.f41252a = i;
        this.b = i2;
        this.c = str;
    }
}
