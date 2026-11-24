package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oy6 implements yy6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf40 f26047a;

    public oy6(vf40 vf40Var) {
        this.f26047a = vf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy6) && this.f26047a.equals(((oy6) obj).f26047a);
    }

    public final int hashCode() {
        return this.f26047a.hashCode();
    }

    public final String toString() {
        return "BetConstructorBetGameInfoUiModel(middleLaneUiModel=" + this.f26047a + Separators.RPAREN;
    }
}
