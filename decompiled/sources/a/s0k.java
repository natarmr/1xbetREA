package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31412a;
    public final long b;

    public s0k(String str, long j) {
        str.getClass();
        this.f31412a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0k)) {
            return false;
        }
        s0k s0kVar = (s0k) obj;
        return Intrinsics.d(this.f31412a, s0kVar.f31412a) && this.b == s0kVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f31412a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnTransactionClicked(betId=", this.f31412a, ", balanceId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
