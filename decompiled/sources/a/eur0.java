package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eur0 implements iur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f8437a;

    public eur0(mdm mdmVar) {
        this.f8437a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eur0) && this.f8437a.equals(((eur0) obj).f8437a);
    }

    public final int hashCode() {
        return this.f8437a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(dsEmptyConfig=", this.f8437a, Separators.RPAREN);
    }
}
