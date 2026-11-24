package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class dwe {
    public static final bwe Companion = new bwe();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6795a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ dwe(int i, long j, long j2, String str, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            m2x.I(i, 63, zve.f45051a.getDescriptor());
            throw null;
        }
        this.f6795a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwe)) {
            return false;
        }
        dwe dweVar = (dwe) obj;
        return this.f6795a == dweVar.f6795a && this.b == dweVar.b && Intrinsics.d(this.c, dweVar.c) && Intrinsics.d(this.d, dweVar.d) && Intrinsics.d(this.e, dweVar.e) && Intrinsics.d(this.f, dweVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f6795a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f6795a, "CouponDeleteOrderRequest(userId=", ", userBonusId=");
        kng0.z(sbQ, this.b, ", appGUID=", this.c);
        f140.v(sbQ, ", language=", this.d, ", betId=", this.e);
        return rw2.o(sbQ, ", lng=", this.f, Separators.RPAREN);
    }

    public dwe(long j, long j2, String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.f6795a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }
}
