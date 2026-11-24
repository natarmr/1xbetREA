package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qon implements uon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f29080a;

    public qon(mdm mdmVar) {
        this.f29080a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qon) && this.f29080a.equals(((qon) obj).f29080a);
    }

    public final int hashCode() {
        return this.f29080a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(dsEmptyConfig=", this.f29080a, Separators.RPAREN);
    }
}
