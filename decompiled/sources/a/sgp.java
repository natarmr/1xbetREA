package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sgp implements ugp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mim0 f32172a;
    public final uft0 b;

    public sgp(mim0 mim0Var, uft0 uft0Var) {
        this.f32172a = mim0Var;
        this.b = uft0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgp)) {
            return false;
        }
        sgp sgpVar = (sgp) obj;
        return this.f32172a.equals(sgpVar.f32172a) && this.b.equals(sgpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32172a.hashCode() * 31);
    }

    public final String toString() {
        return "FeatureMatchDataTeamUiModel(card=" + this.f32172a + ", model=" + this.b + Separators.RPAREN;
    }
}
