package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jep0 f19915a;

    public lep0(jep0 jep0Var) {
        this.f19915a = jep0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lep0) && this.f19915a.equals(((lep0) obj).f19915a);
    }

    public final int hashCode() {
        return this.f19915a.hashCode();
    }

    public final String toString() {
        return "TeamHeaderUiModel(teamHeaderItemUiModel=" + this.f19915a + Separators.RPAREN;
    }
}
