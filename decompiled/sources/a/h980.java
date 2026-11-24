package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h980 implements j980 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f12663a;

    public h980(ra10 ra10Var) {
        this.f12663a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h980) && this.f12663a.equals(((h980) obj).f12663a);
    }

    public final int hashCode() {
        return this.f12663a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f12663a, Separators.RPAREN);
    }
}
