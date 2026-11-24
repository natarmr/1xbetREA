package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class win implements bjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xhn f39223a;

    public win(xhn xhnVar) {
        this.f39223a = xhnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof win) && this.f39223a.equals(((win) obj).f39223a);
    }

    public final int hashCode() {
        return this.f39223a.hashCode();
    }

    public final String toString() {
        return "CellMakeMoveScreenShowing(cellUiModel=" + this.f39223a + Separators.RPAREN;
    }
}
