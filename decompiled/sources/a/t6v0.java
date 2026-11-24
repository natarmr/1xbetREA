package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t6v0 implements u6v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f33438a;

    public t6v0(ra10 ra10Var) {
        this.f33438a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6v0) && this.f33438a.equals(((t6v0) obj).f33438a);
    }

    public final int hashCode() {
        return this.f33438a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowError(lottieConfig=", this.f33438a, Separators.RPAREN);
    }
}
