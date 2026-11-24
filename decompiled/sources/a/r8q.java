package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.presentation.model.FinInstrumentUIModel;

/* JADX INFO: loaded from: classes4.dex */
public final class r8q extends w46 {
    public static final ocq Y = ocq.f25039a;
    public final vyt A;
    public final f6k B;
    public final ahu C;
    public final ot D;
    public final hru E;
    public final duj F;
    public final ilt0 G;
    public final trm0 H;
    public final b8u I;
    public final rxu J;
    public final yqc K;
    public final pmi L;
    public final xex M;
    public final zr1 N;
    public final rou O;
    public final pru P;
    public final p7m0 Q;
    public final p7m0 R;
    public final p7m0 S;
    public final ol60 T;
    public final p7m0 U;
    public c4m0 V;
    public int W;
    public final sje X;
    public final qdq b;
    public final w5z c;
    public final ort d;
    public final mii0 e;
    public final v88 f;
    public final i1w0 g;
    public final sa10 h;
    public final mne i;
    public final jtj j;
    public final ctf0 k;
    public final neu l;
    public final dyt m;
    public final v6q n;
    public final neu o;
    public final w4p0 p;
    public final c5k q;
    public final gr00 r;
    public final yuu s;
    public final meu t;
    public final dyt u;
    public final yk50 v;
    public final vpu w;
    public final oif0 x;
    public final vpu y;
    public final reu z;

    public r8q(qdq qdqVar, w5z w5zVar, ort ortVar, mii0 mii0Var, v88 v88Var, m1e m1eVar, i1w0 i1w0Var, sa10 sa10Var, mne mneVar, jtj jtjVar, ctf0 ctf0Var, neu neuVar, dyt dytVar, v6q v6qVar, neu neuVar2, w4p0 w4p0Var, c5k c5kVar, gr00 gr00Var, yuu yuuVar, meu meuVar, dyt dytVar2, yk50 yk50Var, vpu vpuVar, oif0 oif0Var, vpu vpuVar2, reu reuVar, vyt vytVar, f6k f6kVar, ahu ahuVar, ot otVar, hru hruVar, duj dujVar, ilt0 ilt0Var, trm0 trm0Var, b8u b8uVar, rxu rxuVar, yqc yqcVar, pmi pmiVar, xex xexVar, zr1 zr1Var, rou rouVar, pru pruVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = qdqVar;
        this.c = w5zVar;
        this.d = ortVar;
        this.e = mii0Var;
        this.f = v88Var;
        this.g = i1w0Var;
        this.h = sa10Var;
        this.i = mneVar;
        this.j = jtjVar;
        this.k = ctf0Var;
        this.l = neuVar;
        this.m = dytVar;
        this.n = v6qVar;
        this.o = neuVar2;
        this.p = w4p0Var;
        this.q = c5kVar;
        this.r = gr00Var;
        this.s = yuuVar;
        this.t = meuVar;
        this.u = dytVar2;
        this.v = yk50Var;
        this.w = vpuVar;
        this.x = oif0Var;
        this.y = vpuVar2;
        this.z = reuVar;
        this.A = vytVar;
        this.B = f6kVar;
        this.C = ahuVar;
        this.D = otVar;
        this.E = hruVar;
        this.F = dujVar;
        this.G = ilt0Var;
        this.H = trm0Var;
        this.I = b8uVar;
        this.J = rxuVar;
        this.K = yqcVar;
        this.L = pmiVar;
        this.M = xexVar;
        this.N = zr1Var;
        this.O = rouVar;
        this.P = pruVar;
        this.Q = q7m0.a(h8q.f12640a);
        this.R = q7m0.a(new s7q(new p0d(0, qic.c)));
        this.S = q7m0.a(p7q.f26519a);
        this.T = new ol60(3);
        this.U = q7m0.a(n7q.f23053a);
        sje sjeVarS = d5c.S(jiu0.a(this), new ax5(this));
        this.X = sjeVarS;
        yje yjeVar = null;
        byte b = 4;
        slb.U(new fnq(m1eVar.b(), new l8q(this, yjeVar, b), (byte) 4), sjeVarS);
        if (reuVar.c().b && ortVar.f25751a.a()) {
            sac.V(jiu0.a(this), new rnp(b), null, mneVar.b, new gc1((Object) this, yjeVar, (byte) 6), 10);
        }
        byte b2 = 1;
        sac.V(jiu0.a(this), new j7q(this, b2), null, mneVar.b, new l8q(this, yjeVar, b2), 10);
    }

    public final void A() {
        p7m0 p7m0Var = this.Q;
        if (p7m0Var.getValue() instanceof i8q) {
            Object value = p7m0Var.getValue();
            value.getClass();
        }
    }

    public final void B(zhi0 zhi0Var, Function0 function0) {
        String strJ0 = sj3.j0(zhi0Var.getMessage(), this.k.f(R.string.error_something_went_wrong, new Object[0]));
        kuw kuwVar = zhi0Var.c;
        i2o i2oVar = i2o.BetExistsError;
        ol60 ol60Var = this.T;
        if (kuwVar == i2oVar) {
            ol60Var.f(new y7q(strJ0));
            return;
        }
        if (kuwVar == i2o.q) {
            ol60Var.f(new z7q(strJ0));
        } else if (kuwVar == i2o.BetSumExceededNew || kuwVar == i2o.BetSumExceeded) {
            ol60Var.f(new c8q(strJ0));
        } else {
            function0.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object C(double d, zje zjeVar, boolean z) {
        o8q o8qVar;
        boolean z2;
        Object obj;
        Object objR;
        o8q o8qVar2;
        double d2;
        FinInstrumentUIModel finInstrumentUIModel;
        boolean z3;
        ql5 ql5Var;
        int i;
        yh7 yh7Var;
        FinInstrumentUIModel finInstrumentUIModel2;
        ql5 ql5Var2;
        if (zjeVar instanceof o8q) {
            o8qVar = (o8q) zjeVar;
            int i2 = o8qVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o8qVar.q = i2 - Integer.MIN_VALUE;
            } else {
                o8qVar = new o8q(this, zjeVar);
            }
        } else {
            o8qVar = new o8q(this, zjeVar);
        }
        Object obj2 = o8qVar.o;
        Object obj3 = wne.f39444a;
        int i3 = o8qVar.q;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = o8qVar.n;
                z3 = o8qVar.j;
                d2 = o8qVar.i;
                finInstrumentUIModel = o8qVar.l;
                ql5Var = o8qVar.k;
                z1x.P(obj2);
                objR = obj2;
                obj = obj3;
                i = i4;
                o8qVar2 = o8qVar;
                z2 = true;
            } else {
                if (i3 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yh7Var = o8qVar.m;
                finInstrumentUIModel2 = o8qVar.l;
                ql5 ql5Var3 = o8qVar.k;
                z1x.P(obj2);
                ql5Var2 = ql5Var3;
                z2 = true;
            }
            yh7 yh7Var2 = yh7Var;
            this.N.y(finInstrumentUIModel2.d.C(), yh7Var2.b, z2);
            double d3 = yh7Var2.e;
            String str = yh7Var2.d;
            String strValueOf = String.valueOf(yh7Var2.b);
            pn40 pn40Var = pn40.f27267a;
            this.T.f(new v7q(yh7Var2, ql5Var2, d3, str, strValueOf, this.k.b.a(R.string.history_possible_win, Arrays.copyOf(new Object[0], 0)), pn40.p(ql5Var2.f, yh7Var2.e * yh7Var2.c), this.z.c().f24244a));
            return Unit.f46060a;
        }
        z1x.P(obj2);
        Object value = this.S.getValue();
        value.getClass();
        ql5 ql5Var4 = ((q7q) value).f28264a;
        FinInstrumentUIModel finInstrumentUIModelZ = z();
        if (finInstrumentUIModelZ != null) {
            p7m0 p7m0Var = this.R;
            int i5 = ((s7q) p7m0Var.getValue()).f31762a.f26144a;
            qic qicVar = ((s7q) p7m0Var.getValue()).f31762a.b;
            long jLongValue = ((Number) this.m.b().get(i5)).longValue();
            double dDoubleValue = ((Number) this.l.b().get(i5)).doubleValue();
            wbq wbqVar = wbq.f38891a;
            v6q v6qVar = this.n;
            double dA = v6qVar.a(i5, wbqVar);
            double dA2 = v6qVar.a(i5, wbq.b);
            boolean z4 = qicVar == qic.f28784a;
            int i6 = finInstrumentUIModelZ.f46648a;
            long jA = this.u.a();
            long j = ql5Var4.f28916a;
            ezc ezcVarA = this.A.a();
            byte b = this.P.a().I1.f26017a;
            o8qVar.k = ql5Var4;
            o8qVar.l = finInstrumentUIModelZ;
            o8qVar.i = d;
            o8qVar.j = z;
            o8qVar.n = i5;
            o8qVar.q = 1;
            o8q o8qVar3 = o8qVar;
            z2 = true;
            obj = obj3;
            objR = this.c.R(jLongValue, dDoubleValue, dA, dA2, z4, i6, jA, d, "", j, z, false, ezcVarA, true, b, o8qVar3);
            o8qVar2 = o8qVar3;
            if (objR != obj) {
                d2 = d;
                finInstrumentUIModel = finInstrumentUIModelZ;
                z3 = z;
                ql5Var = ql5Var4;
                i = i5;
            }
            return obj;
        }
        return Unit.f46060a;
        yh7Var = (yh7) objR;
        String strValueOf2 = String.valueOf(yh7Var.b);
        FinInstrumentUIModel finInstrumentUIModelZ2 = z();
        if (finInstrumentUIModelZ2 != null) {
            this.e.Q(finInstrumentUIModelZ2.d.C(), "", strValueOf2, z2);
        }
        double d4 = yh7Var.f42624a;
        o8qVar2.k = ql5Var;
        o8qVar2.l = finInstrumentUIModel;
        o8qVar2.m = yh7Var;
        o8qVar2.i = d2;
        o8qVar2.j = z3;
        o8qVar2.n = i;
        o8qVar2.q = 2;
        this.G.a(d4, ql5Var.f28916a);
        this.H.l(bm5.f2822a, ql5.a(ql5Var, d4, null, 0, 8189));
        Object objY = y(o8qVar2);
        if (objY != obj) {
            objY = Unit.f46060a;
        }
        if (objY != obj) {
            finInstrumentUIModel2 = finInstrumentUIModel;
            ql5Var2 = ql5Var;
            yh7 yh7Var3 = yh7Var;
            this.N.y(finInstrumentUIModel2.d.C(), yh7Var3.b, z2);
            double d5 = yh7Var3.e;
            String str2 = yh7Var3.d;
            String strValueOf3 = String.valueOf(yh7Var3.b);
            pn40 pn40Var2 = pn40.f27267a;
            this.T.f(new v7q(yh7Var3, ql5Var2, d5, str2, strValueOf3, this.k.b.a(R.string.history_possible_win, Arrays.copyOf(new Object[0], 0)), pn40.p(ql5Var2.f, yh7Var3.e * yh7Var3.c), this.z.c().f24244a));
            return Unit.f46060a;
        }
        return obj;
    }

    public final void D(boolean z) {
        sac.V(jiu0.a(this), new j7q(this, (byte) 0), new k7q(this, (byte) 0), this.i.b, new fj3((diu0) this, z, (yje) null, (byte) 7), 8);
    }

    public final void E() {
        byte b = 2;
        if (!this.v.g()) {
            this.g.d(new j7q(this, b));
        } else {
            sac.V(jiu0.a(this), p8q.f26570a, null, this.i.f22085a, new l8q(this, null, b), 10);
        }
    }

    public final void F() {
        p7m0 p7m0Var = this.U;
        p7m0Var.getClass();
        p7m0Var.o(null, m7q.f21332a);
        f8q f8qVar = new f8q(sa10.b(this.h, pb10.g, R.string.data_retrieval_error, 0, null, 28));
        p7m0 p7m0Var2 = this.Q;
        p7m0Var2.getClass();
        p7m0Var2.o(null, f8qVar);
    }

    @Override // a.diu0
    public final void v() {
        this.t.a();
        d5c.G(this.X, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(ArrayList arrayList, zje zjeVar) {
        m8q m8qVar;
        r8q r8qVar;
        List list;
        int i;
        if (zjeVar instanceof m8q) {
            m8qVar = (m8q) zjeVar;
            int i2 = m8qVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m8qVar.n = i2 - Integer.MIN_VALUE;
            } else {
                m8qVar = new m8q(this, zjeVar);
            }
        } else {
            m8qVar = new m8q(this, zjeVar);
        }
        Object objH0 = m8qVar.l;
        Object obj = wne.f39444a;
        int i3 = m8qVar.n;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objH0);
            c4m0 c4m0Var = this.V;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            List list2 = x().c;
            List<FinInstrumentUIModel> list3 = arrayList;
            if (!list2.isEmpty()) {
                list3 = list2;
            }
            for (FinInstrumentUIModel finInstrumentUIModel : list3) {
                if (finInstrumentUIModel.e) {
                    int i4 = finInstrumentUIModel.f46648a;
                    m8qVar.i = list3;
                    m8qVar.j = this;
                    m8qVar.k = i4;
                    m8qVar.n = 1;
                    jtj jtjVar = this.j;
                    jtjVar.getClass();
                    objH0 = bkb.h0(1L, TimeUnit.SECONDS, new d21((Object) jtjVar, (Object) Y, i4, yjeVar, (byte) 5));
                    if (objH0 == obj) {
                        return obj;
                    }
                    r8qVar = this;
                    list = list3;
                    i = i4;
                }
            }
            v4i0.o("Collection contains no element matching the predicate.");
            return null;
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = m8qVar.k;
        r8qVar = m8qVar.j;
        List list4 = m8qVar.i;
        z1x.P(objH0);
        list = list4;
        r8qVar.V = slb.U(new fnq((gmq) objH0, new l21(this, list, i, (yje) null), (byte) 4), this.X);
        return Unit.f46060a;
    }

    public final l7q x() {
        p7m0 p7m0Var = this.U;
        if (!(p7m0Var.getValue() instanceof l7q)) {
            return new l7q(iun.f15405a, false, true);
        }
        Object value = p7m0Var.getValue();
        value.getClass();
        return (l7q) value;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(zje zjeVar) {
        n8q n8qVar;
        if (zjeVar instanceof n8q) {
            n8qVar = (n8q) zjeVar;
            int i = n8qVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n8qVar.k = i - Integer.MIN_VALUE;
            } else {
                n8qVar = new n8q(this, zjeVar);
            }
        } else {
            n8qVar = new n8q(this, zjeVar);
        }
        Object objB = n8qVar.i;
        Object obj = wne.f39444a;
        int i2 = n8qVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            bm5 bm5Var = bm5.m;
            n8qVar.k = 1;
            objB = this.C.b(bm5Var, n8qVar);
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
        hru hruVar = this.E;
        hruVar.getClass();
        if (((pv00) hruVar.f13549a).j(bm5Var2) == null) {
            this.D.a(bm5Var2, ql5Var);
        }
        q7q q7qVar = new q7q(ql5Var);
        p7m0 p7m0Var = this.S;
        p7m0Var.getClass();
        p7m0Var.o(null, q7qVar);
        return Unit.f46060a;
    }

    public final FinInstrumentUIModel z() {
        Object next;
        Iterator it = x().c.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((FinInstrumentUIModel) next).e) {
                return (FinInstrumentUIModel) next;
            }
        }
        next = null;
        return (FinInstrumentUIModel) next;
    }
}
