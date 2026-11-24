package a;

/* JADX INFO: loaded from: classes6.dex */
public final class gpe implements ope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11678a;

    public gpe(long j) {
        this.f11678a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpe)) {
            return false;
        }
        long j = ((gpe) obj).f11678a;
        int i = y3d.h;
        return h2t0.a(this.f11678a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Boolean.hashCode(true) + (Long.hashCode(this.f11678a) * 31);
    }

    public final String toString() {
        return kng0.l("Primary(borderColor=", y3d.i(this.f11678a), ", hasBorder=true)");
    }
}
