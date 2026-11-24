package a;

/* JADX INFO: loaded from: classes6.dex */
public final class npy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23933a;

    public npy(long j) {
        this.f23933a = j;
    }

    @Override // a.hpy
    public final Object a() {
        return new h2t0(this.f23933a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npy) && this.f23933a == ((npy) obj).f23933a;
    }

    public final int hashCode() {
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f23933a);
    }
}
