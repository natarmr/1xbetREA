package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;

/* JADX INFO: loaded from: classes4.dex */
public final class i7g extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 0;
    public /* synthetic */ List j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7g(j7g j7gVar, List list, o4g o4gVar, yje yjeVar) {
        super(3, yjeVar);
        this.m = j7gVar;
        this.j = list;
        this.n = o4gVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (b) {
            case 0:
                i7g i7gVar = new i7g((j7g) obj5, this.j, (o4g) obj4, (yje) obj3);
                i7gVar.l = (Set) obj;
                i7gVar.k = (String) obj2;
                return i7gVar.invokeSuspend(Unit.f46060a);
            case 1:
                i7g i7gVar2 = new i7g((org.xplatform.favorites.impl.presentation.category.f) this.l, (wcb) obj5, (List) obj4, (yje) obj3);
                i7gVar2.j = (List) obj;
                i7gVar2.k = (String) obj2;
                return i7gVar2.invokeSuspend(Unit.f46060a);
            default:
                i7g i7gVar3 = new i7g((lk40) this.k, (wk40) obj5, obj4, (yje) obj3);
                i7gVar3.l = (da10) obj;
                i7gVar3.j = (List) obj2;
                return i7gVar3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object lchVar;
        boolean z;
        Object objW;
        Object value;
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                Set set = (Set) this.l;
                String str = (String) this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                j7g j7gVar = (j7g) obj3;
                List list = this.j;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (StringsKt.O(((f3n0) obj4).b, str, true)) {
                        arrayList.add(obj4);
                    }
                }
                List listL0 = CollectionsKt.L0(set);
                o4g o4gVar = (o4g) obj2;
                List list2 = o4gVar.b;
                List list3 = o4gVar.f24633a;
                if (!list2.isEmpty() || !list3.isEmpty()) {
                    ArrayList<f3n0> arrayList2 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (list3.contains(Long.valueOf(((f3n0) obj5).f8872a))) {
                            arrayList2.add(obj5);
                        }
                    }
                    p7m0 p7m0Var = j7gVar.k;
                    if (arrayList2.isEmpty()) {
                        lchVar = new mch(g2v.d(j7gVar.f, pb10.v, null, null, R.string.nothing_found, 0, null, 478), 0L);
                    } else {
                        ctf0 ctf0Var = j7gVar.h;
                        boolean z2 = str.length() > 0;
                        ctf0Var.getClass();
                        listL0.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (!z2) {
                            String strA = ctf0Var.b.a(R.string.select_all, Arrays.copyOf(new Object[0], 0));
                            if (arrayList2.isEmpty()) {
                                z = true;
                            } else {
                                Iterator it = arrayList2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = true;
                                    } else if (!listL0.contains(Long.valueOf(((f3n0) it.next()).f8872a))) {
                                        z = false;
                                    }
                                }
                            }
                            lc00VarB.add(new a7g(0L, "", strA, z, false));
                        }
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        for (f3n0 f3n0Var : arrayList2) {
                            long j = f3n0Var.f8872a;
                            arrayList3.add(new a7g(j, f3n0Var.c.f19909a, f3n0Var.b, listL0.contains(Long.valueOf(j)), true));
                        }
                        lc00VarB.addAll(arrayList3);
                        lchVar = new lch(kotlin.collections.a.a(lc00VarB));
                    }
                    p7m0Var.getClass();
                    p7m0Var.o(null, lchVar);
                }
                return Unit.f46060a;
            case 1:
                org.xplatform.favorites.impl.presentation.category.f fVar = (org.xplatform.favorites.impl.presentation.category.f) this.l;
                List list4 = this.j;
                String str2 = (String) this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = str2.length() > 0;
                if (z3) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list4) {
                        d0t d0tVar = (d0t) obj6;
                        if (str2.length() == 0 || StringsKt.O(d0tVar.o, str2, true) || StringsKt.O(d0tVar.b, str2, true) || StringsKt.O(qzb.c0(d0tVar), str2, true) || StringsKt.O(qzb.r0(d0tVar), str2, true)) {
                            arrayList4.add(obj6);
                        }
                    }
                    list4 = arrayList4;
                }
                if (!list4.isEmpty()) {
                    l0s l0sVar = fVar.f;
                    l0sVar.getClass();
                    l0sVar.y = list4;
                }
                ctf0 ctf0Var2 = fVar.h;
                y78 y78Var = fVar.g;
                boolean zJ = fVar.i.j();
                boolean z4 = ((sff0) fVar.s.getValue()).J;
                wcb wcbVar = (wcb) obj3;
                List list5 = (List) obj2;
                ctf0Var2.getClass();
                y78Var.getClass();
                wcbVar.getClass();
                list5.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj7 : list4) {
                    if (((d0t) obj7).C) {
                        arrayList6.add(obj7);
                    }
                }
                ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(e0t.a((d0t) it2.next(), ctf0Var2, y78Var, zJ, z4, wcbVar, list5));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj8 : list4) {
                    if (!((d0t) obj8).C) {
                        arrayList8.add(obj8);
                    }
                }
                ArrayList arrayList9 = new ArrayList(r3d.q(arrayList8, 10));
                Iterator it3 = arrayList8.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(e0t.a((d0t) it3.next(), ctf0Var2, y78Var, zJ, z4, wcbVar, list5));
                }
                if (!arrayList7.isEmpty()) {
                    arrayList5.add(new FavoriteGroupHeaderUiItem.LiveCategory(ctf0Var2.b.a(R.string.live_games_new, Arrays.copyOf(new Object[0], 0)), arrayList7.size(), false));
                    arrayList5.addAll(arrayList7);
                }
                if (!arrayList9.isEmpty()) {
                    arrayList5.add(new FavoriteGroupHeaderUiItem.LineCategory(ctf0Var2.f(R.string.line_games, new Object[0]), arrayList9.size(), false));
                    arrayList5.addAll(arrayList9);
                }
                return new Pair(arrayList5, Boolean.valueOf(z3));
            default:
                wk40 wk40Var = (wk40) obj3;
                da10 da10Var = (da10) this.l;
                List list6 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                lk40 lk40Var = (lk40) this.k;
                if (lk40Var != null) {
                    ctf0 ctf0Var3 = wk40Var.j;
                    boolean zBooleanValue = ((Boolean) wk40Var.v.getValue()).booleanValue();
                    r9u r9uVar = wk40Var.o;
                    ygp ygpVar = ygp.t;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    boolean zD = j1q0Var.f15748a.d(ygpVar);
                    ctf0Var3.getClass();
                    list6.getClass();
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    uvw.p(lc00VarB2, ctf0Var3, lk40Var.b, lk40Var.f20181a, 0, 0, iun.f15405a, list6, zBooleanValue, "POST_GAME_HEADER", ijg.J0, zD);
                    i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
                    ljg ljgVar = lk40Var.f20181a;
                    objW = new nk40(i4VarR0, q3d.j(ljgVar.b, ljgVar.c));
                } else {
                    e0g0 e0g0Var = j0g0.b;
                    objW = obj2 instanceof g0g0 ? wk40Var.w(da10Var) : pk40.f27119a;
                }
                p7m0 p7m0Var2 = wk40Var.w;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, objW));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7g(lk40 lk40Var, wk40 wk40Var, Object obj, yje yjeVar) {
        super(3, yjeVar);
        this.k = lk40Var;
        this.m = wk40Var;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7g(org.xplatform.favorites.impl.presentation.category.f fVar, wcb wcbVar, List list, yje yjeVar) {
        super(3, yjeVar);
        this.l = fVar;
        this.m = wcbVar;
        this.n = list;
    }
}
