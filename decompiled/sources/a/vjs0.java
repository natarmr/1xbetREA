package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vjs0 implements xjs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37546a;

    public vjs0(mdm mdmVar) {
        this.f37546a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjs0) && this.f37546a.equals(((vjs0) obj).f37546a);
    }

    public final int hashCode() {
        return this.f37546a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f37546a, Separators.RPAREN);
    }
}
