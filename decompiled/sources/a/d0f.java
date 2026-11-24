package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class d0f {
    public static final b0f Companion = new b0f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5265a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final String f;
    public final double g;
    public final long h;
    public final long i;
    public final String j;

    public /* synthetic */ d0f(double d, double d2, double d3, int i, long j, long j2, String str, String str2, String str3, String str4, String str5) {
        if (1023 != (i & 1023)) {
            m2x.I(i, 1023, zze.f45250a.getDescriptor());
            throw null;
        }
        this.f5265a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
        this.f = str4;
        this.g = d3;
        this.h = j;
        this.i = j2;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0f)) {
            return false;
        }
        d0f d0fVar = (d0f) obj;
        return Intrinsics.d(this.f5265a, d0fVar.f5265a) && Intrinsics.d(this.b, d0fVar.b) && Intrinsics.d(this.c, d0fVar.c) && Double.compare(this.d, d0fVar.d) == 0 && Double.compare(this.e, d0fVar.e) == 0 && Intrinsics.d(this.f, d0fVar.f) && Double.compare(this.g, d0fVar.g) == 0 && this.h == d0fVar.h && this.i == d0fVar.i && Intrinsics.d(this.j, d0fVar.j);
    }

    public final int hashCode() {
        String str = this.f5265a;
        int iD = brm0.d(this.e, brm0.d(this.d, ua80.b(ua80.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31), 31);
        String str2 = this.f;
        return this.j.hashCode() + rw2.b(rw2.b(brm0.d(this.g, (iD + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CouponMakeSaleRequest(betId=", this.f5265a, ", language=", this.b, ", lng=");
        hne.A(sbN, this.c, ", saleSum=", this.d);
        ohs0.A(sbN, this.e, ", remainingSum=", ", betGuid=");
        hne.A(sbN, this.f, ", autoSaleOrder=", this.g);
        kng0.A(sbN, ", userId=", this.h, ", userBonusId=");
        kng0.z(sbN, this.i, ", appGUID=", this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public d0f(String str, String str2, String str3, double d, double d2, String str4, double d3, long j, long j2, String str5) {
        brm0.B(str2, str3, str5);
        this.f5265a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
        this.f = str4;
        this.g = d3;
        this.h = j;
        this.i = j2;
        this.j = str5;
    }
}
