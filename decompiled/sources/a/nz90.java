package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class nz90 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final vzg0 o;
    public final svu p;
    public final String q;
    public final i1w0 r;
    public final mne s;
    public bby t;
    public bby u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz90(vzg0 vzg0Var, svu svuVar, m1e m1eVar, String str, i1w0 i1w0Var, ocl oclVar, mne mneVar) {
        super(null, new wm90((byte) 13), new yar(oclVar, (byte) 7), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        this.o = vzg0Var;
        this.p = svuVar;
        this.q = str;
        this.r = i1w0Var;
        this.s = mneVar;
        sac.T(new fnq(m1eVar.b(), new mz90(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
    }

    public final void M() {
        bby bbyVar = this.u;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.u = sac.V(jiu0.a(this), new lz90(this, (byte) 0), null, this.s.b, new mz90(this, null, b), 10);
        }
    }

    public final void N() {
        boolean z = ((x48) D()).d.size() >= 2;
        bby bbyVar = this.t;
        if ((bbyVar == null || !bbyVar.isActive()) && z) {
            this.t = sac.d0(jiu0.a(this), nz90.class.getSimpleName(), 4L, 4L, null, 0L, null, new lz90(this, (byte) 1), new z210(this, null, (byte) 29), 120);
        }
    }

    @Override // a.diu0
    public final void v() {
        bby bbyVar = this.t;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        k48 k48Var = (k48) obj;
        k48Var.getClass();
        if (!k48Var.equals(f48.f8900a)) {
            if (k48Var.equals(h48.f12421a)) {
                M();
                return;
            }
            if (k48Var.equals(i48.f14134a)) {
                N();
                return;
            }
            if (k48Var.equals(j48.f15871a)) {
                bby bbyVar = this.t;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                    return;
                }
                return;
            }
            if (!(k48Var instanceof g48)) {
                t9f.b();
                return;
            }
            int i = ((g48) k48Var).f10651a;
            this.o.e("KEY_CURRENT_PHOTO", Integer.valueOf(i));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, x48.a((x48) value, false, false, false, i, 31)));
            return;
        }
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
    }
}
