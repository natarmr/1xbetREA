package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class sih0 extends i3t0 {
    public static final /* synthetic */ int N = 0;
    public final msu A;
    public final w4p0 B;
    public final es C;
    public final m1e D;
    public final fmt0 E;
    public final ywu F;
    public final tqt G;
    public c4m0 H;
    public c4m0 I;
    public bby J;
    public bby K;
    public bby L;
    public bby M;
    public final vzg0 o;
    public final int p;
    public final i1w0 q;
    public final yhi r;
    public final hjd s;
    public final rus t;
    public final j3c u;
    public final art v;
    public final sqt w;
    public final prc x;
    public final osu y;
    public final osu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public sih0(final vzg0 vzg0Var, final int i, mne mneVar, i1w0 i1w0Var, yhi yhiVar, hjd hjdVar, rus rusVar, final lbu lbuVar, final pru pruVar, final bzt bztVar, j3c j3cVar, ctf0 ctf0Var, y78 y78Var, art artVar, sqt sqtVar, prc prcVar, osu osuVar, osu osuVar2, msu msuVar, w4p0 w4p0Var, final kuu kuuVar, es esVar, m1e m1eVar, fmt0 fmt0Var, ywu ywuVar, tqt tqtVar, final r9u r9uVar, final ifh0 ifh0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new Function0() { // from class: a.lih0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                n0w n0wVar;
                sff0 sff0VarA = pruVar.a();
                v8d v8dVarA = bztVar.f3488a.a();
                boolean zJ = lbuVar.j();
                kuu kuuVar2 = kuuVar;
                int i2 = i;
                lok0 lok0VarA = kuuVar2.a(i2);
                ifh0 ifh0Var2 = ifh0Var;
                int iOrdinal = ifh0Var2.ordinal();
                if (iOrdinal == 0) {
                    n0wVar = n0w.f22720a;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    n0wVar = n0w.b;
                }
                n0w n0wVar2 = n0wVar;
                iun iunVar = iun.f15405a;
                cxk0 cxk0Var = new cxk0(iunVar, iunVar, iunVar);
                cxk0 cxk0Var2 = new cxk0(iunVar, iunVar, iunVar);
                Long l = (Long) vzg0Var.a("KEY_SELECTED_SEARCH_FILTER");
                long jLongValue = l != null ? l.longValue() : -321L;
                xun xunVar = xun.f41520a;
                sah0 sah0Var = sah0.f31888a;
                boolean z = sff0VarA.J;
                boolean z2 = sff0VarA.J1;
                boolean z3 = lok0VarA.n;
                boolean z4 = lok0VarA.p;
                String str = lok0VarA.u;
                v5l0 v5l0VarP = xdx.P(lok0VarA.e, sff0VarA);
                int i3 = v8dVarA.r;
                ygp ygpVar = ygp.t;
                r9u r9uVar2 = r9uVar;
                r9uVar2.getClass();
                j1q0 j1q0Var = r9uVar2.f30104a;
                j1q0Var.getClass();
                return new uhh0(i2, ifh0Var2, "", "", cxk0Var, cxk0Var2, iunVar, iunVar, iunVar, iunVar, jLongValue, null, xunVar, null, true, sah0Var, zJ, z, z2, z3, z4, str, n0wVar2, v5l0VarP, i3, j1q0Var.f15748a.d(ygpVar));
            }
        }, g090VarP, new g18((Object) ctf0Var, (Object) y78Var, i, (byte) 15), (yzn0) null);
        this.o = vzg0Var;
        this.p = i;
        this.q = i1w0Var;
        this.r = yhiVar;
        this.s = hjdVar;
        this.t = rusVar;
        this.u = j3cVar;
        this.v = artVar;
        this.w = sqtVar;
        this.x = prcVar;
        this.y = osuVar;
        this.z = osuVar2;
        this.A = msuVar;
        this.B = w4p0Var;
        this.C = esVar;
        this.D = m1eVar;
        this.E = fmt0Var;
        this.F = ywuVar;
        this.G = tqtVar;
        fmt0Var.a(false);
        i3t0.K(this, null, null, new mih0(this, null, (byte) 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(twk0 twk0Var, dxk0 dxk0Var, zje zjeVar) {
        nih0 nih0Var;
        cxk0 cxk0Var;
        if (zjeVar instanceof nih0) {
            nih0Var = (nih0) zjeVar;
            int i = nih0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                nih0Var.m = i - Integer.MIN_VALUE;
            } else {
                nih0Var = new nih0(this, zjeVar);
            }
        } else {
            nih0Var = new nih0(this, zjeVar);
        }
        Object obj = nih0Var.k;
        Object obj2 = wne.f39444a;
        int i2 = nih0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            String str = dxk0Var.f6850a;
            if (str.length() <= 0) {
                this.B.f(-321L);
                iun iunVar = iun.f15405a;
                return new cxk0(iunVar, iunVar, iunVar);
            }
            List list = twk0Var.f34654a;
            List list2 = twk0Var.b;
            List list3 = twk0Var.c;
            this.w.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            ArrayList arrayListA = sqt.a(list, dxk0Var);
            ArrayList arrayListA2 = sqt.a(list2, dxk0Var);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list3) {
                if (!(((d2w) obj3) instanceof z1w)) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                d2w d2wVar = (d2w) obj4;
                if (d2wVar != null) {
                    if (d2wVar instanceof y1w) {
                        y1w y1wVar = (y1w) d2wVar;
                        if (StringsKt.O(y1wVar.b, str, true) || StringsKt.O(y1wVar.o.f144a, str, true)) {
                            arrayList2.add(obj4);
                        }
                    } else if (d2wVar instanceof u1w) {
                        u1w u1wVar = (u1w) d2wVar;
                        if (StringsKt.O(u1wVar.b, str, true) || StringsKt.O(u1wVar.o.f144a, str, true) || StringsKt.O(u1wVar.p.f144a, str, true)) {
                            arrayList2.add(obj4);
                        }
                    } else if (d2wVar instanceof x1w) {
                        x1w x1wVar = (x1w) d2wVar;
                        if (StringsKt.O(x1wVar.b, str, true) || StringsKt.O(x1wVar.n.f144a, str, true) || StringsKt.O(x1wVar.o.f144a, str, true)) {
                            arrayList2.add(obj4);
                        }
                    } else if (d2wVar instanceof c2w) {
                        c2w c2wVar = (c2w) d2wVar;
                        if (StringsKt.O(c2wVar.b, str, true) || StringsKt.O(c2wVar.o.f144a, str, true) || StringsKt.O(c2wVar.p.f144a, str, true)) {
                            arrayList2.add(obj4);
                        }
                    }
                }
            }
            cxk0 cxk0Var2 = new cxk0(arrayListA, arrayListA2, arrayList2);
            nih0Var.i = dxk0Var;
            nih0Var.j = cxk0Var2;
            nih0Var.m = 1;
            if (P(cxk0Var2, nih0Var) == obj2) {
                return obj2;
            }
            cxk0Var = cxk0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cxk0Var = nih0Var.j;
            dxk0Var = nih0Var.i;
            z1x.P(obj);
        }
        long j = dxk0Var.b;
        if (j == -321) {
            return cxk0Var;
        }
        List list4 = cxk0Var.f5126a;
        List list5 = cxk0Var.b;
        List list6 = cxk0Var.c;
        this.G.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : list4) {
            if (((d0t) obj5).v == j) {
                arrayList3.add(obj5);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj6 : list5) {
            if (((d0t) obj6).v == j) {
                arrayList4.add(obj6);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj7 : list6) {
            if (((d2w) obj7).d() == j) {
                arrayList5.add(obj7);
            }
        }
        return new cxk0(arrayList3, arrayList4, arrayList5);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object N(twk0 twk0Var, dxk0 dxk0Var, zje zjeVar) {
        oih0 oih0Var;
        Object objM;
        sah0 sah0Var;
        twk0 twk0Var2;
        cxk0 cxk0Var;
        dxk0 dxk0Var2;
        if (zjeVar instanceof oih0) {
            oih0Var = (oih0) zjeVar;
            int i = oih0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oih0Var.o = i - Integer.MIN_VALUE;
            } else {
                oih0Var = new oih0(this, zjeVar);
            }
        } else {
            oih0Var = new oih0(this, zjeVar);
        }
        oih0 oih0Var2 = oih0Var;
        Object obj = oih0Var2.m;
        Object obj2 = wne.f39444a;
        int i2 = oih0Var2.o;
        lfh0 lfh0Var = null;
        if (i2 == 0) {
            z1x.P(obj);
            List list = twk0Var.f34654a;
            List list2 = twk0Var.c;
            List list3 = twk0Var.b;
            i3t0.A(this, this.s, new did(CollectionsKt.q0(list, list3)), null, null, 6);
            i3t0.A(this, this.t, new fll0(list2), null, null, 6);
            List list4 = twk0Var.f34654a;
            this.v.getClass();
            list4.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.addAll(CollectionsKt.D0(CollectionsKt.A0(list4, new vvt((byte) 16)), 5));
            if (arrayList.size() < 5) {
                arrayList2.addAll(CollectionsKt.D0(CollectionsKt.A0(list3, new vvt((byte) 17)), 5 - arrayList.size()));
            }
            if (arrayList2.size() + arrayList.size() < 5) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!(((d2w) obj3) instanceof z1w)) {
                        arrayList4.add(obj3);
                    }
                }
                arrayList3.addAll(CollectionsKt.D0(CollectionsKt.A0(arrayList4, new vvt((byte) 18)), (5 - arrayList.size()) - arrayList2.size()));
            }
            cxk0 cxk0Var2 = new cxk0(arrayList, arrayList2, arrayList3);
            sah0 sah0Var2 = (((uhh0) D()).k != dxk0Var.b || ((((uhh0) D()).d.length() == 0) != (dxk0Var.f6850a.length() == 0))) ? sah0.c : !((uhh0) D()).d.equals(dxk0Var.f6850a) ? sah0.b : sah0.f31888a;
            oih0Var2.i = twk0Var;
            oih0Var2.j = dxk0Var;
            oih0Var2.k = cxk0Var2;
            oih0Var2.l = sah0Var2;
            oih0Var2.o = 1;
            objM = M(twk0Var, dxk0Var, oih0Var2);
            if (objM == obj2) {
                return obj2;
            }
            sah0Var = sah0Var2;
            twk0Var2 = twk0Var;
            cxk0Var = cxk0Var2;
            dxk0Var2 = dxk0Var;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sah0 sah0Var3 = oih0Var2.l;
            cxk0 cxk0Var3 = oih0Var2.k;
            dxk0 dxk0Var3 = oih0Var2.j;
            twk0 twk0Var3 = oih0Var2.i;
            z1x.P(obj);
            objM = obj;
            dxk0Var2 = dxk0Var3;
            cxk0Var = cxk0Var3;
            sah0Var = sah0Var3;
            twk0Var2 = twk0Var3;
        }
        cxk0 cxk0Var4 = (cxk0) objM;
        if (cxk0Var4.f5126a.isEmpty() && cxk0Var4.b.isEmpty() && cxk0Var4.c.isEmpty() && dxk0Var2.f6850a.length() > 0) {
            lfh0Var = lfh0.f19956a;
        }
        H(new fn0((Object) dxk0Var2, (Object) twk0Var2, (Object) cxk0Var, (Object) cxk0Var4, (Object) lfh0Var, (Object) sah0Var, (Object) this, (byte) 14));
        return Unit.f46060a;
    }

    public final void O() {
        c4m0 c4m0Var = this.H;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            byte b = 4;
            this.H = i3t0.L(this, new fnq(this.D.b(), new yng0(this, null, b), b), null, null, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object P(cxk0 cxk0Var, zje zjeVar) {
        rih0 rih0Var;
        sih0 sih0Var = this;
        if (zjeVar instanceof rih0) {
            rih0Var = (rih0) zjeVar;
            int i = rih0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rih0Var.k = i - Integer.MIN_VALUE;
            } else {
                rih0Var = new rih0(sih0Var, zjeVar);
            }
        } else {
            rih0Var = new rih0(sih0Var, zjeVar);
        }
        Object objA = rih0Var.i;
        Object obj = wne.f39444a;
        int i2 = rih0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            rih0Var.k = 1;
            objA = sih0Var.A.a(cxk0Var, rih0Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = (List) objA;
        p7m0 p7m0Var = sih0Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            sih0Var.f.getClass();
            if (p7m0Var.m(value, uhh0.a((uhh0) value, null, null, null, null, null, null, null, list, 0L, null, null, null, false, null, 67108351))) {
                break;
            }
            sih0Var = this;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((dok0) it.next()).a() == ((uhh0) D()).k) {
                }
            }
            this.B.f(-321L);
        } else {
            this.B.f(-321L);
        }
        return Unit.f46060a;
    }

    @Override // a.diu0
    public final void v() {
        zn00 zn00Var = (zn00) this.x.b;
        ((tfh0) zn00Var.b).f33866a.o(null, -321L);
        ((bih0) zn00Var.f44650a).f2660a.o(null, "");
        this.r.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        uhh0 uhh0Var;
        xeh0 xeh0Var = (xeh0) obj;
        xeh0Var.getClass();
        super.x(xeh0Var);
        boolean zEquals = xeh0Var.equals(meh0.f21645a);
        yhi yhiVar = this.r;
        if (zEquals) {
            v3c.N(this.H);
            yhiVar.c();
            v3c.N(this.I);
            bby bbyVar = this.J;
            if (bbyVar != null) {
                v3c.N(bbyVar);
            }
            v3c.N(this.K);
            v3c.N(this.M);
            return;
        }
        if (xeh0Var.equals(neh0.f23386a)) {
            E();
            return;
        }
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (xeh0Var.equals(oeh0.f25122a)) {
            i3t0.K(this, null, null, new bu(this, objArr3 == true ? 1 : 0, (byte) 16), 3);
            return;
        }
        if (xeh0Var.equals(peh0.f26853a)) {
            O();
            this.K = i3t0.F(this, this.s, null, null, new x0h0((byte) 11), 119);
            this.M = i3t0.F(this, this.t, null, null, new x0h0((byte) 12), 119);
            return;
        }
        if (xeh0Var instanceof qeh0) {
            ill0 ill0Var = ((qeh0) xeh0Var).f28584a;
            i3t0.A(this, this.t, ill0Var, null, null, 6);
            if (ill0Var instanceof gll0) {
                long j = ((gll0) ill0Var).f11497a;
                Set set = ((uhh0) D()).m;
                H(new j5d0(set.contains(Long.valueOf(j)) ? eui0.e(CollectionsKt.O0(set), Long.valueOf(j)) : eui0.h(CollectionsKt.O0(set), Long.valueOf(j)), this, (byte) 28));
                return;
            }
            return;
        }
        boolean z = xeh0Var instanceof reh0;
        hjd hjdVar = this.s;
        ywu ywuVar = this.F;
        byte b = 0;
        if (z) {
            bem bemVar = ((reh0) xeh0Var).f30335a;
            if (bemVar instanceof wdm) {
                wdm wdmVar = (wdm) bemVar;
                long j2 = wdmVar.f38979a;
                for (Object obj3 : CollectionsKt.q0(((uhh0) D()).g, ((uhh0) D()).h)) {
                    if (((d0t) obj3).f5282a == j2) {
                        obj2 = obj3;
                        break;
                    }
                }
                d0t d0tVar = (d0t) obj2;
                int i = d0tVar != null ? (int) d0tVar.v : 0;
                boolean z2 = wdmVar.b;
                ((yo4) ywuVar.b).f42966a.a("bet_recommended_game", xp20.f(new Pair("sport_id", Integer.valueOf(i)), new Pair("option", z2 ? "live" : "line"), new Pair("screen", "top_champ")));
                ((je) ywuVar.d).o(i, z2, y1p.SPECIAL_EVENT_TOP_CHAMP);
            }
            i3t0.B(this, hjdVar, new vid[]{new did(CollectionsKt.q0(((uhh0) D()).g, ((uhh0) D()).h)), ebc.n0(bemVar)});
            return;
        }
        if (xeh0Var instanceof seh0) {
            long j3 = ((seh0) xeh0Var).f32076a;
            if (((uhh0) D()).k != j3) {
                this.B.f(j3);
            }
            ywuVar.getClass();
            String strValueOf = j3 == -4321 ? "filter" : j3 == -321 ? "all" : String.valueOf(j3);
            ((yo4) ywuVar.b).l(strValueOf, "top_champ_search");
            ((zr1) ywuVar.c).p(strValueOf, "top_champ_search");
            return;
        }
        if (xeh0Var instanceof teh0) {
            i3t0.B(this, hjdVar, new vid[]{new did(CollectionsKt.q0(((uhh0) D()).g, ((uhh0) D()).h)), ((teh0) xeh0Var).f33821a});
            return;
        }
        if (!xeh0Var.equals(ueh0.f35528a)) {
            if (xeh0Var.equals(veh0.f37289a)) {
                v3c.N(this.H);
                yhiVar.c();
                v3c.N(this.I);
                bby bbyVar2 = this.J;
                if (bbyVar2 != null) {
                    v3c.N(bbyVar2);
                }
                i3t0.K(this, null, null, new mih0(this, objArr2 == true ? 1 : 0, b), 3);
                this.E.a(true);
                O();
                return;
            }
            if (!(xeh0Var instanceof weh0)) {
                t9f.b();
                return;
            }
            String str = ((weh0) xeh0Var).f39019a;
            boolean z3 = ((uhh0) D()).c.length() > 0 && str.length() == 0;
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                uhh0Var = (uhh0) value;
                this.f.getClass();
            } while (!p7m0Var.m(value, uhh0.a(uhh0Var, str, null, null, null, null, null, null, null, 0L, null, null, null, false, z3 ? sah0.c : sah0.f31888a, 67076091)));
            osu osuVar = this.z;
            osuVar.getClass();
            bih0 bih0Var = (bih0) osuVar.f25799a.f44650a;
            bih0Var.getClass();
            bih0Var.f2660a.o(null, str);
            v3c.N(this.L);
            this.L = i3t0.K(this, null, null, new gv60(str, this, objArr == true ? 1 : 0, (byte) 10), 3);
            return;
        }
        i1w0 i1w0Var = this.q;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
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
