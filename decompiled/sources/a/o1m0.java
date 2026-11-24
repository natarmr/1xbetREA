package a;

/* JADX INFO: loaded from: classes4.dex */
public final class o1m0 implements q1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0m0 f24488a;

    public o1m0(z0m0 z0m0Var) {
        this.f24488a = z0m0Var;
    }

    @Override // a.q1m0
    public final boolean a() {
        return true;
    }

    @Override // a.q1m0
    public final z0m0 b() {
        return this.f24488a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1m0) && this.f24488a.equals(((o1m0) obj).f24488a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f24488a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(headerUiState=" + this.f24488a + ", rtlSupport=true)";
    }
}
