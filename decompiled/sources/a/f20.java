package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.verification.nomapay.impl.navigation.NomaPayWebScreens$NomaPayFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class f20 extends w46 {
    public static final List F = q3d.j(cau0.d, cau0.e);
    public final p7m0 A;
    public final ol60 B;
    public boolean C;
    public final ra10 D;
    public final ra10 E;
    public final int b;
    public final i1w0 c;
    public final vzg0 d;
    public final ctf0 e;
    public final mne f;
    public final m1e g;
    public final l9u0 h;
    public final r46 i;
    public final ljf0 j;
    public final j9i k;
    public final y2m0 l;
    public final xuz m;
    public final xb5 n;
    public final rou o;
    public final r9u p;
    public final ok50 q;
    public final ljf0 r;
    public final v8d s;
    public final sff0 t;
    public final p7m0 u;
    public final boolean v;
    public bby w;
    public bby x;
    public c4m0 y;
    public c4m0 z;

    public f20(int i, i1w0 i1w0Var, vzg0 vzg0Var, ctf0 ctf0Var, mne mneVar, m1e m1eVar, l9u0 l9u0Var, r46 r46Var, ljf0 ljf0Var, j9i j9iVar, y2m0 y2m0Var, xuz xuzVar, xb5 xb5Var, rou rouVar, r9u r9uVar, ok50 ok50Var, ljf0 ljf0Var2, bzt bztVar, sa10 sa10Var, pru pruVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = i;
        this.c = i1w0Var;
        this.d = vzg0Var;
        this.e = ctf0Var;
        this.f = mneVar;
        this.g = m1eVar;
        this.h = l9u0Var;
        this.i = r46Var;
        this.j = ljf0Var;
        this.k = j9iVar;
        this.l = y2m0Var;
        this.m = xuzVar;
        this.n = xb5Var;
        this.o = rouVar;
        this.p = r9uVar;
        this.q = ok50Var;
        this.r = ljf0Var2;
        v8d v8dVarA = bztVar.f3488a.a();
        this.s = v8dVarA;
        this.t = pruVar.a();
        this.u = q7m0.a(cau0.b);
        this.v = v8dVarA.p == lxw.b;
        this.A = q7m0.a(z10.f43594a);
        this.B = new ol60(1, i99.b);
        pb10 pb10Var = pb10.g;
        this.D = sa10.b(sa10Var, pb10Var, R.string.data_retrieval_error, R.string.refresh_data, new f8(0, this, f20.class, "onRefreshData", "onRefreshData()V", 0, (byte) 5), 16);
        this.E = sa10.b(sa10Var, pb10Var, R.string.no_connection_title, 0, null, 28);
    }

    public final void A() {
        bby bbyVar;
        p7m0 p7m0Var = this.A;
        p7m0Var.getClass();
        yje yjeVar = null;
        p7m0Var.o(null, z10.f43594a);
        bby bbyVar2 = this.w;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.w) != null) {
            bbyVar.cancel(null);
        }
        this.w = sac.V(jiu0.a(this), new u10(this, (byte) 0), null, this.f.f22085a, new oa((Object) this, yjeVar, (byte) 3), 10);
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.w;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.x;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        c4m0 c4m0Var = this.y;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum w(boolean z, zje zjeVar) {
        d20 d20Var;
        long jL;
        if (zjeVar instanceof d20) {
            d20Var = (d20) zjeVar;
            int i = d20Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d20Var.k = i - Integer.MIN_VALUE;
            } else {
                d20Var = new d20(this, zjeVar);
            }
        } else {
            d20Var = new d20(this, zjeVar);
        }
        Object objA = d20Var.i;
        wne wneVar = wne.f39444a;
        int i2 = d20Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            d20Var.k = 1;
            objA = this.o.a(z, d20Var);
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
        if (z2 && !z3 && this.t.M1) {
            ygp ygpVar = ygp.i;
            r9u r9uVar = this.p;
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
            boolean z5 = this.s.p == lxw.b;
            boolean z6 = cau0Var == cau0.h;
            boolean z7 = m2c0Var.P;
            boolean z8 = ((jau0) ((nmt0) this.q.f25390a).f23789a).f16208a;
            if (z5 && z6 && !z7 && z4 && !z8 && zD) {
                this.B.f(v10.f36605a);
                ((jau0) ((nmt0) this.r.f20148a).f23789a).f16208a = true;
            }
        }
        return cau0Var;
    }

    public final void x() {
        byte b = 0;
        if (this.u.getValue() == cau0.h) {
            sac.V(jiu0.a(this), new b5((byte) 10), null, this.f.f22085a, new e20(this, null, b), 10);
        } else {
            if (!this.v) {
                return;
            }
            this.d.e("DELAY_USER_DATA_UPDATE_KEY", Boolean.TRUE);
            i1w0 i1w0Var = this.c;
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            this.m.getClass();
            k0w0VarI.h(new NomaPayWebScreens$NomaPayFragmentScreen());
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
    }

    public final void y(ra10 ra10Var) {
        v();
        b20 b20Var = new b20(ra10Var);
        p7m0 p7m0Var = this.A;
        p7m0Var.getClass();
        p7m0Var.o(null, b20Var);
    }

    public final void z() {
        int iOrdinal = ((cau0) this.u.getValue()).ordinal();
        if (iOrdinal == 4) {
            return;
        }
        i1w0 i1w0Var = this.c;
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
    }
}
