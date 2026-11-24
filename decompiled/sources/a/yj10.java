package a;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yj10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knf0 f42722a;
    public final wj10 b;
    public final btt0 c;

    public yj10(knf0 knf0Var, wj10 wj10Var, btt0 btt0Var) {
        wj10Var.getClass();
        this.f42722a = knf0Var;
        this.b = wj10Var;
        this.c = btt0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(long j, double d, csr csrVar, ej10 ej10Var, zje zjeVar) {
        xj10 xj10Var;
        lnm0 lnm0Var;
        ws60 ws60Var;
        if (zjeVar instanceof xj10) {
            xj10Var = (xj10) zjeVar;
            int i = xj10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xj10Var.k = i - Integer.MIN_VALUE;
            } else {
                xj10Var = new xj10(this, zjeVar);
            }
        } else {
            xj10Var = new xj10(this, zjeVar);
        }
        Object objA = xj10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xj10Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.c.a();
            String strC = this.f42722a.c();
            xj10Var.k = 1;
            uju ujuVar = (uju) this.b.b.invoke();
            Double d2 = !csrVar.f4905a.f3145a.a() ? new Double(d) : null;
            bg8.Companion.getClass();
            objA = ujuVar.a(strA, new bk10(j, ag8.a(csrVar), d2, strC, kotlin.collections.a.c(new Integer(ej10Var.f7886a))), xj10Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        ek10 ek10Var = (ek10) ((q16) objA).a();
        List list = ek10Var.f7934a;
        List list2 = list == null ? iun.f15405a : list;
        String str = ek10Var.b;
        if (str != null) {
            switch (str) {
                case "0":
                    lnm0Var = lnm0.c;
                    break;
                case "1":
                    lnm0Var = lnm0.e;
                    break;
                case "2":
                    lnm0Var = lnm0.d;
                    break;
                case "3":
                    lnm0Var = lnm0.f;
                    break;
                default:
                    lnm0Var = lnm0.e;
                    break;
            }
        } else {
            lnm0Var = lnm0.e;
        }
        lnm0 lnm0Var2 = lnm0Var;
        Double d3 = ek10Var.c;
        double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
        Double d4 = ek10Var.d;
        if (d4 == null) {
            throw new ef5();
        }
        double dDoubleValue2 = d4.doubleValue();
        Double d5 = ek10Var.e;
        double dDoubleValue3 = d5 != null ? d5.doubleValue() : 0.0d;
        Long l = ek10Var.f;
        if (l == null) {
            throw new ef5();
        }
        long jLongValue = l.longValue();
        if (list == null || list.size() < 2) {
            koa.f18622a.getClass();
            ws60Var = new ws60(yk5.m(0), 0);
        } else {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!TextUtils.isDigitsOnly((String) it.next())) {
                            koa.f18622a.getClass();
                            ws60Var = new ws60(yk5.m(0), 0);
                        }
                    }
                }
            }
            int i3 = Integer.parseInt((String) list.get(0));
            int i4 = Integer.parseInt((String) list.get(1));
            koa.f18622a.getClass();
            ws60Var = new ws60(yk5.m(i3), i4);
        }
        return new vj10(list2, lnm0Var2, dDoubleValue, dDoubleValue2, dDoubleValue3, jLongValue, ws60Var);
    }
}
