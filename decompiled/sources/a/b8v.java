package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b8v implements e8v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2177a;

    public final boolean equals(Object obj) {
        if (obj instanceof b8v) {
            return this.f2177a.equals(((b8v) obj).f2177a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2177a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnChangeQuery(query=", this.f2177a, Separators.RPAREN);
    }
}
