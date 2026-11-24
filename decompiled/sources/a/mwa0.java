package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mwa0 implements owa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yrl f22494a;

    public mwa0(yrl yrlVar) {
        gx1 gx1Var = gx1.f12054a;
        this.f22494a = yrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwa0)) {
            return false;
        }
        gx1 gx1Var = gx1.f12054a;
        return this.f22494a.equals(((mwa0) obj).f22494a);
    }

    public final int hashCode() {
        return this.f22494a.hashCode() + (gx1.f12054a.hashCode() * 31);
    }

    public final String toString() {
        return "Timer(style=" + gx1.f12054a + ", dsAggregatorTournamentTimerUiModel=" + this.f22494a + Separators.RPAREN;
    }
}
