package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class usc0 implements xsc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f36205a;

    public usc0(mdm mdmVar) {
        this.f36205a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usc0) && this.f36205a.equals(((usc0) obj).f36205a);
    }

    public final int hashCode() {
        return this.f36205a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyConfig=", this.f36205a, Separators.RPAREN);
    }
}
