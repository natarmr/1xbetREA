package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class vfg implements wfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37329a;

    public vfg(mdm mdmVar) {
        this.f37329a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfg) && this.f37329a.equals(((vfg) obj).f37329a);
    }

    public final int hashCode() {
        return this.f37329a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f37329a, Separators.RPAREN);
    }
}
