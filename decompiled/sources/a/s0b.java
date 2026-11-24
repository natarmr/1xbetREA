package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class s0b implements u0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31403a;

    public final boolean equals(Object obj) {
        if (obj instanceof s0b) {
            return this.f31403a.equals(((s0b) obj).f31403a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31403a.hashCode();
    }

    public final String toString() {
        return kng0.l("Label(label=", this.f31403a, Separators.RPAREN);
    }
}
