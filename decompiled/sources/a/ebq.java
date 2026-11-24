package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ebq extends i3t0 {
    public static final /* synthetic */ int f0 = 0;
    public final neu A;
    public final w4p0 B;
    public final c5k C;
    public final gr00 D;
    public final yuu E;
    public final meu F;
    public final yk50 G;
    public final vpu H;
    public final oif0 I;
    public final vpu J;
    public final reu K;
    public final vyt L;
    public final f6k M;
    public final ahu N;
    public final ot O;
    public final hru P;
    public final duj Q;
    public final ilt0 R;
    public final trm0 S;
    public final b8u T;
    public final rxu U;
    public final yqc V;
    public final x0u W;
    public final xex X;
    public final zr1 Y;
    public final rou Z;
    public final pru a0;
    public final v6q b0;
    public c4m0 c0;
    public bby d0;
    public c4m0 e0;
    public final vzg0 o;
    public final i1u p;
    public final w5z q;
    public final kc60 r;
    public final iqt s;
    public final mii0 t;
    public final v88 u;
    public final m1e v;
    public final i1w0 w;
    public final mne x;
    public final abu y;
    public final ctf0 z;

    public ebq(vzg0 vzg0Var, ocl oclVar, i1u i1uVar, i1u i1uVar2, w5z w5zVar, kc60 kc60Var, iqt iqtVar, mii0 mii0Var, v88 v88Var, m1e m1eVar, i1w0 i1w0Var, mne mneVar, abu abuVar, ctf0 ctf0Var, neu neuVar, w4p0 w4p0Var, c5k c5kVar, gr00 gr00Var, yuu yuuVar, meu meuVar, yk50 yk50Var, vpu vpuVar, oif0 oif0Var, vpu vpuVar2, reu reuVar, vyt vytVar, f6k f6kVar, ahu ahuVar, ot otVar, hru hruVar, duj dujVar, ilt0 ilt0Var, trm0 trm0Var, b8u b8uVar, rxu rxuVar, yqc yqcVar, x0u x0uVar, xex xexVar, zr1 zr1Var, rou rouVar, pru pruVar, i1u i1uVar3, v6q v6qVar) {
        dvj dvjVar;
        m1eVar.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        wg2 wg2Var = new wg2(vzg0Var, (byte) 6);
        cz czVar = new cz(oclVar, ctf0Var, (byte) 14);
        dvj dvjVar2 = mneVar.b;
        super(null, wg2Var, czVar, cvm0.p(dvjVar2, dvjVar2), null);
        this.o = vzg0Var;
        this.p = i1uVar;
        this.q = w5zVar;
        this.r = kc60Var;
        this.s = iqtVar;
        this.t = mii0Var;
        this.u = v88Var;
        this.v = m1eVar;
        this.w = i1w0Var;
        this.x = mneVar;
        this.y = abuVar;
        this.z = ctf0Var;
        this.A = neuVar;
        this.B = w4p0Var;
        this.C = c5kVar;
        this.D = gr00Var;
        this.E = yuuVar;
        this.F = meuVar;
        this.G = yk50Var;
        this.H = vpuVar;
        this.I = oif0Var;
        this.J = vpuVar2;
        this.K = reuVar;
        this.L = vytVar;
        this.M = f6kVar;
        this.N = ahuVar;
        this.O = otVar;
        this.P = hruVar;
        this.Q = dujVar;
        this.R = ilt0Var;
        this.S = trm0Var;
        this.T = b8uVar;
        this.U = rxuVar;
        this.V = yqcVar;
        this.W = x0uVar;
        this.X = xexVar;
        this.Y = zr1Var;
        this.Z = rouVar;
        this.a0 = pruVar;
        this.b0 = v6qVar;
        Integer num = ((oaq) D()).c;
        if (num != null) {
            v6qVar.b(num.intValue());
        }
        U();
        byte b = 2;
        yje yjeVar = null;
        if (reuVar.c().b && iqtVar.f15225a.a()) {
            sac.V(jiu0.a(this), new uaq(this, b), null, dvjVar2, new gc1((Object) this, yjeVar, (byte) 7), 10);
            dvjVar = dvjVar2;
        } else {
            dvjVar = dvjVar2;
        }
        byte b2 = 1;
        dvj dvjVar3 = dvjVar;
        sac.V(jiu0.a(this), new uaq(this, (byte) 3), null, dvjVar3, new waq(this, yjeVar, b2), 10);
        sac.T(new fnq(vtb.N(i1uVar2.f14018a.c.f28212a), new u52((diu0) this, yjeVar, (byte) 10), (byte) 4), d5c.S(jiu0.a(this), dvjVar3), bbq.h);
        T();
        sac.T(new fnq(vtb.M(i1uVar3.f14018a.c.f), new yaq(this, yjeVar, b2), (byte) 4), jiu0.a(this), new p23(b, yjeVar, (byte) 5));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    public final List M(int i, wbq wbqVar) {
        double d;
        List list;
        List list2;
        sbq sbqVar;
        kcq kcqVar = ((oaq) D()).f;
        if (kcqVar == null || (list2 = kcqVar.b) == null) {
            d = 0.0d;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((sbq) obj).e == wbqVar) {
                    arrayList.add(obj);
                }
            }
            List listA0 = CollectionsKt.A0(arrayList, new e3l((byte) 15));
            if (listA0 == null || (sbqVar = (sbq) CollectionsKt.W(i, listA0)) == null) {
                d = 0.0d;
            } else {
                d = sbqVar.c;
            }
        }
        kcq kcqVar2 = ((oaq) D()).f;
        if (kcqVar2 == null || (list = kcqVar2.b) == null) {
            return iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((sbq) obj2).c == d) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object N(zje zjeVar) {
        xaq xaqVar;
        Object value;
        if (zjeVar instanceof xaq) {
            xaqVar = (xaq) zjeVar;
            int i = xaqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xaqVar.k = i - Integer.MIN_VALUE;
            } else {
                xaqVar = new xaq(this, zjeVar);
            }
        } else {
            xaqVar = new xaq(this, zjeVar);
        }
        Object objB = xaqVar.i;
        Object obj = wne.f39444a;
        int i2 = xaqVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            bm5 bm5Var = bm5.m;
            xaqVar.k = 1;
            objB = this.N.b(bm5Var, xaqVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        ql5 ql5Var = (ql5) objB;
        bm5 bm5Var2 = bm5.m;
        hru hruVar = this.P;
        hruVar.getClass();
        if (((pv00) hruVar.f13549a).j(bm5Var2) == null) {
            this.O.a(bm5Var2, ql5Var);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, oaq.a((oaq) value, null, false, null, vcc.k0(ql5Var), null, null, null, false, false, 0, null, false, 4087)));
        return Unit.f46060a;
    }

    public final gcq O() {
        Object next;
        Iterator it = ((oaq) D()).f24940a.iterator();
        while (it.hasNext()) {
            next = it.next();
            int i = ((gcq) next).f11074a;
            Integer num = ((oaq) D()).c;
            if (num != null && i == num.intValue()) {
                return (gcq) next;
            }
        }
        next = null;
        return (gcq) next;
    }

    public final void P(Throwable th) {
        this.Q.b(th, new vaq(this, (byte) 0));
    }

    public final void Q() {
        bby bbyVar = this.d0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.d0 = i3t0.K(this, null, new pop(1, this, ebq.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), new zaq(this, null), 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object R(double d, zje zjeVar, boolean z) {
        abq abqVar;
        Object next;
        boolean z2;
        Object obj;
        abq abqVar2;
        double d2;
        gcq gcqVar;
        Object obj2;
        long j;
        g9q g9qVar;
        boolean z3;
        List list;
        Long l;
        yh7 yh7Var;
        gcq gcqVar2;
        g9q g9qVar2;
        if (zjeVar instanceof abq) {
            abqVar = (abq) zjeVar;
            int i = abqVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                abqVar.q = i - Integer.MIN_VALUE;
            } else {
                abqVar = new abq(this, zjeVar);
            }
        } else {
            abqVar = new abq(this, zjeVar);
        }
        Object obj3 = abqVar.o;
        Object obj4 = wne.f39444a;
        int i2 = abqVar.q;
        Object obj5 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                j = abqVar.n;
                boolean z4 = abqVar.j;
                d2 = abqVar.i;
                gcqVar = abqVar.l;
                g9qVar = abqVar.k;
                z1x.P(obj3);
                obj2 = obj3;
                obj = obj4;
                z3 = z4;
                abqVar2 = abqVar;
                z2 = true;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yh7Var = abqVar.m;
                gcqVar2 = abqVar.l;
                g9qVar2 = abqVar.k;
                z1x.P(obj3);
            }
            this.Y.y(gcqVar2.d.C(), yh7Var.b, true);
            long j2 = g9qVar2.f10928a;
            String str = g9qVar2.f;
            double d3 = yh7Var.e;
            String str2 = yh7Var.d;
            String strValueOf = String.valueOf(yh7Var.b);
            pn40 pn40Var = pn40.f27267a;
            G(new haq(d3, j2, strValueOf, str, str2, pn40.p(g9qVar2.f, yh7Var.e * yh7Var.c), this.z.b.a(R.string.history_possible_win, Arrays.copyOf(new Object[0], 0)), this.K.c().f24244a));
            return Unit.f46060a;
        }
        z1x.P(obj3);
        g9q g9qVar3 = ((oaq) D()).d;
        gcq gcqVarO = O();
        List listM = M(((oaq) D()).j, ((oaq) D()).k);
        Iterator it = listM.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((sbq) next).e != wbq.f38891a);
        sbq sbqVar = (sbq) next;
        for (Object obj6 : listM) {
            if (((sbq) obj6).e == wbq.b) {
                obj5 = obj6;
                break;
            }
        }
        sbq sbqVar2 = (sbq) obj5;
        if (gcqVarO != null && g9qVar3 != null && sbqVar != null && sbqVar2 != null) {
            cev cevVar = ((oaq) D()).g;
            long jLongValue = (cevVar == null || (list = cevVar.g) == null || (l = (Long) CollectionsKt.W(2, list)) == null) ? 0L : l.longValue();
            sff0 sff0VarA = this.a0.a();
            long j3 = sbqVar.d;
            double d4 = sbqVar.c;
            double d5 = sbqVar.b;
            double d6 = sbqVar2.b;
            boolean z5 = ((oaq) D()).k == wbq.f38891a;
            int i3 = gcqVarO.f11074a;
            long j4 = g9qVar3.f10928a;
            ezc ezcVarA = this.L.a();
            byte b = sff0VarA.I1.f26017a;
            abqVar.k = g9qVar3;
            abqVar.l = gcqVarO;
            abqVar.i = d;
            abqVar.j = z;
            abqVar.n = jLongValue;
            abqVar.q = 1;
            abq abqVar3 = abqVar;
            z2 = true;
            obj = obj4;
            Object objR = this.q.R(j3, d4, d5, d6, z5, i3, jLongValue, d, "", j4, z, false, ezcVarA, true, b, abqVar3);
            abqVar2 = abqVar3;
            if (objR != obj) {
                d2 = d;
                gcqVar = gcqVarO;
                obj2 = objR;
                j = jLongValue;
                g9qVar = g9qVar3;
                z3 = z;
            }
            return obj;
        }
        return Unit.f46060a;
        yh7 yh7Var2 = (yh7) obj2;
        String strValueOf2 = String.valueOf(yh7Var2.b);
        gcq gcqVarO2 = O();
        if (gcqVarO2 != null) {
            this.t.Q(gcqVarO2.d.C(), "", strValueOf2, z2);
        }
        double d7 = yh7Var2.f42624a;
        abqVar2.k = g9qVar;
        abqVar2.l = gcqVar;
        abqVar2.m = yh7Var2;
        abqVar2.i = d2;
        abqVar2.j = z3;
        abqVar2.n = j;
        abqVar2.q = 2;
        this.R.a(d7, g9qVar.f10928a);
        this.S.l(bm5.f2822a, new ql5(g9qVar.f10928a, d7, g9qVar.c, g9qVar.d, g9qVar.e, g9qVar.f, g9qVar.g, g9qVar.h, g9qVar.i, g9qVar.j, g9qVar.k, g9qVar.l, g9qVar.m));
        Object objN = N(abqVar2);
        if (objN != wne.f39444a) {
            objN = Unit.f46060a;
        }
        if (objN != obj) {
            yh7Var = yh7Var2;
            gcqVar2 = gcqVar;
            g9qVar2 = g9qVar;
            this.Y.y(gcqVar2.d.C(), yh7Var.b, true);
            long j5 = g9qVar2.f10928a;
            String str3 = g9qVar2.f;
            double d8 = yh7Var.e;
            String str4 = yh7Var.d;
            String strValueOf3 = String.valueOf(yh7Var.b);
            pn40 pn40Var2 = pn40.f27267a;
            G(new haq(d8, j5, strValueOf3, str3, str4, pn40.p(g9qVar2.f, yh7Var.e * yh7Var.c), this.z.b.a(R.string.history_possible_win, Arrays.copyOf(new Object[0], 0)), this.K.c().f24244a));
            return Unit.f46060a;
        }
        return obj;
    }

    public final void S(boolean z) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, oaq.a((oaq) value, null, false, null, null, null, null, null, false, false, 0, null, true, 2047)));
        byte b = 1;
        sac.V(jiu0.a(this), new uaq(this, b), new taq(this, b), this.x.b, new fj3((diu0) this, z, (yje) null, (byte) 8), 8);
    }

    public final void T() {
        J(new fnq(this.r.a(), new cbq((Object) this, (yje) null, (byte) 0), (byte) 4), this.x.b, new pop(1, this, ebq.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18));
    }

    public final void U() {
        c4m0 c4m0Var = this.e0;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.e0 = J(new fnq(this.v.b(), new waq(this, null, (byte) 2), (byte) 4), this.x.b, new pop(1, this, ebq.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22));
        }
    }

    @Override // a.diu0
    public final void v() {
        this.F.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        double d;
        double d2;
        p7m0 p7m0Var;
        Object value2;
        wbq wbqVar;
        Object next;
        List list;
        Long l;
        List list2;
        sbq sbqVar;
        f9q f9qVar = (f9q) obj;
        f9qVar.getClass();
        super.x(f9qVar);
        boolean z = f9qVar instanceof u8q;
        i1w0 i1w0Var = this.w;
        if (z) {
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
        } else {
            boolean z2 = f9qVar instanceof b9q;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            yk50 yk50Var = this.G;
            vzg0 vzg0Var = this.o;
            Object obj2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (z2) {
                b9q b9qVar = (b9q) f9qVar;
                wbq wbqVar2 = b9qVar.f2223a;
                int i = b9qVar.b;
                gcq gcqVarO = O();
                boolean zG = yk50Var.g();
                kcq kcqVar = ((oaq) D()).f;
                if (kcqVar != null && (list2 = kcqVar.b) != null) {
                    d = 0.0d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((sbq) obj3).e == wbqVar2) {
                            arrayList.add(obj3);
                        }
                    }
                    List listA0 = CollectionsKt.A0(arrayList, new e3l((byte) 14));
                    if (listA0 != null && (sbqVar = (sbq) CollectionsKt.W(i, listA0)) != null) {
                        d2 = sbqVar.b;
                    }
                    if (i == ((oaq) D()).j || d2 == d) {
                        p7m0Var = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var.m(value2, oaq.a((oaq) value2, null, false, null, null, null, null, null, false, false, i, wbq.c, false, 2559)));
                        vzg0Var.e("SELECTED_INDEX_KEY", Integer.valueOf(i));
                        vzg0Var.e("SELECTED_TYPE_KEY", wbq.c);
                        return;
                    }
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    while (true) {
                        Object value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                        wbqVar = wbqVar2;
                        if (p7m0Var2.m(value3, oaq.a((oaq) value3, null, false, null, null, null, null, null, false, false, 0, wbqVar, false, 3071))) {
                            break;
                        } else {
                            wbqVar2 = wbqVar;
                        }
                    }
                    vzg0Var.e("SELECTED_TYPE_KEY", wbqVar);
                    List listM = M(((oaq) D()).j, ((oaq) D()).k);
                    Iterator it = listM.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((sbq) next).e != wbq.f38891a);
                    sbq sbqVar2 = (sbq) next;
                    for (Object obj4 : listM) {
                        if (((sbq) obj4).e == wbq.b) {
                            obj2 = obj4;
                            break;
                        }
                    }
                    sbq sbqVar3 = (sbq) obj2;
                    if (zG || gcqVarO == null || sbqVar2 == null || sbqVar3 == null) {
                        S(false);
                        return;
                    }
                    cev cevVar = ((oaq) D()).g;
                    long jLongValue = (cevVar == null || (list = cevVar.g) == null || (l = (Long) CollectionsKt.W(2, list)) == null) ? 0L : l.longValue();
                    ((h7q) this.B.b).c.c = jLongValue;
                    G(new faq(new FinBetInfoModel(gcqVarO.f11074a, String.valueOf(d2), d2, gcqVarO.b, gcqVarO.d, sbqVar2.c, gcqVarO.c, sbqVar2.d, sbqVar2.b, sbqVar3.b, ((oaq) D()).k == wbq.f38891a, i, jLongValue)));
                    return;
                }
                d = 0.0d;
                d2 = d;
                if (i == ((oaq) D()).j) {
                }
                p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, oaq.a((oaq) value2, null, false, null, null, null, null, null, false, false, i, wbq.c, false, 2559)));
                vzg0Var.e("SELECTED_INDEX_KEY", Integer.valueOf(i));
                vzg0Var.e("SELECTED_TYPE_KEY", wbq.c);
                return;
            }
            if (!(f9qVar instanceof x8q)) {
                if (f9qVar instanceof y8q) {
                    i3t0.K(this, null, new pop(1, this, ebq.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 20), new dbq(this, objArr3 == true ? 1 : 0, (byte) 1), 1);
                    return;
                }
                if (f9qVar instanceof w8q) {
                    if (((oaq) D()).h || ((oaq) D()).i) {
                        return;
                    }
                    if (yk50Var.g()) {
                        i3t0.K(this, null, new pop(1, this, ebq.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), new dbq(this, objArr2 == true ? 1 : 0, (byte) 0), 1);
                        return;
                    } else {
                        i1w0Var.d(new uaq(this, (byte) 0));
                        return;
                    }
                }
                if (f9qVar instanceof v8q) {
                    if (((oaq) D()).h || ((oaq) D()).i) {
                        return;
                    }
                    G(daq.f5763a);
                    return;
                }
                if (f9qVar instanceof e9q) {
                    i3t0.K(this, null, new pop(1, this, ebq.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), new m91(this, objArr == true ? 1 : 0, (byte) 9), 1);
                    return;
                }
                if (f9qVar instanceof d9q) {
                    g9q g9qVar = ((oaq) D()).d;
                    if (g9qVar != null) {
                        this.u.a(i1w0Var, true, g9qVar.f10928a);
                        return;
                    }
                    return;
                }
                if (f9qVar.equals(t8q.f33523a)) {
                    E();
                    return;
                }
                if (f9qVar.equals(a9q.f490a)) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value, oaq.a((oaq) value, null, false, null, null, null, null, null, true, false, 0, null, false, 3711)));
                    Q();
                    return;
                }
                if (!f9qVar.equals(z8q.f43980a)) {
                    if (!f9qVar.equals(c9q.f3973a)) {
                        t9f.b();
                        return;
                    } else {
                        Q();
                        U();
                        return;
                    }
                }
                bby bbyVar = this.d0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                c4m0 c4m0Var = this.c0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                c4m0 c4m0Var2 = this.e0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                    return;
                }
                return;
            }
            int i2 = ((x8q) f9qVar).f40473a;
            p7m0 p7m0Var4 = ocjVar.f25029a;
            while (true) {
                Object value4 = p7m0Var4.getValue();
                value4.getClass();
                oyg0Var.getClass();
                int i3 = i2;
                if (p7m0Var4.m(value4, oaq.a((oaq) value4, null, false, null, null, null, null, null, false, false, i3, wbq.c, false, 2559))) {
                    vzg0Var.e("SELECTED_INDEX_KEY", Integer.valueOf(i3));
                    vzg0Var.e("SELECTED_TYPE_KEY", wbq.c);
                    return;
                }
                i2 = i3;
            }
        }
    }
}
