package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ngl implements tgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugl f23491a;

    public ngl(ugl uglVar) {
        this.f23491a = uglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngl) && this.f23491a.equals(((ngl) obj).f23491a);
    }

    public final int hashCode() {
        return this.f23491a.hashCode();
    }

    public final String toString() {
        return "CellRestoreMovingScreenShowing(cellUiModel=" + this.f23491a + Separators.RPAREN;
    }
}
