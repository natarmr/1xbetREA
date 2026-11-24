package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q5u0 implements p5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u73 f28172a;
    public t73 b;
    public t73 c;
    public t73 d;

    public q5u0(xkq xkqVar) {
        this(new zlt0((Object) xkqVar, (byte) 3));
    }

    @Override // a.l5u0
    public final long b(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        int iB = t73Var.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.f28172a.get(i).d(t73Var.a(i), t73Var2.a(i), t73Var3.a(i)));
        }
        return jMax;
    }

    @Override // a.l5u0
    public final t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        t73 t73VarC = this.b;
        if (t73VarC == null) {
            t73VarC = t73Var.c();
            this.b = t73VarC;
        }
        int iB = t73VarC.b();
        int i = 0;
        while (true) {
            t73 t73Var4 = this.b;
            if (i >= iB) {
                if (t73Var4 != null) {
                    return t73Var4;
                }
                Intrinsics.h("valueVector");
                throw null;
            }
            if (t73Var4 == null) {
                Intrinsics.h("valueVector");
                throw null;
            }
            long j2 = j;
            t73Var4.e(this.f28172a.get(i).e(t73Var.a(i), t73Var2.a(i), t73Var3.a(i), j2), i);
            i++;
            j = j2;
        }
    }

    @Override // a.l5u0
    public final t73 g(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        t73 t73VarC = this.d;
        if (t73VarC == null) {
            t73VarC = t73Var3.c();
            this.d = t73VarC;
        }
        int iB = t73VarC.b();
        int i = 0;
        while (true) {
            t73 t73Var4 = this.d;
            if (i >= iB) {
                if (t73Var4 != null) {
                    return t73Var4;
                }
                Intrinsics.h("endVelocityVector");
                throw null;
            }
            if (t73Var4 == null) {
                Intrinsics.h("endVelocityVector");
                throw null;
            }
            t73Var4.e(this.f28172a.get(i).c(t73Var.a(i), t73Var2.a(i), t73Var3.a(i)), i);
            i++;
        }
    }

    @Override // a.l5u0
    public final t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        t73 t73VarC = this.c;
        if (t73VarC == null) {
            t73VarC = t73Var3.c();
            this.c = t73VarC;
        }
        int iB = t73VarC.b();
        int i = 0;
        while (true) {
            t73 t73Var4 = this.c;
            if (i >= iB) {
                if (t73Var4 != null) {
                    return t73Var4;
                }
                Intrinsics.h("velocityVector");
                throw null;
            }
            if (t73Var4 == null) {
                Intrinsics.h("velocityVector");
                throw null;
            }
            long j2 = j;
            t73Var4.e(this.f28172a.get(i).b(t73Var.a(i), t73Var2.a(i), t73Var3.a(i), j2), i);
            i++;
            j = j2;
        }
    }

    public q5u0(u73 u73Var) {
        this.f28172a = u73Var;
    }
}
