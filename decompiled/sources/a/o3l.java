package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o3l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6m f24590a;

    public o3l(o6m o6mVar) {
        this.f24590a = o6mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3l) && this.f24590a.equals(((o3l) obj).f24590a);
    }

    public final int hashCode() {
        return this.f24590a.hashCode();
    }

    public final String toString() {
        return "DotaGameMapUiModel(mapModel=" + this.f24590a + Separators.RPAREN;
    }
}
