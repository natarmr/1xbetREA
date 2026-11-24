package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fna implements gna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3z f9825a;

    public fna(k3z k3zVar) {
        this.f9825a = k3zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fna) && this.f9825a.equals(((fna) obj).f9825a);
    }

    public final int hashCode() {
        return this.f9825a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f9825a + Separators.RPAREN;
    }
}
