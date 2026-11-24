package a;

/* JADX INFO: loaded from: classes6.dex */
public final class hgp implements jgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fot0 f13024a;

    public hgp(fot0 fot0Var) {
        this.f13024a = fot0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgp) && this.f13024a.equals(((hgp) obj).f13024a);
    }

    public final int hashCode() {
        return this.f13024a.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.f13024a + ')';
    }
}
