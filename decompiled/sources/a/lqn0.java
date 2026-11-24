package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lqn0 implements nqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20494a;

    public lqn0(int i) {
        this.f20494a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqn0) && this.f20494a == ((lqn0) obj).f20494a;
    }

    public final int hashCode() {
        return Integer.hashCode(500) + (Integer.hashCode(this.f20494a) * 31);
    }

    public final String toString() {
        return ua80.e(this.f20494a, "StartScrollAnimation(swipeDx=", ", duration=500)");
    }
}
