package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rgl implements tgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugl f30443a;

    public rgl(ugl uglVar) {
        this.f30443a = uglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgl) && this.f30443a.equals(((rgl) obj).f30443a);
    }

    public final int hashCode() {
        return this.f30443a.hashCode();
    }

    public final String toString() {
        return "RestoreCellsResultScreenShowing(cellUiModel=" + this.f30443a + Separators.RPAREN;
    }
}
