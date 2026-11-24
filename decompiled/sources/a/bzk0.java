package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class bzk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knf0 f3473a;
    public final lme0 b;
    public final zyk0 c;
    public final uyk0 d;
    public final btt0 e;

    public bzk0(knf0 knf0Var, lme0 lme0Var, zyk0 zyk0Var, uyk0 uyk0Var, btt0 btt0Var) {
        this.f3473a = knf0Var;
        this.b = lme0Var;
        this.c = zyk0Var;
        this.d = uyk0Var;
        this.e = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final Object a(double d, long j, csr csrVar, ArrayList arrayList, zje zjeVar) {
        azk0 azk0Var;
        bg8 bg8VarA;
        lme0 lme0Var;
        ?? arrayList2;
        iyk0 iyk0Var;
        yxk0 yxk0Var;
        if (zjeVar instanceof azk0) {
            azk0Var = (azk0) zjeVar;
            int i = azk0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                azk0Var.l = i - Integer.MIN_VALUE;
            } else {
                azk0Var = new azk0(this, zjeVar);
            }
        } else {
            azk0Var = new azk0(this, zjeVar);
        }
        Object objA = azk0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = azk0Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            String strC = this.f3473a.c();
            String strA = this.e.a();
            lme0 lme0Var2 = this.b;
            azk0Var.i = lme0Var2;
            azk0Var.l = 1;
            wxk0 wxk0Var = (wxk0) this.c.b.invoke();
            Double d2 = (csrVar == null || csrVar.f4905a.f3145a.a()) ? null : new Double(d);
            if (csrVar != null) {
                bg8.Companion.getClass();
                bg8VarA = ag8.a(csrVar);
            } else {
                bg8VarA = null;
            }
            objA = wxk0Var.a(strA, new yyk0(j, bg8VarA, d2, strC, arrayList), azk0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            lme0Var = lme0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lme0Var = azk0Var.i;
            z1x.P(objA);
        }
        ezk0 ezk0Var = (ezk0) ((u2t) objA).a();
        lme0Var.getClass();
        Long l = ezk0Var.f8676a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Double d3 = ezk0Var.b;
        double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
        Double d4 = ezk0Var.c;
        double dDoubleValue2 = d4 != null ? d4.doubleValue() : 0.0d;
        List<yzc> list = ezk0Var.d;
        if (list != null) {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            for (yzc yzcVar : list) {
                yzcVar.getClass();
                int iOrdinal = yzcVar.ordinal();
                if (iOrdinal == 0) {
                    yxk0Var = yxk0.f43427a;
                } else if (iOrdinal == 1) {
                    yxk0Var = yxk0.b;
                } else if (iOrdinal == 2) {
                    yxk0Var = yxk0.c;
                } else if (iOrdinal == 3) {
                    yxk0Var = yxk0.d;
                } else if (iOrdinal == 4) {
                    yxk0Var = yxk0.e;
                } else {
                    if (iOrdinal != 5) {
                        t9f.b();
                        return null;
                    }
                    yxk0Var = yxk0.f;
                }
                arrayList2.add(yxk0Var);
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        ?? r15 = arrayList2;
        kyk0 kyk0Var = ezk0Var.e;
        if (kyk0Var != null) {
            int iOrdinal2 = kyk0Var.ordinal();
            if (iOrdinal2 == 0) {
                iyk0Var = iyk0.f15594a;
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                iyk0Var = iyk0.b;
            }
        } else {
            iyk0Var = iyk0.b;
        }
        iyk0 iyk0Var2 = iyk0Var;
        Double d5 = ezk0Var.f;
        double dDoubleValue3 = d5 != null ? d5.doubleValue() : 0.0d;
        String str = ezk0Var.g;
        if (str == null) {
            str = "";
        }
        return new vyk0(jLongValue, dDoubleValue, dDoubleValue2, r15, iyk0Var2, dDoubleValue3, str);
    }
}
