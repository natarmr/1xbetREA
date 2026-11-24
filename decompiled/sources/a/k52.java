package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chf0 f17698a;

    public gmq a() {
        return sj3.S(wwb.C(((ou6) this.f17698a.c).f25862a, new String[]{"bet_events"}, new pd(2, null, (byte) 22)), 50L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(long j, zje zjeVar) {
        j52 j52Var;
        if (zjeVar instanceof j52) {
            j52Var = (j52) zjeVar;
            int i = j52Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                j52Var.k = i - Integer.MIN_VALUE;
            } else {
                j52Var = new j52(this, zjeVar);
            }
        } else {
            j52Var = new j52(this, zjeVar);
        }
        Object objF = j52Var.i;
        Object obj = wne.f39444a;
        int i2 = j52Var.k;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objF);
            j52Var.k = 1;
            objF = this.f17698a.F(j, j52Var);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        List list = (List) objF;
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((qu6) it.next()).x != 707) {
                        z = false;
                        break;
                    }
                }
            }
        } else {
            z = false;
            break;
        }
        return Boolean.valueOf(z);
    }
}
