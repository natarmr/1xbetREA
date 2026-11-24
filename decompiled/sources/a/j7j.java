package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j7j implements m7j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f16043a;

    public j7j(jkm jkmVar) {
        this.f16043a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7j) && this.f16043a.equals(((j7j) obj).f16043a);
    }

    public final int hashCode() {
        return this.f16043a.hashCode();
    }

    public final String toString() {
        return twn.o("Error(config=", this.f16043a, Separators.RPAREN);
    }
}
