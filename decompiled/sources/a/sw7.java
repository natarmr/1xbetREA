package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sw7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32907a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public sw7(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f32907a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw7)) {
            return false;
        }
        sw7 sw7Var = (sw7) obj;
        return Intrinsics.d(this.f32907a, sw7Var.f32907a) && Intrinsics.d(this.b, sw7Var.b) && this.c == sw7Var.c && this.d == sw7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f32907a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isLoading=", Separators.RPAREN, b1j.n("BettingBalanceValue(balanceValue=", this.f32907a, ", currency=", this.b, ", showTopUpButtonPulseAnimation="), this.c, this.d);
    }
}
