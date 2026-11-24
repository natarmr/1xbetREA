package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s9j implements u9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31852a;

    public final boolean equals(Object obj) {
        if (obj instanceof s9j) {
            return this.f31852a.equals(((s9j) obj).f31852a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31852a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlaysHolder(description=", this.f31852a, Separators.RPAREN);
    }
}
