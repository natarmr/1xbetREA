package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20958a;
    public final long b;

    public m0k(String str, long j) {
        str.getClass();
        this.f20958a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0k)) {
            return false;
        }
        m0k m0kVar = (m0k) obj;
        return Intrinsics.d(this.f20958a, m0kVar.f20958a) && this.b == m0kVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f20958a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnPowerBetClicked(betId=", this.f20958a, ", balanceId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
