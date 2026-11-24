package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final glq f29906a;
    public t73 b;
    public t73 c;
    public t73 d;
    public final float e;

    public r5u0(glq glqVar) {
        this.f29906a = glqVar;
        this.e = glqVar.g();
    }

    public final t73 a(long j, t73 t73Var, t73 t73Var2) {
        t73 t73VarC = this.c;
        if (t73VarC == null) {
            t73VarC = t73Var.c();
            this.c = t73VarC;
        }
        int iB = t73VarC.b();
        int i = 0;
        while (true) {
            t73 t73Var3 = this.c;
            if (i >= iB) {
                if (t73Var3 != null) {
                    return t73Var3;
                }
                Intrinsics.h("velocityVector");
                throw null;
            }
            if (t73Var3 == null) {
                Intrinsics.h("velocityVector");
                throw null;
            }
            t73Var.getClass();
            t73Var3.e(this.f29906a.a(t73Var2.a(i), j), i);
            i++;
        }
    }
}
