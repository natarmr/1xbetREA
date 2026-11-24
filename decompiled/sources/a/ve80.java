package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ve80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37271a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final ue80 f;
    public final x04 g;

    public ve80(boolean z, long j, long j2, long j3, long j4, ue80 ue80Var) {
        ue80Var.getClass();
        this.f37271a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = ue80Var;
        this.g = o2e.X(false);
    }

    public final void a(Object obj, long j) {
        if (this.g.a()) {
            this.f.b(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.d);
        sb.append(" at ");
        sb.append((Object) f7r.a(this.b));
        sb.append(" for ");
        c99.v(brm0.k(j, " was completed multiple times!", sb));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ve80) {
            ve80 ve80Var = (ve80) obj;
            if (this.f37271a == ve80Var.f37271a && this.b == ve80Var.b && this.c == ve80Var.c && this.d == ve80Var.d && this.e == ve80Var.e && Intrinsics.d(this.f, ve80Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(rw2.b(rw2.b(rw2.b(Boolean.hashCode(this.f37271a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.f37271a + ", cameraFrameNumber=" + ((Object) f7r.a(this.b)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.c + ')')) + ", cameraOutputSequence=" + this.d + ", cameraOutputNumber=" + this.e + ", outputListener=" + this.f + ')';
    }
}
