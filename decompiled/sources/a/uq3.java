package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uq3 implements br3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr3 f36098a;

    public uq3(cr3 cr3Var) {
        this.f36098a = cr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uq3) && this.f36098a.equals(((uq3) obj).f36098a);
    }

    public final int hashCode() {
        return this.f36098a.hashCode();
    }

    public final String toString() {
        return "CellMovingScreenShowing(cellUiModel=" + this.f36098a + Separators.RPAREN;
    }
}
