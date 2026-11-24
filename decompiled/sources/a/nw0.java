package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24212a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ax0 h;

    public nw0(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, ax0 ax0Var) {
        brm0.B(str, str3, str4);
        this.f24212a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = ax0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw0)) {
            return false;
        }
        nw0 nw0Var = (nw0) obj;
        return Intrinsics.d(this.f24212a, nw0Var.f24212a) && Intrinsics.d(this.b, nw0Var.b) && Intrinsics.d(this.c, nw0Var.c) && Intrinsics.d(this.d, nw0Var.d) && this.e == nw0Var.e && this.f == nw0Var.f && this.g == nw0Var.g && this.h.equals(nw0Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.f24212a.hashCode() * 31;
        String str = this.b;
        return this.h.hashCode() + brm0.e(brm0.e(brm0.e(ua80.b(ua80.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorGameUiState(title=", this.f24212a, ", taxLabel=", this.b, ", gameUrl=");
        f140.v(sbN, this.c, ", lobbyUrl=", this.d, ", paymentEnabled=");
        ua80.u(", debugAllowed=", ", isLoading=", sbN, this.e, this.f);
        sbN.append(this.g);
        sbN.append(", aggregatorGameWebViewState=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
