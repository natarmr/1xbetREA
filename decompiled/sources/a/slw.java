package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class slw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rlw f32419a;
    public final uql0 b;

    public slw(rlw rlwVar, uql0 uql0Var) {
        this.f32419a = rlwVar;
        this.b = uql0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slw)) {
            return false;
        }
        slw slwVar = (slw) obj;
        return this.f32419a.equals(slwVar.f32419a) && this.b == slwVar.b;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "SPORT_FILTER";
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f32419a.hashCode() + 418935197) * 31);
    }

    public final String toString() {
        return "HorizontalPopularSportTabDSUiModel(id=SPORT_FILTER, sportTabsState=" + this.f32419a + ", type=" + this.b + Separators.RPAREN;
    }
}
