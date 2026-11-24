package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eo90 implements ho90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8129a;

    public final boolean equals(Object obj) {
        if (obj instanceof eo90) {
            return this.f8129a.equals(((eo90) obj).f8129a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8129a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearch(query=", this.f8129a, Separators.RPAREN);
    }
}
