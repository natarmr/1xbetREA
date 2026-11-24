package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dcx implements fcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f5867a;

    public dcx(mdm mdmVar) {
        this.f5867a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dcx) && this.f5867a.equals(((dcx) obj).f5867a);
    }

    public final int hashCode() {
        return this.f5867a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorLottie=", this.f5867a, Separators.RPAREN);
    }
}
