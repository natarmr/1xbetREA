package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vdd implements xdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mim0 f37225a;
    public final jed b;

    public vdd(mim0 mim0Var, jed jedVar) {
        this.f37225a = mim0Var;
        this.b = jedVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdd)) {
            return false;
        }
        vdd vddVar = (vdd) obj;
        return this.f37225a.equals(vddVar.f37225a) && this.b.equals(vddVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37225a.hashCode() * 31);
    }

    public final String toString() {
        return "CompletedMatchDataTeamUiModel(card=" + this.f37225a + ", model=" + this.b + Separators.RPAREN;
    }
}
