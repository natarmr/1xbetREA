package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dla0 implements ela0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6269a;

    public dla0(mdm mdmVar) {
        this.f6269a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dla0) && this.f6269a.equals(((dla0) obj).f6269a);
    }

    public final int hashCode() {
        return this.f6269a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(dsEmptyConfig=", this.f6269a, Separators.RPAREN);
    }
}
