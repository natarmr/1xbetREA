package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import org.xplatform.wallet.impl.navigation.WalletsScreen$AddWalletScreen;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models.BonusAccountUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class u0v0 extends i3t0 {
    public static final /* synthetic */ int P = 0;
    public final psc A;
    public final nou B;
    public final xru C;
    public final peg0 D;
    public final ot E;
    public final jyg0 F;
    public final pru G;
    public final peu H;
    public final eqx I;
    public String J;
    public final c4m0 K;
    public bby L;
    public bby M;
    public bby N;
    public bby O;
    public final wxs0 o;
    public final oct p;
    public final peg0 q;
    public final zx10 r;
    public final zg s;
    public final je t;
    public final i1w0 u;
    public final duj v;
    public final dq00 w;
    public final cmt x;
    public final z220 y;
    public final yqc z;

    public u0v0(wxs0 wxs0Var, oct octVar, peg0 peg0Var, zx10 zx10Var, zg zgVar, je jeVar, m1e m1eVar, g2v g2vVar, mne mneVar, i1w0 i1w0Var, duj dujVar, dq00 dq00Var, cmt cmtVar, z220 z220Var, yqc yqcVar, psc pscVar, nou nouVar, xru xruVar, peg0 peg0Var2, ot otVar, jyg0 jyg0Var, pru pruVar, peu peuVar, eqx eqxVar, ctf0 ctf0Var, String str) {
        m1eVar.getClass();
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        rbt0 rbt0Var = new rbt0(eqxVar, (byte) 20);
        cls0 cls0Var = new cls0(g2vVar, ctf0Var, (byte) 11);
        yje yjeVar = null;
        super(rbt0Var, g090VarP, cls0Var, (yzn0) null);
        this.o = wxs0Var;
        this.p = octVar;
        this.q = peg0Var;
        this.r = zx10Var;
        this.s = zgVar;
        this.t = jeVar;
        this.u = i1w0Var;
        this.v = dujVar;
        this.w = dq00Var;
        this.x = cmtVar;
        this.y = z220Var;
        this.z = yqcVar;
        this.A = pscVar;
        this.B = nouVar;
        this.C = xruVar;
        this.D = peg0Var2;
        this.E = otVar;
        this.F = jyg0Var;
        this.G = pruVar;
        this.H = peuVar;
        this.I = eqxVar;
        this.J = str;
        c4m0 c4m0Var = this.K;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.K = sac.T(new fnq(m1eVar.b(), new k6s0(this, yjeVar, (byte) 22), (byte) 4), jiu0.a(this), s0v0.h);
        }
    }

    public final void M(Throwable th) {
        Object value;
        if (th != null) {
            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, j0v0.a((j0v0) value, false, true, false, false, null, null, null, null, null, 0L, false, 2044)));
                return;
            }
            if (th instanceof zhi0) {
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                G(new h0v0(message));
                return;
            }
        }
        this.v.b(th, new b4u0((byte) 23));
    }

    public final void N(boolean z) {
        Object value;
        bby bbyVar = this.L;
        if (bbyVar == null || !bbyVar.isActive()) {
            if (((j0v0) D()).e.isEmpty()) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, j0v0.a((j0v0) value, true, false, false, false, null, null, null, null, null, 0L, false, 2046)));
            }
            this.L = i3t0.K(this, null, new wzu0(1, this, u0v0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 3), new q0v0(this, z, null), 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(ql5 ql5Var, long j, zje zjeVar) {
        r0v0 r0v0Var;
        if (zjeVar instanceof r0v0) {
            r0v0Var = (r0v0) zjeVar;
            int i = r0v0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0v0Var.k = i - Integer.MIN_VALUE;
            } else {
                r0v0Var = new r0v0(this, zjeVar);
            }
        } else {
            r0v0Var = new r0v0(this, zjeVar);
        }
        Object obj = r0v0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = r0v0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            this.s.f44322a.a("change_bill_done", xp20.f(new Pair("currency_id", Long.valueOf(ql5Var.e)), new Pair("currency_default_id", Long.valueOf(j))));
            this.t.f16351a.a(tx3.l0(new k1p[]{new i1p((int) ql5Var.e, (byte) 2), new i1p((int) j, (byte) 0)}), 3070L);
            r0v0Var.k = 1;
            if (this.y.C(ql5Var, r0v0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        N(false);
        return Unit.f46060a;
    }

    public final void P() {
        this.s.f44322a.c("create_bill_call");
        this.t.f16351a.a(xun.f41520a, 3275L);
        i1w0 i1w0Var = this.u;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.o.getClass();
        k0w0VarI.h(new WalletsScreen$AddWalletScreen());
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void x(pzu0 pzu0Var) {
        Object value;
        Object value2;
        Object value3;
        pzu0Var.getClass();
        super.x(pzu0Var);
        if (pzu0Var instanceof izu0) {
            P();
            return;
        }
        boolean z = pzu0Var instanceof nzu0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, j0v0.a((j0v0) value3, false, false, false, false, null, null, null, null, null, 0L, true, 1023)));
            N(true);
            return;
        }
        byte b = 0;
        if (!(pzu0Var instanceof jzu0)) {
            yje yjeVar = null;
            if (pzu0Var instanceof gzu0) {
                yzu0 yzu0Var = ((gzu0) pzu0Var).f12200a;
                bby bbyVar = this.M;
                if ((bbyVar == null || !bbyVar.isActive()) && !yzu0Var.d) {
                    this.M = i3t0.K(this, null, new wzu0(1, this, u0v0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), new r72(this, yzu0Var, yjeVar, (byte) 26), 1);
                    return;
                }
                return;
            }
            if (pzu0Var instanceof hzu0) {
                long j = ((hzu0) pzu0Var).f13922a;
                bby bbyVar2 = this.O;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    this.O = i3t0.K(this, null, new wzu0(1, this, u0v0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 2), new uw(this, j, yjeVar, (byte) 5), 1);
                    return;
                }
                return;
            }
            if (pzu0Var instanceof ozu0) {
                long j2 = ((ozu0) pzu0Var).f26116a;
                bby bbyVar3 = this.N;
                if (bbyVar3 == null || !bbyVar3.isActive()) {
                    this.N = i3t0.K(this, null, new wzu0(1, this, u0v0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), new bm8(this, j2, null), 1);
                    return;
                }
                return;
            }
            if (pzu0Var instanceof mzu0) {
                bby bbyVar4 = this.N;
                if (bbyVar4 == null || !bbyVar4.isActive()) {
                    this.N = i3t0.K(this, null, new o0v0(this, b), new am4(this, null), 1);
                    return;
                }
                return;
            }
            if (pzu0Var instanceof lzu0) {
                boolean z2 = ((lzu0) pzu0Var).f20922a;
                bby bbyVar5 = this.O;
                if (bbyVar5 == null || !bbyVar5.isActive()) {
                    this.O = i3t0.K(this, null, new wzu0(1, this, u0v0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 4), new vnn((Object) this, z2, yjeVar, (byte) 10), 1);
                    return;
                }
                return;
            }
            if (pzu0Var instanceof kzu0) {
                BonusAccountUiModel bonusAccountUiModel = ((kzu0) pzu0Var).f19168a;
                bby bbyVar6 = this.M;
                if (bbyVar6 == null || !bbyVar6.isActive()) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value2, j0v0.a((j0v0) value2, true, false, false, false, null, null, null, null, null, 0L, false, 2046)));
                    this.M = i3t0.K(this, null, new wzu0(1, this, u0v0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), new t0v0(this, bonusAccountUiModel, null), 1);
                    return;
                }
                return;
            }
            if (!(pzu0Var instanceof dzu0)) {
                if (pzu0Var instanceof fzu0) {
                    N(false);
                    return;
                } else if (pzu0Var instanceof ezu0) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            boolean zIsEmpty = ((j0v0) D()).e.isEmpty();
            if (((dzu0) pzu0Var).f6959a) {
                N(false);
                return;
            }
            if (zIsEmpty) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, j0v0.a((j0v0) value, false, true, false, false, null, null, null, null, null, 0L, false, 2044)));
            }
            v3c.N(this.L);
            v3c.N(this.M);
            v3c.N(this.N);
            v3c.N(this.O);
            return;
        }
        i1w0 i1w0Var = this.u;
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

    @Override // a.diu0
    public final void v() {
        v3c.N(this.K);
        v3c.N(this.L);
        v3c.N(this.M);
        v3c.N(this.N);
        v3c.N(this.O);
    }
}
