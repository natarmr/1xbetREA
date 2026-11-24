package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uv7 implements zv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f36334a;

    public uv7(ra10 ra10Var) {
        this.f36334a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uv7) && this.f36334a.equals(((uv7) obj).f36334a);
    }

    public final int hashCode() {
        return this.f36334a.hashCode();
    }

    public final String toString() {
        return h97.k("Empty(lottieConfig=", this.f36334a, Separators.RPAREN);
    }
}
