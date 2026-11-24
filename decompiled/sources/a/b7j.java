package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b7j implements d7j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f2112a;

    public b7j(jkm jkmVar) {
        this.f2112a = jkmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7j) && this.f2112a.equals(((b7j) obj).f2112a);
    }

    public final int hashCode() {
        return this.f2112a.hashCode();
    }

    public final String toString() {
        return twn.o("ShowEmptyView(config=", this.f2112a, Separators.RPAREN);
    }
}
