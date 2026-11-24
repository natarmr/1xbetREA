package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class rtu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rou f31093a;
    public final x4v b;

    public rtu(rou rouVar, x4v x4vVar) {
        this.f31093a = rouVar;
        this.b = x4vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, int i, yje yjeVar) {
        qtu qtuVar;
        Object g0g0Var;
        Object g0g0Var2;
        if (yjeVar instanceof qtu) {
            qtuVar = (qtu) yjeVar;
            int i2 = qtuVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qtuVar.m = i2 - Integer.MIN_VALUE;
            } else {
                qtuVar = new qtu(this, yjeVar);
            }
        } else {
            qtuVar = new qtu(this, yjeVar);
        }
        Object objA = qtuVar.k;
        wne wneVar = wne.f39444a;
        int i3 = qtuVar.m;
        try {
            if (i3 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                rou rouVar = this.f31093a;
                qtuVar.i = z;
                qtuVar.j = i;
                qtuVar.m = 1;
                objA = rouVar.a(false, qtuVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = qtuVar.j;
                z = qtuVar.i;
                z1x.P(objA);
            }
            Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
            g0g0Var = new Integer(intOrNull != null ? intOrNull.intValue() : 0);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object num = new Integer(0);
        if (g0g0Var instanceof g0g0) {
            g0g0Var = num;
        }
        int iIntValue = ((Number) g0g0Var).intValue();
        try {
            krt0 krt0VarA = this.b.a();
            g0g0Var2 = new c3c0(iIntValue, krt0VarA.f18785a, z ? krt0VarA.c : krt0VarA.b);
        } catch (Throwable th2) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        Throwable thA = j0g0.a(g0g0Var2);
        if (thA != null) {
            if (!(thA instanceof j7t0)) {
                throw thA;
            }
            g0g0Var2 = new c3c0(0, 0L, false);
        }
        c3c0 c3c0Var = (c3c0) g0g0Var2;
        return c3c0Var.f3668a == 0 ? new c3c0(i, 0L, false) : c3c0Var;
    }
}
