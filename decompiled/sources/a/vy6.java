package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vy6 implements yy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf40 f38234a;

    public vy6(vf40 vf40Var) {
        this.f38234a = vf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy6) && this.f38234a.equals(((vy6) obj).f38234a);
    }

    public final int hashCode() {
        return this.f38234a.hashCode();
    }

    public final String toString() {
        return "TotoBetGameInfoUiModel(middleLaneUiModel=" + this.f38234a + Separators.RPAREN;
    }
}
