package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class v000 extends i3t0 {
    public final LimitNeGroupEnum o;
    public final bei0 p;
    public final i1w0 q;
    public final mne r;
    public final duj s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v000(LimitNeGroupEnum limitNeGroupEnum, bei0 bei0Var, i1w0 i1w0Var, ctf0 ctf0Var, mne mneVar, duj dujVar) {
        super(null, new mbz(limitNeGroupEnum, ctf0Var, (byte) 7), new z8z((byte) 20), cvm0.p(mneVar.c, mneVar.f22085a), null);
        bei0Var.getClass();
        ctf0Var.getClass();
        this.o = limitNeGroupEnum;
        this.p = bei0Var;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = dujVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        n000 n000Var = (n000) obj;
        n000Var.getClass();
        boolean zEquals = n000Var.equals(k000.f17440a);
        byte b = 25;
        byte b2 = 21;
        yje yjeVar = null;
        mne mneVar = this.r;
        if (zEquals) {
            sac.V(jiu0.a(this), new ebz(this, b2), null, mneVar.b, new u88((Object) this, true, yjeVar, b), 10);
            return;
        }
        boolean z = false;
        if (n000Var.equals(j000.f15660a)) {
            sac.V(jiu0.a(this), new ebz(this, b2), null, mneVar.b, new u88(this, z, yjeVar, b), 10);
        } else {
            if (!n000Var.equals(l000.f19175a)) {
                if (n000Var.equals(m000.f20930a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            i1w0 i1w0Var = this.q;
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
}
