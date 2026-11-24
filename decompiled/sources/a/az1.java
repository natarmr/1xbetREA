package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class az1 implements cz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1695a;
    public final String b;

    public az1(long j, String str) {
        str.getClass();
        this.f1695a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az1)) {
            return false;
        }
        az1 az1Var = (az1) obj;
        return this.f1695a == az1Var.f1695a && Intrinsics.d(this.b, az1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f1695a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f1695a, "ShowBottomSheet(tournamentId=", ", tournamentName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
