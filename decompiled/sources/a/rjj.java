package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rjj implements z63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5u0 f30597a;
    public final lxs0 b;
    public final Object c;
    public final t73 d;
    public final t73 e;
    public final t73 f;
    public final Object g;
    public final long h;

    public rjj(sjj sjjVar, lxs0 lxs0Var, Object obj, t73 t73Var) {
        r5u0 r5u0Var = new r5u0(sjjVar.f32306a);
        this.f30597a = r5u0Var;
        this.b = lxs0Var;
        this.c = obj;
        t73 t73Var2 = (t73) lxs0Var.f20832a.invoke(obj);
        this.d = t73Var2;
        this.e = fre0.L(t73Var);
        Function1 function1 = lxs0Var.b;
        t73 t73VarC = r5u0Var.d;
        if (t73VarC == null) {
            t73VarC = t73Var2.c();
            r5u0Var.d = t73VarC;
        }
        int iB = t73VarC.b();
        int i = 0;
        while (true) {
            t73 t73Var3 = r5u0Var.d;
            glq glqVar = r5u0Var.f29906a;
            if (i >= iB) {
                if (t73Var3 == null) {
                    Intrinsics.h("targetVector");
                    throw null;
                }
                this.g = function1.invoke(t73Var3);
                t73 t73VarC2 = r5u0Var.c;
                if (t73VarC2 == null) {
                    t73VarC2 = t73Var2.c();
                    r5u0Var.c = t73VarC2;
                }
                int iB2 = t73VarC2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    t73Var2.getClass();
                    jMax = Math.max(jMax, glqVar.h(t73Var.a(i2)));
                }
                this.h = jMax;
                t73 t73VarL = fre0.L(this.f30597a.a(jMax, this.d, t73Var));
                this.f = t73VarL;
                int iB3 = t73VarL.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    t73 t73Var4 = this.f;
                    float fA = t73Var4.a(i3);
                    float f = this.f30597a.e;
                    t73Var4.e(l1e0.c(fA, -f, f), i3);
                }
                return;
            }
            if (t73Var3 == null) {
                Intrinsics.h("targetVector");
                throw null;
            }
            t73Var3.e(glqVar.i(t73Var2.a(i), t73Var.a(i)), i);
            i++;
        }
    }

    @Override // a.z63
    public final boolean a() {
        return false;
    }

    @Override // a.z63
    public final t73 b(long j) {
        if (c(j)) {
            return this.f;
        }
        return this.f30597a.a(j, this.d, this.e);
    }

    @Override // a.z63
    public final long d() {
        return this.h;
    }

    @Override // a.z63
    public final lxs0 e() {
        return this.b;
    }

    @Override // a.z63
    public final Object f(long j) {
        if (c(j)) {
            return this.g;
        }
        Function1 function1 = this.b.b;
        r5u0 r5u0Var = this.f30597a;
        t73 t73VarC = r5u0Var.b;
        t73 t73Var = this.d;
        if (t73VarC == null) {
            t73VarC = t73Var.c();
            r5u0Var.b = t73VarC;
        }
        int iB = t73VarC.b();
        int i = 0;
        while (true) {
            t73 t73Var2 = r5u0Var.b;
            if (i >= iB) {
                if (t73Var2 != null) {
                    return function1.invoke(t73Var2);
                }
                Intrinsics.h("valueVector");
                throw null;
            }
            if (t73Var2 == null) {
                Intrinsics.h("valueVector");
                throw null;
            }
            t73Var2.e(r5u0Var.f29906a.b(t73Var.a(i), this.e.a(i), j), i);
            i++;
        }
    }

    @Override // a.z63
    public final Object g() {
        return this.g;
    }
}
