package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gv00 {
    public static final fv00 Companion = new fv00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11954a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public /* synthetic */ gv00(int i, String str, String str2, String str3, String str4, long j) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, ev00.f8447a.getDescriptor());
            throw null;
        }
        this.f11954a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = System.currentTimeMillis();
        } else {
            this.e = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv00)) {
            return false;
        }
        gv00 gv00Var = (gv00) obj;
        return Intrinsics.d(this.f11954a, gv00Var.f11954a) && Intrinsics.d(this.b, gv00Var.b) && Intrinsics.d(this.c, gv00Var.c) && Intrinsics.d(this.d, gv00Var.d) && this.e == gv00Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ua80.b(ua80.b(ua80.b(this.f11954a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LogData(userId=", this.f11954a, ", wifiName=", this.b, ", carrierName=");
        f140.v(sbN, this.c, ", crashLogs=", this.d, ", timestamp=");
        return brm0.k(this.e, Separators.RPAREN, sbN);
    }

    public gv00(String str, String str2, String str3, String str4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        str.getClass();
        str2.getClass();
        this.f11954a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jCurrentTimeMillis;
    }
}
