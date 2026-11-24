package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ren0 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public c4m0 A;
    public bby B;
    public bby C;
    public final i1w0 o;
    public final ouu p;
    public final oif0 q;
    public final hcp0 r;
    public final ehf0 s;
    public final m1e t;
    public final duj u;
    public final mne v;
    public final svu w;
    public final pru x;
    public final kys0 y;
    public final lk5 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ren0(vzg0 vzg0Var, i1w0 i1w0Var, g2v g2vVar, ouu ouuVar, oif0 oif0Var, hcp0 hcp0Var, ehf0 ehf0Var, m1e m1eVar, duj dujVar, mne mneVar, svu svuVar, pru pruVar, kys0 kys0Var, lk5 lk5Var, bzt bztVar) {
        m1eVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new a7n0((byte) 11), g090VarP, new u5l0((Object) bztVar, (Object) g2vVar, (byte) 27), (yzn0) null);
        this.o = i1w0Var;
        this.p = ouuVar;
        this.q = oif0Var;
        this.r = hcp0Var;
        this.s = ehf0Var;
        this.t = m1eVar;
        this.u = dujVar;
        this.v = mneVar;
        this.w = svuVar;
        this.x = pruVar;
        this.y = kys0Var;
        this.z = lk5Var;
        i3t0.K(this, null, null, new m91(this, null, (byte) 19), 3);
    }

    public final void M(Throwable th) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, jen0.a((jen0) value, false, false, false, null, een0.b, 13)));
        this.u.b(th, new o3m0(th, this, (byte) 14));
    }

    public final void N() {
        bby bbyVar = this.B;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.B = sac.V(jiu0.a(this), new ndn0(1, this, ren0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, this.v.b, new qen0(this, yjeVar, (byte) 0), 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object value;
        den0 den0Var = (den0) obj;
        den0Var.getClass();
        if (den0Var instanceof ben0) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, jen0.a((jen0) value, false, true, false, null, null, 29)));
            N();
            return;
        }
        if (den0Var instanceof xdn0) {
            N();
            return;
        }
        char c = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (den0Var instanceof cen0) {
            aan0 aan0Var = ((cen0) den0Var).f4221a;
            for (Object obj3 : ((jen0) D()).d) {
                if (((nmp0) obj3).f23784a == aan0Var.f536a) {
                    obj2 = obj3;
                    break;
                }
            }
            nmp0 nmp0Var = (nmp0) obj2;
            if (nmp0Var == null) {
                return;
            }
            this.o.d(new lrc0(nmp0Var.c == 189 && this.x.a().c.d, (Object) this, (Object) nmp0Var, (byte) 6));
            return;
        }
        if (den0Var instanceof zdn0) {
            aan0 aan0Var2 = ((zdn0) den0Var).f44220a;
            Iterator it = ((jen0) D()).d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((nmp0) next).f23784a != aan0Var2.f536a);
            nmp0 nmp0Var2 = (nmp0) next;
            if (nmp0Var2 == null) {
                return;
            }
            i3t0.K(this, null, new ndn0(1, this, ren0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), new gv60(this, nmp0Var2, null, (byte) 16), 1);
            return;
        }
        boolean z = den0Var instanceof aen0;
        mne mneVar = this.v;
        if (z) {
            this.C = sac.V(jiu0.a(this), new ndn0(1, this, ren0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar.b, new lcl0(this, ((aen0) den0Var).f738a, objArr4 == true ? 1 : 0, (byte) 8), 10);
            return;
        }
        if (den0Var instanceof ydn0) {
            this.C = sac.V(jiu0.a(this), new ndn0(1, this, ren0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, mneVar.b, new qen0(this, objArr3 == true ? 1 : 0, c == true ? 1 : 0), 10);
            return;
        }
        if (den0Var instanceof wdn0) {
            G(new gen0(((wdn0) den0Var).f38982a));
            return;
        }
        if (den0Var instanceof vdn0) {
            c4m0 c4m0Var = this.A;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.A = slb.U(new fnq(new dnq(this.t.b(), new jgb0((Object) this, (yje) (objArr2 == true ? 1 : 0), (byte) 21), (byte) 1), new qen0(this, objArr == true ? 1 : 0, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), mneVar.b));
            return;
        }
        if (den0Var instanceof tdn0) {
            v3c.N(this.A);
            v3c.N(this.B);
            v3c.N(this.C);
        } else if (den0Var instanceof udn0) {
            E();
        }
    }
}
