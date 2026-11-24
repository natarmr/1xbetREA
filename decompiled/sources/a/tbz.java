package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f33693a;
    public o24 c;
    public int f;
    public final nvu b = new nvu((byte) 14);
    public int d = -1;
    public int e = -1;

    public tbz(Function1 function1) {
        this.f33693a = function1;
    }

    public final sbz a(int i, long j, Function1 function1, boolean z) {
        o24 o24Var = this.c;
        if (o24Var == null) {
            return jen.f16383a;
        }
        ltb0 ltb0Var = (ltb0) o24Var.d;
        boolean z2 = ltb0Var instanceof m13;
        ktb0 ktb0Var = new ktb0(o24Var, i, this.b, function1);
        ktb0Var.d = new p4e(j);
        if (!z2) {
            ltb0Var.a(ktb0Var);
        } else if (z) {
            m13 m13Var = (m13) ltb0Var;
            m13Var.b.add(new qwb0(1, ktb0Var));
            if (!m13Var.c) {
                m13Var.c = true;
                m13Var.f20984a.post(m13Var);
            }
        } else {
            m13 m13Var2 = (m13) ltb0Var;
            m13Var2.b.add(new qwb0(0, ktb0Var));
            if (!m13Var2.c) {
                m13Var2.c = true;
                m13Var2.f20984a.post(m13Var2);
            }
        }
        ahy.k0(i, "compose:lazy:schedule_prefetch:index");
        return ktb0Var;
    }
}
