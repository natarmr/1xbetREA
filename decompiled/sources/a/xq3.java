package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xq3 implements br3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cr3 f41295a;

    public xq3(cr3 cr3Var) {
        this.f41295a = cr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq3) && this.f41295a.equals(((xq3) obj).f41295a);
    }

    public final int hashCode() {
        return this.f41295a.hashCode();
    }

    public final String toString() {
        return "GameScreenShowing(cellUiModel=" + this.f41295a + Separators.RPAREN;
    }
}
