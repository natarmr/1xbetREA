package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.verification.nomapay.impl.navigation.NomaPayWebScreens$NomaPayFragmentScreen;
import org.xplatform.verification.options.impl.navigation.VerificationOptionsScreens$VerificationOptionsFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class abu0 extends w46 {
    public static final List E = q3d.j(cau0.d, cau0.e);
    public final ol60 A;
    public boolean B;
    public final ra10 C;
    public final ra10 D;
    public final i1w0 b;
    public final vzg0 c;
    public final ctf0 d;
    public final mne e;
    public final l9u0 f;
    public final m1e g;
    public final r9u h;
    public final rou i;
    public final woc j;
    public final r990 k;
    public final v88 l;
    public final v6k m;
    public final ok50 n;
    public final ljf0 o;
    public final xuz p;
    public final sff0 q;
    public final v8d r;
    public final boolean s;
    public final p7m0 t;
    public bby u;
    public bby v;
    public c4m0 w;
    public c4m0 x;
    public bby y;
    public final p7m0 z;

    public abu0(i1w0 i1w0Var, vzg0 vzg0Var, ctf0 ctf0Var, mne mneVar, l9u0 l9u0Var, m1e m1eVar, r9u r9uVar, rou rouVar, woc wocVar, r990 r990Var, v88 v88Var, v6k v6kVar, ok50 ok50Var, ljf0 ljf0Var, xuz xuzVar, bzt bztVar, sa10 sa10Var, pru pruVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        this.b = i1w0Var;
        this.c = vzg0Var;
        this.d = ctf0Var;
        this.e = mneVar;
        this.f = l9u0Var;
        this.g = m1eVar;
        this.h = r9uVar;
        this.i = rouVar;
        this.j = wocVar;
        this.k = r990Var;
        this.l = v88Var;
        this.m = v6kVar;
        this.n = ok50Var;
        this.o = ljf0Var;
        this.p = xuzVar;
        sff0 sff0VarA = pruVar.a();
        this.q = sff0VarA;
        this.r = bztVar.f3488a.a();
        this.s = sff0VarA.u0;
        this.t = q7m0.a(cau0.b);
        this.z = q7m0.a(tau0.f33632a);
        this.A = new ol60(1, i99.b);
        pb10 pb10Var = pb10.g;
        this.C = sa10.b(sa10Var, pb10Var, R.string.data_retrieval_error, R.string.refresh_data, new avs0(0, this, abu0.class, "onRefreshData", "onRefreshData()V", 0, (byte) 5), 16);
        this.D = sa10.b(sa10Var, pb10Var, R.string.no_connection_title, 0, null, 28);
    }

    public final void A() {
        bby bbyVar;
        boolean z = this.q.u0;
        p7m0 p7m0Var = this.t;
        byte b = 0;
        boolean z2 = p7m0Var.getValue() != cau0.h;
        if (z && z2) {
            p7m0 p7m0Var2 = this.z;
            p7m0Var2.getClass();
            yje yjeVar = null;
            p7m0Var2.o(null, tau0.f33632a);
            bby bbyVar2 = this.y;
            if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.y) != null) {
                bbyVar.cancel(null);
            }
            this.y = sac.V(jiu0.a(this), new d4u0((byte) 5), null, this.e.f22085a, new yau0(this, yjeVar, b), 10);
            return;
        }
        if (p7m0Var.getValue() == cau0.f) {
            return;
        }
        i1w0 i1w0Var = this.b;
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
    }

    public final void B() {
        bby bbyVar;
        p7m0 p7m0Var = this.z;
        p7m0Var.getClass();
        yje yjeVar = null;
        p7m0Var.o(null, tau0.f33632a);
        bby bbyVar2 = this.u;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.u) != null) {
            bbyVar.cancel(null);
        }
        this.u = sac.V(jiu0.a(this), new oau0(this, (byte) 1), null, this.e.f22085a, new wbl0(this, yjeVar, (byte) 16), 10);
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.u;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.v;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        c4m0 c4m0Var = this.w;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar3 = this.y;
        if (bbyVar3 != null) {
            bbyVar3.cancel(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(boolean z, zje zjeVar) {
        xau0 xau0Var;
        long jL;
        if (zjeVar instanceof xau0) {
            xau0Var = (xau0) zjeVar;
            int i = xau0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xau0Var.k = i - Integer.MIN_VALUE;
            } else {
                xau0Var = new xau0(this, zjeVar);
            }
        } else {
            xau0Var = new xau0(this, zjeVar);
        }
        Object objA = xau0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xau0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            xau0Var.k = 1;
            objA = this.i.a(z, xau0Var);
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
        if (z2 && !z3 && this.q.M1) {
            ygp ygpVar = ygp.i;
            r9u r9uVar = this.h;
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
            boolean z5 = this.r.p == lxw.b;
            boolean z6 = cau0Var == cau0.h;
            boolean z7 = m2c0Var.P;
            boolean z8 = ((jau0) ((nmt0) this.n.f25390a).f23789a).f16208a;
            if (z5 && z6 && !z7 && z4 && !z8 && zD) {
                this.A.f(pau0.f26673a);
                ((jau0) ((nmt0) this.o.f20148a).f23789a).f16208a = true;
            }
        }
        return objA;
    }

    public final void x(boolean z) {
        i1w0 i1w0Var = this.b;
        if (z) {
            i1w0Var.d(new oau0(this, (byte) 0));
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                this.l.a(i1w0Var, true, 0L);
                return;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    public final void y(boolean z) {
        lxw lxwVar = this.r.p;
        lxw lxwVar2 = lxw.b;
        i1w0 i1w0Var = this.b;
        p7m0 p7m0Var = this.t;
        if (lxwVar == lxwVar2) {
            switch (((cau0) p7m0Var.getValue()).ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 8:
                    this.c.e("DELAY_USER_DATA_UPDATE_KEY", Boolean.TRUE);
                    i1w0Var.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0Var);
                    this.p.getClass();
                    k0w0Var.h(new NomaPayWebScreens$NomaPayFragmentScreen());
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                        break;
                    }
                    break;
                case 6:
                    x(z);
                    break;
            }
            return;
        }
        int iOrdinal = ((cau0) p7m0Var.getValue()).ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 5) {
            if (iOrdinal == 6) {
                x(z);
                return;
            } else if (iOrdinal != 7 && iOrdinal != 8) {
                return;
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        svs0 svs0Var = mbu0.b;
        FragmentScreen verificationOptionsScreens$VerificationOptionsFragmentScreen = new VerificationOptionsScreens$VerificationOptionsFragmentScreen(-1, this.f.f19674a);
        if (verificationOptionsScreens$VerificationOptionsFragmentScreen instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) verificationOptionsScreens$VerificationOptionsFragmentScreen)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(verificationOptionsScreens$VerificationOptionsFragmentScreen)));
        }
        ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar2 = (paw) listIteratorO2;
            if (!pawVar2.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar2.next());
            }
        }
    }

    public final void z(ra10 ra10Var) {
        v();
        vau0 vau0Var = new vau0(ra10Var);
        p7m0 p7m0Var = this.z;
        p7m0Var.getClass();
        p7m0Var.o(null, vau0Var);
    }
}
