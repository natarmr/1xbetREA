package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rw7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31205a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public rw7(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f31205a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw7)) {
            return false;
        }
        rw7 rw7Var = (rw7) obj;
        return Intrinsics.d(this.f31205a, rw7Var.f31205a) && Intrinsics.d(this.b, rw7Var.b) && this.c == rw7Var.c && this.d == rw7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f31205a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isLoading=", Separators.RPAREN, b1j.n("BettingBalanceValue(balanceValue=", this.f31205a, ", currency=", this.b, ", showTopUpButtonPulseAnimation="), this.c, this.d);
    }
}
