package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mgl implements tgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugl f21748a;

    public mgl(ugl uglVar) {
        this.f21748a = uglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgl) && this.f21748a.equals(((mgl) obj).f21748a);
    }

    public final int hashCode() {
        return this.f21748a.hashCode();
    }

    public final String toString() {
        return "CellMovingScreenShowing(cellUiModel=" + this.f21748a + Separators.RPAREN;
    }
}
