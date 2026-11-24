package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ota0 extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final n4u o;
    public final drc p;
    public final duj q;
    public final mne r;
    public bby s;

    public ota0(n4u n4uVar, ocl oclVar, drc drcVar, xfu xfuVar, duj dujVar, mne mneVar) {
        super(null, new ssa0(xfuVar, (byte) 1), new yar(oclVar, (byte) 10), cvm0.p(mneVar.c, mneVar.f22085a), null);
        this.o = n4uVar;
        this.p = drcVar;
        this.q = dujVar;
        this.r = mneVar;
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.s;
        if (bbyVar == null || !bbyVar.isActive()) {
            List list = ((hua0) D()).f13671a;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((yv20) it.next()).c));
            }
            yje yjeVar = null;
            if (!arrayList.isEmpty()) {
                this.s = sac.V(jiu0.a(this), new yr80(this, (byte) 17), null, this.r.b, new o690((Object) this, (Object) arrayList, yjeVar, (byte) 9), 10);
            } else {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, hua0.a((hua0) value, null, true, 5)));
            }
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        yqa0 yqa0Var = (yqa0) obj;
        yqa0Var.getClass();
        if (yqa0Var.equals(dqa0.f6505a)) {
            ((xv20) this.p.f6553a.f23980a).f41537a.n(null);
        } else if (yqa0Var.equals(lqa0.f20478a)) {
            M();
        } else {
            t9f.b();
        }
    }
}
