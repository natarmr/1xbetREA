package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vkr extends w46 {
    public final i1w0 b;
    public final ani0 c;
    public final lef0 d;
    public final i8u e;
    public final duj f;
    public final p7m0 g;
    public final p7m0 h;
    public final p7m0 i;
    public final ol60 j;

    public vkr(i1w0 i1w0Var, rpt rptVar, ani0 ani0Var, lef0 lef0Var, i8u i8uVar, i8u i8uVar2, duj dujVar) {
        Object value;
        Object value2;
        ejr ejrVar;
        i1w0Var.getClass();
        this.b = i1w0Var;
        this.c = ani0Var;
        this.d = lef0Var;
        this.e = i8uVar2;
        this.f = dujVar;
        Boolean bool = Boolean.FALSE;
        this.g = q7m0.a(bool);
        this.h = q7m0.a(iun.f15405a);
        this.i = q7m0.a(bool);
        this.j = new ol60(1, i99.b);
        List<w93> list = ((xio) ((pmi) rptVar.f30901a).c).b;
        boolean zIsEmpty = list.isEmpty();
        gjr gjrVar = gjr.f11414a;
        if (zIsEmpty) {
            List list2 = ((xio) i8uVar.f14358a.c).c;
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                xkd0 xkd0Var = (xkd0) obj;
                xkd0Var.getClass();
                arrayList.add(new nkr(xkd0Var.f41025a, f140.i(i2, Separators.DOT), xkd0Var.b, ejr.f7921a));
                i = i2;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.add(0, gjrVar);
            p7m0 p7m0Var = this.h;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, arrayList2));
            return;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        for (w93 w93Var : list) {
            w93Var.getClass();
            int i3 = w93Var.f38757a;
            String str = w93Var.b;
            String str2 = w93Var.c;
            int iOrdinal = w93Var.d.ordinal();
            if (iOrdinal == 0) {
                ejrVar = ejr.f7921a;
            } else if (iOrdinal == 1) {
                ejrVar = ejr.b;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    throw null;
                }
                ejrVar = ejr.c;
            }
            arrayList3.add(new nkr(i3, str, str2, ejrVar));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList4.add(0, gjrVar);
        p7m0 p7m0Var2 = this.h;
        do {
            value2 = p7m0Var2.getValue();
        } while (!p7m0Var2.m(value2, arrayList4));
        x();
    }

    public final void w(ukr ukrVar) {
        sac.V(jiu0.a(this), new dcr((byte) 4), null, null, new sxk(this, ukrVar, null, (byte) 28), 14);
    }

    public final void x() {
        p7m0 p7m0Var;
        Object value;
        Object next;
        do {
            p7m0Var = this.i;
            value = p7m0Var.getValue();
            ((Boolean) value).getClass();
            Iterator it = ((Iterable) this.h.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                p6t0 p6t0Var = (p6t0) next;
                if ((p6t0Var instanceof nkr) && ((nkr) p6t0Var).d == ejr.f7921a) {
                    break;
                }
            }
        } while (!p7m0Var.m(value, Boolean.valueOf(next == null)));
    }
}
