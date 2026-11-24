package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy9 f23129a;
    public final ucs0 b;
    public final uw9 c;

    public n9a(fy9 fy9Var, ucs0 ucs0Var, uw9 uw9Var) {
        fy9Var.getClass();
        this.f23129a = fy9Var;
        this.b = ucs0Var;
        this.c = uw9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n9a) {
            n9a n9aVar = (n9a) obj;
            return Intrinsics.d(this.f23129a, n9aVar.f23129a) && this.b == n9aVar.b && this.c == n9aVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f23129a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.f23129a + ", processor=" + this.b + ", captureSequenceProcessor=" + this.c + ')';
    }
}
