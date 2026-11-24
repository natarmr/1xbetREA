package a;

/* JADX INFO: loaded from: classes.dex */
public final class st40 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32757a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public st40(long j, long j2, long j3, long j4, long j5) {
        this.f32757a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && st40.class == obj.getClass()) {
            st40 st40Var = (st40) obj;
            if (this.f32757a == st40Var.f32757a && this.b == st40Var.b && this.c == st40Var.c && this.d == st40Var.d && this.e == st40Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + rw2.b(rw2.b(rw2.b(rw2.b(527, 31, this.f32757a), 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f32757a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
