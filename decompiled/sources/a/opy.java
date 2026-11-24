package a;

/* JADX INFO: loaded from: classes2.dex */
public final class opy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f25662a;

    public opy(short s) {
        this.f25662a = s;
    }

    @Override // a.hpy
    public final Object a() {
        return new q2t0(this.f25662a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opy) && this.f25662a == ((opy) obj).f25662a;
    }

    public final int hashCode() {
        p2t0 p2t0Var = q2t0.b;
        return Short.hashCode(this.f25662a);
    }
}
