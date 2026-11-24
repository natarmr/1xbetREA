package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f369a;

    public a7h(a4x a4xVar) {
        this.f369a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7h) && this.f369a.equals(((a7h) obj).f369a);
    }

    public final int hashCode() {
        return this.f369a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f369a, "Rows(rows=", Separators.RPAREN);
    }
}
