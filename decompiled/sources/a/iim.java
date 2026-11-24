package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iim implements kim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14835a;

    public iim(String str) {
        this.f14835a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iim) && this.f14835a.equals(((iim) obj).f14835a);
    }

    public final int hashCode() {
        return this.f14835a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChange(query=", this.f14835a, Separators.RPAREN);
    }
}
