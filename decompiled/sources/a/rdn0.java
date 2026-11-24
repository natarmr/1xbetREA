package a;

/* JADX INFO: loaded from: classes4.dex */
public final class rdn0 extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final svu A;
    public final hjd B;
    public final mne C;
    public final r9u D;
    public final a8z E;
    public c4m0 F;
    public bby G;
    public bby H;
    public final j3c o;
    public final luu p;
    public final dj9 q;
    public final lbu r;
    public final pru s;
    public final m1e t;
    public final yhi u;
    public final wdu v;
    public final duj w;
    public final b4j x;
    public final je y;
    public final hnu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public rdn0(vzg0 vzg0Var, ctf0 ctf0Var, y78 y78Var, j3c j3cVar, luu luuVar, dj9 dj9Var, lbu lbuVar, pru pruVar, m1e m1eVar, yhi yhiVar, wdu wduVar, duj dujVar, b4j b4jVar, je jeVar, hnu hnuVar, g2v g2vVar, svu svuVar, hjd hjdVar, mne mneVar, r9u r9uVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new a7n0((byte) 9), cvm0.p(rwjVar, rwjVar), new mlb(ctf0Var, y78Var, g2vVar, (byte) 10), (yzn0) null);
        this.o = j3cVar;
        this.p = luuVar;
        this.q = dj9Var;
        this.r = lbuVar;
        this.s = pruVar;
        this.t = m1eVar;
        this.u = yhiVar;
        this.v = wduVar;
        this.w = dujVar;
        this.x = b4jVar;
        this.y = jeVar;
        this.z = hnuVar;
        this.A = svuVar;
        this.B = hjdVar;
        this.C = mneVar;
        this.D = r9uVar;
        this.E = maz.a(wez.b, new jfm0(this, (byte) 9));
        i3t0.K(this, null, null, new bu(this, null, (byte) 19), 3);
    }

    public final void M(Throwable th) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, hdn0.a((hdn0) value, null, false, null, cdn0.b, null, null, false, false, false, null, false, false, false, 8055)));
        this.w.b(th, new o3m0(th, this, (byte) 11));
    }

    public final void N() {
        bby bbyVar = this.G;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.G = sac.V(jiu0.a(this), new ndn0(1, this, rdn0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, this.C.b, new qdn0(this, yjeVar, (byte) 0), 10);
    }

    public final boolean O() {
        return ((hdn0) D()).c == bdn0.f2407a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        ycn0 ycn0Var = (ycn0) obj;
        ycn0Var.getClass();
        byte b = 2;
        byte b2 = 1;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (ycn0Var instanceof qcn0) {
            if (!(((qcn0) ycn0Var) instanceof qcn0)) {
                t9f.b();
                return;
            }
            uid uidVarN0 = ebc.n0(((qcn0) ycn0Var).f28492a);
            i3t0.B(this, this.B, new vid[]{new did(((hdn0) D()).f12878a), uidVarN0});
            if (uidVarN0 instanceof pid) {
                for (Object obj3 : ((hdn0) D()).f12878a) {
                    if (((d0t) obj3).f5282a == ((pid) uidVarN0).f27037a) {
                        obj2 = obj3;
                        break;
                    }
                }
                d0t d0tVar = (d0t) obj2;
                if (d0tVar != null) {
                    long j = d0tVar.v;
                    boolean z = d0tVar.C;
                    if (((hdn0) D()).c == bdn0.c) {
                        this.x.q(j, zde0.NOTIFICATIONS, z);
                        this.y.o(j, z, y1p.NOTIFICATIONS);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (ycn0Var instanceof xcn0) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, hdn0.a((hdn0) value, null, false, null, null, null, null, false, true, false, null, false, false, false, 8063)));
            N();
            return;
        }
        if (ycn0Var instanceof vcn0) {
            N();
            return;
        }
        boolean z2 = ycn0Var instanceof wcn0;
        mne mneVar = this.C;
        if (z2) {
            sac.V(jiu0.a(this), new ndn0(1, this, rdn0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, mneVar.f22085a, new qdn0(this, objArr3 == true ? 1 : 0, b2), 10);
            return;
        }
        if (ycn0Var instanceof ucn0) {
            G(new edn0(((ucn0) ycn0Var).f35439a));
            return;
        }
        if (ycn0Var instanceof tcn0) {
            c4m0 c4m0Var = this.F;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.F = slb.U(new fnq(new dnq(this.t.b(), new jgb0((Object) this, (yje) (objArr2 == true ? 1 : 0), (byte) 19), (byte) 1), new qdn0(this, objArr == true ? 1 : 0, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b));
            this.H = i3t0.F(this, this.B, mneVar.f22085a, null, new acm0((byte) 4), 118);
            return;
        }
        if (ycn0Var instanceof rcn0) {
            v3c.N(this.F);
            v3c.N(this.G);
            v3c.N(this.H);
        } else if (ycn0Var instanceof scn0) {
            E();
        }
    }
}
