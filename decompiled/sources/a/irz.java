package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.limits_africa.impl.presentation.LimitsAfricaScreens$LimitsAfricaFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class irz extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final vsi0 o;
    public final mne p;
    public final i1w0 q;
    public final duj r;
    public final htu s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irz(vsi0 vsi0Var, mne mneVar, i1w0 i1w0Var, duj dujVar, htu htuVar, bzt bztVar) {
        super(null, new pcy((byte) 29), new ce0(bztVar, (byte) 3), cvm0.p(mneVar.c, mneVar.f22085a), null);
        vsi0Var.getClass();
        htuVar.getClass();
        this.o = vsi0Var;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = dujVar;
        this.s = htuVar;
        sac.V(jiu0.a(this), new grz(this, (byte) 0), null, mneVar.b, new slx(this, null, (byte) 11), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        m85 m85Var;
        tqz tqzVar = (tqz) obj;
        tqzVar.getClass();
        boolean zEquals = tqzVar.equals(oqz.f25711a);
        i1w0 i1w0Var = this.q;
        if (zEquals) {
            if (((erz) D()).c) {
                return;
            }
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
            if (tqzVar.equals(nqz.f23977a)) {
                G(brz.f3102a);
                return;
            }
            boolean z = tqzVar instanceof qqz;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    m85Var = ((qqz) tqzVar).f29184a;
                } while (!p7m0Var.m(value2, erz.a((erz) value2, null, new d7i0(m85Var.f21353a, m85Var.b), false, false, 13)));
                return;
            }
            if (tqzVar.equals(mqz.f22244a)) {
                E();
                return;
            }
            boolean z2 = tqzVar instanceof pqz;
            yje yjeVar = null;
            mne mneVar = this.p;
            if (z2) {
                pqz pqzVar = (pqz) tqzVar;
                int i = pqzVar.f27439a;
                String str = pqzVar.b;
                sac.V(jiu0.a(this), new grz(this, (byte) 1), new rcz(this, (byte) 10), mneVar.b, new gc1((Object) this, i, (Object) str, yjeVar, (byte) 10), 8);
                return;
            }
            if (!tqzVar.equals(rqz.f30955a)) {
                if (!tqzVar.equals(sqz.f32651a)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, erz.a((erz) value, null, null, true, false, 11)));
                sac.V(jiu0.a(this), new grz(this, (byte) 0), null, mneVar.b, new slx(this, yjeVar, (byte) 11), 10);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new q0w0(new LimitsAfricaScreens$LimitsAfricaFragmentScreen())), i1w0Var, copyOnWriteArrayListQ2, 0);
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
