package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u4a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f35035a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(yje yjeVar) {
        t4a t4aVar;
        if (yjeVar instanceof t4a) {
            t4aVar = (t4a) yjeVar;
            int i = t4aVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t4aVar.k = i - Integer.MIN_VALUE;
            } else {
                t4aVar = new t4a(this, yjeVar);
            }
        } else {
            t4aVar = new t4a(this, yjeVar);
        }
        Object objI = t4aVar.i;
        wne wneVar = wne.f39444a;
        int i2 = t4aVar.k;
        if (i2 == 0) {
            z1x.P(objI);
            tl5 tl5Var = tl5.c;
            t4aVar.k = 1;
            objI = this.f35035a.i(tl5Var, t4aVar);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objI) {
            ql5 ql5Var = (ql5) obj;
            if (ql5Var.i.e() || (ql5Var.i == txs0.e && ql5Var.l)) {
                arrayList.add(obj);
            }
        }
        return Boolean.valueOf(arrayList.size() > 1);
    }
}
