package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class jif0 extends i3t0 {
    public final cu o;
    public final gxu p;
    public final krc q;
    public final mne r;
    public final i1w0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jif0(vzg0 vzg0Var, cu cuVar, gxu gxuVar, krc krcVar, mne mneVar, i1w0 i1w0Var, ctf0 ctf0Var, krc krcVar2) {
        super(null, new tie0(krcVar2, (byte) 17), new iv80(ctf0Var, (byte) 25), cvm0.p(mneVar.c, mneVar.f22085a), null);
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.o = cuVar;
        this.p = gxuVar;
        this.q = krcVar;
        this.r = mneVar;
        this.s = i1w0Var;
    }

    public final void M(String str) {
        Object value;
        byte b;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            b = 1;
        } while (!p7m0Var.m(value, gif0.a((gif0) value, str, false, false, 1)));
        if (str.length() == 4) {
            sac.V(jiu0.a(this), new bue0((byte) 20), null, this.r.c, new iif0(this, null, b), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        xhf0 xhf0Var = (xhf0) obj;
        xhf0Var.getClass();
        super.x(xhf0Var);
        if (xhf0Var instanceof thf0) {
            thf0 thf0Var = (thf0) xhf0Var;
            if (!thf0Var.equals(shf0.f32209a)) {
                if (thf0Var.equals(rhf0.f30488a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, gif0.a((gif0) value, null, false, false, 7)));
            return;
        }
        if (!(xhf0Var instanceof whf0)) {
            t9f.b();
            return;
        }
        whf0 whf0Var = (whf0) xhf0Var;
        if (!whf0Var.equals(uhf0.f35675a)) {
            if (!(whf0Var instanceof vhf0)) {
                t9f.b();
                return;
            }
            vhf0 vhf0Var = (vhf0) whf0Var;
            au90 au90Var = vhf0Var.b;
            boolean z = au90Var instanceof xt90;
            String str = vhf0Var.f37427a;
            if (!z) {
                M(ttm0.H(1, str));
                return;
            }
            M(str + ((xt90) au90Var).f41455a);
            return;
        }
        i1w0 i1w0Var = this.s;
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
