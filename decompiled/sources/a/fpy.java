package a;

/* JADX INFO: loaded from: classes6.dex */
public final class fpy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9949a;

    public fpy(int i) {
        this.f9949a = i;
    }

    @Override // a.hpy
    public final Object a() {
        return Integer.valueOf(this.f9949a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpy) && this.f9949a == ((fpy) obj).f9949a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9949a);
    }
}
