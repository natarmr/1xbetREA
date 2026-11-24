package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class lqz extends i3t0 {
    public static final /* synthetic */ int s = 0;
    public final tsi0 o;
    public final mne p;
    public final i1w0 q;
    public final duj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqz(tsi0 tsi0Var, mne mneVar, i1w0 i1w0Var, duj dujVar, ftu ftuVar) {
        Object value;
        super(null, new pcy((byte) 26), new z8z((byte) 17), cvm0.p(mneVar.c, mneVar.f22085a), null);
        tsi0Var.getClass();
        ftuVar.getClass();
        this.o = tsi0Var;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = dujVar;
        qiq0 qiq0Var = (qiq0) jyz.f17382a.b;
        qiq0Var = qiq0Var == null ? new qiq0(LimitKenyaGroupEnum.c, liq0.f20118a, 0L, "", 0L, false, false, false, nrz.d, iun.f15405a, false) : qiq0Var;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, jqz.a((jqz) value, qiq0Var, null, false, 6)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        w95 w95Var;
        ypz ypzVar = (ypz) obj;
        ypzVar.getClass();
        if (ypzVar.equals(tpz.f34359a)) {
            if (((jqz) D()).c) {
                return;
            }
            G(fqz.f9998a);
            return;
        }
        if (ypzVar.equals(spz.f32607a)) {
            G(gqz.f11757a);
            return;
        }
        yje yjeVar = null;
        if (ypzVar instanceof xpz) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                w95Var = ((xpz) ypzVar).f41289a;
            } while (!p7m0Var.m(value, jqz.a((jqz) value, null, new y85(w95Var.f38761a, w95Var.b, w95Var.c), false, 5)));
            return;
        }
        if (ypzVar.equals(rpz.f30908a)) {
            E();
            return;
        }
        if (ypzVar.equals(upz.f36092a)) {
            sac.V(jiu0.a(this), new ebz(this, (byte) 18), new rcz(this, (byte) 9), this.p.b, new e3p(this, yjeVar, (byte) 12), 8);
            return;
        }
        boolean zEquals = ypzVar.equals(vpz.f37831a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.q;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!ypzVar.equals(wpz.f39566a)) {
                t9f.b();
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
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
