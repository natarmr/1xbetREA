package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class t090 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr00 f33109a;
    public final knf0 b;
    public final mne c;

    public t090(nr00 nr00Var, knf0 knf0Var, mne mneVar) {
        knf0Var.getClass();
        this.f33109a = nr00Var;
        this.b = knf0Var;
        this.c = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        s090 s090Var;
        Object g0g0Var;
        if (zjeVar instanceof s090) {
            s090Var = (s090) zjeVar;
            int i = s090Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s090Var.k = i - Integer.MIN_VALUE;
            } else {
                s090Var = new s090(this, zjeVar);
            }
        } else {
            s090Var = new s090(this, zjeVar);
        }
        Object objD0 = s090Var.i;
        wne wneVar = wne.f39444a;
        int i2 = s090Var.k;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                dvj dvjVar = this.c.b;
                c670 c670Var = new c670(this, yjeVar, (byte) 10);
                s090Var.k = 1;
                objD0 = qjj.d0(dvjVar, c670Var, s090Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            g0g0Var = (List) objD0;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return j0g0.a(g0g0Var) == null ? g0g0Var : iun.f15405a;
    }
}
