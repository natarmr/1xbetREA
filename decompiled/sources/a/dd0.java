package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dd0 implements gd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eol f5870a;

    public dd0(eol eolVar) {
        this.f5870a = eolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd0) && this.f5870a.equals(((dd0) obj).f5870a);
    }

    public final int hashCode() {
        return this.f5870a.hashCode();
    }

    public final String toString() {
        return "OnItemClicked(brandUiModel=" + this.f5870a + Separators.RPAREN;
    }
}
