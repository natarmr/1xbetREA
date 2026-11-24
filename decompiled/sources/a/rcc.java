package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rcc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f30231a;

    public rcc(a4x a4xVar) {
        this.f30231a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcc) && this.f30231a.equals(((rcc) obj).f30231a);
    }

    public final int hashCode() {
        return this.f30231a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f30231a, "ChipsSectionUiModel(chips=", Separators.RPAREN);
    }
}
