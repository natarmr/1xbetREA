package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.verification.nomapay.impl.navigation.NomaPayWebScreens$NomaPayFragmentScreen;
import org.xplatform.verification.options.impl.navigation.VerificationOptionsScreens$VerificationOptionsFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class lbu0 extends i3t0 {
    public static final List J = q3d.j(cau0.d, cau0.e);
    public final xuz A;
    public final boolean B;
    public final i7u0 C;
    public final q7u0 D;
    public final cmt E;
    public bby F;
    public bby G;
    public final c4m0 H;
    public bby I;
    public final vzg0 o;
    public final i1w0 p;
    public final mne q;
    public final l9u0 r;
    public final r9u s;
    public final rou t;
    public final woc u;
    public final r990 v;
    public final v88 w;
    public final v6k x;
    public final ok50 y;
    public final ljf0 z;

    public lbu0(vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, mne mneVar, l9u0 l9u0Var, m1e m1eVar, r9u r9uVar, rou rouVar, woc wocVar, r990 r990Var, v88 v88Var, v6k v6kVar, ok50 ok50Var, ljf0 ljf0Var, xuz xuzVar, boolean z, g2v g2vVar, i7u0 i7u0Var, q7u0 q7u0Var, cmt cmtVar, bzt bztVar, pru pruVar) {
        c4m0 c4m0Var;
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        n20 n20Var = new n20(pruVar, ctf0Var, bztVar, (byte) 1);
        cls0 cls0Var = new cls0(ctf0Var, g2vVar, (byte) 7);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, n20Var, cls0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = mneVar;
        this.r = l9u0Var;
        this.s = r9uVar;
        this.t = rouVar;
        this.u = wocVar;
        this.v = r990Var;
        this.w = v88Var;
        this.x = v6kVar;
        this.y = ok50Var;
        this.z = ljf0Var;
        this.A = xuzVar;
        this.B = z;
        this.C = i7u0Var;
        this.D = q7u0Var;
        this.E = cmtVar;
        c4m0 c4m0Var2 = this.H;
        yje yjeVar = null;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.H) != null) {
            c4m0Var.cancel(null);
        }
        this.H = sac.T(new fnq(m1eVar.b(), new jbu0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), kbu0.h);
        N();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(boolean z, zje zjeVar) {
        ibu0 ibu0Var;
        long jL;
        if (zjeVar instanceof ibu0) {
            ibu0Var = (ibu0) zjeVar;
            int i = ibu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ibu0Var.k = i - Integer.MIN_VALUE;
            } else {
                ibu0Var = new ibu0(this, zjeVar);
            }
        } else {
            ibu0Var = new ibu0(this, zjeVar);
        }
        Object objA = ibu0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ibu0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ibu0Var.k = 1;
            objA = this.t.a(z, ibu0Var);
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
        if (z2 && !z3 && ((ebu0) D()).f) {
            ygp ygpVar = ygp.i;
            r9u r9uVar = this.s;
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
            boolean z5 = ((ebu0) D()).e == lxw.b;
            boolean z6 = cau0Var == cau0.h;
            boolean z7 = m2c0Var.P;
            boolean z8 = ((jau0) ((nmt0) this.y.f25390a).f23789a).f16208a;
            if (z5 && z6 && !z7 && z4 && !z8 && zD) {
                G(bbu0.f2325a);
                ((jau0) ((nmt0) this.z.f20148a).f23789a).f16208a = true;
            }
        }
        return objA;
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
        } while (!p7m0Var.m(value, ebu0.a((ebu0) value, null, x9u0.f40526a, 59)));
        bby bbyVar2 = this.F;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.F) != null) {
            bbyVar.cancel(null);
        }
        this.F = sac.V(jiu0.a(this), new hbu0(this, (byte) 0), null, this.q.f22085a, new vmq0(this, yjeVar, (byte) 4), 10);
    }

    public final void O() {
        byte b = 1;
        boolean z = this.B;
        i1w0 i1w0Var = this.p;
        if (z) {
            i1w0Var.d(new hbu0(this, b));
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                this.w.a(i1w0Var, true, 0L);
                return;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.F;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.G;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        bby bbyVar3 = this.I;
        if (bbyVar3 != null) {
            bbyVar3.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        yje yjeVar;
        bby bbyVar;
        w9u0 w9u0Var = (w9u0) obj;
        w9u0Var.getClass();
        boolean zEquals = w9u0Var.equals(s9u0.f31865a);
        byte b = 6;
        byte b2 = 0;
        i1w0 i1w0Var = this.p;
        if (zEquals) {
            boolean z = ((ebu0) D()).b != cau0.h;
            if (((ebu0) D()).d && z) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                    yjeVar = null;
                } while (!p7m0Var.m(value, ebu0.a((ebu0) value, null, x9u0.f40526a, 59)));
                bby bbyVar2 = this.I;
                if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.I) != null) {
                    bbyVar.cancel(null);
                }
                this.I = sac.V(jiu0.a(this), new d4u0(b), null, this.q.f22085a, new jbu0(this, yjeVar, b2), 10);
                return;
            }
            if (((ebu0) D()).b == cau0.f) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!w9u0Var.equals(t9u0.f33586a)) {
                if (w9u0Var.equals(v9u0.f37052a)) {
                    N();
                    return;
                } else if (w9u0Var.equals(u9u0.f35300a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            cau0 cau0Var = ((ebu0) D()).b;
            cau0 cau0Var2 = cau0.h;
            i7u0 i7u0Var = this.C;
            q7u0 q7u0Var = this.D;
            if (cau0Var == cau0Var2) {
                q7u0Var.a(this.E.g());
                i8i.D("screen", "verification", i7u0Var.f14311a, "deposit_call");
            } else {
                q7u0Var.f28268a.a(xun.f41520a, 12381L);
                i7u0Var.f14311a.c("verification_call");
            }
            if (((ebu0) D()).e == lxw.b) {
                switch (((ebu0) D()).b.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                        this.o.e("DELAY_USER_DATA_UPDATE_KEY", Boolean.TRUE);
                        i1w0Var.getClass();
                        k0w0 k0w0Var = new k0w0(i1w0Var);
                        this.A.getClass();
                        k0w0Var.h(new NomaPayWebScreens$NomaPayFragmentScreen());
                        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO;
                            if (pawVar2.hasNext()) {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                            break;
                        }
                        break;
                    case 6:
                        O();
                        break;
                }
                return;
            }
            int iOrdinal = ((ebu0) D()).b.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 5) {
                if (iOrdinal == 6) {
                    O();
                    return;
                } else if (iOrdinal != 7 && iOrdinal != 8) {
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            svs0 svs0Var = mbu0.b;
            FragmentScreen verificationOptionsScreens$VerificationOptionsFragmentScreen = new VerificationOptionsScreens$VerificationOptionsFragmentScreen(-1, this.r.f19674a);
            if (verificationOptionsScreens$VerificationOptionsFragmentScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) verificationOptionsScreens$VerificationOptionsFragmentScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(verificationOptionsScreens$VerificationOptionsFragmentScreen)));
            }
            ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorO2;
                if (!pawVar3.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar3.next());
                }
            }
        }
    }
}
