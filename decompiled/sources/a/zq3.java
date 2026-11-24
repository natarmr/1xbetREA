package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zq3 implements br3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr3 f44790a;

    public zq3(cr3 cr3Var) {
        this.f44790a = cr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq3) && this.f44790a.equals(((zq3) obj).f44790a);
    }

    public final int hashCode() {
        return this.f44790a.hashCode();
    }

    public final String toString() {
        return "RestoreCellsResultScreenShowing(cellUiModel=" + this.f44790a + Separators.RPAREN;
    }
}
