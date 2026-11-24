package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tw7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34635a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public tw7(String str, String str2, String str3, boolean z, boolean z2) {
        brm0.B(str, str2, str3);
        this.f34635a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw7)) {
            return false;
        }
        tw7 tw7Var = (tw7) obj;
        return Intrinsics.d(this.f34635a, tw7Var.f34635a) && Intrinsics.d(this.b, tw7Var.b) && this.c == tw7Var.c && this.d == tw7Var.d && Intrinsics.d(this.e, tw7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(brm0.e(ua80.b(this.f34635a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BettingBalanceValue(balanceValue=", this.f34635a, ", currency=", this.b, ", showTopUpButtonPulseAnimation=");
        ua80.u(", isLoading=", ", balanceTitle=", sbN, this.c, this.d);
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
