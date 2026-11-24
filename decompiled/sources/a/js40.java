package a;

/* JADX INFO: loaded from: classes.dex */
public final class js40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17032a;
    public final long b;
    public final long c;

    public js40(boolean z, long j, long j2) {
        this.f17032a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof js40) {
            js40 js40Var = (js40) obj;
            return this.f17032a == js40Var.f17032a && ne60.c(this.b, js40Var.b) && this.c == js40Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(Boolean.hashCode(this.f17032a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MotionDragState(isDragging=" + this.f17032a + ", dragAmount=" + ((Object) ne60.h(this.b)) + ", velocity=" + ((Object) g6u0.g(this.c)) + ')';
    }
}
