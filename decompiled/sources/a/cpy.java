package a;

/* JADX INFO: loaded from: classes6.dex */
public final class cpy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f4771a;

    public cpy(double d) {
        this.f4771a = d;
    }

    @Override // a.hpy
    public final Object a() {
        return Double.valueOf(this.f4771a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpy) && Double.compare(this.f4771a, ((cpy) obj).f4771a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f4771a);
    }
}
