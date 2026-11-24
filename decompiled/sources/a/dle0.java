package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dle0 implements fle0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6277a;

    public dle0(mdm mdmVar) {
        this.f6277a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dle0) && this.f6277a.equals(((dle0) obj).f6277a);
    }

    public final int hashCode() {
        return this.f6277a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorLottie=", this.f6277a, Separators.RPAREN);
    }
}
