package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class g0z implements l0z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10483a;

    public g0z(String str) {
        this.f10483a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0z) && this.f10483a.equals(((g0z) obj).f10483a);
    }

    public final int hashCode() {
        return this.f10483a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnItemClick(id=", this.f10483a, Separators.RPAREN);
    }
}
