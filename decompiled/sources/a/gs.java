package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f11805a;

    public /* synthetic */ gs(g45 g45Var) {
        this.f11805a = g45Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(double d, zje zjeVar) {
        gk9 gk9Var;
        if (zjeVar instanceof gk9) {
            gk9Var = (gk9) zjeVar;
            int i = gk9Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gk9Var.l = i - Integer.MIN_VALUE;
            } else {
                gk9Var = new gk9(this, zjeVar);
            }
        } else {
            gk9Var = new gk9(this, zjeVar);
        }
        Object objK = gk9Var.j;
        wne wneVar = wne.f39444a;
        int i2 = gk9Var.l;
        if (i2 == 0) {
            z1x.P(objK);
            p7m0 p7m0Var = ((lye) this.f11805a.f10647a).n;
            gk9Var.i = d;
            gk9Var.l = 1;
            objK = ntb.K(p7m0Var, gk9Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = gk9Var.i;
            z1x.P(objK);
        }
        int i3 = ((en7) objK).b;
        if (i3 != 0) {
            d = m7x.p(d, i3);
        }
        return new Double(d);
    }

    public void b() {
        double d;
        g45 g45Var = this.f11805a;
        ave aveVar = (ave) g45Var.c;
        if (aveVar.f1521a != q4f.m) {
            d = ((lye) g45Var.f10647a).f20858a.s;
        } else {
            g0f g0fVar = (g0f) CollectionsKt.firstOrNull(((m0f) g45Var.b).f20951a);
            d = g0fVar != null ? g0fVar.s : 0.0d;
        }
        if (d == 0.0d) {
            d = aveVar.f;
        }
        aveVar.e = d;
    }

    public void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            na20 na20Var = (na20) it.next();
            List list = na20Var.f23170a;
            ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Boolean.valueOf(arrayList2.add(new l820(((Number) it2.next()).longValue(), na20Var.b, na20Var.c))));
            }
            arrayList3.add(arrayList4);
        }
        ((ave) this.f11805a.c).n.addAll(arrayList2);
    }
}
