package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class h2f {
    public static final g2f Companion = new g2f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12329a;
    public final int b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public /* synthetic */ h2f(int i, String str, int i2, String str2, boolean z, int i3, boolean z2) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, f2f.f8809a.getDescriptor());
            throw null;
        }
        this.f12329a = str;
        this.b = i2;
        this.c = str2;
        this.d = z;
        this.e = i3;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2f)) {
            return false;
        }
        h2f h2fVar = (h2f) obj;
        return Intrinsics.d(this.f12329a, h2fVar.f12329a) && this.b == h2fVar.b && Intrinsics.d(this.c, h2fVar.c) && this.d == h2fVar.d && this.e == h2fVar.e && this.f == h2fVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, brm0.e(ua80.b(twn.a(this.b, this.f12329a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "CouponScannerRequest(language=", this.f12329a, ", cfView=", ", betId=");
        brm0.C(this.c, ", calculateSaleInfo=", ", fCountry=", sbP, this.d);
        return ohs0.k(this.e, ", fillOutRusNames=", Separators.RPAREN, sbP, this.f);
    }

    public h2f(int i, int i2, String str, String str2, boolean z) {
        this.f12329a = str;
        this.b = i;
        this.c = str2;
        this.d = true;
        this.e = i2;
        this.f = z;
    }
}
