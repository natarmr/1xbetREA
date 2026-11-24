package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xin implements bjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xhn f40953a;

    public xin(xhn xhnVar) {
        this.f40953a = xhnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xin) && this.f40953a.equals(((xin) obj).f40953a);
    }

    public final int hashCode() {
        return this.f40953a.hashCode();
    }

    public final String toString() {
        return "CellsResultScreen(cellUiModel=" + this.f40953a + Separators.RPAREN;
    }
}
