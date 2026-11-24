package a;

/* JADX INFO: loaded from: classes6.dex */
public final class mpy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22199a;

    public mpy(int i) {
        this.f22199a = i;
    }

    @Override // a.hpy
    public final Object a() {
        return new b2t0(this.f22199a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpy) && this.f22199a == ((mpy) obj).f22199a;
    }

    public final int hashCode() {
        a2t0 a2t0Var = b2t0.b;
        return Integer.hashCode(this.f22199a);
    }
}
