package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jpy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f16923a;

    public jpy(short s) {
        this.f16923a = s;
    }

    @Override // a.hpy
    public final Object a() {
        return Short.valueOf(this.f16923a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpy) && this.f16923a == ((jpy) obj).f16923a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f16923a);
    }
}
