package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l2k0 extends i3t0 {
    public static final /* synthetic */ int J = 0;
    public final pzu A;
    public final kb0 B;
    public final cmt C;
    public sd60 D;
    public c4m0 E;
    public bby F;
    public bby G;
    public bby H;
    public c4m0 I;
    public final String o;
    public final duj p;
    public final vgs0 q;
    public final ivn r;
    public final yox s;
    public final do20 t;
    public final cpc u;
    public final a7q v;
    public final m1e w;
    public final ctf0 x;
    public final phf0 y;
    public final pru z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2k0(String str, mne mneVar, duj dujVar, vgs0 vgs0Var, ivn ivnVar, yox yoxVar, do20 do20Var, cpc cpcVar, a7q a7qVar, ocl oclVar, m1e m1eVar, ctf0 ctf0Var, phf0 phf0Var, pru pruVar, bzt bztVar, pzu pzuVar, kb0 kb0Var, cmt cmtVar) {
        super(new z5j(pruVar, bztVar, (byte) 1), cvm0.p(mneVar.f22085a, mneVar.c), new gpb0(ctf0Var, oclVar, (byte) 12), (yzn0) null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = str;
        this.p = dujVar;
        this.q = vgs0Var;
        this.r = ivnVar;
        this.s = yoxVar;
        this.t = do20Var;
        this.u = cpcVar;
        this.v = a7qVar;
        this.w = m1eVar;
        this.x = ctf0Var;
        this.y = phf0Var;
        this.z = pruVar;
        this.A = pzuVar;
        this.B = kb0Var;
        this.C = cmtVar;
        i3t0.F(this, kb0Var, null, null, new ogj0((byte) 27), 119);
    }

    public final void M(boolean z, lk80 lk80Var) {
        Object value;
        f2k0 f2k0Var;
        bby bbyVar = this.F;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        sd60 sd60Var = this.D;
        if (sd60Var != null) {
            sac.V((bvc) sd60Var.c, null, null, (lne) sd60Var.b, new zm70(sd60Var, null), 11);
        }
        if (!z) {
            bby bbyVar2 = this.H;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
            }
            this.H = i3t0.K(this, null, new gvj0(1, this, l2k0.class, "handleTransactionHistoryLoadError", "handleTransactionHistoryLoadError(Ljava/lang/Throwable;)V", 0, (byte) 9), new j2k0(this, yjeVar, (byte) 0), 1);
        }
        if (!this.z.a().K) {
            bby bbyVar3 = this.F;
            if (bbyVar3 != null) {
                bbyVar3.cancel(null);
            }
            this.F = i3t0.L(this, new fnq(((hk5) ((yk50) this.v.f384a).b).f13192a, new bai0(this, yjeVar, (byte) 22), (byte) 4), null, null, 3);
            return;
        }
        bvc bvcVarA = jiu0.a(this);
        ugs0.f35640a.getClass();
        vgs0 vgs0Var = this.q;
        vgs0Var.getClass();
        this.D = new sd60(new yl80(z ? (List) ((oo) ((vkr0) vgs0Var.c.f20589a).c).f25569a.getValue() : iun.f15405a, lk80Var), vgs0Var.f37397a.f22085a, bvcVarA, new xh20((Object) vgs0Var, z, (byte) 24), new meq0((Object) vgs0Var, yjeVar, (byte) 17), new fup0(2, vgs0Var, vgs0.class, "isEndOfPaginationReached", "isEndOfPaginationReached(Lorg/xplatform/feature/balance_management/impl/balance_management/presentation/common/model/TransactionsHistoryPagingRequest;Ljava/util/List;)Z", 0, (byte) 21));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            f2k0Var = (f2k0) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, f2k0.a(f2k0Var, null, null, null, null, false, z ? 100 : 10, 223)));
        this.F = i3t0.K(this, null, null, new vnn((Object) this, z, yjeVar, (byte) 6), 3);
    }

    public final void N(boolean z) {
        c4m0 c4m0Var = this.E;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar = this.G;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.G = i3t0.K(this, null, null, new j2k0(this, yjeVar, (byte) 1), 3);
        this.E = i3t0.L(this, new fnq(new i89(this.y.m(), (byte) 23), new k2k0(this, z, yjeVar, (byte) 0), (byte) 4), null, new gvj0(1, this, l2k0.class, "handleBalanceError", "handleBalanceError(Ljava/lang/Throwable;)V", 0, (byte) 10), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        a2k0 a2k0Var = (a2k0) obj;
        a2k0Var.getClass();
        super.x(a2k0Var);
        final byte b = 1;
        if (a2k0Var.equals(q1k0.f27958a)) {
            M(true, lk80.f20189a);
            return;
        }
        yje yjeVar = null;
        if (a2k0Var.equals(w1k0.f38405a)) {
            c4m0 c4m0Var = this.I;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.I = i3t0.L(this, new fnq(this.w.b(), new yng0(this, yjeVar, (byte) 18), (byte) 4), null, null, 3);
            i3t0.A(this, this.B, new rh5(this.o), null, null, 6);
            return;
        }
        if (a2k0Var.equals(u1k0.f34904a)) {
            c4m0 c4m0Var2 = this.E;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            c4m0 c4m0Var3 = this.I;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            bby bbyVar = this.G;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        if (a2k0Var.equals(n1k0.f22754a)) {
            E();
            return;
        }
        final byte b2 = 0;
        if (a2k0Var.equals(v1k0.f36636a)) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, f2k0.a((f2k0) value, null, null, null, null, true, 0, 239)));
            ((oo) ((vkr0) this.t.f6397a).c).f25569a.n(iun.f15405a);
            M(false, lk80.c);
            return;
        }
        if (a2k0Var.equals(s1k0.f31461a)) {
            N(true);
            return;
        }
        if (a2k0Var.equals(r1k0.f29685a)) {
            sd60 sd60Var = this.D;
            if (sd60Var != null) {
                sac.V((bvc) sd60Var.c, null, null, (lne) sd60Var.b, new wn2((Object) sd60Var, (Object) lk80.b, yjeVar, (byte) 21), 11);
                return;
            }
            return;
        }
        if (a2k0Var.equals(x1k0.f40126a)) {
            i3t0.A(this, this.B, sh5.f32194a, null, new gvj0(1, this, l2k0.class, "handleBalanceError", "handleBalanceError(Ljava/lang/Throwable;)V", 0, (byte) 11), 2);
            return;
        }
        if (a2k0Var.equals(p1k0.f26206a)) {
            i3t0.A(this, this.B, ph5.f26980a, null, null, 6);
            return;
        }
        if (a2k0Var.equals(o1k0.f24484a)) {
            i3t0.A(this, this.B, oh5.f25250a, null, null, 6);
            return;
        }
        boolean zEquals = a2k0Var.equals(y1k0.f41859a);
        cmt cmtVar = this.C;
        if (zEquals) {
            i3t0.A(this, this.B, new th5(cmtVar.g()), null, new Function1(this) { // from class: a.h2k0
                public final /* synthetic */ l2k0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b2;
                    c2k0 c2k0Var = c2k0.f3628a;
                    l2k0 l2k0Var = this.b;
                    Throwable th = (Throwable) obj2;
                    switch (b3) {
                        case 0:
                            th.getClass();
                            l2k0Var.G(c2k0Var);
                            break;
                        default:
                            th.getClass();
                            l2k0Var.G(c2k0Var);
                            break;
                    }
                    return Unit.f46060a;
                }
            }, 2);
        } else if (a2k0Var.equals(z1k0.f43626a)) {
            i3t0.A(this, this.B, new uh5(cmtVar.g()), null, new Function1(this) { // from class: a.h2k0
                public final /* synthetic */ l2k0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b;
                    c2k0 c2k0Var = c2k0.f3628a;
                    l2k0 l2k0Var = this.b;
                    Throwable th = (Throwable) obj2;
                    switch (b3) {
                        case 0:
                            th.getClass();
                            l2k0Var.G(c2k0Var);
                            break;
                        default:
                            th.getClass();
                            l2k0Var.G(c2k0Var);
                            break;
                    }
                    return Unit.f46060a;
                }
            }, 2);
        } else if (!(a2k0Var instanceof t1k0)) {
            t9f.b();
        } else {
            i3t0.A(this, this.B, new qh5(((t1k0) a2k0Var).f33171a), null, null, 6);
        }
    }
}
