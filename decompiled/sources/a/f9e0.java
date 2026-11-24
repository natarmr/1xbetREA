package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class f9e0 {
    public static final e9e0 Companion = new e9e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9150a;
    public final String b;

    public /* synthetic */ f9e0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f9150a = null;
        } else {
            this.f9150a = str;
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
        if (!(obj instanceof f9e0)) {
            return false;
        }
        f9e0 f9e0Var = (f9e0) obj;
        return Intrinsics.d(this.f9150a, f9e0Var.f9150a) && Intrinsics.d(this.b, f9e0Var.b);
    }

    public final int hashCode() {
        String str = this.f9150a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("RatingTournamentResponse(tournamentId=", this.f9150a, ", tournamentName=", this.b, Separators.RPAREN);
    }
}
