package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vsc0 implements xsc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37944a;

    public vsc0(mdm mdmVar) {
        this.f37944a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsc0) && this.f37944a.equals(((vsc0) obj).f37944a);
    }

    public final int hashCode() {
        return this.f37944a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f37944a, Separators.RPAREN);
    }
}
