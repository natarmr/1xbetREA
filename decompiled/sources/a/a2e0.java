package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a2e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120a;
    public final String b;

    public a2e0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f120a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2e0)) {
            return false;
        }
        a2e0 a2e0Var = (a2e0) obj;
        return Intrinsics.d(this.f120a, a2e0Var.f120a) && Intrinsics.d(this.b, a2e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f120a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("RankingsTournamentModel(tournamentId=", this.f120a, ", tournamentName=", this.b, Separators.RPAREN);
    }
}
