package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class g1i0 extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final b4j A;
    public final x20 B;
    public bby C;
    public c4m0 D;
    public bby E;
    public boolean F;
    public final oeg0 o;
    public final duj p;
    public final gle0 q;
    public final mne r;
    public final ctf0 s;
    public final m1e t;
    public final ort u;
    public final cyh v;
    public final z4w0 w;
    public final rou x;
    public final ftb y;
    public final rou z;

    public g1i0(oeg0 oeg0Var, duj dujVar, gle0 gle0Var, mne mneVar, ctf0 ctf0Var, m1e m1eVar, ort ortVar, cyh cyhVar, z4w0 z4w0Var, rou rouVar, pru pruVar, ftb ftbVar, rou rouVar2, b4j b4jVar, x20 x20Var, bzt bztVar) {
        oeg0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        p2e0 p2e0Var = new p2e0(pruVar, (byte) 4);
        a8f0 a8f0Var = new a8f0(bztVar, ctf0Var);
        rwj rwjVar = mneVar.f22085a;
        super(null, p2e0Var, a8f0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = oeg0Var;
        this.p = dujVar;
        this.q = gle0Var;
        this.r = mneVar;
        this.s = ctf0Var;
        this.t = m1eVar;
        this.u = ortVar;
        this.v = cyhVar;
        this.w = z4w0Var;
        this.x = rouVar;
        this.y = ftbVar;
        this.z = rouVar2;
        this.A = b4jVar;
        this.B = x20Var;
        this.F = true;
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.E;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, s0i0.a((s0i0) value, null, null, null, true, false, 15)));
        this.E = sac.V(jiu0.a(this), new nxh0(1, this, g1i0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), new c1i0(this, (byte) 1), this.r.b, new e1i0(this, null, (byte) 0), 8);
    }

    public final void N(Throwable th) {
        Object value;
        G(new a1i0(this.s.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0))));
        if (((s0i0) D()).b == null) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, s0i0.a((s0i0) value, null, null, null, false, true, 15)));
        }
        this.p.b(th, new d1i0((byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        k0i0 k0i0Var = (k0i0) obj;
        k0i0Var.getClass();
        boolean z = k0i0Var instanceof i0i0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        x20 x20Var = this.B;
        b4j b4jVar = this.A;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (z) {
            for (Object obj3 : y0b.f) {
                if (((y0b) obj3).f41797a == ((i0i0) k0i0Var).f13950a) {
                    obj2 = obj3;
                    break;
                }
            }
            y0b y0bVar = (y0b) obj2;
            if (y0bVar != null) {
                byte b = y0bVar.f41797a;
                if (y0bVar != ((s0i0) D()).c) {
                    b1j.w("promo_id", Integer.valueOf(b), b4jVar.f1961a, "promo_cashback_activate");
                    b1j.r(b, x20Var.f40143a, 3320L);
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, s0i0.a((s0i0) value2, null, null, y0bVar, false, false, 55)));
                    G(y0i0.f41807a);
                    return;
                }
                return;
            }
            return;
        }
        boolean z2 = k0i0Var instanceof e0i0;
        oeg0 oeg0Var = this.o;
        if (z2) {
            i8i.D("point", ParameterNames.INFO, b4jVar.f1961a, "promo_cashback_rules_call");
            x20Var.f40143a.a(cui0.b(new j1p(ParameterNames.INFO, (byte) 0)), 3319L);
            oeg0Var.c().d(new gwg0((Object) this, (byte) 23));
            return;
        }
        boolean z3 = k0i0Var instanceof j0i0;
        mne mneVar = this.r;
        if (z3) {
            bby bbyVar = this.C;
            if (bbyVar == null || !bbyVar.isActive()) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, s0i0.a((s0i0) value, null, null, null, true, false, 15)));
                bvc bvcVarA = jiu0.a(this);
                nxh0 nxh0Var = new nxh0(1, this, g1i0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9);
                dvj dvjVar = mneVar.b;
                this.C = sac.V(bvcVarA, nxh0Var, new c1i0(this, (byte) 0), dvjVar, new kpb0(this, objArr2 == true ? 1 : 0, (byte) 11), 8);
                return;
            }
            return;
        }
        if (!(k0i0Var instanceof c0i0)) {
            if (k0i0Var instanceof h0i0) {
                M();
                return;
            }
            if (k0i0Var instanceof a0i0) {
                v3c.N(this.C);
                return;
            }
            if (k0i0Var instanceof b0i0) {
                this.w.a(((b0i0) k0i0Var).f1766a);
                return;
            }
            if (k0i0Var instanceof d0i0) {
                E();
                return;
            }
            if (!(k0i0Var instanceof f0i0)) {
                if (k0i0Var instanceof g0i0) {
                    v3c.N(this.D);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            c4m0 c4m0Var = this.D;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.D = sac.T(new fnq(this.t.b(), new e1i0(this, objArr == true ? 1 : 0, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), f1i0.h);
                return;
            }
            return;
        }
        i1w0 i1w0VarC = oeg0Var.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }
}
