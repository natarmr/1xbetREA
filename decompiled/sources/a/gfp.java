package a;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public final class gfp extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public c4m0 A;
    public final nw20 o;
    public final lbu p;
    public final mne q;
    public final nn60 r;
    public final m1e s;
    public final kqc t;
    public final oct u;
    public final s31 v;
    public final gg5 w;
    public final i1w0 x;
    public c4m0 y;
    public bby z;

    public gfp(vzg0 vzg0Var, nw20 nw20Var, lbu lbuVar, iqt iqtVar, ctf0 ctf0Var, mne mneVar, gw60 gw60Var, nn60 nn60Var, m1e m1eVar, g2v g2vVar, kqc kqcVar, oct octVar, kc60 kc60Var, s31 s31Var, gg5 gg5Var, i1w0 i1w0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        fbp fbpVar = new fbp(g2vVar, iqtVar, (byte) 2);
        bcn bcnVar = new bcn(ctf0Var, (byte) 11);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, fbpVar, bcnVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = nw20Var;
        this.p = lbuVar;
        this.q = mneVar;
        this.r = nn60Var;
        this.s = m1eVar;
        this.t = kqcVar;
        this.u = octVar;
        this.v = s31Var;
        this.w = gg5Var;
        this.x = i1w0Var;
        i3t0.B(this, nn60Var, new en60[]{new wm60(zn60.OneXFavouriteNew)});
        i3t0.F(this, nn60Var, null, null, new jbp((byte) 6), 119);
        sac.T(new fnq(kc60Var.a(), new ffp(this, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foe.h);
    }

    public final void M() {
        c4m0 c4m0Var = this.y;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        nw20 nw20Var = this.o;
        this.y = sac.T(new fnq(aoq.c(((ort) nw20Var.b).a(), new za60(yjeVar, (Object) nw20Var, (byte) 4)), new ffp(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.q.b), new pfl(2, this, gfp.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 4, (byte) 8));
    }

    public final void N() {
        bby bbyVar = this.z;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.z = sac.V(jiu0.a(this), new k4p(1, this, gfp.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, null, new efp(this, null, b), 14);
        }
    }

    public final void O(Throwable th) {
        Object value;
        boolean z = th != null && ((th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof UnknownHostException));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, i9p.a((i9p) value, false, false, false, z, !z, null, null, null, false, 8140)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        n2t n2tVar = (n2t) obj;
        n2tVar.getClass();
        super.x(n2tVar);
        if (n2tVar instanceof a2t) {
            E();
            return;
        }
        boolean z = n2tVar instanceof f2t;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        ?? r8 = 0;
        Object obj2 = null;
        if (z) {
            if (!((f2t) n2tVar).f8829a.equals(on60.f25532a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var = this.y;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, i9p.a((i9p) value3, false, false, false, true, false, null, null, null, false, 8175)));
            return;
        }
        boolean z2 = n2tVar instanceof j2t;
        byte b = 0;
        nn60 nn60Var = this.r;
        if (z2) {
            i3t0.B(this, nn60Var, new en60[]{((j2t) n2tVar).f15798a});
            return;
        }
        boolean z3 = n2tVar instanceof h2t;
        byte b2 = 2;
        mne mneVar = this.q;
        if (z3) {
            c4m0 c4m0Var2 = this.A;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.A = slb.U(new dnq(new fnq(this.s.b(), new efp(this, r8, b2), (byte) 4), new rj((Object) this, (yje) r8, (byte) 25), (byte) 1), d5c.S(jiu0.a(this), mneVar.f22085a));
                return;
            }
            return;
        }
        if (n2tVar instanceof i2t) {
            c4m0 c4m0Var3 = this.A;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            c4m0 c4m0Var4 = this.y;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
            }
            bby bbyVar = this.z;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        if (n2tVar instanceof g2t) {
            M();
            N();
            return;
        }
        if (n2tVar instanceof l2t) {
            c4m0 c4m0Var5 = this.y;
            if (c4m0Var5 != null) {
                c4m0Var5.cancel(null);
            }
            bby bbyVar2 = this.z;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, i9p.a((i9p) value2, true, false, false, false, false, null, null, null, false, 8189)));
            M();
            N();
            return;
        }
        if (n2tVar instanceof d2t) {
            d2t d2tVar = (d2t) n2tVar;
            for (Object obj3 : ((i9p) D()).h) {
                if (((pbv) obj3).f26728a == d2tVar.f5374a) {
                    obj2 = obj3;
                    break;
                }
            }
            pbv pbvVar = (pbv) obj2;
            if (pbvVar == null) {
                return;
            }
            i3t0.B(this, nn60Var, new en60[]{new bn60(pbvVar, d2tVar.b, -1)});
            return;
        }
        if (n2tVar instanceof e2t) {
            long j = ((e2t) n2tVar).f7103a;
            for (Object obj4 : ((i9p) D()).h) {
                if (((pbv) obj4).f26728a == j) {
                    r8 = obj4;
                    break;
                }
            }
            pbv pbvVar2 = (pbv) r8;
            if (pbvVar2 == null) {
                return;
            }
            i3t0.B(this, nn60Var, new en60[]{new ym60(pbvVar2)});
            return;
        }
        if (n2tVar instanceof k2t) {
            this.v.f(at2.XGAMES);
            this.w.a(g2p.XGAMES);
            this.x.d(new g7p(this, b2));
        } else {
            if (n2tVar instanceof c2t) {
                sac.V(jiu0.a(this), new k4p(1, this, gfp.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.f22085a, new efp(this, r8, b), 10);
                return;
            }
            if (!(n2tVar instanceof m2t)) {
                if (n2tVar instanceof b2t) {
                    G(sct.f32004a);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, i9p.a((i9p) value, false, false, false, false, false, null, null, null, false, 8187)));
        }
    }
}
