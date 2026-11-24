package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lnj0 {
    public static final jnj0 Companion = new jnj0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20348a;
    public final String b;
    public final boolean c;
    public final double d;
    public final boolean e;

    public /* synthetic */ lnj0(int i, int i2, String str, boolean z, double d, boolean z2) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, hnj0.f13356a.getDescriptor());
            throw null;
        }
        this.f20348a = i2;
        this.b = str;
        this.c = z;
        this.d = d;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnj0)) {
            return false;
        }
        lnj0 lnj0Var = (lnj0) obj;
        return this.f20348a == lnj0Var.f20348a && Intrinsics.d(this.b, lnj0Var.b) && this.c == lnj0Var.c && Double.compare(this.d, lnj0Var.d) == 0 && this.e == lnj0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.d(this.d, brm0.e(ua80.b(Integer.hashCode(this.f20348a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f20348a, "ShareCouponRequest(cfView=", ", couponId=", this.b, ", useBetCfView=");
        sbR.append(this.c);
        sbR.append(", timeZone=");
        sbR.append(this.d);
        return f140.n(sbR, ", useTwelveHourTimeFormat=", this.e, Separators.RPAREN);
    }

    public lnj0(int i, String str, double d, boolean z) {
        str.getClass();
        this.f20348a = i;
        this.b = str;
        this.c = false;
        this.d = d;
        this.e = z;
    }
}
