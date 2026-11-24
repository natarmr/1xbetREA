package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nlm implements tlm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hmm f23734a;

    public nlm(hmm hmmVar) {
        this.f23734a = hmmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlm) && this.f23734a.equals(((nlm) obj).f23734a);
    }

    public final int hashCode() {
        return this.f23734a.hashCode();
    }

    public final String toString() {
        return "SearchField(searchFieldUiModel=" + this.f23734a + Separators.RPAREN;
    }
}
