package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b7s0 implements d7s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2123a;
    public final String b;

    public b7s0(long j, String str) {
        str.getClass();
        this.f2123a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7s0)) {
            return false;
        }
        b7s0 b7s0Var = (b7s0) obj;
        return this.f2123a == b7s0Var.f2123a && Intrinsics.d(this.b, b7s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f2123a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f2123a, "ShowBottomSheet(tournamentId=", ", tournamentName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
