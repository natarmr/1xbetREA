package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eln implements fln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uvo0 f8008a;

    public eln(uvo0 uvo0Var) {
        this.f8008a = uvo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eln) && this.f8008a.equals(((eln) obj).f8008a);
    }

    public final int hashCode() {
        return this.f8008a.hashCode();
    }

    public final String toString() {
        return "TaxSpoilerUiItem(taxSpoilerUiState=" + this.f8008a + Separators.RPAREN;
    }
}
