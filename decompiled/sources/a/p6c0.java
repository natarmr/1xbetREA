package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p6c0 implements r6c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26448a;
    public final String b;
    public final String c;
    public final String d;

    public p6c0(long j, String str, String str2, String str3) {
        str2.getClass();
        this.f26448a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6c0)) {
            return false;
        }
        p6c0 p6c0Var = (p6c0) obj;
        return this.f26448a == p6c0Var.f26448a && this.b.equals(p6c0Var.b) && Intrinsics.d(this.c, p6c0Var.c) && Intrinsics.d(this.d, p6c0Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(Long.hashCode(this.f26448a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26448a, "ShowSuccessBet(balanceId=", ", coefficient=", this.b);
        f140.v(sbO, ", betNumber=", this.c, ", shareText=", this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
