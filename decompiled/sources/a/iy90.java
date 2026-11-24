package a;

/* JADX INFO: loaded from: classes.dex */
public final class iy90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjq f15578a;

    static {
        new hy90().f13849a.e();
        vtt0.H(0);
    }

    public iy90(jjq jjqVar) {
        this.f15578a = jjqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iy90) {
            return this.f15578a.equals(((iy90) obj).f15578a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15578a.f16630a.hashCode();
    }
}
