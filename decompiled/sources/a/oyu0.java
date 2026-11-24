package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class oyu0 {
    public static final nyu0 Companion = new nyu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26075a;
    public final String b;

    public /* synthetic */ oyu0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f26075a = null;
        } else {
            this.f26075a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyu0)) {
            return false;
        }
        oyu0 oyu0Var = (oyu0) obj;
        return Intrinsics.d(this.f26075a, oyu0Var.f26075a) && Intrinsics.d(this.b, oyu0Var.b);
    }

    public final int hashCode() {
        String str = this.f26075a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("WalletSendSmsCodeResponse(message=", this.f26075a, ", guid=", this.b, Separators.RPAREN);
    }
}
