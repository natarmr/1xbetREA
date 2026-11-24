package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.feed.navigation.FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class qi2 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public final duj A;
    public c4m0 B;
    public bby C;
    public final j3c o;
    public final i1w0 p;
    public final rrc q;
    public final ifp r;
    public final abu s;
    public final g2v t;
    public final yzn0 u;
    public final n4u v;
    public final hcp0 w;
    public final ehf0 x;
    public final m1e y;
    public final mne z;

    /* JADX WARN: Code duplicated, block: B:9:0x006d  */
    /* JADX WARN: Illegal instructions before constructor call */
    public qi2(vzg0 vzg0Var, j3c j3cVar, i1w0 i1w0Var, r9u r9uVar, pru pruVar, rrc rrcVar, ifp ifpVar, abu abuVar, g2v g2vVar, yzn0 yzn0Var, n4u n4uVar, hcp0 hcp0Var, ehf0 ehf0Var, m1e m1eVar, mne mneVar, ctf0 ctf0Var, duj dujVar) {
        boolean z;
        i1w0Var.getClass();
        r9uVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new t32((byte) 9), cvm0.p(rwjVar, rwjVar), new uc(ctf0Var, (byte) 23), (yzn0) null);
        this.o = j3cVar;
        this.p = i1w0Var;
        this.q = rrcVar;
        this.r = ifpVar;
        this.s = abuVar;
        this.t = g2vVar;
        this.u = yzn0Var;
        this.v = n4uVar;
        this.w = hcp0Var;
        this.x = ehf0Var;
        this.y = m1eVar;
        this.z = mneVar;
        this.A = dujVar;
        sff0 sff0VarA = pruVar.a();
        mum0 mum0Var = sff0VarA.g;
        if (!sff0VarA.B0 || mum0Var.B == vcp.NoTabsDashboard) {
            z = false;
        } else {
            ygp ygpVar = ygp.u;
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (j1q0Var.f15748a.d(ygpVar)) {
                z = true;
            } else {
                z = false;
            }
        }
        i3t0.K(this, null, null, new ni2(this, mum0Var.p, z, null), 3);
    }

    public final void M() {
        Object value;
        bby bbyVar = this.C;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            if (((ei2) D()).c instanceof bqp0) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, ei2.a((ei2) value, null, false, dqp0.f6528a, false, false, null, 123)));
            }
            this.C = sac.V(jiu0.a(this), new ln1(1, this, qi2.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, this.z.b, new mi2(this, null, b), 10);
        }
    }

    public final void N(Throwable th) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            th.getClass();
        } while (!p7m0Var.m(value, ei2.a((ei2) value, null, false, new bqp0(th), false, false, null, 107)));
        this.A.b(th, new ma2((byte) 11));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        vh2 vh2Var = (vh2) obj;
        vh2Var.getClass();
        super.x(vh2Var);
        if (vh2Var.equals(kh2.f18268a)) {
            E();
            return;
        }
        yje yjeVar = null;
        if (vh2Var.equals(jh2.f16506a)) {
            c4m0 c4m0Var = this.B;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            bby bbyVar = this.C;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        final byte b = 1;
        if (vh2Var.equals(lh2.f20034a)) {
            c4m0 c4m0Var2 = this.B;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.B = slb.U(new dnq(new fnq(this.y.b(), new pa((Object) this, yjeVar, (byte) 24), (byte) 4), new oi2(this, yjeVar, b), (byte) 1), d5c.S(jiu0.a(this), this.z.f22085a));
                return;
            }
            return;
        }
        if (vh2Var.equals(qh2.f28716a)) {
            M();
            return;
        }
        boolean zEquals = vh2Var.equals(sh2.f32189a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals) {
            v3c.N(this.C);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, ei2.a((ei2) value2, null, false, null, false, true, null, 47)));
            M();
            return;
        }
        boolean zEquals2 = vh2Var.equals(nh2.f23512a);
        final byte b2 = 0;
        i1w0 i1w0Var = this.p;
        if (!zEquals2) {
            if (vh2Var.equals(th2.f33942a)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, ei2.a((ei2) value, null, false, null, false, false, null, 119)));
                return;
            }
            if (vh2Var instanceof rh2) {
                rh2 rh2Var = (rh2) vh2Var;
                i1w0Var.d(new sl1(rh2Var.b, (i3t0) this, rh2Var.f30467a, (byte) 2));
                return;
            }
            if (vh2Var instanceof uh2) {
                uh2 uh2Var = (uh2) vh2Var;
                long j = uh2Var.f35654a;
                i3t0.K(this, null, new xd2((byte) 7), new pi2(uh2Var.b, this, j, null), 1);
                return;
            }
            if (vh2Var.equals(mh2.f21769a)) {
                i1w0Var.d(new Function1(this) { // from class: a.hi2
                    public final /* synthetic */ qi2 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b3 = b;
                        qi2 qi2Var = this.b;
                        k0w0 k0w0Var = (k0w0) obj2;
                        switch (b3) {
                            case 0:
                                k0w0Var.getClass();
                                c8d c8dVar = (c8d) k0w0Var.b(new b1w0(new pn(qi2Var, null, (byte) 7))).f14945a;
                                bjk bjkVar = cfx0.o;
                                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                                break;
                            default:
                                k0w0Var.getClass();
                                rrc rrcVar = qi2Var.q;
                                m7r0 m7r0Var = m7r0.f21334a;
                                rrcVar.getClass();
                                k0w0Var.h(new FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1(rrcVar, m7r0Var));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
            if (vh2Var.equals(ph2.f26975a)) {
                G(di2.f6120a);
                return;
            } else if (vh2Var.equals(oh2.f25244a)) {
                i1w0Var.d(new Function1(this) { // from class: a.hi2
                    public final /* synthetic */ qi2 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b3 = b2;
                        qi2 qi2Var = this.b;
                        k0w0 k0w0Var = (k0w0) obj2;
                        switch (b3) {
                            case 0:
                                k0w0Var.getClass();
                                c8d c8dVar = (c8d) k0w0Var.b(new b1w0(new pn(qi2Var, null, (byte) 7))).f14945a;
                                bjk bjkVar = cfx0.o;
                                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                                break;
                            default:
                                k0w0Var.getClass();
                                rrc rrcVar = qi2Var.q;
                                m7r0 m7r0Var = m7r0.f21334a;
                                rrcVar.getClass();
                                k0w0Var.h(new FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1(rrcVar, m7r0Var));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            } else {
                t9f.b();
                return;
            }
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
