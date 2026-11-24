package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ipf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15161a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public ipf0(String str, String str2, String str3, boolean z, boolean z2) {
        brm0.B(str, str2, str3);
        this.f15161a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public static ipf0 a(ipf0 ipf0Var, String str, int i) {
        boolean z = (i & 1) != 0 ? ipf0Var.f15161a : false;
        boolean z2 = ipf0Var.b;
        String str2 = ipf0Var.c;
        if ((i & 8) != 0) {
            str = ipf0Var.d;
        }
        String str3 = str;
        String str4 = ipf0Var.e;
        ipf0Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new ipf0(str2, str3, str4, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipf0)) {
            return false;
        }
        ipf0 ipf0Var = (ipf0) obj;
        return this.f15161a == ipf0Var.f15161a && this.b == ipf0Var.b && Intrinsics.d(this.c, ipf0Var.c) && Intrinsics.d(this.d, ipf0Var.d) && Intrinsics.d(this.e, ipf0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f15161a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("CurrentBetState(takeMoneyButtonVisible=", ", currentBetTextVisible=", ", currentWin=", this.f15161a, this.b);
        f140.v(sbQ, this.c, ", currentBet=", this.d, ", currency=");
        return axq.n(sbQ, this.e, Separators.RPAREN);
    }

    public /* synthetic */ ipf0() {
        this("", "", "", false, false);
    }
}
