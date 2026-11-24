package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vin implements bjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xhn f37487a;

    public vin(xhn xhnVar) {
        this.f37487a = xhnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vin) && this.f37487a.equals(((vin) obj).f37487a);
    }

    public final int hashCode() {
        return this.f37487a.hashCode();
    }

    public final String toString() {
        return "CellAnimationScreen(cellUiModel=" + this.f37487a + Separators.RPAREN;
    }
}
