package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qy6 implements yy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf40 f29520a;

    public qy6(vf40 vf40Var) {
        this.f29520a = vf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy6) && this.f29520a.equals(((qy6) obj).f29520a);
    }

    public final int hashCode() {
        return this.f29520a.hashCode();
    }

    public final String toString() {
        return "FinBetsBetGameInfoUiModel(middleLaneUiModel=" + this.f29520a + Separators.RPAREN;
    }
}
