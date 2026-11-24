package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class twu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34668a;
    public final String b;
    public final String c;

    public twu0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f34668a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twu0)) {
            return false;
        }
        twu0 twu0Var = (twu0) obj;
        return Intrinsics.d(this.f34668a, twu0Var.f34668a) && Intrinsics.d(this.b, twu0Var.b) && Intrinsics.d(this.c, twu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f34668a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("WalletMoneyChooseUiState(title=", this.f34668a, ", topUpTitle=", this.b, ", withdrawTitle="), this.c, Separators.RPAREN);
    }
}
