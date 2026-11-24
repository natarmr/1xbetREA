package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hpu0 extends ipu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f13460a;

    public hpu0(mdm mdmVar) {
        this.f13460a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hpu0) && this.f13460a.equals(((hpu0) obj).f13460a);
    }

    public final int hashCode() {
        return this.f13460a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f13460a, Separators.RPAREN);
    }
}
