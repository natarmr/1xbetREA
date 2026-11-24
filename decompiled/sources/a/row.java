package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class row implements vow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qow f30860a;

    public row(qow qowVar) {
        this.f30860a = qowVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof row) && this.f30860a.equals(((row) obj).f30860a);
    }

    public final int hashCode() {
        return this.f30860a.hashCode();
    }

    public final String toString() {
        return "Content(tableUiModel=" + this.f30860a + Separators.RPAREN;
    }
}
