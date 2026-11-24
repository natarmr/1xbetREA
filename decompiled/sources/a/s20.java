package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.xplatform.verification.nomapay.impl.navigation.NomaPayWebScreens$NomaPayFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class s20 extends i3t0 {
    public static final List J = q3d.j(cau0.d, cau0.e);
    public final r9u A;
    public final ok50 B;
    public final ljf0 C;
    public final i7u0 D;
    public final q7u0 E;
    public final cmt F;
    public bby G;
    public bby H;
    public final c4m0 I;
    public final int o;
    public final vzg0 p;
    public final i1w0 q;
    public final mne r;
    public final l9u0 s;
    public final r46 t;
    public final ljf0 u;
    public final j9i v;
    public final y2m0 w;
    public final xuz x;
    public final xb5 y;
    public final rou z;

    public s20(int i, vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, mne mneVar, m1e m1eVar, l9u0 l9u0Var, r46 r46Var, ljf0 ljf0Var, j9i j9iVar, y2m0 y2m0Var, xuz xuzVar, xb5 xb5Var, rou rouVar, r9u r9uVar, ok50 ok50Var, ljf0 ljf0Var2, g2v g2vVar, i7u0 i7u0Var, q7u0 q7u0Var, cmt cmtVar, bzt bztVar, pru pruVar) {
        c4m0 c4m0Var;
        ctf0Var.getClass();
        m1eVar.getClass();
        n20 n20Var = new n20(pruVar, ctf0Var, bztVar, (byte) 0);
        o20 o20Var = new o20(ctf0Var, g2vVar, (byte) 0);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, n20Var, o20Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = i;
        this.p = vzg0Var;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = l9u0Var;
        this.t = r46Var;
        this.u = ljf0Var;
        this.v = j9iVar;
        this.w = y2m0Var;
        this.x = xuzVar;
        this.y = xb5Var;
        this.z = rouVar;
        this.A = r9uVar;
        this.B = ok50Var;
        this.C = ljf0Var2;
        this.D = i7u0Var;
        this.E = q7u0Var;
        this.F = cmtVar;
        c4m0 c4m0Var2 = this.I;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.I) != null) {
            c4m0Var.cancel(null);
        }
        this.I = sac.T(new fnq(m1eVar.b(), new q20(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), r20.h);
        N();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum M(boolean z, zje zjeVar) {
        p20 p20Var;
        long jL;
        if (zjeVar instanceof p20) {
            p20Var = (p20) zjeVar;
            int i = p20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                p20Var.k = i - Integer.MIN_VALUE;
            } else {
                p20Var = new p20(this, zjeVar);
            }
        } else {
            p20Var = new p20(this, zjeVar);
        }
        Object objA = p20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = p20Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            p20Var.k = 1;
            objA = this.z.a(z, p20Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        m2c0 m2c0Var = (m2c0) objA;
        jqt0 jqt0Var = m2c0Var.k;
        cau0 cau0Var = m2c0Var.e0;
        boolean z2 = jqt0Var == jqt0.e || jqt0Var == jqt0.d;
        boolean z3 = cau0Var == cau0.f || m2c0Var.s0;
        if (z2 && !z3 && ((k20) D()).f) {
            ygp ygpVar = ygp.i;
            r9u r9uVar = this.A;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            boolean zD = j1q0Var.f15748a.d(ygpVar);
            Long lT0 = StringsKt.t0(m2c0Var.j);
            if (lT0 != null) {
                long jLongValue = lT0.longValue();
                uen uenVar = wen.b;
                jL = wen.l(ibc.w0(System.currentTimeMillis() - wen.e(ibc.w0(jLongValue, bfn.SECONDS)), bfn.MILLISECONDS), bfn.DAYS);
            } else {
                jL = Long.MAX_VALUE;
            }
            boolean z4 = jL <= 90;
            boolean z5 = ((k20) D()).e == lxw.b;
            boolean z6 = cau0Var == cau0.h;
            boolean z7 = m2c0Var.P;
            boolean z8 = ((jau0) ((nmt0) this.B.f25390a).f23789a).f16208a;
            if (z5 && z6 && !z7 && z4 && !z8 && zD) {
                G(h20.f12309a);
                ((jau0) ((nmt0) this.C.f20148a).f23789a).f16208a = true;
            }
        }
        return cau0Var;
    }

    public final void N() {
        Object value;
        yje yjeVar;
        bby bbyVar;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            yjeVar = null;
        } while (!p7m0Var.m(value, k20.a((k20) value, null, e10.f7015a, 59)));
        bby bbyVar2 = this.G;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.G) != null) {
            bbyVar.cancel(null);
        }
        this.G = sac.V(jiu0.a(this), new m20(this, (byte) 0), null, this.r.f22085a, new ya(this, yjeVar, (byte) 2), 10);
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.G;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.H;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        d10 d10Var = (d10) obj;
        d10Var.getClass();
        boolean zEquals = d10Var.equals(z00.f43541a);
        i1w0 i1w0Var = this.q;
        if (zEquals) {
            int iOrdinal = ((k20) D()).b.ordinal();
            if (iOrdinal == 4) {
                return;
            }
            if (iOrdinal != 6) {
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
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            }
        } else {
            if (!d10Var.equals(a10.f45a)) {
                if (d10Var.equals(c10.f3549a)) {
                    N();
                    return;
                } else if (d10Var.equals(b10.f1784a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            cau0 cau0Var = ((k20) D()).b;
            cau0 cau0Var2 = cau0.h;
            i7u0 i7u0Var = this.D;
            q7u0 q7u0Var = this.E;
            if (cau0Var == cau0Var2) {
                q7u0Var.a(this.F.g());
                i7u0Var.f14311a.a("deposit_call", wp20.b(new Pair("screen", "verification")));
                sac.V(jiu0.a(this), new b5((byte) 11), null, this.r.f22085a, new wa(this, null, (byte) 2), 10);
                return;
            }
            if (((k20) D()).e != lxw.b) {
                return;
            }
            i7u0Var.f14311a.c("verification_call");
            q7u0Var.f28268a.a(xun.f41520a, 12381L);
            this.p.e("DELAY_USER_DATA_UPDATE_KEY", Boolean.TRUE);
            i1w0Var.getClass();
            k0w0 k0w0Var = new k0w0(i1w0Var);
            this.x.getClass();
            k0w0Var.h(new NomaPayWebScreens$NomaPayFragmentScreen());
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorO;
                if (!pawVar3.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar3.next());
                }
            }
        }
    }
}
