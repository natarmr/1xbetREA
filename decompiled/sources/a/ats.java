package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ats {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlr f1447a;
    public final gps b;

    public ats(jlr jlrVar, gps gpsVar) {
        this.f1447a = jlrVar;
        this.b = gpsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ats)) {
            return false;
        }
        ats atsVar = (ats) obj;
        return this.f1447a.equals(atsVar.f1447a) && this.b.equals(atsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1447a.hashCode() * 31);
    }

    public final String toString() {
        return "GameStreamScenarioResult(game=" + this.f1447a + ", gameRequestState=" + this.b + Separators.RPAREN;
    }
}
