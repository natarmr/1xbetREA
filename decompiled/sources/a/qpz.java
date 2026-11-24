package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.limits_ee.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class qpz extends i3t0 {
    public static final /* synthetic */ int s = 0;
    public final ssi0 o;
    public final mne p;
    public final i1w0 q;
    public final duj r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpz(ssi0 ssi0Var, mne mneVar, i1w0 i1w0Var, duj dujVar, etu etuVar) {
        Object value;
        super(null, new pcy((byte) 24), new z8z((byte) 16), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ssi0Var.getClass();
        etuVar.getClass();
        this.o = ssi0Var;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = dujVar;
        piq0 piq0Var = (piq0) dvz.f6769a.c;
        piq0Var = piq0Var == null ? new piq0(LimitGroupEnum.b, kiq0.f18349a, 0L, "", 0L, false, false, false, mrz.d, iun.f15405a, false) : piq0Var;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, opz.a((opz) value, piq0Var, null, false, 6)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        v95 v95Var;
        epz epzVar = (epz) obj;
        epzVar.getClass();
        if (epzVar.equals(zoz.f44737a)) {
            if (((opz) D()).c) {
                return;
            }
            G(kpz.f18697a);
            return;
        }
        if (epzVar.equals(yoz.f43007a)) {
            G(lpz.f20462a);
            return;
        }
        yje yjeVar = null;
        if (epzVar instanceof dpz) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                v95Var = ((dpz) epzVar).f6489a;
            } while (!p7m0Var.m(value, opz.a((opz) value, null, new x85(v95Var.f37017a, v95Var.b, v95Var.c), false, 5)));
            return;
        }
        if (epzVar.equals(xoz.f41244a)) {
            E();
            return;
        }
        if (epzVar.equals(apz.f1273a)) {
            sac.V(jiu0.a(this), new ebz(this, (byte) 17), new rcz(this, (byte) 8), this.p.b, new e3p(this, yjeVar, (byte) 11), 8);
            return;
        }
        boolean zEquals = epzVar.equals(bpz.f3006a);
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
            if (!epzVar.equals(cpz.f4772a)) {
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
