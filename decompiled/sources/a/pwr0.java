package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pwr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27725a;
    public final String b;
    public final a4x c;
    public final int d;

    public pwr0(int i, a4x a4xVar, String str, String str2) {
        a4xVar.getClass();
        this.f27725a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwr0)) {
            return false;
        }
        pwr0 pwr0Var = (pwr0) obj;
        return this.f27725a.equals(pwr0Var.f27725a) && this.b.equals(pwr0Var.b) && Intrinsics.d(this.c, pwr0Var.c) && this.d == pwr0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cs0.b(this.c, ua80.b(this.f27725a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TournamentBracketCaptionUiModel(tournamentName=", this.f27725a, ", tournamentLogo=", this.b, ", chips=");
        sbN.append(this.c);
        sbN.append(", selectedTabId=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
