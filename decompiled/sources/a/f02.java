package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8698a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;

    public f02(long j, long j2, String str, String str2, String str3, String str4) {
        str2.getClass();
        str3.getClass();
        this.f8698a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f02)) {
            return false;
        }
        f02 f02Var = (f02) obj;
        return this.f8698a.equals(f02Var.f8698a) && Intrinsics.d(this.b, f02Var.b) && Intrinsics.d(this.c, f02Var.c) && this.d == f02Var.d && this.e == f02Var.e && this.f.equals(f02Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(rw2.b(ua80.b(ua80.b(this.f8698a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorWebResult(name=", this.f8698a, ", gameUrl=", this.b, ", lobbyUrl=");
        defpackage.c.i(sbN, this.d, this.c, ", providerId=");
        kng0.A(sbN, ", productId=", this.e, ", message=");
        return axq.n(sbN, this.f, Separators.RPAREN);
    }
}
