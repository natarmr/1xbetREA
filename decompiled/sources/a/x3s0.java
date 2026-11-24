package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x3s0 implements z3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40235a;
    public final String b;

    public x3s0(long j, String str) {
        str.getClass();
        this.f40235a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3s0)) {
            return false;
        }
        x3s0 x3s0Var = (x3s0) obj;
        return this.f40235a == x3s0Var.f40235a && Intrinsics.d(this.b, x3s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f40235a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f40235a, "ShowBottomSheet(tournamentId=", ", tournamentName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
