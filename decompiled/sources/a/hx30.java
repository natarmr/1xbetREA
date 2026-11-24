package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hx30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13794a;

    public hx30(String str) {
        this.f13794a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx30) && this.f13794a.equals(((hx30) obj).f13794a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f13794a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("ShowFullScreenLoader(betId=", this.f13794a, ", isFullScreenLoader=true)");
    }
}
