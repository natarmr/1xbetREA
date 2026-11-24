package a;

/* JADX INFO: loaded from: classes.dex */
public final class hvh0 {
    public static final hvh0 c = new hvh0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13726a;
    public final long b;

    public hvh0(long j, long j2) {
        this.f13726a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hvh0.class == obj.getClass()) {
            hvh0 hvh0Var = (hvh0) obj;
            if (this.f13726a == hvh0Var.f13726a && this.b == hvh0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f13726a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f13726a);
        sb.append(", position=");
        return brm0.k(this.b, "]", sb);
    }
}
