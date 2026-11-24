package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jnf0 extends k2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jnu0 f16809a;
    public final List b;
    public final iev c;
    public final ew9 d;

    public jnf0(jnu0 jnu0Var, List list, iev ievVar, ew9 ew9Var) {
        this.f16809a = jnu0Var;
        this.b = list;
        this.c = ievVar;
        this.d = ew9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jnf0) {
            jnf0 jnf0Var = (jnf0) obj;
            return this.f16809a == jnf0Var.f16809a && this.b.equals(jnf0Var.b) && this.c == jnf0Var.c && this.d == jnf0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e((this.c.hashCode() + dw9.a(this.f16809a.hashCode() * 31, 31, this.b)) * 31, 31, false);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.f16809a + ", sharedCameraIds=" + this.b + ", graphListener=" + this.c + ", isPrewarm=false, isForegroundObserver=" + this.d + ')';
    }
}
