package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class afk0 implements qkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffk0 f782a;
    public final sjj b;
    public final j73 c;
    public final cbh0 d = fbh0.b;

    public afk0(ffk0 ffk0Var, sjj sjjVar, j73 j73Var) {
        this.f782a = ffk0Var;
        this.b = sjjVar;
        this.c = j73Var;
    }

    @Override // a.qkq
    public Object a(qah0 qah0Var, float f, zje zjeVar) {
        return c(qah0Var, f, cfx0.p, zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(qah0 qah0Var, float f, Function1 function1, zje zjeVar) {
        vek0 vek0Var;
        Function1 function2;
        if (zjeVar instanceof vek0) {
            vek0Var = (vek0) zjeVar;
            int i = vek0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vek0Var.l = i - Integer.MIN_VALUE;
            } else {
                vek0Var = new vek0(this, zjeVar);
            }
        } else {
            vek0Var = new vek0(this, zjeVar);
        }
        Object objD0 = vek0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = vek0Var.l;
        if (i2 == 0) {
            z1x.P(objD0);
            xek0 xek0Var = new xek0(this, f, function1, qah0Var, null);
            vek0Var.i = function1;
            vek0Var.l = 1;
            objD0 = qjj.d0(this.d, xek0Var, vek0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
            function2 = function1;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function2 = vek0Var.i;
            z1x.P(objD0);
        }
        g73 g73Var = (g73) objD0;
        function2.invoke(new Float(0.0f));
        return g73Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(qah0 qah0Var, float f, Function1 function1, zje zjeVar) {
        yek0 yek0Var;
        if (zjeVar instanceof yek0) {
            yek0Var = (yek0) zjeVar;
            int i = yek0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yek0Var.k = i - Integer.MIN_VALUE;
            } else {
                yek0Var = new yek0(this, zjeVar);
            }
        } else {
            yek0Var = new yek0(this, zjeVar);
        }
        Object objB = yek0Var.i;
        Object obj = wne.f39444a;
        int i2 = yek0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            yek0Var.k = 1;
            objB = b(qah0Var, f, function1, yek0Var);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        g73 g73Var = (g73) objB;
        return new Float(g73Var.f10794a.floatValue() != 0.0f ? ((Number) g73Var.b.b()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(qah0 qah0Var, float f, float f2, wek0 wek0Var, zje zjeVar) {
        zek0 zek0Var;
        if (zjeVar instanceof zek0) {
            zek0Var = (zek0) zjeVar;
            int i = zek0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zek0Var.k = i - Integer.MIN_VALUE;
            } else {
                zek0Var = new zek0(this, zjeVar);
            }
        } else {
            zek0Var = new zek0(this, zjeVar);
        }
        zek0 zek0Var2 = zek0Var;
        Object objB = zek0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = zek0Var2.k;
        if (i2 == 0) {
            z1x.P(objB);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return x4d0.d(f, f2, 28);
            }
            zek0Var2.k = 1;
            sjj sjjVar = this.b;
            objB = (Math.abs(uzb.R(sjjVar, 0.0f, f2)) >= Math.abs(f) ? new vqc((Object) sjjVar, (byte) 22) : new lef0(this.c)).b(qah0Var, new Float(f), new Float(f2), wek0Var, zek0Var2);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((g73) objB).b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afk0) {
            afk0 afk0Var = (afk0) obj;
            if (Intrinsics.d(afk0Var.c, this.c) && Intrinsics.d(afk0Var.b, this.b) && Intrinsics.d(afk0Var.f782a, this.f782a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f782a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
