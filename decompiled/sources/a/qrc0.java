package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class qrc0 extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final uf3 A;
    public final oct B;
    public final x20 C;
    public final b4j D;
    public final duj E;
    public final ctf0 F;
    public bby G;
    public bby H;
    public bby I;
    public final c4m0 J;
    public final vzg0 o;
    public final rl70 p;
    public final nou q;
    public final ivn r;
    public final gpu s;
    public final xex t;
    public final mrt u;
    public final h4k v;
    public final dcu w;
    public final rrd x;
    public final mne y;
    public final oeg0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public qrc0(vrc0 vrc0Var, pru pruVar, vzg0 vzg0Var, rl70 rl70Var, nou nouVar, ivn ivnVar, gpu gpuVar, xex xexVar, mrt mrtVar, h4k h4kVar, dcu dcuVar, rrd rrdVar, m1e m1eVar, mne mneVar, oeg0 oeg0Var, uf3 uf3Var, oct octVar, x20 x20Var, b4j b4jVar, g2v g2vVar, duj dujVar, ctf0 ctf0Var) {
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(vs10Var, rwjVar);
        yje yjeVar = null;
        super(new mr0(vrc0Var, pruVar, vzg0Var, g2vVar, (byte) 26), g090VarP, new iv80(ctf0Var, (byte) 9), (yzn0) null);
        this.o = vzg0Var;
        this.p = rl70Var;
        this.q = nouVar;
        this.r = ivnVar;
        this.s = gpuVar;
        this.t = xexVar;
        this.u = mrtVar;
        this.v = h4kVar;
        this.w = dcuVar;
        this.x = rrdVar;
        this.y = mneVar;
        this.z = oeg0Var;
        this.A = uf3Var;
        this.B = octVar;
        this.C = x20Var;
        this.D = b4jVar;
        this.E = dujVar;
        this.F = ctf0Var;
        sac.V(jiu0.a(this), new mrc0(this, (byte) 1), null, mneVar.b, new er60((Object) this, yjeVar, (byte) 22), 10);
        c4m0 c4m0Var = this.J;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.J = sac.T(new fnq(m1eVar.b(), new orc0(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new st20(2, yjeVar, (byte) 15));
        }
    }

    public final void M() {
        Object value;
        bby bbyVar = this.H;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, zqc0.a((zqc0) value, true, false, null, null, 0, 0, 0, 0L, 0.0d, null, false, 65534)));
            this.H = sac.i0(jiu0.a(this), "PromoShopDetailViewModel.loadPromoCodeDetails", 3, 0L, q3d.j(SocketTimeoutException.class, UnknownHostException.class, oqt0.class), null, new er60((Object) this, (yje) null, (byte) 23), null, this.y.b, new mrc0(this, (byte) 2), null, 596);
        }
    }

    public final void N() {
        bby bbyVar = this.I;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.I = sac.i0(jiu0.a(this), "PromoShopDetailViewModel.loadRelatedPromoCodes", 3, 0L, q3d.j(SocketTimeoutException.class, UnknownHostException.class, oqt0.class), null, new orc0(this, null, b), null, this.y.b, new mrc0(this, (byte) 0), null, 596);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        mqc0 mqc0Var = (mqc0) obj;
        mqc0Var.getClass();
        super.x(mqc0Var);
        if (mqc0Var.equals(hqc0.f13479a)) {
            E();
            return;
        }
        boolean zEquals = mqc0Var.equals(iqc0.f15205a);
        byte b = 0;
        oeg0 oeg0Var = this.z;
        if (!zEquals) {
            Object obj2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (mqc0Var.equals(fqc0.f9969a)) {
                bby bbyVar = this.G;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.G = sac.V(jiu0.a(this), new mrc0(this, (byte) 3), null, this.y.b, new orc0(this, objArr2 == true ? 1 : 0, b), 10);
                    return;
                }
                return;
            }
            if (mqc0Var.equals(jqc0.f16944a)) {
                M();
                N();
                return;
            }
            if (mqc0Var.equals(kqc0.f18717a)) {
                sac.V(jiu0.a(this), new prc0(1, this, qrc0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, null, new orc0(this, objArr == true ? 1 : 0, (byte) 2), 14);
                return;
            }
            if (!(mqc0Var instanceof gqc0)) {
                if (!(mqc0Var instanceof lqc0)) {
                    t9f.b();
                    return;
                }
                long j = ((lqc0) mqc0Var).f20482a;
                for (Object obj3 : ((zqc0) D()).d) {
                    if (((vrc0) obj3).getId() == j) {
                        obj2 = obj3;
                        break;
                    }
                }
                vrc0 vrc0Var = (vrc0) obj2;
                if (vrc0Var != null) {
                    oeg0Var.c().d(new oac0(this, vrc0Var, (byte) 7));
                    return;
                }
                return;
            }
            boolean z = ((gqc0) mqc0Var).f11726a;
            int iH0 = z ? ((zqc0) D()).e.h0() + ((zqc0) D()).h : ((zqc0) D()).h - ((zqc0) D()).e.h0();
            int i = z ? ((zqc0) D()).i + 1 : ((zqc0) D()).i - 1;
            Integer numValueOf = Integer.valueOf(iH0);
            vzg0 vzg0Var = this.o;
            vzg0Var.e("AMOUNT_KEY", numValueOf);
            vzg0Var.e("GAME_COUNT_KEY", Integer.valueOf(i));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, zqc0.a((zqc0) value, false, false, null, null, iH0, i, 0, 0L, 0.0d, null, false, 65151)));
            return;
        }
        i1w0 i1w0VarC = oeg0Var.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }
}
