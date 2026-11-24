package a;

/* JADX INFO: loaded from: classes6.dex */
public final class epy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8209a;

    public epy(float f) {
        this.f8209a = f;
    }

    @Override // a.hpy
    public final Object a() {
        return Float.valueOf(this.f8209a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epy) && Float.compare(this.f8209a, ((epy) obj).f8209a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8209a);
    }
}
