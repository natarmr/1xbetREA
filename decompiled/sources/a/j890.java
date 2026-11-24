package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.rules.impl.presentation.models.PaymentInfoParams;

/* JADX INFO: loaded from: classes5.dex */
public final class j890 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final PaymentInfoParams o;
    public final bdu p;
    public final mne q;
    public final j1q0 r;
    public final oeg0 s;
    public bby t;
    public bby u;
    public int v;
    public boolean w;

    public j890(PaymentInfoParams paymentInfoParams, bdu bduVar, m1e m1eVar, mne mneVar, j1q0 j1q0Var, oeg0 oeg0Var, ocl oclVar) {
        m1eVar.getClass();
        j1q0Var.getClass();
        oeg0Var.getClass();
        qw80 qw80Var = new qw80((Object) paymentInfoParams, (Object) bduVar, (byte) 6);
        yar yarVar = new yar(oclVar, (byte) 5);
        rwj rwjVar = mneVar.f22085a;
        super(null, qw80Var, yarVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = paymentInfoParams;
        this.p = bduVar;
        this.q = mneVar;
        this.r = j1q0Var;
        this.s = oeg0Var;
        this.w = true;
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(m1eVar.b(), new i890(this, yjeVar, (byte) 0), (byte) 4), new pr60(3, yjeVar, (byte) 16), (byte) 1);
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar2 = mneVar.f22085a;
        sac.T(dnqVar, d5c.S(bvcVarA, rwjVar2), new st20(2, yjeVar, (byte) 13));
        sac.V(jiu0.a(this), new ev80((byte) 15), null, rwjVar2, new h890(this, yjeVar, (byte) 1), 10);
    }

    public final void M(c890 c890Var) {
        if (((d890) D()).e != c890.f3903a && ((d890) D()).e != c890.b) {
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            c890 c890Var2 = c890Var;
            if (p7m0Var.m(value, d890.a((d890) value, null, 0L, c890Var2, false, 47))) {
                return;
            } else {
                c890Var = c890Var2;
            }
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        z390 z390Var = (z390) obj;
        z390Var.getClass();
        super.x(z390Var);
        if (!(z390Var instanceof x390)) {
            boolean z = z390Var instanceof y390;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            mne mneVar = this.q;
            yje yjeVar = null;
            if (z) {
                this.v = 0;
                bby bbyVar = this.u;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                bby bbyVar2 = this.t;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, d890.a((d890) value3, null, 0L, null, false, 31)));
                this.t = sac.V(jiu0.a(this), new ev80((byte) 16), null, mneVar.f22085a, new i890(this, yjeVar, (byte) 2), 10);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var2.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value4, d890.a((d890) value4, null, 0L, c890.f3903a, false, 47)));
                G(z790.f43907a);
                return;
            }
            byte b = 1;
            if (z390Var.equals(v390.f36723a)) {
                bby bbyVar3 = this.u;
                if ((bbyVar3 == null || !bbyVar3.isActive()) && ((d890) D()).e == c890.f3903a) {
                    this.v = 0;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, d890.a((d890) value2, null, 0L, c890.b, false, 47)));
                    return;
                }
                return;
            }
            if (z390Var.equals(u390.f34986a)) {
                M(c890.c);
                return;
            }
            if (z390Var.equals(s390.f31546a)) {
                M(c890.d);
                return;
            }
            if (!z390Var.equals(t390.f33256a)) {
                if (z390Var instanceof w390) {
                    G(new a890(((w390) z390Var).f38491a));
                    return;
                } else if (z390Var.equals(r390.f29776a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            int i = this.v;
            if (i >= 3) {
                this.v = 0;
                M(c890.e);
                return;
            }
            this.v = i + 1;
            bby bbyVar4 = this.u;
            if (bbyVar4 != null) {
                bbyVar4.cancel(null);
            }
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value = p7m0Var4.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value, d890.a((d890) value, null, 0L, c890.f3903a, false, 47)));
            this.u = sac.V(jiu0.a(this), new ev80((byte) 14), null, mneVar.f22085a, new i890(this, yjeVar, b), 10);
            return;
        }
        i1w0 i1w0VarC = this.s.c();
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
