package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class azp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1729a;
    public final oip0 b;
    public final oip0 c;

    public azp(String str, oip0 oip0Var, oip0 oip0Var2) {
        str.getClass();
        this.f1729a = str;
        this.b = oip0Var;
        this.c = oip0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azp)) {
            return false;
        }
        azp azpVar = (azp) obj;
        return Intrinsics.d(this.f1729a, azpVar.f1729a) && this.b.equals(azpVar.b) && this.c.equals(azpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f1729a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FightingScoreResultUiModel(title=" + this.f1729a + ", firstTeamResultScore=" + this.b + ", secondTeamResultScore=" + this.c + Separators.RPAREN;
    }
}
