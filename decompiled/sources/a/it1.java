package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class it1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dol f15332a;

    public it1(dol dolVar) {
        this.f15332a = dolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof it1) && this.f15332a.equals(((it1) obj).f15332a);
    }

    public final int hashCode() {
        return this.f15332a.hashCode();
    }

    public final String toString() {
        return "ProvidersUiModel(uiModel=" + this.f15332a + Separators.RPAREN;
    }
}
