package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ogl implements tgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugl f25225a;

    public ogl(ugl uglVar) {
        this.f25225a = uglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogl) && this.f25225a.equals(((ogl) obj).f25225a);
    }

    public final int hashCode() {
        return this.f25225a.hashCode();
    }

    public final String toString() {
        return "CellsResultScreenShowing(cellUiModel=" + this.f25225a + Separators.RPAREN;
    }
}
