package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dh8 implements jh8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6080a;

    public dh8(mdm mdmVar) {
        this.f6080a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh8) && this.f6080a.equals(((dh8) obj).f6080a);
    }

    public final int hashCode() {
        return this.f6080a.hashCode();
    }

    public final String toString() {
        return b1j.j("Lottie(config=", this.f6080a, Separators.RPAREN);
    }
}
