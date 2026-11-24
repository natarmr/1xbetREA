package a;

/* JADX INFO: loaded from: classes6.dex */
public final class hpe implements ope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13438a;

    public hpe(long j) {
        this.f13438a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpe)) {
            return false;
        }
        long j = ((hpe) obj).f13438a;
        int i = y3d.h;
        return h2t0.a(this.f13438a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(true) + (Long.hashCode(this.f13438a) * 31);
    }

    public final String toString() {
        return kng0.l("Red(borderColor=", y3d.i(this.f13438a), ", hasBorder=true)");
    }
}
