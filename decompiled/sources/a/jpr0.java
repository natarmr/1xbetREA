package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jpr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16916a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;

    public jpr0(String str, String str2, String str3, String str4, long j) {
        cs0.x(str, str2, str3, str4);
        this.f16916a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpr0)) {
            return false;
        }
        jpr0 jpr0Var = (jpr0) obj;
        return Intrinsics.d(this.f16916a, jpr0Var.f16916a) && Intrinsics.d(this.b, jpr0Var.b) && Intrinsics.d(this.c, jpr0Var.c) && this.d == jpr0Var.d && Intrinsics.d(this.e, jpr0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(ua80.b(ua80.b(this.f16916a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TotoJackpotBannerUiModel(roundNumber=", this.f16916a, ", jackpotValue=", this.b, ", acceptingBetsTime=");
        defpackage.c.i(sbN, this.d, this.c, ", timeTermination=");
        return rw2.o(sbN, ", jackpotTitle=", this.e, Separators.RPAREN);
    }
}
