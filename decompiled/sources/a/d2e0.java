package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class d2e0 {
    public static final c2e0 Companion = new c2e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5353a;
    public final String b;

    public /* synthetic */ d2e0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f5353a = null;
        } else {
            this.f5353a = str;
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
        if (!(obj instanceof d2e0)) {
            return false;
        }
        d2e0 d2e0Var = (d2e0) obj;
        return Intrinsics.d(this.f5353a, d2e0Var.f5353a) && Intrinsics.d(this.b, d2e0Var.b);
    }

    public final int hashCode() {
        String str = this.f5353a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("RankingsTournamentResponse(tournamentId=", this.f5353a, ", tournamentName=", this.b, Separators.RPAREN);
    }
}
