package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p150 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26184a;
    public final String b;

    public p150(long j, String str) {
        str.getClass();
        this.f26184a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p150)) {
            return false;
        }
        p150 p150Var = (p150) obj;
        return this.f26184a == p150Var.f26184a && Intrinsics.d(this.b, p150Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f26184a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26184a, "OnClickTournament(tournamentId=", ", key=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
