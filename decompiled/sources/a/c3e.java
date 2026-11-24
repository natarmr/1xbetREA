package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c3e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3670a;
    public final int b;
    public final u2e c;

    public c3e(Object obj, int i, u2e u2eVar) {
        this.f3670a = obj;
        this.b = i;
        this.c = u2eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3e)) {
            return false;
        }
        c3e c3eVar = (c3e) obj;
        return Intrinsics.d(this.f3670a, c3eVar.f3670a) && this.b == c3eVar.b && this.c.equals(c3eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f3670a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.f3670a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
