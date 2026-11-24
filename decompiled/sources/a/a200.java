package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class a200 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final guz f100a;

    public a200(gii0 gii0Var) {
        gii0Var.getClass();
        this.f100a = (guz) gii0Var.b(sre0.f32672a.b(guz.class));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, mqi0 mqi0Var, zje zjeVar) {
        u100 u100Var;
        if (zjeVar instanceof u100) {
            u100Var = (u100) zjeVar;
            int i = u100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u100Var.k = i - Integer.MIN_VALUE;
            } else {
                u100Var = new u100(this, zjeVar);
            }
        } else {
            u100Var = new u100(this, zjeVar);
        }
        Object obj = u100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = u100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            u100Var.k = 1;
            if (this.f100a.b(str, mqi0Var, u100Var) == wneVar) {
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
    public final Object b(String str, rsi0 rsi0Var, zje zjeVar) {
        y100 y100Var;
        if (zjeVar instanceof y100) {
            y100Var = (y100) zjeVar;
            int i = y100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y100Var.k = i - Integer.MIN_VALUE;
            } else {
                y100Var = new y100(this, zjeVar);
            }
        } else {
            y100Var = new y100(this, zjeVar);
        }
        Object obj = y100Var.i;
        wne wneVar = wne.f39444a;
        int i2 = y100Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            y100Var.k = 1;
            if (this.f100a.d(str, rsi0Var, y100Var) == wneVar) {
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
