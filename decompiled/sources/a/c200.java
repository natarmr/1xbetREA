package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class c200 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iuz f3601a;

    public c200(gii0 gii0Var) {
        gii0Var.getClass();
        this.f3601a = (iuz) gii0Var.b(sre0.f32672a.b(iuz.class));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, oqi0 oqi0Var, zje zjeVar) {
        s100 s100Var;
        if (zjeVar instanceof s100) {
            s100Var = (s100) zjeVar;
            int i = s100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s100Var.k = i - Integer.MIN_VALUE;
            } else {
                s100Var = new s100(this, zjeVar);
            }
        } else {
            s100Var = new s100(this, zjeVar);
        }
        Object obj = s100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = s100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            s100Var.k = 1;
            if (this.f3601a.c(str, oqi0Var, s100Var) == wneVar) {
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
    public final Object b(String str, psi0 psi0Var, zje zjeVar) {
        w100 w100Var;
        if (zjeVar instanceof w100) {
            w100Var = (w100) zjeVar;
            int i = w100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                w100Var.k = i - Integer.MIN_VALUE;
            } else {
                w100Var = new w100(this, zjeVar);
            }
        } else {
            w100Var = new w100(this, zjeVar);
        }
        Object obj = w100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = w100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            w100Var.k = 1;
            if (this.f3601a.b(str, psi0Var, w100Var) == wneVar) {
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
