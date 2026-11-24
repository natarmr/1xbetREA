package a;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class ik9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chf0 f14914a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        hk9 hk9Var;
        if (zjeVar instanceof hk9) {
            hk9Var = (hk9) zjeVar;
            int i = hk9Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hk9Var.k = i - Integer.MIN_VALUE;
            } else {
                hk9Var = new hk9(this, zjeVar);
            }
        } else {
            hk9Var = new hk9(this, zjeVar);
        }
        Object objW = hk9Var.i;
        Object obj = wne.f39444a;
        int i2 = hk9Var.k;
        if (i2 == 0) {
            z1x.P(objW);
            hk9Var.k = 1;
            objW = this.f14914a.w(hk9Var);
            if (objW == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW);
        }
        Double d = new Double(1.0d);
        for (ru6 ru6Var : (Iterable) objW) {
            double dDoubleValue = d.doubleValue();
            BigDecimal bigDecimalH = kotlin.text.b.h(ru6Var.b);
            d = new Double(dDoubleValue * (bigDecimalH != null ? bigDecimalH.doubleValue() : 1.0d));
        }
        return d;
    }
}
