package a;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.ChoosenDate;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;

/* JADX INFO: loaded from: classes4.dex */
public final class rua0 extends i3t0 {
    public static final List G = kotlin.collections.a.c(314L);
    public static final j700 H = j700.f16016a;
    public final pmi0 A;
    public final dxt B;
    public final lrc C;
    public bby D;
    public bby E;
    public final c4m0 F;
    public final tzi o;
    public final fvt0 p;
    public final nv20 q;
    public final ivn r;
    public final vjp s;
    public final qv2 t;
    public final h3c u;
    public final i1w0 v;
    public final m1e w;
    public final duj x;
    public final mne y;
    public final lef0 z;

    public rua0(vzg0 vzg0Var, tzi tziVar, g2v g2vVar, ctf0 ctf0Var, pru pruVar, lbu lbuVar, r9u r9uVar, fvt0 fvt0Var, nv20 nv20Var, ivn ivnVar, vjp vjpVar, qv2 qv2Var, h3c h3cVar, i1w0 i1w0Var, m1e m1eVar, duj dujVar, mne mneVar, xfu xfuVar, lef0 lef0Var, pmi0 pmi0Var, dxt dxtVar, sqt sqtVar, lrc lrcVar) {
        ctf0Var.getClass();
        r9uVar.getClass();
        m1eVar.getClass();
        enm enmVar = new enm(pruVar, sqtVar, lbuVar, r9uVar, ctf0Var);
        o20 o20Var = new o20(ctf0Var, g2vVar, (byte) 19);
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, enmVar, o20Var, cvm0.p(rwjVar, rwjVar));
        this.o = tziVar;
        this.p = fvt0Var;
        this.q = nv20Var;
        this.r = ivnVar;
        this.s = vjpVar;
        this.t = qv2Var;
        this.u = h3cVar;
        this.v = i1w0Var;
        this.w = m1eVar;
        this.x = dujVar;
        this.y = mneVar;
        this.z = lef0Var;
        this.A = pmi0Var;
        this.B = dxtVar;
        this.C = lrcVar;
        c4m0 c4m0Var = this.F;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.F = slb.U(new fnq(xfuVar.a(false), new s980(this, null, (byte) 22), (byte) 4), d5c.S(jiu0.a(this), rwjVar));
        }
        ghq0 ghq0Var = ((gua0) D()).n;
        ygq0 ygq0Var = ghq0Var.f11314a;
        wgq0 wgq0Var = ghq0Var.b;
        if (ygq0Var != ygq0.NOT) {
            lef0Var.i(ygq0Var, true);
        }
        long j = wgq0Var.f39129a;
        if (j != -1) {
            pmi0Var.j(j);
        }
        long j2 = wgq0Var.b;
        if (j2 != -1) {
            dxtVar.a(j2);
        }
    }

    public final void M(boolean z) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            oyg0 oyg0Var = this.f;
            oyg0Var.getClass();
            q7x.F(oyg0Var, Boolean.valueOf(z), "KEY_MULTISELECT_ACTIVE_STATE");
        } while (!p7m0Var.m(value, gua0.a((gua0) value, null, null, null, null, null, false, false, null, false, null, z, 65535)));
        if (((gua0) D()).b.d == j8l0.MEDIUM_ITEMS_LINE_SEPARATOR_WITH_EVENTS) {
            return;
        }
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState = ((gua0) D()).p;
        Set set = !z ? xun.f41520a : feedsChampsItemsSelectionState.b;
        feedsChampsItemsSelectionState.getClass();
        set.getClass();
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState2 = new FeedsChampsItemsSelectionState(set, z);
        if (Intrinsics.d(((gua0) D()).p, feedsChampsItemsSelectionState2)) {
            return;
        }
        H(new xh20((Object) feedsChampsItemsSelectionState2, z, (byte) 11));
    }

    public final void N(boolean z) {
        Object value;
        Object value2;
        bby bbyVar;
        yje yjeVar = null;
        if (z && (bbyVar = this.D) != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.D;
        if (bbyVar2 == null || !bbyVar2.isActive()) {
            boolean z2 = ((gua0) D()).f11919a instanceof eua0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, gua0.a((gua0) value, null, null, null, null, null, z, false, null, false, null, false, 131007)));
            } else {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, gua0.a((gua0) value2, null, null, null, null, null, true, false, null, false, null, false, 131007)));
            }
            this.D = sac.V(jiu0.a(this), new wma0(1, this, rua0.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, this.y.f22085a, new e3p(this, yjeVar, (byte) 28), 10);
        }
    }

    public final void O(long j) {
        Object next;
        Object next2;
        List list = r7x.x((gua0) D()).f18576a;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((rbb) next).f30176a != j);
        rbb rbbVar = (rbb) next;
        if (rbbVar != null) {
            i3t0.K(this, null, null, new qua0(rbbVar.p, this, rbbVar.b, rbbVar.c, j, rbbVar.n, null), 3);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            w3d.u(arrayList, ((rbb) it2.next()).d);
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((sum0) next2).f32829a != j);
        sum0 sum0Var = (sum0) next2;
        if (sum0Var != null) {
            i3t0.K(this, null, null, new qua0(sum0Var.m, this, sum0Var.b, sum0Var.c, j, sum0Var.l, null), 3);
        }
    }

    public final void P(long j) {
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState;
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState2 = ((gua0) D()).p;
        boolean zContains = feedsChampsItemsSelectionState2.b.contains(Long.valueOf(j));
        Set set = feedsChampsItemsSelectionState2.b;
        if (zContains) {
            feedsChampsItemsSelectionState = FeedsChampsItemsSelectionState.a(feedsChampsItemsSelectionState2, eui0.e(set, Long.valueOf(j)));
        } else if (set.size() >= 10) {
            return;
        } else {
            feedsChampsItemsSelectionState = new FeedsChampsItemsSelectionState(eui0.h(set, Long.valueOf(j)), true);
        }
        H(new lma0(feedsChampsItemsSelectionState, (byte) 5));
    }

    public final void Q() {
        long j = ((gua0) D()).n.b.f39129a;
        long j2 = ((gua0) D()).n.b.b;
        G(new zta0((j == -1 || j2 == -1) ? new ChoosenDate.SingleDate(new Date(j)) : new ChoosenDate.Interval(new Date(j), new Date(j2))));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object value;
        zmb zmbVar;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        zqa0 zqa0Var = (zqa0) obj;
        zqa0Var.getClass();
        super.x(zqa0Var);
        yje yjeVar = null;
        final byte b = 1;
        if (zqa0Var.equals(vqa0.f37847a)) {
            bby bbyVar = this.E;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.E = i3t0.K(this, null, null, new epp(this, yjeVar, (byte) 28), 3);
                return;
            }
            return;
        }
        if (zqa0Var.equals(wqa0.f39580a)) {
            v3c.N(this.E);
            v3c.N(this.D);
            return;
        }
        if (zqa0Var.equals(oqa0.f25679a)) {
            N(true);
            return;
        }
        final byte b2 = 0;
        if (zqa0Var.equals(mqa0.f22215a)) {
            N(false);
            return;
        }
        boolean zEquals = zqa0Var.equals(pqa0.f27407a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, gua0.a((gua0) value5, null, null, null, null, null, false, false, null, false, null, false, 130815)));
            return;
        }
        boolean zEquals2 = zqa0Var.equals(cqa0.f4784a);
        i1w0 i1w0Var = this.v;
        if (!zEquals2) {
            if (zqa0Var.equals(gqa0.f11723a)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, gua0.a((gua0) value3, null, null, null, null, null, false, true, null, false, null, false, 130047)));
                return;
            }
            if (zqa0Var instanceof kqa0) {
                String str = ((kqa0) zqa0Var).f18713a;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    q7x.F(oyg0Var, str, "KEY_SEARCH_QUERY");
                } while (!p7m0Var3.m(value2, gua0.a((gua0) value2, null, str, null, null, null, false, false, null, false, null, false, 131067)));
                return;
            }
            if (zqa0Var.equals(hqa0.f13476a)) {
                int iOrdinal = ((gua0) D()).f.ordinal();
                if (iOrdinal == 0) {
                    zmbVar = zmb.b;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    zmbVar = zmb.f44617a;
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                while (true) {
                    Object value6 = p7m0Var4.getValue();
                    value6.getClass();
                    oyg0Var.getClass();
                    q7x.F(oyg0Var, zmbVar, "KEY_CHAMP_SORT_TYPE");
                    zmb zmbVar2 = zmbVar;
                    if (p7m0Var4.m(value6, gua0.a((gua0) value6, null, null, null, null, zmbVar2, false, false, null, false, null, false, 131039))) {
                        break;
                    } else {
                        zmbVar = zmbVar2;
                    }
                }
                bby bbyVar2 = this.D;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                N(true);
                return;
            }
            if (zqa0Var.equals(fqa0.f9965a)) {
                ghq0 ghq0Var = ((gua0) D()).n;
                jhq0 jhq0Var = jhq0.f16541a;
                G(new aua0(ghq0Var));
                return;
            }
            if (zqa0Var.equals(nqa0.f23950a)) {
                if (((gua0) D()).l) {
                    Q();
                    return;
                }
                return;
            }
            boolean z = zqa0Var instanceof iqa0;
            byte b3 = 6;
            lef0 lef0Var = this.z;
            if (z) {
                chq0 chq0Var = ((iqa0) zqa0Var).f15201a;
                if (!(chq0Var instanceof ahq0)) {
                    if (chq0Var instanceof bhq0) {
                        Q();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                j6m0 j6m0Var = ygq0.b;
                byte b4 = ((ahq0) chq0Var).f886a;
                j6m0Var.getClass();
                ygq0 ygq0VarA = j6m0.a(b4);
                lef0Var.i(ygq0VarA, false);
                H(new lma0(ygq0VarA, b3));
                return;
            }
            if (zqa0Var instanceof uqa0) {
                ygq0 ygq0Var = ((uqa0) zqa0Var).f36110a;
                lef0Var.i(ygq0Var, false);
                H(new lma0(ygq0Var, b3));
                return;
            }
            if (zqa0Var instanceof tqa0) {
                final Date date = ((tqa0) zqa0Var).f34371a;
                final long time = date.getTime();
                this.A.j(time);
                H(new Function2() { // from class: a.oua0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b5 = b2;
                        long j = time;
                        Date date2 = date;
                        switch (b5) {
                            case 0:
                                oyg0 oyg0Var2 = (oyg0) obj2;
                                gua0 gua0Var = (gua0) obj3;
                                oyg0Var2.getClass();
                                gua0Var.getClass();
                                q7x.F(oyg0Var2, Long.valueOf(date2.getTime()), "KEY_TIME_FILTER_START");
                                ghq0 ghq0Var2 = gua0Var.n;
                                return gua0.a(gua0Var, null, null, null, null, null, false, false, new ghq0(ghq0Var2.f11314a, new wgq0(j, ghq0Var2.b.b)), false, null, false, 122879);
                            default:
                                oyg0 oyg0Var3 = (oyg0) obj2;
                                gua0 gua0Var2 = (gua0) obj3;
                                oyg0Var3.getClass();
                                gua0Var2.getClass();
                                q7x.F(oyg0Var3, Long.valueOf(date2.getTime()), "KEY_TIME_FILTER_END");
                                ghq0 ghq0Var3 = gua0Var2.n;
                                return gua0.a(gua0Var2, null, null, null, null, null, false, false, new ghq0(ghq0Var3.f11314a, new wgq0(ghq0Var3.b.f39129a, j)), false, null, false, 122879);
                        }
                    }
                });
                return;
            }
            if (zqa0Var instanceof sqa0) {
                final Date date2 = ((sqa0) zqa0Var).f32619a;
                final long time2 = date2.getTime();
                this.B.a(time2);
                H(new Function2() { // from class: a.oua0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b5 = b;
                        long j = time2;
                        Date date3 = date2;
                        switch (b5) {
                            case 0:
                                oyg0 oyg0Var2 = (oyg0) obj2;
                                gua0 gua0Var = (gua0) obj3;
                                oyg0Var2.getClass();
                                gua0Var.getClass();
                                q7x.F(oyg0Var2, Long.valueOf(date3.getTime()), "KEY_TIME_FILTER_START");
                                ghq0 ghq0Var2 = gua0Var.n;
                                return gua0.a(gua0Var, null, null, null, null, null, false, false, new ghq0(ghq0Var2.f11314a, new wgq0(j, ghq0Var2.b.b)), false, null, false, 122879);
                            default:
                                oyg0 oyg0Var3 = (oyg0) obj2;
                                gua0 gua0Var2 = (gua0) obj3;
                                oyg0Var3.getClass();
                                gua0Var2.getClass();
                                q7x.F(oyg0Var3, Long.valueOf(date3.getTime()), "KEY_TIME_FILTER_END");
                                ghq0 ghq0Var3 = gua0Var2.n;
                                return gua0.a(gua0Var2, null, null, null, null, null, false, false, new ghq0(ghq0Var3.f11314a, new wgq0(ghq0Var3.b.f39129a, j)), false, null, false, 122879);
                        }
                    }
                });
                if (((gua0) D()).l) {
                    ygq0 ygq0Var2 = ygq0.CUSTOM_DATE;
                    lef0Var.i(ygq0Var2, false);
                    H(new lma0(ygq0Var2, b3));
                    return;
                }
                return;
            }
            if (zqa0Var instanceof aqa0) {
                aqa0 aqa0Var = (aqa0) zqa0Var;
                String strK = f7k.K(((gua0) D()).f, aqa0Var.f1289a, aqa0Var.b);
                LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(((gua0) D()).d);
                if (!linkedHashSetO0.remove(strK)) {
                    linkedHashSetO0.add(strK);
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                    q7x.F(oyg0Var, linkedHashSetO0, "EXPANDED_STATE_KEY");
                } while (!p7m0Var5.m(value, gua0.a((gua0) value, null, null, linkedHashSetO0, null, null, false, false, null, false, null, false, 131063)));
                return;
            }
            if (zqa0Var instanceof bqa0) {
                O(((bqa0) zqa0Var).f3019a);
                return;
            }
            if (zqa0Var instanceof xqa0) {
                xqa0 xqa0Var = (xqa0) zqa0Var;
                long j = xqa0Var.f41307a;
                long j2 = xqa0Var.b;
                String str2 = xqa0Var.d;
                if (j == -2) {
                    return;
                }
                List list = r7x.x((gua0) D()).f18576a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList, ((rbb) it.next()).d);
                }
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((sum0) next).f32829a != j);
                sum0 sum0Var = (sum0) next;
                if (sum0Var == null) {
                    O(j);
                    return;
                }
                if (str2.length() == 0) {
                    str2 = sum0Var.c;
                }
                i3t0.K(this, null, null, new qua0(sum0Var.m, this, sum0Var.b, str2, j, j2, null), 3);
                return;
            }
            if (zqa0Var instanceof zpa0) {
                zpa0 zpa0Var = (zpa0) zqa0Var;
                i1w0Var.d(new r91((Object) this, zpa0Var.b, (Object) zpa0Var.f44751a, (byte) 25));
                return;
            }
            if (zqa0Var instanceof jqa0) {
                long j3 = ((jqa0) zqa0Var).f16941a;
                if (!((gua0) D()).q) {
                    List<rbb> list2 = r7x.x((gua0) D()).f18576a;
                    ArrayList arrayList2 = new ArrayList();
                    for (rbb rbbVar : list2) {
                        lc00 lc00VarB = kotlin.collections.a.b();
                        if (rbbVar.d.isEmpty()) {
                            lc00VarB.add(Long.valueOf(rbbVar.f30176a));
                        }
                        List list3 = rbbVar.d;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(Long.valueOf(((sum0) it3.next()).f32829a));
                        }
                        lc00VarB.addAll(arrayList3);
                        w3d.u(arrayList2, kotlin.collections.a.a(lc00VarB));
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            if (((Number) it4.next()).longValue() == j3) {
                                P(j3);
                                break;
                            }
                        }
                    }
                }
                M(true);
                return;
            }
            if (zqa0Var instanceof rqa0) {
                P(((rqa0) zqa0Var).f30923a);
                return;
            }
            if (!zqa0Var.equals(qqa0.f29157a)) {
                if (zqa0Var.equals(eqa0.f8229a)) {
                    M(false);
                    return;
                } else if (zqa0Var.equals(ypa0.f43023a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            List<rbb> list4 = r7x.x((gua0) D()).f18576a;
            ArrayList arrayList4 = new ArrayList();
            for (rbb rbbVar2 : list4) {
                List listC = kotlin.collections.a.c(Long.valueOf(rbbVar2.f30176a));
                List list5 = rbbVar2.d;
                ArrayList arrayList5 = new ArrayList(r3d.q(list5, 10));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(Long.valueOf(((sum0) it5.next()).f32829a));
                }
                w3d.u(arrayList4, CollectionsKt.q0(listC, arrayList5));
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (((gua0) D()).p.b.contains(Long.valueOf(((Number) obj2).longValue()))) {
                    arrayList6.add(obj2);
                }
            }
            if (arrayList6.size() > 1) {
                i1w0Var.d(new zga0((Object) this, (Object) CollectionsKt.P0(arrayList6), (byte) 7));
                return;
            }
            Long l = (Long) CollectionsKt.firstOrNull(arrayList6);
            if (l != null) {
                O(l.longValue());
                return;
            }
            return;
        }
        if (((gua0) D()).k) {
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value4 = p7m0Var6.getValue();
                value4.getClass();
                oyg0Var.getClass();
                q7x.F(oyg0Var, "", "KEY_SEARCH_QUERY");
            } while (!p7m0Var6.m(value4, gua0.a((gua0) value4, null, "", null, null, null, false, false, null, false, null, false, 130043)));
            return;
        }
        c4m0 c4m0Var = this.F;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.C.z(true);
        i1w0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayList, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
