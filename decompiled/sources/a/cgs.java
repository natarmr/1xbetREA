package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cgs implements egs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3z f4328a;

    public cgs(k3z k3zVar) {
        this.f4328a = k3zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cgs) && this.f4328a.equals(((cgs) obj).f4328a);
    }

    public final int hashCode() {
        return this.f4328a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f4328a + Separators.RPAREN;
    }
}
