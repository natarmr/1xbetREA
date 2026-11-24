package a;

/* JADX INFO: loaded from: classes2.dex */
public final class apy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f1272a;

    public apy(byte b) {
        this.f1272a = b;
    }

    @Override // a.hpy
    public final Object a() {
        return Byte.valueOf(this.f1272a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apy) && this.f1272a == ((apy) obj).f1272a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f1272a);
    }
}
