package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class an00 {
    public static final zm00 Companion = new zm00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1127a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public /* synthetic */ an00(int i, long j, String str, String str2, int i2, int i3) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, ym00.f42864a.getDescriptor());
            throw null;
        }
        this.f1127a = j;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an00)) {
            return false;
        }
        an00 an00Var = (an00) obj;
        return this.f1127a == an00Var.f1127a && Intrinsics.d(this.b, an00Var.b) && Intrinsics.d(this.c, an00Var.c) && this.d == an00Var.d && this.e == an00Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f1127a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f1127a, "LoadCouponWithUserIdRequest(userId=", ", guid=", this.b);
        axq.s(this.d, ", lng=", this.c, ", partner=", sbO);
        return vqd.p(sbO, ", cfView=", this.e, Separators.RPAREN);
    }

    public an00(int i, long j, String str, String str2) {
        str.getClass();
        this.f1127a = j;
        this.b = str;
        this.c = str2;
        this.d = 1;
        this.e = i;
    }
}
