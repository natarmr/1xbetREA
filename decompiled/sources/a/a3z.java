package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a3z implements c3z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9s f197a;

    public a3z(l9s l9sVar) {
        this.f197a = l9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3z) && this.f197a.equals(((a3z) obj).f197a);
    }

    public final int hashCode() {
        return this.f197a.hashCode();
    }

    public final String toString() {
        return "Content(gameDetailsModel=" + this.f197a + Separators.RPAREN;
    }
}
