package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class b200 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final huz f1833a;

    public b200(gii0 gii0Var) {
        gii0Var.getClass();
        this.f1833a = (huz) gii0Var.b(sre0.f32672a.b(huz.class));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, nqi0 nqi0Var, zje zjeVar) {
        r100 r100Var;
        if (zjeVar instanceof r100) {
            r100Var = (r100) zjeVar;
            int i = r100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                r100Var.k = i - Integer.MIN_VALUE;
            } else {
                r100Var = new r100(this, zjeVar);
            }
        } else {
            r100Var = new r100(this, zjeVar);
        }
        Object obj = r100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = r100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            r100Var.k = 1;
            if (this.f1833a.c(str, nqi0Var, r100Var) == wneVar) {
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
    public final Object b(String str, osi0 osi0Var, zje zjeVar) {
        v100 v100Var;
        if (zjeVar instanceof v100) {
            v100Var = (v100) zjeVar;
            int i = v100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                v100Var.k = i - Integer.MIN_VALUE;
            } else {
                v100Var = new v100(this, zjeVar);
            }
        } else {
            v100Var = new v100(this, zjeVar);
        }
        Object obj = v100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = v100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            v100Var.k = 1;
            if (this.f1833a.b(str, osi0Var, v100Var) == wneVar) {
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
