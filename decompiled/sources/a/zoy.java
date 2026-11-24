package a;

/* JADX INFO: loaded from: classes6.dex */
public final class zoy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44736a;

    public zoy(boolean z) {
        this.f44736a = z;
    }

    @Override // a.hpy
    public final Object a() {
        return Boolean.valueOf(this.f44736a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoy) && this.f44736a == ((zoy) obj).f44736a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44736a);
    }
}
