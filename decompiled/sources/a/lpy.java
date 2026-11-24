package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lpy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f20461a;

    public lpy(byte b) {
        this.f20461a = b;
    }

    @Override // a.hpy
    public final Object a() {
        return new p1t0(this.f20461a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lpy) && this.f20461a == ((lpy) obj).f20461a;
    }

    public final int hashCode() {
        o1t0 o1t0Var = p1t0.b;
        return Byte.hashCode(this.f20461a);
    }
}
