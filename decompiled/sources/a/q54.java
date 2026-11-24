package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.authorization.model.AuthType;

/* JADX INFO: loaded from: classes3.dex */
public final class q54 extends i3t0 {
    public final i1w0 o;
    public final mzt p;
    public final dpc q;

    public q54(vzg0 vzg0Var, i1w0 i1w0Var, mzt mztVar, s9m0 s9m0Var, dpc dpcVar, pru pruVar, bzt bztVar, AuthType authType, mne mneVar) {
        super(vzg0Var, new on((Object) authType, (Object) pruVar, (Object) bztVar, (byte) 16), cvm0.p(mneVar.c, mneVar.f22085a), new or3((byte) 13));
        this.o = i1w0Var;
        this.p = mztVar;
        this.q = dpcVar;
    }

    @Override // a.diu0
    public final void v() {
        this.q.a();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        a54 a54Var = (a54) obj;
        a54Var.getClass();
        super.x(a54Var);
        boolean z = a54Var instanceof y44;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, m54.a((m54) value3, null, false, ((y44) a54Var).f41984a, 0L, 47)));
            return;
        }
        if (!a54Var.equals(x44.f40247a)) {
            if (a54Var.equals(z44.f43751a)) {
                ((us3) this.p.f22668a.b).getClass();
                return;
            }
            if (a54Var.equals(w44.f38527a)) {
                if (((m54) D()).b) {
                    return;
                }
                H(new o33((byte) 10));
                return;
            } else {
                if (!a54Var.equals(v44.f36761a)) {
                    if (a54Var.equals(u44.f35026a)) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                    q7x.F(oyg0Var, Boolean.FALSE, "KEY_ANIMATE_CHANGES");
                } while (!p7m0Var2.m(value, m54.a((m54) value, null, false, false, 0L, 61)));
                return;
            }
        }
        if (!((m54) D()).c) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (((m54) D()).f != -1 && jCurrentTimeMillis - ((m54) D()).f < 2000) {
                G(j54.f15915a);
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, m54.a((m54) value2, null, false, false, jCurrentTimeMillis, 31)));
            G(k54.f17700a);
            return;
        }
        i1w0 i1w0Var = this.o;
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
}
