package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class u3a0 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final String o;
    public final vzg0 p;
    public final ivn q;
    public final i1w0 r;
    public final duj s;
    public bby t;

    public u3a0(m1e m1eVar, mne mneVar, duj dujVar, ocl oclVar, ivn ivnVar, ctf0 ctf0Var, vzg0 vzg0Var, i1w0 i1w0Var, String str) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wg2 wg2Var = new wg2(vzg0Var, (byte) 7);
        cz czVar = new cz(oclVar, ctf0Var, (byte) 25);
        dvj dvjVar = mneVar.b;
        super(null, wg2Var, czVar, cvm0.p(dvjVar, dvjVar), null);
        this.o = str;
        this.p = vzg0Var;
        this.q = ivnVar;
        this.r = i1w0Var;
        this.s = dujVar;
        yje yjeVar = null;
        sac.T(new fnq(m1eVar.b(), new c670(this, yjeVar, (byte) 13), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new s980(this, yjeVar, (byte) 16));
        M();
    }

    public final void M() {
        bby bbyVar = this.t;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.t = i3t0.K(this, null, new yi90(1, this, u3a0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), new epp(this, null, (byte) 22), 1);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        int i;
        Object value2;
        Object value3;
        g3a0 g3a0Var = (g3a0) obj;
        g3a0Var.getClass();
        super.x(g3a0Var);
        if (g3a0Var instanceof c3a0) {
            i1w0 i1w0Var = this.r;
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
            if (g3a0Var instanceof e3a0) {
                M();
                return;
            }
            boolean z = g3a0Var instanceof d3a0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            vzg0 vzg0Var = this.p;
            if (z) {
                int i2 = ((d3a0) g3a0Var).f5394a;
                vzg0Var.e("KEY_MAIN_TAB", Integer.valueOf(i2));
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, n3a0.a((n3a0) value3, null, i2, 0, 0, false, false, 61)));
                return;
            }
            if (!(g3a0Var instanceof f3a0)) {
                t9f.b();
                return;
            }
            int i3 = ((f3a0) g3a0Var).f8852a;
            Integer num = (Integer) vzg0Var.a("KEY_MAIN_TAB");
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 0) {
                int i4 = i3;
                vzg0Var.e("KEY_SUB_TAB_LEFT", Integer.valueOf(i4));
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                    i = i4;
                    i4 = i;
                } while (!p7m0Var2.m(value, n3a0.a((n3a0) value, null, 0, i, 0, false, false, 59)));
                return;
            }
            if (iIntValue != 1) {
                vzg0Var.e("KEY_SUB_TAB_LEFT", 0);
                vzg0Var.e("KEY_SUB_TAB_RIGHT", 0);
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, n3a0.a((n3a0) value2, null, 0, 0, 0, false, false, 51)));
                return;
            }
            vzg0Var.e("KEY_SUB_TAB_RIGHT", Integer.valueOf(i3));
            p7m0 p7m0Var4 = ocjVar.f25029a;
            while (true) {
                Object value4 = p7m0Var4.getValue();
                value4.getClass();
                oyg0Var.getClass();
                int i5 = i3;
                if (p7m0Var4.m(value4, n3a0.a((n3a0) value4, null, 0, 0, i5, false, false, 55))) {
                    return;
                } else {
                    i3 = i5;
                }
            }
        }
    }
}
