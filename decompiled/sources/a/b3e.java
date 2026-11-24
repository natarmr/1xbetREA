package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b3e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1898a;
    public final boolean b;
    public final u2e c;

    /* JADX WARN: Multi-variable type inference failed */
    public b3e(Object obj, int i, u2e u2eVar) {
        this.f1898a = obj;
        this.b = i;
        this.c = u2eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3e)) {
            return false;
        }
        b3e b3eVar = (b3e) obj;
        return Intrinsics.d(this.f1898a, b3eVar.f1898a) && this.b == b3eVar.b && this.c.equals(b3eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b ? 1 : 0, this.f1898a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.f1898a + ", index=" + (this.b ? 1 : 0) + ", reference=" + this.c + ')';
    }
}
