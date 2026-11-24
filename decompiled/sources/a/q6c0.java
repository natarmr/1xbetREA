package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q6c0 implements s6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28193a;
    public final String b;
    public final String c;
    public final q4f d;
    public final String e;

    public q6c0(long j, String str, String str2, q4f q4fVar, String str3) {
        str2.getClass();
        this.f28193a = j;
        this.b = str;
        this.c = str2;
        this.d = q4fVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6c0)) {
            return false;
        }
        q6c0 q6c0Var = (q6c0) obj;
        return this.f28193a == q6c0Var.f28193a && this.b.equals(q6c0Var.b) && Intrinsics.d(this.c, q6c0Var.c) && this.d == q6c0Var.d && Intrinsics.d(this.e, q6c0Var.e);
    }

    public final int hashCode() {
        int iB = vqd.b(this.d, ua80.b(ua80.b(Long.hashCode(this.f28193a) * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28193a, "ShowSuccessBet(balanceId=", ", coefficient=", this.b);
        sbO.append(", betNumber=");
        sbO.append(this.c);
        sbO.append(", couponType=");
        sbO.append(this.d);
        return rw2.o(sbO, ", shareText=", this.e, Separators.RPAREN);
    }
}
