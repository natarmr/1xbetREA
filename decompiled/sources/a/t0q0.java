package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t0q0 implements v0q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f33132a;

    public t0q0(mdm mdmVar) {
        this.f33132a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0q0) && this.f33132a.equals(((t0q0) obj).f33132a);
    }

    public final int hashCode() {
        return this.f33132a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f33132a, Separators.RPAREN);
    }
}
