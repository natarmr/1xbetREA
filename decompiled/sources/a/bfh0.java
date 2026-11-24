package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bfh0 implements efh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f2503a;

    @Override // a.efh0
    public final mdm a() {
        return this.f2503a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfh0) {
            return this.f2503a.equals(((bfh0) obj).f2503a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2503a.hashCode();
    }

    public final String toString() {
        return b1j.j("ContentLoadError(config=", this.f2503a, Separators.RPAREN);
    }
}
