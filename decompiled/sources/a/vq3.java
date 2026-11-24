package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vq3 implements br3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr3 f37835a;

    public vq3(cr3 cr3Var) {
        this.f37835a = cr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq3) && this.f37835a.equals(((vq3) obj).f37835a);
    }

    public final int hashCode() {
        return this.f37835a.hashCode();
    }

    public final String toString() {
        return "CellRestoreMovingScreenShowing(cellUiModel=" + this.f37835a + Separators.RPAREN;
    }
}
