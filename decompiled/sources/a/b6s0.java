package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b6s0 implements d6s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2071a;
    public final String b;

    public b6s0(long j, String str) {
        str.getClass();
        this.f2071a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6s0)) {
            return false;
        }
        b6s0 b6s0Var = (b6s0) obj;
        return this.f2071a == b6s0Var.f2071a && Intrinsics.d(this.b, b6s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f2071a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f2071a, "ShowBottomSheet(tournamentId=", ", tournamentName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
