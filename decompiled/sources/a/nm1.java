package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23750a;
    public final String b;

    public nm1(long j, String str) {
        str.getClass();
        this.f23750a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm1)) {
            return false;
        }
        nm1 nm1Var = (nm1) obj;
        return this.f23750a == nm1Var.f23750a && Intrinsics.d(this.b, nm1Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ua80.b(Long.hashCode(this.f23750a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f23750a, "TournamentPrizesScreen(tournamentId=", ", tournamentTitle=", this.b);
        sbO.append(", stageTournamentID=0)");
        return sbO.toString();
    }
}
