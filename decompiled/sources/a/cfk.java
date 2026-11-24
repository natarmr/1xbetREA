package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class cfk extends pfk {
    public final cty g;
    public final cu00 h;
    public final cu00 i;
    public final /* synthetic */ ffk j;

    public cfk(ffk ffkVar, cty ctyVar) {
        this.j = ffkVar;
        g45 g45Var = ffkVar.l;
        s2d0 s2d0Var = ffkVar.e;
        List list = s2d0Var.q;
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (!njq.A.e(((i3d0) obj).d).booleanValue()) {
                arrayListU.add(obj);
            }
        }
        List list2 = s2d0Var.r;
        ArrayList arrayListU2 = twn.u(list2);
        for (Object obj2 : list2) {
            if (!njq.L.e(((p3d0) obj2).d).booleanValue()) {
                arrayListU2.add(obj2);
            }
        }
        List list3 = s2d0Var.s;
        list3.getClass();
        List list4 = s2d0Var.k;
        list4.getClass();
        h950 h950Var = (h950) ffkVar.l.b;
        ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(ydx.L(h950Var, ((Number) it.next()).intValue()));
        }
        super(g45Var, arrayListU, arrayListU2, list3, new zek(arrayList, (byte) 0));
        f6i f6iVar = (f6i) g45Var.f10647a;
        this.g = ctyVar;
        eu00 eu00Var = (eu00) f6iVar.e;
        afk afkVar = new afk(this, (byte) 0);
        eu00Var.getClass();
        this.h = new cu00(eu00Var, afkVar);
        eu00 eu00Var2 = (eu00) f6iVar.e;
        afk afkVar2 = new afk(this, (byte) 1);
        eu00Var2.getClass();
        this.i = new cu00(eu00Var2, afkVar2);
    }

    @Override // a.pfk, a.dr30, a.cr30
    public final Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        s(g950Var, ux50Var);
        return super.a(g950Var, ux50Var);
    }

    @Override // a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return (Collection) this.h.invoke();
    }

    @Override // a.pfk, a.dr30, a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        wm40 wm40Var;
        g950Var.getClass();
        ux50Var.getClass();
        s(g950Var, ux50Var);
        ali aliVar = this.j.p;
        return (aliVar == null || (wm40Var = (wm40) ((xg) aliVar.b).invoke(g950Var)) == null) ? super.d(g950Var, ux50Var) : wm40Var;
    }

    @Override // a.pfk, a.dr30, a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        s(g950Var, ux50Var);
        return super.f(g950Var, ux50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // a.pfk
    public final void h(ArrayList arrayList, Function1 function1) {
        ?? arrayList2;
        ali aliVar = this.j.p;
        if (aliVar != null) {
            Set<g950> setKeySet = ((LinkedHashMap) aliVar.f1068a).keySet();
            arrayList2 = new ArrayList();
            for (g950 g950Var : setKeySet) {
                g950Var.getClass();
                wm40 wm40Var = (wm40) ((xg) aliVar.b).invoke(g950Var);
                if (wm40Var != null) {
                    arrayList2.add(wm40Var);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // a.pfk
    public final void j(g950 g950Var, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((wsy) it.next()).y().a(g950Var, ux50.c));
        }
        g45 g45Var = this.b;
        arrayList.addAll(((fx) ((f6i) g45Var.f10647a).p).c(g950Var, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((lm50) ((km50) ((f6i) g45Var.f10647a).s)).d.h(g950Var, arrayList2, arrayList3, this.j, new bfk(arrayList, (byte) 0));
    }

    @Override // a.pfk
    public final void k(g950 g950Var, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((wsy) it.next()).y().f(g950Var, ux50.c));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((lm50) ((km50) ((f6i) this.b.f10647a).s)).d.h(g950Var, arrayList2, arrayList3, this.j, new bfk(arrayList, (byte) 0));
    }

    @Override // a.pfk
    public final qlc l(g950 g950Var) {
        g950Var.getClass();
        return this.j.h.d(g950Var);
    }

    @Override // a.pfk
    public final Set n() {
        List listB = this.j.n.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            Set setE = ((wsy) it.next()).y().e();
            if (setE == null) {
                return null;
            }
            w3d.u(linkedHashSet, setE);
        }
        return linkedHashSet;
    }

    @Override // a.pfk
    public final Set o() {
        ffk ffkVar = this.j;
        List listB = ffkVar.n.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            w3d.u(linkedHashSet, ((wsy) it.next()).y().c());
        }
        linkedHashSet.addAll(((fx) ((f6i) this.b.f10647a).p).g(ffkVar));
        return linkedHashSet;
    }

    @Override // a.pfk
    public final Set p() {
        List listB = this.j.n.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            w3d.u(linkedHashSet, ((wsy) it.next()).y().g());
        }
        return linkedHashSet;
    }

    @Override // a.pfk
    public final boolean r(sfk sfkVar) {
        return ((qv90) ((f6i) this.b.f10647a).q).f(this.j, sfkVar);
    }

    public final void s(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        ((gqw0) ((f6i) this.b.f10647a).k).getClass();
        this.j.getClass();
    }
}
