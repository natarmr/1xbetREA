package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes3.dex */
public final class uqg extends bnn0 implements aer {
    public /* synthetic */ int i;
    public /* synthetic */ wmm0 j;
    public /* synthetic */ lpg k;
    public /* synthetic */ kam0 l;
    public /* synthetic */ List m;
    public final /* synthetic */ vqg n;
    public final /* synthetic */ dqg o;
    public final /* synthetic */ ypl0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqg(vqg vqgVar, dqg dqgVar, ypl0 ypl0Var, yje yjeVar) {
        super(6, yjeVar);
        this.n = vqgVar;
        this.o = dqgVar;
        this.p = ypl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x029d  */
    /* JADX WARN: Code duplicated, block: B:192:0x037f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0385  */
    /* JADX WARN: Code duplicated, block: B:255:0x0491  */
    /* JADX WARN: Code duplicated, block: B:352:0x065f  */
    /* JADX WARN: Code duplicated, block: B:355:0x0669  */
    /* JADX WARN: Code duplicated, block: B:361:0x0683  */
    /* JADX WARN: Code duplicated, block: B:375:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:450:0x03a1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x068d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x068d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0678 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:? A[LOOP:24: B:353:0x0663->B:496:?, LOOP_END, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list;
        List listA;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Object next;
        Object value;
        Iterator it4;
        List list2;
        List list3;
        Iterator it5;
        List list4;
        List list5;
        Object next2;
        int i = this.i;
        wmm0 wmm0Var = this.j;
        lpg lpgVar = this.k;
        kam0 kam0Var = this.l;
        List list6 = this.m;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        vqg vqgVar = this.n;
        long j = vqgVar.b.b;
        ArrayList<StatisticBlockModel> arrayList = kam0Var.f17972a;
        dqg dqgVar = this.o;
        dqgVar.getClass();
        ueh uehVar = dqgVar.b;
        ljg ljgVar = dqgVar.f6514a;
        if (j == 1) {
            smg smgVar = dqgVar.c;
            omg omgVar = dqgVar.d;
            lc00 lc00VarB = kotlin.collections.a.b();
            ArrayList arrayList2 = new ArrayList();
            for (StatisticBlockModel statisticBlockModel : arrayList) {
                Iterator it6 = h6l.c.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        list5 = list6;
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                    list5 = list6;
                    if (((h6l) next2).f12534a == statisticBlockModel.f46623a) {
                        break;
                    }
                    list6 = list5;
                }
                h6l h6lVar = (h6l) next2;
                if (h6lVar != null) {
                    arrayList2.add(h6lVar);
                }
                list6 = list5;
            }
            list = list6;
            Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                h6l h6lVar2 = (h6l) it7.next();
                int iOrdinal = h6lVar2.ordinal();
                t9m0 t9m0Var = h6lVar2.f12534a;
                switch (iOrdinal) {
                    case 0:
                        it4 = it7;
                        List list7 = ljgVar.e;
                        List list8 = omgVar.i;
                        list7.getClass();
                        list8.getClass();
                        if (list8.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                            continue;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list7) {
                                if (lgb.b0((le90) obj2)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                                continue;
                            }
                        }
                        it7 = it4;
                        break;
                    case 1:
                        it4 = it7;
                        List list9 = omgVar.i;
                        list9.getClass();
                        if (list9.isEmpty() || list9.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        }
                        Iterator it8 = list9.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                            }
                            kmg kmgVar = (kmg) it8.next();
                            e8h e8hVar = kmgVar.c;
                            List list10 = e8hVar.e;
                            e8h e8hVar2 = kmgVar.d;
                            Iterator it9 = it8;
                            List list11 = e8hVar2.e;
                            boolean z = iom0.l(list10) || iom0.l(list11);
                            if (list10.size() == 5 && list11.size() == 5 && e8hVar.b.length() != 0 && e8hVar2.b.length() != 0 && !z) {
                                continue;
                            }
                            it8 = it9;
                            break;
                            break;
                        }
                        break;
                        it7 = it4;
                        break;
                    case 2:
                        it4 = it7;
                        List list12 = omgVar.i;
                        list12.getClass();
                        if (list12.isEmpty() || list12.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                            continue;
                        } else {
                            Iterator it10 = list12.iterator();
                            while (true) {
                                if (!it10.hasNext()) {
                                    lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                                    continue;
                                } else if (!((kmg) it10.next()).m.isEmpty()) {
                                }
                            }
                        }
                        it7 = it4;
                        break;
                    case 3:
                        it4 = it7;
                        List list13 = omgVar.i;
                        list13.getClass();
                        if (list13.isEmpty() || list13.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        }
                        Iterator it11 = list13.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                            }
                            kmg kmgVar2 = (kmg) it11.next();
                            List list14 = kmgVar2.i;
                            List list15 = kmgVar2.k;
                            Iterator it12 = it11;
                            List list16 = kmgVar2.j;
                            if (!list14.isEmpty() && ((list2 = kmgVar2.i) == null || !list2.isEmpty())) {
                                Iterator it13 = list2.iterator();
                                while (it13.hasNext()) {
                                    if (((eev) it13.next()).f7692a != 0) {
                                        continue;
                                    }
                                    break;
                                }
                                if (list16.isEmpty()) {
                                    if (list15.isEmpty()) {
                                    }
                                    it11 = it12;
                                } else {
                                    if (list15.isEmpty()) {
                                    }
                                    it11 = it12;
                                }
                            } else if (list16.isEmpty() || list16.isEmpty()) {
                                if (list15.isEmpty() && !list15.isEmpty()) {
                                    Iterator it14 = list15.iterator();
                                    while (it14.hasNext()) {
                                        if (((eev) it14.next()).f7692a != 0) {
                                        }
                                        break;
                                    }
                                }
                                it11 = it12;
                            } else {
                                Iterator it15 = list16.iterator();
                                while (it15.hasNext()) {
                                    if (((eev) it15.next()).f7692a != 0) {
                                    }
                                    break;
                                }
                                if (list15.isEmpty()) {
                                }
                                it11 = it12;
                            }
                            break;
                        }
                        break;
                        it7 = it4;
                        break;
                    case 4:
                        it4 = it7;
                        List list17 = omgVar.i;
                        list17.getClass();
                        if (list17.isEmpty() || list17.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        }
                        Iterator it16 = list17.iterator();
                        while (true) {
                            if (!it16.hasNext()) {
                                lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                            }
                            List<ils> list18 = ((kmg) it16.next()).n;
                            if (list18 == null || !list18.isEmpty()) {
                                for (ils ilsVar : list18) {
                                    Iterator it17 = it16;
                                    if (ilsVar.f14994a != mls.f22008a) {
                                        continue;
                                    }
                                    if (ilsVar.b != 0) {
                                    }
                                    it16 = it17;
                                }
                            }
                            it16 = it16;
                            break;
                            break;
                        }
                        break;
                        it7 = it4;
                        break;
                    case 5:
                        it4 = it7;
                        smgVar.getClass();
                        List list19 = smgVar.c;
                        List list20 = smgVar.f;
                        if (list19.isEmpty() || list20.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        } else if (list20.size() + list19.size() != 10) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        } else {
                            continue;
                        }
                        it7 = it4;
                        break;
                    case 6:
                        it4 = it7;
                        List list21 = omgVar.i;
                        list21.getClass();
                        if (list21.isEmpty() || list21.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                            continue;
                        } else {
                            Iterator it18 = list21.iterator();
                            while (true) {
                                if (it18.hasNext()) {
                                    kmg kmgVar3 = (kmg) it18.next();
                                    e8h e8hVar3 = kmgVar3.c;
                                    List list22 = kmgVar3.d.e;
                                    if (!e8hVar3.e.isEmpty() && ((list3 = kmgVar3.c.e) == null || !list3.isEmpty())) {
                                        Iterator it19 = list3.iterator();
                                        while (true) {
                                            if (!it19.hasNext()) {
                                                continue;
                                            } else if (!((f8h) it19.next()).n.isEmpty()) {
                                                if (!list22.isEmpty() && (list22 == null || !list22.isEmpty())) {
                                                    Iterator it20 = list22.iterator();
                                                    while (true) {
                                                        if (!it20.hasNext()) {
                                                            continue;
                                                        } else if (!((f8h) it20.next()).n.isEmpty()) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                                    continue;
                                }
                            }
                        }
                        it7 = it4;
                        break;
                    case 7:
                        List list23 = omgVar.i;
                        list23.getClass();
                        if (list23.isEmpty() || list23.isEmpty()) {
                            it4 = it7;
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        }
                        Iterator it21 = list23.iterator();
                        while (true) {
                            if (!it21.hasNext()) {
                                it4 = it7;
                                lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                            }
                            kmg kmgVar4 = (kmg) it21.next();
                            if (kmgVar4.c.e.isEmpty() || ((list4 = kmgVar4.c.e) != null && list4.isEmpty())) {
                                it4 = it7;
                                it5 = it21;
                            } else {
                                Iterator it22 = list4.iterator();
                                while (true) {
                                    if (it22.hasNext()) {
                                        it4 = it7;
                                        f8h f8hVar = (f8h) it22.next();
                                        it5 = it21;
                                        if (f8hVar.d.c.length() == 0 || (f8hVar.k.isEmpty() && f8hVar.l.isEmpty() && f8hVar.m.isEmpty())) {
                                            it21 = it5;
                                            it7 = it4;
                                        } else {
                                            List<f8h> list24 = kmgVar4.d.e;
                                            if (list24 == null || !list24.isEmpty()) {
                                                for (f8h f8hVar2 : list24) {
                                                    if (f8hVar2.d.c.length() != 0) {
                                                        if (!f8hVar2.k.isEmpty()) {
                                                            continue;
                                                        }
                                                        if (!f8hVar2.l.isEmpty() || !f8hVar2.m.isEmpty()) {
                                                        }
                                                        break;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        it4 = it7;
                                        it5 = it21;
                                    }
                                }
                            }
                            it21 = it5;
                            it7 = it4;
                            break;
                        }
                        break;
                        it7 = it4;
                        break;
                    case 8:
                        smgVar.getClass();
                        if (smgVar.c.isEmpty() || smgVar.f.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        }
                        break;
                    case 9:
                        ljgVar.getClass();
                        v1h v1hVar = ljgVar.d;
                        if (v1hVar.d.isEmpty() && v1hVar.e.isEmpty() && v1hVar.f.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        }
                        break;
                    case 10:
                        ljgVar.getClass();
                        v1h v1hVar2 = ljgVar.d;
                        if (v1hVar2.g.isEmpty() && v1hVar2.h.isEmpty()) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        }
                        break;
                    case 11:
                        uehVar.getClass();
                        qeh qehVar = uehVar.c;
                        boolean zIsEmpty = qehVar.f28583a.isEmpty();
                        boolean zIsEmpty2 = qehVar.b.b.isEmpty();
                        if (zIsEmpty && zIsEmpty2) {
                            lc00VarB.add(Integer.valueOf(t9m0Var.f33572a));
                        }
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                it4 = it7;
                it7 = it4;
            }
            listA = kotlin.collections.a.a(lc00VarB);
        } else {
            list = list6;
            if (j == 46) {
                d4g d4gVar = dqgVar.e;
                lc00 lc00VarB2 = kotlin.collections.a.b();
                ArrayList arrayList4 = new ArrayList();
                Iterator it23 = arrayList.iterator();
                while (it23.hasNext()) {
                    StatisticBlockModel statisticBlockModel2 = (StatisticBlockModel) it23.next();
                    Iterator it24 = rqf.c.iterator();
                    while (true) {
                        if (!it24.hasNext()) {
                            it3 = it23;
                            next = null;
                            break;
                        }
                        next = it24.next();
                        it3 = it23;
                        if (((rqf) next).f30928a == statisticBlockModel2.f46623a) {
                            break;
                        }
                        it23 = it3;
                    }
                    rqf rqfVar = (rqf) next;
                    if (rqfVar != null) {
                        arrayList4.add(rqfVar);
                    }
                    it23 = it3;
                }
                Iterator it25 = arrayList4.iterator();
                while (it25.hasNext()) {
                    rqf rqfVar2 = (rqf) it25.next();
                    int iOrdinal2 = rqfVar2.ordinal();
                    short s = rqfVar2.f30928a.f33572a;
                    switch (iOrdinal2) {
                        case 0:
                            it = it25;
                            List list25 = ljgVar.e;
                            List list26 = d4gVar.e;
                            list25.getClass();
                            list26.getClass();
                            if (list26.isEmpty()) {
                                lc00VarB2.add(Integer.valueOf(s));
                                continue;
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj3 : list25) {
                                    if (pzb.X((le90) obj3)) {
                                        arrayList5.add(obj3);
                                    }
                                }
                                if (arrayList5.isEmpty()) {
                                    lc00VarB2.add(Integer.valueOf(s));
                                    continue;
                                }
                            }
                            it25 = it;
                            break;
                        case 1:
                            d4gVar.getClass();
                            List list27 = d4gVar.e;
                            if (list27.isEmpty() || list27.isEmpty()) {
                                it = it25;
                                lc00VarB2.add(Integer.valueOf(s));
                            }
                            Iterator it26 = list27.iterator();
                            while (true) {
                                if (!it26.hasNext()) {
                                    it = it25;
                                    lc00VarB2.add(Integer.valueOf(s));
                                }
                                n3g n3gVar = (n3g) it26.next();
                                v3g v3gVar = n3gVar.c;
                                List list28 = n3gVar.d.c;
                                it = it25;
                                if (v3gVar.c.size() == 5 && list28.size() == 5) {
                                    List list29 = n3gVar.c.c;
                                    if (list29 == null || !list29.isEmpty()) {
                                        Iterator it27 = list29.iterator();
                                        while (true) {
                                            if (!it27.hasNext()) {
                                                if (list28 == null || !list28.isEmpty()) {
                                                    it2 = list28.iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            if (d4gVar.c.c.length() != 0 && d4gVar.d.c.length() != 0) {
                                                                continue;
                                                            }
                                                            break;
                                                        } else if (((w3g) it2.next()).f38500a.length() == 0) {
                                                        }
                                                    }
                                                } else {
                                                    if (d4gVar.c.c.length() != 0) {
                                                        continue;
                                                        break;
                                                    }
                                                    continue;
                                                }
                                            } else if (((w3g) it27.next()).f38500a.length() == 0) {
                                            }
                                        }
                                    } else if (list28 == null) {
                                        it2 = list28.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                if (d4gVar.c.c.length() != 0) {
                                                    continue;
                                                    break;
                                                }
                                                continue;
                                            } else if (((w3g) it2.next()).f38500a.length() == 0) {
                                            }
                                        }
                                    } else {
                                        it2 = list28.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                if (d4gVar.c.c.length() != 0) {
                                                    continue;
                                                    break;
                                                }
                                                continue;
                                            } else if (((w3g) it2.next()).f38500a.length() == 0) {
                                            }
                                        }
                                    }
                                }
                                it25 = it;
                                break;
                            }
                            break;
                            it25 = it;
                            break;
                        case 2:
                            d4gVar.getClass();
                            List list30 = d4gVar.e;
                            if (list30.isEmpty() || list30.isEmpty()) {
                                lc00VarB2.add(Integer.valueOf(s));
                                break;
                            } else {
                                Iterator it28 = list30.iterator();
                                do {
                                    if (!it28.hasNext()) {
                                        lc00VarB2.add(Integer.valueOf(s));
                                        break;
                                    }
                                } while (((n3g) it28.next()).e.isEmpty());
                            }
                            break;
                        case 3:
                            s8h s8hVar = d4gVar.c;
                            s8h s8hVar2 = d4gVar.d;
                            ArrayList arrayListZ0 = rcb.Z0(s8hVar.f);
                            ArrayList arrayListZ1 = rcb.Z0(s8hVar2.f);
                            if (!arrayListZ0.isEmpty() && !arrayListZ1.isEmpty()) {
                                if (CollectionsKt.q0(arrayListZ0, arrayListZ1).size() != 10 || s8hVar.c.length() == 0 || s8hVar2.c.length() == 0) {
                                }
                            }
                            lc00VarB2.add(Integer.valueOf(s));
                            break;
                        case 4:
                            ljgVar.getClass();
                            v1h v1hVar3 = ljgVar.d;
                            if (v1hVar3.d.isEmpty() && v1hVar3.e.isEmpty() && v1hVar3.f.isEmpty()) {
                                lc00VarB2.add(Integer.valueOf(s));
                            }
                            break;
                        case 5:
                            ljgVar.getClass();
                            v1h v1hVar4 = ljgVar.d;
                            if (v1hVar4.g.isEmpty() && v1hVar4.h.isEmpty()) {
                                lc00VarB2.add(Integer.valueOf(s));
                            }
                            break;
                        case 6:
                            uehVar.getClass();
                            qeh qehVar2 = uehVar.c;
                            boolean zIsEmpty3 = qehVar2.f28583a.isEmpty();
                            boolean zIsEmpty4 = qehVar2.b.b.isEmpty();
                            if (zIsEmpty3 && zIsEmpty4) {
                                lc00VarB2.add(Integer.valueOf(s));
                            }
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    it = it25;
                    it25 = it;
                }
                listA = kotlin.collections.a.a(lc00VarB2);
            } else {
                listA = iun.f15405a;
            }
        }
        vqgVar.O = listA;
        ctf0 ctf0Var = vqgVar.i;
        long j2 = vqgVar.b.b;
        boolean z2 = lpgVar.f20440a;
        long j3 = wmm0Var.f39414a;
        long j4 = wmm0Var.b;
        boolean z3 = lpgVar.b;
        long j5 = wmm0Var.c;
        boolean zL = vqgVar.o.l();
        long j6 = wmm0Var.d;
        long j7 = wmm0Var.e;
        long j8 = wmm0Var.f;
        o4i0 o4i0Var = wmm0Var.g;
        hyx hyxVar = wmm0Var.h;
        long j9 = wmm0Var.i;
        List list31 = wmm0Var.j;
        ArrayList arrayList6 = kam0Var.f17972a;
        r9u r9uVar = vqgVar.t;
        ygp ygpVar = ygp.t;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        List listC = kqg.c(this.o, ctf0Var, j2, j3, z2, j4, z3, j5, this.p, zL, i, j6, j7, j8, o4i0Var, hyxVar, j9, list31, arrayList6, j1q0Var.f15748a.d(ygpVar), list, vqgVar.y.j());
        vqgVar.P = q3d.j(ljgVar.b, ljgVar.c);
        if (listC.isEmpty()) {
            vqgVar.z();
        } else {
            p7m0 p7m0Var = vqgVar.I;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, new lch(listC)));
        }
        return Unit.f46060a;
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj).intValue();
        dqg dqgVar = this.o;
        ypl0 ypl0Var = this.p;
        uqg uqgVar = new uqg(this.n, dqgVar, ypl0Var, (yje) obj6);
        uqgVar.i = iIntValue;
        uqgVar.j = (wmm0) obj2;
        uqgVar.k = (lpg) obj3;
        uqgVar.l = (kam0) obj4;
        uqgVar.m = (List) obj5;
        return uqgVar.invokeSuspend(Unit.f46060a);
    }
}
