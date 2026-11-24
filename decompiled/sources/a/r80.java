package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class r80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f30002a;
    public final pek0 b;
    public final d80 c;
    public final btt0 d;
    public final knf0 e;
    public final nc f = new nc((Object) this, (byte) 9);

    public r80(gii0 gii0Var, pek0 pek0Var, gfk0 gfk0Var, d80 d80Var, btt0 btt0Var, knf0 knf0Var) {
        this.f30002a = gii0Var;
        this.b = pek0Var;
        this.c = d80Var;
        this.d = btt0Var;
        this.e = knf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.z70[]] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Enum] */
    public final Object a(List list, long j, csr csrVar, zje zjeVar) {
        q80 q80Var;
        pek0 pek0Var;
        yeg0 yeg0Var;
        String str;
        ?? r7;
        if (zjeVar instanceof q80) {
            q80Var = (q80) zjeVar;
            int i = q80Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                q80Var.l = i - Integer.MIN_VALUE;
            } else {
                q80Var = new q80(this, zjeVar);
            }
        } else {
            q80Var = new q80(this, zjeVar);
        }
        Object objA = q80Var.j;
        wne wneVar = wne.f39444a;
        int i2 = q80Var.l;
        String str2 = null;
        if (i2 == 0) {
            z1x.P(objA);
            s70 s70Var = (s70) this.f.invoke();
            String strA = this.d.a();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                t70 t70Var = (t70) it.next();
                t70Var.getClass();
                arrayList.add(new y70(t70Var.f33442a, b80.valueOf(t70Var.b.name())));
            }
            bg8.Companion.getClass();
            u80 u80Var = new u80(arrayList, ag8.a(csrVar), j, this.e.c());
            pek0Var = this.b;
            q80Var.i = pek0Var;
            q80Var.l = 1;
            objA = s70Var.a(strA, u80Var, q80Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pek0Var = q80Var.i;
            z1x.P(objA);
        }
        x80 x80Var = (x80) ((u2t) objA).a();
        pek0Var.getClass();
        Long l = x80Var.f;
        long jLongValue = l != null ? l.longValue() : 0L;
        Double d = x80Var.d;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = x80Var.g;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Integer num = x80Var.f40439a;
        double dIntValue = num != null ? num.intValue() : 0.0d;
        List list2 = x80Var.b;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        lme0 lme0Var = yeg0.f42484a;
        Integer num2 = (Integer) CollectionsKt.W(0, list2);
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num2.intValue();
        lme0Var.getClass();
        yeg0[] yeg0VarArrValues = yeg0.values();
        int length = yeg0VarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                yeg0Var = null;
                break;
            }
            yeg0Var = yeg0VarArrValues[i3];
            if (yeg0Var.ordinal() == iIntValue) {
                break;
            }
            i3++;
        }
        if (yeg0Var == null) {
            jf4.k(null);
            return null;
        }
        List list3 = x80Var.e;
        if (list3 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            z70.f43894a.getClass();
            ?? Values = z70.values();
            int length2 = Values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    str = str2;
                    r7 = str;
                    break;
                }
                r7 = Values[i4];
                str = str2;
                if (r7.ordinal() == iIntValue2) {
                    break;
                }
                i4++;
                str2 = str;
            }
            if (r7 == 0) {
                jf4.k(str);
                return str;
            }
            arrayList2.add(r7);
            str2 = str;
        }
        return new o80(jLongValue, dDoubleValue, dDoubleValue2, dIntValue, yeg0Var, arrayList2, 64);
    }
}
