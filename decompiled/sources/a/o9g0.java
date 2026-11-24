package a;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.special_event.impl.results.presentation.model.ResultsScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class o9g0 extends i3t0 {
    public static final /* synthetic */ int M = 0;
    public final okt0 A;
    public final drm0 B;
    public final ilp0 C;
    public final zas0 D;
    public final zie0 E;
    public final art F;
    public final zie0 G;
    public final j3c H;
    public c4m0 I;
    public bby J;
    public bby K;
    public bby L;
    public final vzg0 o;
    public final ResultsScreenParams p;
    public final i1w0 q;
    public final mne r;
    public final m1e s;
    public final rus t;
    public final rpt u;
    public final w4p0 v;
    public final vqc w;
    public final iqt x;
    public final rou y;
    public final rqt z;

    /* JADX WARN: Illegal instructions before constructor call */
    public o9g0(vzg0 vzg0Var, ResultsScreenParams resultsScreenParams, i1w0 i1w0Var, mne mneVar, ctf0 ctf0Var, m1e m1eVar, rus rusVar, rpt rptVar, w4p0 w4p0Var, f4u f4uVar, vqc vqcVar, iqt iqtVar, rou rouVar, edu eduVar, yfu yfuVar, rqt rqtVar, okt0 okt0Var, drm0 drm0Var, ilp0 ilp0Var, jtj jtjVar, zas0 zas0Var, zie0 zie0Var, art artVar, zie0 zie0Var2, jru jruVar, bzt bztVar, pru pruVar, j3c j3cVar, kuu kuuVar, wiu wiuVar, r9u r9uVar) {
        long jLongValue;
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(vs10Var, rwjVar);
        yje yjeVar = null;
        super(new ng0((Object) kuuVar, (Object) resultsScreenParams, (Object) pruVar, (Object) vzg0Var, (Object) r9uVar, (byte) 14), g090VarP, new zlb0(ctf0Var, wiuVar, bztVar, (byte) 20), (yzn0) null);
        this.o = vzg0Var;
        this.p = resultsScreenParams;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = m1eVar;
        this.t = rusVar;
        this.u = rptVar;
        this.v = w4p0Var;
        this.w = vqcVar;
        this.x = iqtVar;
        this.y = rouVar;
        this.z = rqtVar;
        this.A = okt0Var;
        this.B = drm0Var;
        this.C = ilp0Var;
        this.D = zas0Var;
        this.E = zie0Var;
        this.F = artVar;
        this.G = zie0Var2;
        this.H = j3cVar;
        Long l = (Long) vzg0Var.a("RESULTS_FRAGMENT_SELECTED_SPORT_ID_BUNDLE_KEY");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            long j = resultsScreenParams.b;
            vzg0Var.e("RESULTS_FRAGMENT_SELECTED_SPORT_ID_BUNDLE_KEY", Long.valueOf(j));
            jLongValue = j;
        }
        okt0Var.f(jLongValue);
        ((lef0) zas0Var.b).m(((e9g0) D()).m.b);
        byte b = 22;
        byte b2 = 1;
        sac.T(new p6d(new m430(f4uVar.a(n0w.b), this, (byte) 26), new i89(((t5g0) ((lef0) jruVar.b).f19899a).f33368a, b), new p4b0(this, yjeVar, b2), b2), d5c.S(jiu0.a(this), rwjVar), foe.h);
        v8l0 v8l0Var = (v8l0) ((ani0) eduVar.c).f1155a;
        sac.T(new p6d(new p6d(new qaf0(v8l0Var.f, (byte) 6), v8l0Var.e, new fe0((Object) eduVar, yjeVar, (byte) 8), b2), yfuVar.a(), new ib60(this, yjeVar, (byte) 9), b2), jiu0.a(this), foe.h);
        byte b3 = 0;
        sac.T(new fnq(new p6d(((o5g0) ((pv00) jtjVar.b).f27640a).f24686a, new xp90(new i89(((t5g0) ((lef0) jtjVar.c).f19899a).f33368a, b), (byte) 3), new wvt(jtjVar, yjeVar, b3), b2), new tye0(this, yjeVar, (byte) 13), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foe.h);
        i3t0.K(this, null, null, new k9g0(this, yjeVar, b3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(zje zjeVar) {
        l9g0 l9g0Var;
        if (zjeVar instanceof l9g0) {
            l9g0Var = (l9g0) zjeVar;
            int i = l9g0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                l9g0Var.k = i - Integer.MIN_VALUE;
            } else {
                l9g0Var = new l9g0(this, zjeVar);
            }
        } else {
            l9g0Var = new l9g0(this, zjeVar);
        }
        Object objQ = l9g0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = l9g0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objQ);
            bby bbyVar = this.J;
            if ((bbyVar != null && bbyVar.isActive()) || !((e9g0) D()).g.isEmpty()) {
                return Unit.f46060a;
            }
            kzj kzjVarM = qjj.M(jiu0.a(this), null, new coc0(this, yjeVar, (byte) 28), 3);
            l9g0Var.k = 1;
            objQ = kzjVarM.q(l9g0Var);
            if (objQ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objQ);
        }
        byte b = 2;
        this.J = i3t0.K(this, null, new j9g0(this, b), new snn(this, ((Number) objQ).intValue(), yjeVar, b), 1);
        return Unit.f46060a;
    }

    public final void N() {
        c4m0 c4m0Var = this.I;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.I = sac.T(new fnq(this.s.b(), new fj3((diu0) this, (yje) null, (byte) 21), (byte) 4), d5c.S(jiu0.a(this), this.r.f22085a), foe.h);
        }
    }

    @Override // a.diu0
    public final void v() {
        ((b6t) this.w.b).c.f33385a.n(null);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        n5g0 n5g0Var = (n5g0) obj;
        n5g0Var.getClass();
        super.x(n5g0Var);
        if (n5g0Var.equals(g5g0.f10716a)) {
            N();
            return;
        }
        if (n5g0Var.equals(e5g0.f7233a)) {
            e3c.n(this.I);
            e3c.n(this.L);
            e3c.n(this.J);
            bby bbyVar = this.K;
            if (bbyVar != null) {
                e3c.n(bbyVar);
                return;
            }
            return;
        }
        if (n5g0Var.equals(f5g0.f8960a)) {
            E();
            return;
        }
        boolean zEquals = n5g0Var.equals(h5g0.f12478a);
        byte b = 0;
        i1w0 i1w0Var = this.q;
        if (!zEquals) {
            if (n5g0Var.equals(j5g0.f15932a)) {
                i1w0Var.d(new j9g0(this, b));
                return;
            }
            boolean z = n5g0Var instanceof m5g0;
            byte b2 = 1;
            vzg0 vzg0Var = this.o;
            if (z) {
                fll0 fll0Var = new fll0(((e9g0) D()).g);
                ill0 ill0Var = ((m5g0) n5g0Var).f21217a;
                i3t0.B(this, this.t, new jll0[]{fll0Var, ill0Var});
                if (ill0Var instanceof gll0) {
                    long j = ((gll0) ill0Var).f11497a;
                    Set set = ((e9g0) D()).c;
                    LinkedHashSet linkedHashSetE = set.contains(Long.valueOf(j)) ? eui0.e(CollectionsKt.O0(set), Long.valueOf(j)) : eui0.h(CollectionsKt.O0(set), Long.valueOf(j));
                    p7m0 p7m0Var = this.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        this.f.getClass();
                    } while (!p7m0Var.m(value, e9g0.a((e9g0) value, linkedHashSetE, null, null, 0L, null, null, null, 16379)));
                    vzg0Var.e("EXPANDED_IDS_KEY", linkedHashSetE);
                    return;
                }
                return;
            }
            if (n5g0Var.equals(l5g0.f19454a)) {
                ((b6t) this.w.b).c.f33385a.n(null);
                e3c.n(this.I);
                e3c.n(this.L);
                e3c.n(this.J);
                bby bbyVar2 = this.K;
                if (bbyVar2 != null) {
                    e3c.n(bbyVar2);
                }
                N();
                return;
            }
            if (!(n5g0Var instanceof k5g0)) {
                if (n5g0Var instanceof i5g0) {
                    ((lef0) this.D.b).m((Date) CollectionsKt.Q(((e9g0) D()).m.f42829a, ((i5g0) n5g0Var).f14191a));
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            long j2 = ((k5g0) n5g0Var).f17718a;
            if (((e9g0) D()).i != j2) {
                if (j2 == -4321) {
                    i1w0Var.d(new j9g0(this, b2));
                    return;
                } else {
                    vzg0Var.e("RESULTS_FRAGMENT_SELECTED_SPORT_ID_BUNDLE_KEY", Long.valueOf(j2));
                    this.A.f(j2);
                    return;
                }
            }
            return;
        }
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
