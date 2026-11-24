package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30723a;
    public final String b;

    public rm1(long j, String str) {
        str.getClass();
        this.f30723a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm1)) {
            return false;
        }
        rm1 rm1Var = (rm1) obj;
        return this.f30723a == rm1Var.f30723a && Intrinsics.d(this.b, rm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f30723a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f30723a, "TournamentsProvidersScreen(tournamentId=", ", tournamentTitle=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
