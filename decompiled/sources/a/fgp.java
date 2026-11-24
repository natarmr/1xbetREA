package a;

/* JADX INFO: loaded from: classes6.dex */
public final class fgp implements jgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsf0 f9503a;

    public fgp(wsf0 wsf0Var) {
        this.f9503a = wsf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgp) && this.f9503a == ((fgp) obj).f9503a;
    }

    public final int hashCode() {
        return this.f9503a.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.f9503a + ')';
    }
}
