package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class vcv0 extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public c4m0 A;
    public final int o;
    public final i1w0 p;
    public final duj q;
    public final uvu r;
    public final pwi s;
    public final m1e t;
    public final jqt u;
    public final do20 v;
    public final yiu w;
    public final pru x;
    public bby y;
    public c4m0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcv0(vzg0 vzg0Var, int i, i1w0 i1w0Var, mne mneVar, duj dujVar, ctf0 ctf0Var, uvu uvuVar, pwi pwiVar, iqt iqtVar, m1e m1eVar, jqt jqtVar, do20 do20Var, yiu yiuVar, pru pruVar, bzt bztVar) {
        super(null, new a3b0(pruVar, bztVar, iqtVar), new uwu0(ctf0Var, (byte) 3), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = i;
        this.p = i1w0Var;
        this.q = dujVar;
        this.r = uvuVar;
        this.s = pwiVar;
        this.t = m1eVar;
        this.u = jqtVar;
        this.v = do20Var;
        this.w = yiuVar;
        this.x = pruVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        tav0 tav0Var = (tav0) obj;
        tav0Var.getClass();
        super.x(tav0Var);
        boolean zEquals = tav0Var.equals(oav0.f24949a);
        pwi pwiVar = this.s;
        yje yjeVar = null;
        if (zEquals) {
            v3c.N(this.y);
            this.y = null;
            v3c.N(this.z);
            v3c.N(this.A);
            pwiVar.m();
            return;
        }
        byte b = 1;
        if (tav0Var.equals(pav0.f26675a)) {
            v3c.N(this.z);
            this.z = i3t0.L(this, new fnq(new p6d(this.t.b(), this.u.a(), scv0.h, b), new rtq0(this, yjeVar, (byte) 28), (byte) 4), null, null, 3);
            v3c.N(this.A);
            this.A = i3t0.L(this, new omi0(i120.X(new fnq(this.r.f36366a.c.f21068a.z(), new wup0(this, yjeVar, (byte) 19)), new d4u0((byte) 24), i120.g), this, (byte) 15), null, null, 3);
            return;
        }
        if (!tav0Var.equals(qav0.f28416a)) {
            if (tav0Var.equals(rav0.f30155a)) {
                ((r2m0) this.v.f6397a).c.f21068a.r();
                pwiVar.m();
                v3c.N(this.y);
                this.y = i3t0.K(this, null, new npt0(this, (byte) 29), new jtr0((Object) this, yjeVar, (byte) 12), 1);
                return;
            }
            if (!(tav0Var instanceof sav0)) {
                t9f.b();
                return;
            }
            int i = ((sav0) tav0Var).f31902a;
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, ncv0.a((ncv0) value, null, (i3m0) CollectionsKt.W(i, ((ncv0) D()).f23312a), false, false, false, 253)));
            return;
        }
        i1w0 i1w0Var = this.p;
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
