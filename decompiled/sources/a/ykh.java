package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ykh {
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzn0 f42787a;
    public final sjh b;
    public final vby c;

    static {
        uen uenVar = wen.b;
        d = ibc.v0(10, bfn.MINUTES);
    }

    public ykh(yzn0 yzn0Var, sjh sjhVar, vby vbyVar) {
        vbyVar.getClass();
        this.f42787a = yzn0Var;
        this.b = sjhVar;
        this.c = vbyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(long j, zje zjeVar, String str) {
        xkh xkhVar;
        Serializable g0g0Var;
        if (zjeVar instanceof xkh) {
            xkhVar = (xkh) zjeVar;
            int i = xkhVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkhVar.l = i - Integer.MIN_VALUE;
            } else {
                xkhVar = new xkh(this, zjeVar);
            }
        } else {
            xkhVar = new xkh(this, zjeVar);
        }
        Object objJ = xkhVar.j;
        wne wneVar = wne.f39444a;
        int i2 = xkhVar.l;
        try {
            if (i2 == 0) {
                z1x.P(objJ);
                jo20 jo20VarP = ckb.P(j, str);
                e0g0 e0g0Var = j0g0.b;
                yzn0 yzn0Var = this.f42787a;
                xkhVar.i = this;
                xkhVar.l = 1;
                objJ = yzn0Var.j(jo20VarP, xkhVar);
                if (objJ == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = xkhVar.i;
                z1x.P(objJ);
            }
            Iterable iterable = (Iterable) objJ;
            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(bkb.l0((blh) it.next(), this.c));
            }
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = arrayList;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? iun.f15405a : g0g0Var;
    }
}
