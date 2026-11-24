package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class d200 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final juz f5334a;

    public d200(gii0 gii0Var) {
        gii0Var.getClass();
        this.f5334a = (juz) gii0Var.b(sre0.f32672a.b(juz.class));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, pqi0 pqi0Var, zje zjeVar) {
        t100 t100Var;
        if (zjeVar instanceof t100) {
            t100Var = (t100) zjeVar;
            int i = t100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t100Var.k = i - Integer.MIN_VALUE;
            } else {
                t100Var = new t100(this, zjeVar);
            }
        } else {
            t100Var = new t100(this, zjeVar);
        }
        Object obj = t100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = t100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            t100Var.k = 1;
            if (this.f5334a.e(str, pqi0Var, t100Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, qsi0 qsi0Var, zje zjeVar) {
        x100 x100Var;
        if (zjeVar instanceof x100) {
            x100Var = (x100) zjeVar;
            int i = x100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                x100Var.k = i - Integer.MIN_VALUE;
            } else {
                x100Var = new x100(this, zjeVar);
            }
        } else {
            x100Var = new x100(this, zjeVar);
        }
        Object obj = x100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = x100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            x100Var.k = 1;
            if (this.f5334a.d(str, qsi0Var, x100Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, pti0 pti0Var, zje zjeVar) {
        z100 z100Var;
        if (zjeVar instanceof z100) {
            z100Var = (z100) zjeVar;
            int i = z100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z100Var.k = i - Integer.MIN_VALUE;
            } else {
                z100Var = new z100(this, zjeVar);
            }
        } else {
            z100Var = new z100(this, zjeVar);
        }
        Object obj = z100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = z100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            z100Var.k = 1;
            if (this.f5334a.f(str, pti0Var, z100Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
