package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wto0 implements z63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5u0 f39752a;
    public final lxs0 b;
    public Object c;
    public Object d;
    public t73 e;
    public t73 f;
    public final t73 g;
    public long h;
    public t73 i;

    public wto0(j73 j73Var, lxs0 lxs0Var, Object obj, Object obj2, t73 t73Var) {
        this.f39752a = j73Var.a(lxs0Var);
        this.b = lxs0Var;
        this.c = obj2;
        this.d = obj;
        this.e = (t73) lxs0Var.f20832a.invoke(obj);
        Function1 function1 = lxs0Var.f20832a;
        this.f = (t73) function1.invoke(obj2);
        this.g = t73Var != null ? fre0.L(t73Var) : ((t73) function1.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // a.z63
    public final boolean a() {
        return this.f39752a.a();
    }

    @Override // a.z63
    public final t73 b(long j) {
        if (!c(j)) {
            return this.f39752a.h(j, this.e, this.f, this.g);
        }
        t73 t73Var = this.i;
        if (t73Var != null) {
            return t73Var;
        }
        t73 t73VarG = this.f39752a.g(this.e, this.f, this.g);
        this.i = t73VarG;
        return t73VarG;
    }

    @Override // a.z63
    public final long d() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jB = this.f39752a.b(this.e, this.f, this.g);
        this.h = jB;
        return jB;
    }

    @Override // a.z63
    public final lxs0 e() {
        return this.b;
    }

    @Override // a.z63
    public final Object f(long j) {
        if (c(j)) {
            return this.c;
        }
        t73 t73VarC = this.f39752a.c(j, this.e, this.f, this.g);
        int iB = t73VarC.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(t73VarC.a(i))) {
                fsb0.b("AnimationVector cannot contain a NaN. " + t73VarC + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(t73VarC);
    }

    @Override // a.z63
    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (Intrinsics.d(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (t73) this.b.f20832a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (Intrinsics.d(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (t73) this.b.f20832a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.f39752a;
    }
}
