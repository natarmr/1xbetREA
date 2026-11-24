package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xsv implements atv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsv f41436a;

    public xsv(tsv tsvVar) {
        this.f41436a = tsvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsv) && this.f41436a.equals(((xsv) obj).f41436a);
    }

    public final int hashCode() {
        return this.f41436a.hashCode();
    }

    public final String toString() {
        return "Success(headerUiModel=" + this.f41436a + Separators.RPAREN;
    }
}
