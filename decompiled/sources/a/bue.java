package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bue implements cue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3226a;
    public final String b;
    public final efp0 c;
    public final efp0 d;

    public bue(String str, String str2, efp0 efp0Var, efp0 efp0Var2) {
        str.getClass();
        str2.getClass();
        this.f3226a = str;
        this.b = str2;
        this.c = efp0Var;
        this.d = efp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bue)) {
            return false;
        }
        bue bueVar = (bue) obj;
        return Intrinsics.d(this.f3226a, bueVar.f3226a) && Intrinsics.d(this.b, bueVar.b) && this.c.equals(bueVar.c) && this.d.equals(bueVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f3226a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TwoTeams(firstTeamName=", this.f3226a, ", secondTeamName=", this.b, ", firstTeamLogosUiModel=");
        sbN.append(this.c);
        sbN.append(", secondTeamLogosUiModel=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
