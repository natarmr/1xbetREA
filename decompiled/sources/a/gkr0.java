package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class gkr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f11458a = q7m0.a(null);
    public final p7m0 b = q7m0.a(null);

    public final bn7 a() {
        p7m0 p7m0Var = this.b;
        okr0 okr0Var = (okr0) p7m0Var.getValue();
        double d = okr0Var != null ? okr0Var.h : 0.0d;
        okr0 okr0Var2 = (okr0) p7m0Var.getValue();
        return new bn7(d, okr0Var2 != null ? okr0Var2.i : 0.0d);
    }

    public final lmr0 b() {
        Object next;
        List list = (List) this.f11458a.getValue();
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((lmr0) next).d);
            lmr0 lmr0Var = (lmr0) next;
            if (lmr0Var != null) {
                return lmr0Var;
            }
        }
        return new lmr0(0, "", ulr0.NONE, false);
    }

    public final List c() {
        ArrayList arrayListR;
        List list;
        okr0 okr0Var = (okr0) this.b.getValue();
        if (okr0Var == null || (list = okr0Var.j) == null) {
            arrayListR = null;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((hir0) it.next()).c);
            }
            arrayListR = r3d.r(arrayList);
        }
        return arrayListR == null ? iun.f15405a : arrayListR;
    }

    public final Unit d(int i) {
        ArrayList arrayList;
        p7m0 p7m0Var = this.f11458a;
        List<lmr0> list = (List) p7m0Var.getValue();
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (lmr0 lmr0Var : list) {
                int i2 = lmr0Var.f20312a;
                arrayList.add(new lmr0(i2, lmr0Var.b, lmr0Var.c, i2 == i));
            }
        } else {
            arrayList = null;
        }
        p7m0Var.n(arrayList);
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }
}
