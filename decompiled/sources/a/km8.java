package a;

import android.javax.sip.message.Response;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class km8 extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public bby A;
    public bby B;
    public bby C;
    public c4m0 D;
    public boolean E;
    public final vzg0 o;
    public final ctf0 p;
    public final bwl q;
    public final z220 r;
    public final m1e s;
    public final mne t;
    public final oeg0 u;
    public final duj v;
    public final g2v w;
    public final bzt x;
    public final clc y;
    public bby z;

    public km8(vzg0 vzg0Var, ctf0 ctf0Var, bwl bwlVar, z220 z220Var, m1e m1eVar, mne mneVar, oeg0 oeg0Var, duj dujVar, g2v g2vVar, pru pruVar, bzt bztVar, clc clcVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        hc0 hc0Var = new hc0(pruVar, (byte) 14);
        ep4 ep4Var = new ep4(ctf0Var, (byte) 5);
        rwj rwjVar = mneVar.f22085a;
        super(null, hc0Var, ep4Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = vzg0Var;
        this.p = ctf0Var;
        this.q = bwlVar;
        this.r = z220Var;
        this.s = m1eVar;
        this.t = mneVar;
        this.u = oeg0Var;
        this.v = dujVar;
        this.w = g2vVar;
        this.x = bztVar;
        this.y = clcVar;
        this.E = true;
        M();
    }

    public final void M() {
        bby bbyVar = this.C;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.C = sac.V(jiu0.a(this), new yl8(this, (byte) 2), null, this.t.f22085a, new am8(this, null, (byte) 0), 10);
        }
    }

    public final void N(Function0 function0) {
        bby bbyVar = this.B;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.B = sac.V(jiu0.a(this), new yl8(this, (byte) 3), new tq(function0, (byte) 25), this.t.b, new am8(this, null, b), 8);
        }
    }

    public final void O(Throwable th) {
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        int i = this.x.f3488a.a().r;
        xuzVar.getClass();
        mdm mdmVar = new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            mdm mdmVar2 = mdmVar;
            this.f.getClass();
            if (p7m0Var.m(value, nl8.a((nl8) value, null, 0, false, true, mdmVar2, 35))) {
                this.v.b(th, new i87((byte) 28));
                return;
            }
            mdmVar = mdmVar2;
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Integer num;
        Object value;
        sk8 sk8Var = (sk8) obj;
        sk8Var.getClass();
        super.x(sk8Var);
        boolean z = sk8Var instanceof ok8;
        vzg0 vzg0Var = this.o;
        if (z) {
            int i = ((ok8) sk8Var).f25394a;
            if (((nl8) D()).b != 0) {
                return;
            }
            vzg0Var.e("BONUS_ID_KEY", Integer.valueOf(i));
            G(fl8.f9725a);
            return;
        }
        boolean z2 = sk8Var instanceof nk8;
        yje yjeVar = null;
        mne mneVar = this.t;
        byte b = 1;
        if (z2) {
            int i2 = ((nk8) sk8Var).f23669a;
            bby bbyVar = this.A;
            if ((bbyVar == null || !bbyVar.isActive()) && ((nl8) D()).b == 0) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, nl8.a((nl8) value, null, i2, false, false, null, 61)));
                this.A = sac.V(jiu0.a(this), new yl8(this, b), null, mneVar.b, new gm8(this, i2, yjeVar, b), 10);
                return;
            }
            return;
        }
        byte b2 = 2;
        byte b3 = 0;
        if (sk8Var instanceof pk8) {
            bby bbyVar2 = this.z;
            if ((bbyVar2 == null || !bbyVar2.isActive()) && (num = (Integer) vzg0Var.a("BONUS_ID_KEY")) != null) {
                this.z = sac.V(jiu0.a(this), new yl8(this, b3), null, mneVar.b, new gm8(this, num.intValue(), yjeVar, b2), 10);
                return;
            }
            return;
        }
        if (sk8Var.equals(qk8.f28873a)) {
            c4m0 c4m0Var = this.D;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.D = sac.T(new fnq(this.s.b(), new am8(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new yp6(this, yjeVar, (byte) 16));
                return;
            }
            return;
        }
        if (sk8Var.equals(rk8.f30636a)) {
            v3c.N(this.D);
            return;
        }
        if (!sk8Var.equals(kk8.f18423a)) {
            if (sk8Var.equals(mk8.f21933a)) {
                M();
                return;
            } else if (sk8Var.equals(lk8.f20188a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0VarC = this.u.c();
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
