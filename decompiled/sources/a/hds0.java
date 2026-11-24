package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hds0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f12885a;

    public hds0(mdm mdmVar) {
        this.f12885a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hds0) && this.f12885a.equals(((hds0) obj).f12885a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KEY_RECOMMENDS_HEADER";
    }

    public final int hashCode() {
        return this.f12885a.hashCode() + 443487243;
    }

    public final String toString() {
        return b1j.j("TrackedRecommendsHeaderUiItem(key=KEY_RECOMMENDS_HEADER, config=", this.f12885a, Separators.RPAREN);
    }
}
