package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sw50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f32904a;

    public sw50(ra10 ra10Var) {
        this.f32904a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw50) && this.f32904a.equals(((sw50) obj).f32904a);
    }

    public final int hashCode() {
        return this.f32904a.hashCode();
    }

    public final String toString() {
        return h97.k("Error(lottieConfig=", this.f32904a, Separators.RPAREN);
    }
}
