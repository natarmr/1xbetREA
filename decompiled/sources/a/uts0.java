package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uts0 implements xen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36270a;
    public final int b;
    public final ghn c;

    public uts0(int i, int i2, ghn ghnVar) {
        this.f36270a = i;
        this.b = i2;
        this.c = ghnVar;
    }

    @Override // a.j73
    public final l5u0 a(lxs0 lxs0Var) {
        return new y5u0(this.f36270a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uts0) {
            uts0 uts0Var = (uts0) obj;
            if (uts0Var.f36270a == this.f36270a && uts0Var.b == this.b && Intrinsics.d(uts0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.f36270a * 31)) * 31) + this.b;
    }

    @Override // a.xen, a.cfq, a.j73
    public final o5u0 a(lxs0 lxs0Var) {
        return new y5u0(this.f36270a, this.b, this.c);
    }

    @Override // a.cfq, a.j73
    public final p5u0 a(lxs0 lxs0Var) {
        return new y5u0(this.f36270a, this.b, this.c);
    }
}
