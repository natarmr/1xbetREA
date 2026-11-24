package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wq3 implements br3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr3 f39570a;

    public wq3(cr3 cr3Var) {
        this.f39570a = cr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wq3) && this.f39570a.equals(((wq3) obj).f39570a);
    }

    public final int hashCode() {
        return this.f39570a.hashCode();
    }

    public final String toString() {
        return "CellsResultScreenShowing(cellUiModel=" + this.f39570a + Separators.RPAREN;
    }
}
