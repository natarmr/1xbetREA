package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ccx implements fcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f4133a;

    public ccx(mdm mdmVar) {
        this.f4133a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccx) && this.f4133a.equals(((ccx) obj).f4133a);
    }

    public final int hashCode() {
        return this.f4133a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyLottie=", this.f4133a, Separators.RPAREN);
    }
}
