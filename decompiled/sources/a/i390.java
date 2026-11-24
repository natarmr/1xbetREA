package a;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class i390 implements jff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f14087a;
    public final xz40 b = new xz40(new jet[16]);

    public i390(Set set) {
        this.f14087a = set;
    }

    @Override // a.jff0
    public final void c() {
        xz40 xz40Var = this.b;
        Object[] objArr = xz40Var.f41739a;
        int i = xz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            jff0 jff0Var = ((jet) objArr[i2]).f16392a;
            this.f14087a.remove(jff0Var);
            jff0Var.c();
        }
    }

    @Override // a.jff0
    public final void f() {
    }

    @Override // a.jff0
    public final void g() {
    }
}
