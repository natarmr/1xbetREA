package a;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dgx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6065a;
    public final boolean b;
    public final txw0 c;
    public final BitSet d;
    public final BitSet e;
    public final gx3 f;
    public final gx3 g;
    public final /* synthetic */ ydw0 h;

    public dgx0(ydw0 ydw0Var, String str, txw0 txw0Var, BitSet bitSet, BitSet bitSet2, gx3 gx3Var, gx3 gx3Var2) {
        this.h = ydw0Var;
        this.f6065a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = gx3Var;
        this.g = new gx3(0);
        for (Integer num : (cx3) gx3Var2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) gx3Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = txw0Var;
    }

    public final void a(obw0 obw0Var) {
        int iS;
        switch (obw0Var.g) {
            case 0:
                iS = ((jsw0) obw0Var.i).s();
                break;
            default:
                iS = ((ssw0) obw0Var.i).s();
                break;
        }
        boolean z = true;
        if (obw0Var.c != null) {
            this.e.set(iS, true);
        }
        Boolean bool = obw0Var.d;
        if (bool != null) {
            this.d.set(iS, bool.booleanValue());
        }
        if (obw0Var.e != null) {
            Integer numValueOf = Integer.valueOf(iS);
            gx3 gx3Var = this.f;
            Long l = (Long) gx3Var.get(numValueOf);
            long jLongValue = obw0Var.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                gx3Var.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (obw0Var.f != null) {
            Integer numValueOf2 = Integer.valueOf(iS);
            gx3 gx3Var2 = this.g;
            List arrayList = (List) gx3Var2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                gx3Var2.put(numValueOf2, arrayList);
            }
            boolean zX = false;
            switch (obw0Var.g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            vhw0.a();
            kxw0 kxw0Var = (kxw0) this.h.b;
            bkw0 bkw0Var = kxw0Var.d;
            atw0 atw0Var = btw0.F0;
            String str = this.f6065a;
            if (bkw0Var.x1(str, atw0Var)) {
                switch (obw0Var.g) {
                    case 0:
                        zX = ((jsw0) obw0Var.i).x();
                        break;
                }
                if (zX) {
                    arrayList.clear();
                }
            }
            vhw0.a();
            boolean zX1 = kxw0Var.d.x1(str, atw0Var);
            Long l2 = obw0Var.f;
            if (!zX1) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final tvw0 b(int i) {
        List list;
        svw0 svw0VarY = tvw0.y();
        svw0VarY.c();
        ((tvw0) svw0VarY.b).z(i);
        svw0VarY.c();
        ((tvw0) svw0VarY.b).C(this.b);
        txw0 txw0Var = this.c;
        if (txw0Var != null) {
            svw0VarY.c();
            ((tvw0) svw0VarY.b).B(txw0Var);
        }
        rxw0 rxw0VarZ = txw0.z();
        ArrayList arrayListS1 = r6x0.S1(this.d);
        rxw0VarZ.c();
        ((txw0) rxw0VarZ.b).D(arrayListS1);
        ArrayList arrayListS2 = r6x0.S1(this.e);
        rxw0VarZ.c();
        ((txw0) rxw0VarZ.b).B(arrayListS2);
        gx3 gx3Var = this.f;
        ArrayList arrayList = new ArrayList(gx3Var.c);
        for (Integer num : (cx3) gx3Var.keySet()) {
            int iIntValue = num.intValue();
            Long l = (Long) gx3Var.get(num);
            if (l != null) {
                mww0 mww0VarV = pww0.v();
                mww0VarV.c();
                ((pww0) mww0VarV.b).w(iIntValue);
                long jLongValue = l.longValue();
                mww0VarV.c();
                ((pww0) mww0VarV.b).x(jLongValue);
                arrayList.add((pww0) mww0VarV.e());
            }
        }
        rxw0VarZ.c();
        ((txw0) rxw0VarZ.b).F(arrayList);
        gx3 gx3Var2 = this.g;
        if (gx3Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(gx3Var2.c);
            for (Integer num2 : (cx3) gx3Var2.keySet()) {
                vxw0 vxw0VarW = wxw0.w();
                int iIntValue2 = num2.intValue();
                vxw0VarW.c();
                ((wxw0) vxw0VarW.b).x(iIntValue2);
                List list2 = (List) gx3Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    vxw0VarW.c();
                    ((wxw0) vxw0VarW.b).y(list2);
                }
                arrayList2.add((wxw0) vxw0VarW.e());
            }
            list = arrayList2;
        }
        rxw0VarZ.c();
        ((txw0) rxw0VarZ.b).H(list);
        svw0VarY.c();
        ((tvw0) svw0VarY.b).A((txw0) rxw0VarZ.e());
        return (tvw0) svw0VarY.e();
    }

    public dgx0(ydw0 ydw0Var, String str) {
        this.h = ydw0Var;
        this.f6065a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new gx3(0);
        this.g = new gx3(0);
    }
}
