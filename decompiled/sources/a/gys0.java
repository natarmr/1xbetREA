package a;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class gys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12147a;
    public final boolean b;
    public final yzs0 c;
    public final zgc d;
    public final j2e e;
    public int f;
    public ArrayDeque g;
    public nbk0 h;

    public gys0(boolean z, boolean z2, boolean z3, yzs0 yzs0Var, zgc zgcVar, j2e j2eVar) {
        yzs0Var.getClass();
        zgcVar.getClass();
        j2eVar.getClass();
        this.f12147a = z;
        this.b = z2;
        this.c = yzs0Var;
        this.d = zgcVar;
        this.e = j2eVar;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        arrayDeque.getClass();
        arrayDeque.clear();
        nbk0 nbk0Var = this.h;
        nbk0Var.getClass();
        nbk0Var.clear();
    }

    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.h == null) {
            this.h = new nbk0();
        }
    }

    public final aty c(aty atyVar) {
        atyVar.getClass();
        return this.d.N(atyVar);
    }
}
