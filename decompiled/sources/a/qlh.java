package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28933a;
    public final String b;

    public qlh(String str, String str2) {
        this.f28933a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlh)) {
            return false;
        }
        qlh qlhVar = (qlh) obj;
        return Intrinsics.d(this.f28933a, qlhVar.f28933a) && Intrinsics.d(this.b, qlhVar.b);
    }

    public final int hashCode() {
        String str = this.f28933a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("CyberTournamentBracketSelectedMatchModel(selectedName=", this.f28933a, ", selectedMatchId=", this.b, Separators.RPAREN);
    }
}
