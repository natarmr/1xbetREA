package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s0q0 implements v0q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f31421a;

    public s0q0(mdm mdmVar) {
        this.f31421a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0q0) && this.f31421a.equals(((s0q0) obj).f31421a);
    }

    public final int hashCode() {
        return this.f31421a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(lottieConfig=", this.f31421a, Separators.RPAREN);
    }
}
