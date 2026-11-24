package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class zp40 {
    public static final vp40 Companion = new vp40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44742a;
    public final int b;
    public final String c;

    public /* synthetic */ zp40(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, rp40.f30869a.getDescriptor());
            throw null;
        }
        this.f44742a = i2;
        this.b = i3;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp40)) {
            return false;
        }
        zp40 zp40Var = (zp40) obj;
        return this.f44742a == zp40Var.f44742a && this.b == zp40Var.b && Intrinsics.d(this.c, zp40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f44742a) * 31, 31);
    }

    public final String toString() {
        return axq.n(dw9.t("MoneyLimitsValue(limitValue=", this.f44742a, ", limitType=", ", currency=", this.b), this.c, Separators.RPAREN);
    }

    public zp40(int i, int i2, String str) {
        str.getClass();
        this.f44742a = i;
        this.b = i2;
        this.c = str;
    }
}
