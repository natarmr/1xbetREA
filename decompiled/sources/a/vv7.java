package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vv7 implements zv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f38086a;

    public vv7(ra10 ra10Var) {
        this.f38086a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vv7) && this.f38086a.equals(((vv7) obj).f38086a);
    }

    public final int hashCode() {
        return this.f38086a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f38086a, Separators.RPAREN);
    }
}
