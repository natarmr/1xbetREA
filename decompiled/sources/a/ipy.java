package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ipy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15184a;

    public ipy(long j) {
        this.f15184a = j;
    }

    @Override // a.hpy
    public final Object a() {
        return Long.valueOf(this.f15184a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipy) && this.f15184a == ((ipy) obj).f15184a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15184a);
    }
}
